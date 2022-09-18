package mk.ukim.bazi.aplikacija.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OrderContainsBooksEntityPK implements Serializable {
    private int orderId;
    private int bookId;

    @Column(name = "order_id", insertable = false, updatable = false)
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

        OrderContainsBooksEntityPK that = (OrderContainsBooksEntityPK) o;

        if (orderId != that.orderId) return false;
        if (bookId != that.bookId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + bookId;
        return result;
    }
}
