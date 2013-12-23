package org.woehlke.addresslist.dao;

import org.woehlke.addresslist.entities.Address;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 23.12.13
 * Time: 08:59
 * To change this template use File | Settings | File Templates.
 */
public interface AddressDao {

    List<Address> getAddressList();

    void delete(long id);

    void addNewAddress(Address address);
}
