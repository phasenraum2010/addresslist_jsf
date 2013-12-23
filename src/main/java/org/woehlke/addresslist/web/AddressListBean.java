package org.woehlke.addresslist.web;

import org.woehlke.addresslist.dao.AddressDao;
import org.woehlke.addresslist.entities.Address;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
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
public class AddressListBean implements Serializable {

    @EJB
    private AddressDao addressDao;

    public List<Address> getAddressList(){
        return addressDao.getAddressList();
    }

    public String newAdressForm(){
        return "new.xhtml";
    }
}
