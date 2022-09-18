package mk.ukim.bazi.aplikacija.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OnlineBookShopHasUserAccEntityPK implements Serializable {
    private int accId;
    private int idShop;

    @Column(name = "acc_id", insertable = false, updatable = false)
    @Id
    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
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

        OnlineBookShopHasUserAccEntityPK that = (OnlineBookShopHasUserAccEntityPK) o;

        if (accId != that.accId) return false;
        if (idShop != that.idShop) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accId;
        result = 31 * result + idShop;
        return result;
    }
}
