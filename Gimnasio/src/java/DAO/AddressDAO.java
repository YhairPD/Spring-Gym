/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Address;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Yhair
 */
public class AddressDAO {
    
    Session session;
    
    public AddressDAO(){
        this.session = HibernateUtil.getLocalSession();
    }
    
    public AddressDAO( Session session ){
        this.session = session;
    }
    
    public Boolean saveAddress( String street, String number, String postalCode, String city, String state, String country){
        Address address = new Address();
        address.setStreet( street );
        address.setNumber( number );
        address.setPostalCode( postalCode );
        address.setCity( city );
        address.setState( state );
        address.setCountry( country );
        try{
            Transaction t=session.beginTransaction();
            session.save( address );
            t.commit();
            close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            close();
            return false;
        }
    }
    
    public Boolean updateAddress( Integer id, Address address ){
        
        Address addressUpdate = new Address();
        addressUpdate.setStreet(address.getStreet());
        addressUpdate.setNumber(address.getNumber());
        addressUpdate.setPostalCode(address.getPostalCode());
        addressUpdate.setCity(address.getCity());
        addressUpdate.setState(address.getState());
        addressUpdate.setCountry(address.getCountry());
        
        try{
            Transaction t = session.beginTransaction();
            session.update(addressUpdate);
            t.commit();
            close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            close();
            return false;
        }
    }
    
    public List<Address> getAllAddress(){
        List<Address> list = (List<Address>) this.session.createCriteria(Address.class ).list();
        close();
        return list;
    }
    
    public Address getAddressById( Integer id ){
        Address address = (Address)session.load(Address.class, id);
        close();
        return address;
    }
    
    /*
    public  List<Direccion> getDireccionById(int id){
        return (List<Direccion>) this.session.createCriteria(Address.class)
                .add(Restrictions.eq("idDireccion", id))
                .list();
    }
    */
    
    public void close(){
        HibernateUtil.closeLocalSession();  
    }
}
