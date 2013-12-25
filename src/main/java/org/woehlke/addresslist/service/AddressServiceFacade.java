package org.woehlke.addresslist.service;

import org.woehlke.addresslist.dao.AddressDao;
import org.woehlke.addresslist.entities.Address;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 25.12.13
 * Time: 10:42
 * To change this template use File | Settings | File Templates.
 */
@Stateless
@Path("/address")
public class AddressServiceFacade {

    @EJB
    private AddressDao addressDao;

    @GET
    @Produces("application/json")
    @Path("/")
    public java.util.List<Address> getAddressList(){
        return addressDao.getAddressList();
    }

    @GET
    @Produces("application/json")
    @Path("/{addressId}")
    public Address getBookById(@PathParam("addressId") Long id)
    {
        return addressDao.findById(id);
    }
}
