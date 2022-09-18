package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;

@Entity
@Table(name = "shopping_car_has_book", schema = "online_book_shop", catalog = "postgres")
@IdClass(ShoppingCarHasBookEntityPK.class)
public class ShoppingCarHasBookEntity {
    private int cartId;
    private int bookId;
    private Integer quantity;
    private ShoppingCartEntity shoppingCartByCartId;
    private BookEntity bookByBookId;

    @Id
    @Column(name = "cart_id", insertable = false, updatable = false)
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Id
    @Column(name = "book_id", insertable = false, updatable = false)
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

        ShoppingCarHasBookEntity that = (ShoppingCarHasBookEntity) o;

        if (cartId != that.cartId) return false;
        if (bookId != that.bookId) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cartId;
        result = 31 * result + bookId;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id", nullable = false)
    public ShoppingCartEntity getShoppingCartByCartId() {
        return shoppingCartByCartId;
    }

    public void setShoppingCartByCartId(ShoppingCartEntity shoppingCartByCartId) {
        this.shoppingCartByCartId = shoppingCartByCartId;
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", nullable = false)
    public BookEntity getBookByBookId() {
        return bookByBookId;
    }

    public void setBookByBookId(BookEntity bookByBookId) {
        this.bookByBookId = bookByBookId;
    }
}
