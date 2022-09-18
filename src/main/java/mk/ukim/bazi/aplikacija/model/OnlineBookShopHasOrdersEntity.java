package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;

@Entity
@Table(name = "online_book_shop_has_orders", schema = "online_book_shop", catalog = "postgres")
@IdClass(OnlineBookShopHasOrdersEntityPK.class)
public class OnlineBookShopHasOrdersEntity {
    private int orderId;
    private int idShop;
    private Integer quantity;
    private MyorderEntity myorderByOrderId;
    private OnlineBookShopsEntity onlineBookShopsByIdShop;

    @Id
    @Column(name = "order_id", insertable = false, updatable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Id
    @Column(name = "id_shop", insertable = false, updatable = false)
    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OnlineBookShopHasOrdersEntity that = (OnlineBookShopHasOrdersEntity) o;

        if (orderId != that.orderId) return false;
        if (idShop != that.idShop) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + idShop;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id", nullable = false)
    public MyorderEntity getMyorderByOrderId() {
        return myorderByOrderId;
    }

    public void setMyorderByOrderId(MyorderEntity myorderByOrderId) {
        this.myorderByOrderId = myorderByOrderId;
    }

    @ManyToOne
    @JoinColumn(name = "id_shop", referencedColumnName = "shop_id", nullable = false)
    public OnlineBookShopsEntity getOnlineBookShopsByIdShop() {
        return onlineBookShopsByIdShop;
    }

    public void setOnlineBookShopsByIdShop(OnlineBookShopsEntity onlineBookShopsByIdShop) {
        this.onlineBookShopsByIdShop = onlineBookShopsByIdShop;
    }
}
