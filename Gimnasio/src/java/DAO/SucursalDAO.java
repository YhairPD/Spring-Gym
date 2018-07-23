/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Club;
import Beans.Address;
import Beans.Sucursal;
import HibernateUtil.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Yhair
 */
public class SucursalDAO {
    
    Session session;
    
    public SucursalDAO() {
        this.session = HibernateUtil.getLocalSession();
    }
    
    public SucursalDAO( Session session ) {
        this.session = session;
    }
    
    public void saveSucursal( String nombre, String telefono, Address idDireccion, Club idClub){
        
        Date date = new Date();
        
        Sucursal sucursal = new Sucursal();
        
        sucursal.setNombre(nombre);
        sucursal.setTelefono(telefono);
        sucursal.setEliminado(Boolean.FALSE);
        sucursal.setUltimo_editado(date);
        sucursal.setIdDireccion(idDireccion);
        sucursal.setIdClub(idClub);
        
        try{
            Transaction t = session.beginTransaction();
            session.save( sucursal );
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateSucursal( Integer id, Sucursal sucursal){
        
        Date date = new Date();
        
        Sucursal sucursalUpdate = new Sucursal();
        
        sucursalUpdate.setNombre(sucursal.getNombre());
        sucursalUpdate.setTelefono(sucursal.getTelefono());
        sucursalUpdate.setEliminado(Boolean.FALSE);
        sucursalUpdate.setUltimo_editado(date);
        sucursalUpdate.setIdDireccion(sucursal.getIdDireccion());
        sucursalUpdate.setIdClub(sucursal.getIdClub());
        
        try{
            Transaction t = session.beginTransaction();
            session.update( sucursal );
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Sucursal> getAllSucursal(){
        return (List<Sucursal>) this.session.createCriteria( Sucursal.class ).list();
    }
    
    public Sucursal getSucursalById( Integer id ){
        return (Sucursal)session.load(Sucursal.class, id);
    }
    
    /*
    public  List<Sucursal> getSucursalById(int id){
        return (List<Sucursal>) this.session.createCriteria( Sucursal.class )
                .add(Restrictions.eq("idSucursal", id))
                .list();
    }
    */  
}
