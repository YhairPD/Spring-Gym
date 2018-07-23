/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Address;
import Beans.Genero;
import HibernateUtil.HibernateUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Yhair
 */
public class GeneroDAO {
    
    Session session;
    
    public GeneroDAO(){
        this.session = HibernateUtil.getLocalSession();
    }
    
    public GeneroDAO( Session session ){
        this.session = session;
    }
    
    public void saveGenero( String nombre ){
        
        Date date = new Date();
        
        Genero genero = new Genero();
        genero.setNombre(nombre);
        genero.setEliminado(Boolean.FALSE);
        genero.setUltimo_editado( date );
        
        try{
            Transaction t=session.beginTransaction();
            session.save(genero);
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateGenero( Integer id, Genero genero ){
        
        Date date = new Date();
        
        Genero generoUpdate = new Genero();
        generoUpdate.setNombre(genero.getNombre());
        generoUpdate.setEliminado(Boolean.FALSE);
        generoUpdate.setUltimo_editado( date );
        
        try{
            Transaction t=session.beginTransaction();
            session.update(generoUpdate);
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Genero> getAllGenero(){
        return (List<Genero>) this.session.createCriteria( Genero.class ).list();
    }
    
    public Genero getGeneroById( Integer id, Genero genero ){
        return (Genero) this.session.createCriteria( Genero.class ).list();
    }
    
    /*
    public  List<Genero> getGeneroById(int id){
        return (List<Genero>) this.session.createCriteria(Genero.class)
                .add(Restrictions.eq("idGenero", id))
                .list();
    }
    */
    
}
