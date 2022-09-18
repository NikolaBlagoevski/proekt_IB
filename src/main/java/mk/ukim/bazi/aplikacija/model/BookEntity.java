package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "book", schema = "online_book_shop", catalog = "postgres")
public class BookEntity {
    private int bookId;
    private boolean availability;
    private String bookName;
    private String author;
    private String shortDescription;
    private double price;
    private String genre;
    private int quantity;
    private boolean daliMozeDaSeNaracaAkoJaNema;
    private Collection<OnlineBookShopHasBooksEntity> onlineBookShopHasBooksByBookId;
    private Collection<OrderContainsBooksEntity> orderContainsBooksByBookId;
    private Collection<ShoppingCarHasBookEntity> shoppingCarHasBooksByBookId;

    @Id
    @Column(name = "book_id")
    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "availability")
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Basic
    @Column(name = "book_name")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Basic
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "dali_moze_da_se_naraca_ako_ja_nema")
    public boolean isDaliMozeDaSeNaracaAkoJaNema() {
        return daliMozeDaSeNaracaAkoJaNema;
    }

    public void setDaliMozeDaSeNaracaAkoJaNema(boolean daliMozeDaSeNaracaAkoJaNema) {
        this.daliMozeDaSeNaracaAkoJaNema = daliMozeDaSeNaracaAkoJaNema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        if (bookId != that.bookId) return false;
        if (availability != that.availability) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (quantity != that.quantity) return false;
        if (daliMozeDaSeNaracaAkoJaNema != that.daliMozeDaSeNaracaAkoJaNema) return false;
        if (bookName != null ? !bookName.equals(that.bookName) : that.bookName != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bookId;
        result = 31 * result + (availability ? 1 : 0);
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + quantity;
        result = 31 * result + (daliMozeDaSeNaracaAkoJaNema ? 1 : 0);
        return result;
    }

    @OneToMany(mappedBy = "bookByBookId")
    public Collection<OnlineBookShopHasBooksEntity> getOnlineBookShopHasBooksByBookId() {
        return onlineBookShopHasBooksByBookId;
    }

    public void setOnlineBookShopHasBooksByBookId(Collection<OnlineBookShopHasBooksEntity> onlineBookShopHasBooksByBookId) {
        this.onlineBookShopHasBooksByBookId = onlineBookShopHasBooksByBookId;
    }

    @OneToMany(mappedBy = "bookByBookId")
    public Collection<OrderContainsBooksEntity> getOrderContainsBooksByBookId() {
        return orderContainsBooksByBookId;
    }

    public void setOrderContainsBooksByBookId(Collection<OrderContainsBooksEntity> orderContainsBooksByBookId) {
        this.orderContainsBooksByBookId = orderContainsBooksByBookId;
    }

    @OneToMany(mappedBy = "bookByBookId")
    public Collection<ShoppingCarHasBookEntity> getShoppingCarHasBooksByBookId() {
        return shoppingCarHasBooksByBookId;
    }

    public void setShoppingCarHasBooksByBookId(Collection<ShoppingCarHasBookEntity> shoppingCarHasBooksByBookId) {
        this.shoppingCarHasBooksByBookId = shoppingCarHasBooksByBookId;
    }

}
