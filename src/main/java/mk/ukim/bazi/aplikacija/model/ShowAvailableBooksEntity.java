package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;

@Entity
@Table(name = "show_available_books", schema = "online_book_shop", catalog = "postgres")
public class ShowAvailableBooksEntity {
    private Integer bookId;
    private String bookName;
    private String author;
    private String shortDescription;
    private Double price;
    private String genre;
    private Boolean inStock;
    private Boolean notInStockButCanBeOrdered;

    @Id
    @Column(name = "book_id")
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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
    @Column(name = "in_stock")
    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    @Basic
    @Column(name = "not_in_stock_but_can_be_ordered")
    public Boolean getNotInStockButCanBeOrdered() {
        return notInStockButCanBeOrdered;
    }

    public void setNotInStockButCanBeOrdered(Boolean notInStockButCanBeOrdered) {
        this.notInStockButCanBeOrdered = notInStockButCanBeOrdered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShowAvailableBooksEntity that = (ShowAvailableBooksEntity) o;

        if (bookId != null ? !bookId.equals(that.bookId) : that.bookId != null) return false;
        if (bookName != null ? !bookName.equals(that.bookName) : that.bookName != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (genre != null ? !genre.equals(that.genre) : that.genre != null) return false;
        if (inStock != null ? !inStock.equals(that.inStock) : that.inStock != null) return false;
        if (notInStockButCanBeOrdered != null ? !notInStockButCanBeOrdered.equals(that.notInStockButCanBeOrdered) : that.notInStockButCanBeOrdered != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (inStock != null ? inStock.hashCode() : 0);
        result = 31 * result + (notInStockButCanBeOrdered != null ? notInStockButCanBeOrdered.hashCode() : 0);
        return result;
    }
}
