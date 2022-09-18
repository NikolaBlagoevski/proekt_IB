package mk.ukim.bazi.aplikacija.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OnlineBookShopHasOrdersEntityPK implements Serializable {
    private int orderId;
    private int idShop;

    @Column(name = "order_id",insertable = false, updatable = false)
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Column(name = "id_shop",insertable = false, updatable = false)
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

        OnlineBookShopHasOrdersEntityPK that = (OnlineBookShopHasOrdersEntityPK) o;

        if (orderId != that.orderId) return false;
        if (idShop != that.idShop) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + idShop;
        return result;
    }
}
