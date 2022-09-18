package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;

@Entity
@Table(name = "online_book_shop_has_user_acc", schema = "online_book_shop", catalog = "postgres")
@IdClass(OnlineBookShopHasUserAccEntityPK.class)
public class OnlineBookShopHasUserAccEntity {
    private int accId;
    private int idShop;
    private Integer quantity;
    private UserAccountEntity userAccountByAccId;
    private OnlineBookShopsEntity onlineBookShopsByIdShop;

    @Id
    @Column(name = "acc_id", insertable = false, updatable = false)
    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
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

        OnlineBookShopHasUserAccEntity that = (OnlineBookShopHasUserAccEntity) o;

        if (accId != that.accId) return false;
        if (idShop != that.idShop) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accId;
        result = 31 * result + idShop;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "acc_id", referencedColumnName = "id_acc", nullable = false)
    public UserAccountEntity getUserAccountByAccId() {
        return userAccountByAccId;
    }

    public void setUserAccountByAccId(UserAccountEntity userAccountByAccId) {
        this.userAccountByAccId = userAccountByAccId;
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
