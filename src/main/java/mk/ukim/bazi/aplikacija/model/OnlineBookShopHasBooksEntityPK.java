package mk.ukim.bazi.aplikacija.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OnlineBookShopHasBooksEntityPK implements Serializable {
    private int bookId;
    private int idShop;

    @Column(name = "book_id", insertable = false, updatable = false)
    @Id
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Column(name = "id_shop", insertable = false, updatable = false)
    @Id
    public int getIdShop() {
        return idShop;
    }

    public void setIdShop(int idShop) {
        this.idShop = idShop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OnlineBookShopHasBooksEntityPK that = (OnlineBookShopHasBooksEntityPK) o;

        if (bookId != that.bookId) return false;
        if (idShop != that.idShop) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + idShop;
        return result;
    }
}
