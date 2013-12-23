package org.woehlke.addresslist.web;

import org.hibernate.validator.constraints.NotBlank;
import org.woehlke.addresslist.dao.AddressDao;
import org.woehlke.addresslist.entities.Address;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

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

    private long id;

    @NotNull(message = "Name is mandantory")
    @NotBlank(message = "Name is mandantory")
    private String name;

    @NotNull(message = "street is mandantory")
    @NotBlank(message = "street is mandantory")
    private String street;

    @NotNull(message = "houseNumber is mandantory")
    @NotBlank(message = "houseNumber is mandantory")
    private String houseNumber;

    @NotNull(message = "Zip is mandantory")
    @NotBlank(message = "Zip is mandantory")
    private String zip;

    @NotNull(message = "City is mandantory")
    @NotBlank(message = "City is mandantory")
    private String city;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public List<Address> getAddressList(){
        return addressDao.getAddressList();
    }

    public String newAdressForm(){
        this.id=0;
        this.name=null;
        this.street=null;
        this.houseNumber=null;
        this.zip=null;
        this.city=null;
        return "new.xhtml";
    }

    public String saveNew(){
        Address address = new Address();
        address.setName(name);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setZip(zip);
        address.setCity(city);
        addressDao.addNewAddress(address);
        return "hello.xhtml";
    }

    public String editAdressForm(long id){
        Address address = addressDao.findById(id);
        this.id=address.getId();
        this.name=address.getName();
        this.street=address.getStreet();
        this.houseNumber=address.getHouseNumber();
        this.zip=address.getZip();
        this.city=address.getCity();
        return "edit.xhtml";
    }

    public String saveEdited(){
        Address address = addressDao.findById(this.id);
        address.setName(name);
        address.setStreet(street);
        address.setHouseNumber(houseNumber);
        address.setZip(zip);
        address.setCity(city);
        addressDao.update(address);
        return "hello.xhtml";
    }

    public String deleteAdress(long id){
        addressDao.delete(id);
        return "hello.xhtml";
    }
}
