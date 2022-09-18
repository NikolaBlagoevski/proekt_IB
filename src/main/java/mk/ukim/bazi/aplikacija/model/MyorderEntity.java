package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "myorder", schema = "online_book_shop", catalog = "postgres")
public class MyorderEntity {
    private int orderId;
    private double amountToPay;
    private String status;
    private String deliveryAddress;
    private Integer accId;
    private Timestamp date;
    private UserAccountEntity userAccountByAccId;
    private Collection<OnlineBookShopHasOrdersEntity> onlineBookShopHasOrdersByOrderId;
    private Collection<OrderContainsBooksEntity> orderContainsBooksByOrderId;

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "amount_to_pay")
    public double getAmountToPay() {
        return amountToPay;
    }

    public void setAmountToPay(double amountToPay) {
        this.amountToPay = amountToPay;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "delivery_address")
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Basic
    @Column(name = "acc_id", insertable = false, updatable = false)
    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyorderEntity that = (MyorderEntity) o;

        if (orderId != that.orderId) return false;
        if (Double.compare(that.amountToPay, amountToPay) != 0) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (deliveryAddress != null ? !deliveryAddress.equals(that.deliveryAddress) : that.deliveryAddress != null)
            return false;
        if (accId != null ? !accId.equals(that.accId) : that.accId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderId;
        temp = Double.doubleToLongBits(amountToPay);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (deliveryAddress != null ? deliveryAddress.hashCode() : 0);
        result = 31 * result + (accId != null ? accId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "acc_id", referencedColumnName = "id_acc")
    public UserAccountEntity getUserAccountByAccId() {
        return userAccountByAccId;
    }

    public void setUserAccountByAccId(UserAccountEntity userAccountByAccId) {
        this.userAccountByAccId = userAccountByAccId;
    }

    @OneToMany(mappedBy = "myorderByOrderId")
    public Collection<OnlineBookShopHasOrdersEntity> getOnlineBookShopHasOrdersByOrderId() {
        return onlineBookShopHasOrdersByOrderId;
    }

    public void setOnlineBookShopHasOrdersByOrderId(Collection<OnlineBookShopHasOrdersEntity> onlineBookShopHasOrdersByOrderId) {
        this.onlineBookShopHasOrdersByOrderId = onlineBookShopHasOrdersByOrderId;
    }

    @OneToMany(mappedBy = "myorderByOrderId")
    public Collection<OrderContainsBooksEntity> getOrderContainsBooksByOrderId() {
        return orderContainsBooksByOrderId;
    }

    public void setOrderContainsBooksByOrderId(Collection<OrderContainsBooksEntity> orderContainsBooksByOrderId) {
        this.orderContainsBooksByOrderId = orderContainsBooksByOrderId;
    }

/*    @ManyToMany
    List<BookEntity> order_contains_books;*/

}
