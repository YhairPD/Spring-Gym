/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Club;
import Beans.Persona;
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
public class ClubDAO {
    
    Session session;
    
    public ClubDAO() {
        this.session = HibernateUtil.getLocalSession();
    }
    
    public ClubDAO( Session session ) {
        this.session = session;
    }
    
    public void saveClub( String nombre, String imagen, String sitio, String email, Persona idPersona ){
        
        Date date = new Date();
        
        Club club = new Club();
        
        club.setNombre(nombre);
        club.setImagen(imagen);
        club.setSitio_web(sitio);
        club.setEmail(email);
        club.setUltimo_editado(date);
        club.setEliminado(Boolean.FALSE);
        club.setIdPersona(idPersona);
        try{
            Transaction t = session.beginTransaction();
            session.save(club);
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void updateClub( Integer id, Club club ){
        
        Club clubUpdate = getClubById( id );
        
        Date date = new Date();
        
        try{
            Transaction t = session.beginTransaction();
            
            clubUpdate.setNombre(club.getNombre());
            clubUpdate.setImagen(club.getImagen());
            clubUpdate.setSitio_web(club.getSitio_web());
            clubUpdate.setEmail(club.getEmail());
            clubUpdate.setUltimo_editado(date);
            club.setEliminado(Boolean.FALSE);
            
            session.update(club);
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Club> getAllClub(){
        return (List<Club>) this.session.createCriteria( Club.class ).list();
    }
    
    public Club getClubById( Integer id ){
        return (Club)session.load(Club.class, id);
    }
    /*        
    public  List<Club> getClubById(int id){
        return (List<Club>) this.session.createCriteria(Club.class)
                .add(Restrictions.eq("idClub", id))
                .list();
    }
    */
}
