package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;

@Entity
@Table(name = "online_book_shop_has_books", schema = "online_book_shop", catalog = "postgres")
@IdClass(OnlineBookShopHasBooksEntityPK.class)
public class OnlineBookShopHasBooksEntity {
    private int bookId;
    private int idShop;
    private Integer quantity;
    private BookEntity bookByBookId;
    private OnlineBookShopsEntity onlineBookShopsByIdShop;

    @Id
    @Column(name = "book_id", insertable = false, updatable = false)
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
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

        OnlineBookShopHasBooksEntity that = (OnlineBookShopHasBooksEntity) o;

        if (bookId != that.bookId) return false;
        if (idShop != that.idShop) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId;
        result = 31 * result + idShop;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "book_id", nullable = false)
    public BookEntity getBookByBookId() {
        return bookByBookId;
    }

    public void setBookByBookId(BookEntity bookByBookId) {
        this.bookByBookId = bookByBookId;
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
