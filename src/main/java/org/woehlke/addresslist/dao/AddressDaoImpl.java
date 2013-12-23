package org.woehlke.addresslist.dao;

import org.woehlke.addresslist.entities.Address;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 23.12.13
 * Time: 08:53
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class AddressDaoImpl implements AddressDao {


    private static Logger log = Logger.getLogger(AddressDaoImpl.class.getName());


    @PersistenceContext(unitName="addresslistjsf")
    private EntityManager entityManager;

    public List<Address> getAddressList(){
        /*
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
        */
        Query q = entityManager.createQuery("select a from Address a");
        @SuppressWarnings("unchecked")
        List<Address> list =  q.getResultList();
        return list;
    }

    @Override
    public void delete(long id) {
        Address address = entityManager.find(Address.class, id);
        entityManager.remove(address);
    }

    @Override
    public void addNewAddress(Address address) {
        log.info("addNewAddress: "+address.toString());
        entityManager.persist(address);
    }
}
