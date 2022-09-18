package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "shopping_cart", schema = "online_book_shop", catalog = "postgres")
public class ShoppingCartEntity {
    private int cartId;
    private Integer accId;
    private Collection<ShoppingCarHasBookEntity> shoppingCarHasBooksByCartId;
    private UserAccountEntity userAccountByAccId;

    @Id
    @Column(name = "cart_id")
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "acc_id", insertable = false, updatable = false)
    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCartEntity that = (ShoppingCartEntity) o;

        if (cartId != that.cartId) return false;
        if (accId != null ? !accId.equals(that.accId) : that.accId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + (accId != null ? accId.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "shoppingCartByCartId")
    public Collection<ShoppingCarHasBookEntity> getShoppingCarHasBooksByCartId() {
        return shoppingCarHasBooksByCartId;
    }

    public void setShoppingCarHasBooksByCartId(Collection<ShoppingCarHasBookEntity> shoppingCarHasBooksByCartId) {
        this.shoppingCarHasBooksByCartId = shoppingCarHasBooksByCartId;
    }

    @ManyToOne
    @JoinColumn(name = "acc_id", referencedColumnName = "id_acc")
    public UserAccountEntity getUserAccountByAccId() {
        return userAccountByAccId;
    }

    public void setUserAccountByAccId(UserAccountEntity userAccountByAccId) {
        this.userAccountByAccId = userAccountByAccId;
    }
}
