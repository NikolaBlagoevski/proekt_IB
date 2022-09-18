package mk.ukim.bazi.aplikacija.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ShoppingCarHasBookEntityPK implements Serializable {
    private int cartId;
    private int bookId;

    @Column(name = "cart_id", insertable = false, updatable = false)
    @Id
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Column(name = "book_id", insertable = false, updatable = false)
    @Id
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingCarHasBookEntityPK that = (ShoppingCarHasBookEntityPK) o;

        if (cartId != that.cartId) return false;
        if (bookId != that.bookId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + bookId;
        return result;
    }
}
