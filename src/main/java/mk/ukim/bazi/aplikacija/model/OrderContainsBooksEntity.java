package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;

@Entity
@Table(name = "order_contains_books", schema = "online_book_shop", catalog = "postgres")
@IdClass(OrderContainsBooksEntityPK.class)
public class OrderContainsBooksEntity {
    private int orderId;
    private int bookId;
    private Integer quantity;
    private MyorderEntity myorderByOrderId;
    private BookEntity bookByBookId;

    @Id
    @Column(name = "order_id", insertable = false, updatable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

        OrderContainsBooksEntity that = (OrderContainsBooksEntity) o;

        if (orderId != that.orderId) return false;
        if (bookId != that.bookId) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + bookId;
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
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", nullable = false)
    public BookEntity getBookByBookId() {
        return bookByBookId;
    }

    public void setBookByBookId(BookEntity bookByBookId) {
        this.bookByBookId = bookByBookId;
    }
}
