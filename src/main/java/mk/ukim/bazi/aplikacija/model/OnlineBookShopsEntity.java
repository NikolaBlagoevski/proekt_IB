package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "online_book_shops", schema = "online_book_shop", catalog = "postgres")
public class OnlineBookShopsEntity {
    private int shopId;
    private String location;
    private Collection<OnlineBookShopHasBooksEntity> onlineBookShopHasBooksByShopId;
    private Collection<OnlineBookShopHasOrdersEntity> onlineBookShopHasOrdersByShopId;
    private Collection<OnlineBookShopHasUserAccEntity> onlineBookShopHasUserAccsByShopId;

    @Id
    @Column(name = "shop_id")
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OnlineBookShopsEntity that = (OnlineBookShopsEntity) o;

        if (shopId != that.shopId) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shopId;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "onlineBookShopsByIdShop")
    public Collection<OnlineBookShopHasBooksEntity> getOnlineBookShopHasBooksByShopId() {
        return onlineBookShopHasBooksByShopId;
    }

    public void setOnlineBookShopHasBooksByShopId(Collection<OnlineBookShopHasBooksEntity> onlineBookShopHasBooksByShopId) {
        this.onlineBookShopHasBooksByShopId = onlineBookShopHasBooksByShopId;
    }

    @OneToMany(mappedBy = "onlineBookShopsByIdShop")
    public Collection<OnlineBookShopHasOrdersEntity> getOnlineBookShopHasOrdersByShopId() {
        return onlineBookShopHasOrdersByShopId;
    }

    public void setOnlineBookShopHasOrdersByShopId(Collection<OnlineBookShopHasOrdersEntity> onlineBookShopHasOrdersByShopId) {
        this.onlineBookShopHasOrdersByShopId = onlineBookShopHasOrdersByShopId;
    }

    @OneToMany(mappedBy = "onlineBookShopsByIdShop")
    public Collection<OnlineBookShopHasUserAccEntity> getOnlineBookShopHasUserAccsByShopId() {
        return onlineBookShopHasUserAccsByShopId;
    }

    public void setOnlineBookShopHasUserAccsByShopId(Collection<OnlineBookShopHasUserAccEntity> onlineBookShopHasUserAccsByShopId) {
        this.onlineBookShopHasUserAccsByShopId = onlineBookShopHasUserAccsByShopId;
    }
}
