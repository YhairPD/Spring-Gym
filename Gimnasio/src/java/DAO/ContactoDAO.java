/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Contacto;
import Beans.TypeRelationship;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Yhair
 */
public class ContactoDAO {
 
    Session session;
    
    public ContactoDAO(){
        this.session = HibernateUtil.getLocalSession();
    }
    
    public ContactoDAO( Session session ){
        this.session = session;
    }
    
    public void saveContacto( String nombre, String email, String celular, String casa, String trabajo, TypeRelationship idTipo_relacion){
        
        Contacto contacto = new Contacto();
        
        contacto.setNombre(nombre);
        contacto.setEmail(email);
        contacto.setCelular(celular);
        contacto.setCasa(casa);
        contacto.setTrabajo(trabajo);
        contacto.setIdTipo_relacion(idTipo_relacion);
        
        try{
            Transaction t=session.beginTransaction();
            session.save(contacto);
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Contacto> getAllContacto(){
        return (List<Contacto>) this.session.createCriteria( Contacto.class ).list();
    }
    
    public  List<Contacto> getContactoById(int id){
        return (List<Contacto>) this.session.createCriteria( Contacto.class )
                .add(Restrictions.eq("idContacto", id))
                .list();
    }
}
