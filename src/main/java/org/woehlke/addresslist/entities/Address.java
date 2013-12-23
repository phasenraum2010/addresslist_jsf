package org.woehlke.addresslist.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 22.12.13
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Todo: Validation
    @NotNull(message = "Name is mandantory")
    //@NotBlank(message = "Name is mandantory")
    @Column
    private String name;

    @NotNull(message = "street is mandantory")
    //@NotBlank(message = "street is mandantory")
    @Column
    private String street;

    @NotNull(message = "houseNumber is mandantory")
    //@NotBlank(message = "houseNumber is mandantory")
    @Column
    private String houseNumber;

    @NotNull(message = "Zip is mandantory")
    //@NotBlank(message = "Zip is mandantory")
    @Column
    private String zip;

    @NotNull(message = "City is mandantory")
    //@NotBlank(message = "City is mandantory")
    @Column
    private String city;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (!city.equals(address.city)) return false;
        if (!houseNumber.equals(address.houseNumber)) return false;
        if (!name.equals(address.name)) return false;
        if (!street.equals(address.street)) return false;
        if (!zip.equals(address.zip)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + houseNumber.hashCode();
        result = 31 * result + zip.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
