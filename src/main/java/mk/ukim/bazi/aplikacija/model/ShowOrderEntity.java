package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;

@Entity
@Table(name = "show_order", schema = "online_book_shop", catalog = "postgres")
public class ShowOrderEntity {
    private Integer id;
    private Double cenaZaNaplata;
    private String adresaNaDostava;
    private String statusNaNaracka;
    private String imeNaKniga;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "cena za naplata")
    public Double getCenaZaNaplata() {
        return cenaZaNaplata;
    }

    public void setCenaZaNaplata(Double cenaZaNaplata) {
        this.cenaZaNaplata = cenaZaNaplata;
    }

    @Basic
    @Column(name = "adresa na dostava")
    public String getAdresaNaDostava() {
        return adresaNaDostava;
    }

    public void setAdresaNaDostava(String adresaNaDostava) {
        this.adresaNaDostava = adresaNaDostava;
    }

    @Basic
    @Column(name = "status na naracka")
    public String getStatusNaNaracka() {
        return statusNaNaracka;
    }

    public void setStatusNaNaracka(String statusNaNaracka) {
        this.statusNaNaracka = statusNaNaracka;
    }

    @Basic
    @Column(name = "ime na kniga")
    public String getImeNaKniga() {
        return imeNaKniga;
    }

    public void setImeNaKniga(String imeNaKniga) {
        this.imeNaKniga = imeNaKniga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShowOrderEntity that = (ShowOrderEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (cenaZaNaplata != null ? !cenaZaNaplata.equals(that.cenaZaNaplata) : that.cenaZaNaplata != null)
            return false;
        if (adresaNaDostava != null ? !adresaNaDostava.equals(that.adresaNaDostava) : that.adresaNaDostava != null)
            return false;
        if (statusNaNaracka != null ? !statusNaNaracka.equals(that.statusNaNaracka) : that.statusNaNaracka != null)
            return false;
        if (imeNaKniga != null ? !imeNaKniga.equals(that.imeNaKniga) : that.imeNaKniga != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cenaZaNaplata != null ? cenaZaNaplata.hashCode() : 0);
        result = 31 * result + (adresaNaDostava != null ? adresaNaDostava.hashCode() : 0);
        result = 31 * result + (statusNaNaracka != null ? statusNaNaracka.hashCode() : 0);
        result = 31 * result + (imeNaKniga != null ? imeNaKniga.hashCode() : 0);
        return result;
    }
}
