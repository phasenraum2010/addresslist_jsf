package org.woehlke.addresslist.web;

import org.woehlke.addresslist.entities.Address;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 22.12.13
 * Time: 15:45
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class AddressBean implements Serializable {

    public List<Address> getAddressList(){
        List<Address> list = new ArrayList<Address>();
        Address a1 = new Address();
        a1.setName("Willy Wombel");
        a1.setStreet("Kastanienallee");
        a1.setHouseNumber("17");
        a1.setZip("44801");
        a1.setCity("Bochum");
        a1.setId(1L);
        Address a2 = new Address();
        a2.setName("Honk Waffelo");
        a2.setStreet("Eichenstr.");
        a2.setHouseNumber("31");
        a2.setZip("44581");
        a2.setCity("Castrop-Rauxel");
        a2.setId(2L);
        Address a3 = new Address();
        a3.setName("Willy Wonka");
        a3.setStreet("An der Schokoladenfabrik");
        a3.setHouseNumber("42");
        a3.setZip("12345");
        a3.setCity("Berlin");
        a3.setId(3L);
        list.add(a1);
        list.add(a2);
        list.add(a3);
        return list;
    }

    public String newAdressForm(){
        return "new.xhtml";
    }
}
