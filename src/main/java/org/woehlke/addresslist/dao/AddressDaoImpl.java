package org.woehlke.addresslist.dao;

import org.woehlke.addresslist.entities.Address;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 23.12.13
 * Time: 08:53
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class AddressDaoImpl implements AddressDao {

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
}
