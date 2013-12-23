package org.woehlke.addresslist.web;

import org.woehlke.addresslist.dao.AddressDao;
import org.woehlke.addresslist.entities.Address;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 23.12.13
 * Time: 08:44
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class AddressBean implements Serializable {

    @EJB
    private AddressDao addressDao;

    //Todo: Validation
    @NotNull(message = "Name is mandantory")
    private String name;

    @NotNull(message = "street is mandantory")
    private String street;
    private String houseNumber;
    private String zip;
    private String city;

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

    //Todo: Validation
    public String save(){
        Address address = new Address();
        address.setName(name);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setZip(zip);
        address.setCity(city);
        addressDao.addNewAddress(address);
        return "hello.xhtml";
    }
}
