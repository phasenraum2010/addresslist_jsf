package org.woehlke.addresslist.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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

    //Todo: Validation
    private String name;
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

    public String save(){
        return "hello.xhtml";
    }
}
