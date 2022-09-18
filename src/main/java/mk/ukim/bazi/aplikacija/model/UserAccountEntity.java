package mk.ukim.bazi.aplikacija.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "user_account", schema = "online_book_shop", catalog = "postgres")
public class UserAccountEntity {
    private int idAcc;
    private String username;
    private String password;
    private String namePerson;
    private String surname;
    private String address;
    private String email;
    private Collection<MyorderEntity> myordersByIdAcc;
    private Collection<OnlineBookShopHasUserAccEntity> onlineBookShopHasUserAccsByIdAcc;
    private Collection<ShoppingCartEntity> shoppingCartsByIdAcc;

    public UserAccountEntity() {
    }

    public UserAccountEntity(String username, String password, String namePerson, String surname, String address, String email) {
        this.username = username;
        this.password = password;
        this.namePerson = namePerson;
        this.surname = surname;
        this.address = address;
        this.email = email;
    }

    @Id
    @Column(name = "id_acc")
    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {
        this.idAcc = idAcc;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "name_person")
    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAccountEntity that = (UserAccountEntity) o;

        if (idAcc != that.idAcc) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (namePerson != null ? !namePerson.equals(that.namePerson) : that.namePerson != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAcc;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (namePerson != null ? namePerson.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "userAccountByAccId")
    public Collection<MyorderEntity> getMyordersByIdAcc() {
        return myordersByIdAcc;
    }

    public void setMyordersByIdAcc(Collection<MyorderEntity> myordersByIdAcc) {
        this.myordersByIdAcc = myordersByIdAcc;
    }

    @OneToMany(mappedBy = "userAccountByAccId")
    public Collection<OnlineBookShopHasUserAccEntity> getOnlineBookShopHasUserAccsByIdAcc() {
        return onlineBookShopHasUserAccsByIdAcc;
    }

    public void setOnlineBookShopHasUserAccsByIdAcc(Collection<OnlineBookShopHasUserAccEntity> onlineBookShopHasUserAccsByIdAcc) {
        this.onlineBookShopHasUserAccsByIdAcc = onlineBookShopHasUserAccsByIdAcc;
    }

    @OneToMany(mappedBy = "userAccountByAccId")
    public Collection<ShoppingCartEntity> getShoppingCartsByIdAcc() {
        return shoppingCartsByIdAcc;
    }

    public void setShoppingCartsByIdAcc(Collection<ShoppingCartEntity> shoppingCartsByIdAcc) {
        this.shoppingCartsByIdAcc = shoppingCartsByIdAcc;
    }
}
