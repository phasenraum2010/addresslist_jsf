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

    @Override
    public Address findById(long id) {
        Address address = entityManager.find(Address.class, id);
        return address;
    }

    @Override
    public void update(Address address) {
        entityManager.merge(address);
    }
}
