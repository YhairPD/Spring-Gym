/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Asistencia;
import Beans.Socio;
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
public class AsistenciaDAO {
    
    Session session;
    
    public AsistenciaDAO() {
        this.session = HibernateUtil.getLocalSession();
    }
    
    public AsistenciaDAO( Session session ) {
        this.session = session;
    }
    
    public void savePersona( Socio idSocio ){
        
        Date date = new Date();
        
        Asistencia asistencia = new Asistencia();
        asistencia.setFecha( date );
        asistencia.setIdSocio( idSocio );
        
        try{
            Transaction t=session.beginTransaction();
            session.save(asistencia);
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Asistencia> getAllAsistencia(){
        return (List<Asistencia>) this.session.createCriteria( Asistencia.class ).list();
    }
    
    public  List<Asistencia> getAsistenciaById( int id ) {
        return (List<Asistencia>) this.session.createCriteria(Asistencia.class)
                .add(Restrictions.eq("idAsistencia", id))
                .list();
    }
}
