/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Persona;
import Beans.TypePerson;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Yhair
 */
public class PersonaDAO {
    
    Session session;
    
    public PersonaDAO(){
        this.session = HibernateUtil.getLocalSession();
    }
    
    public PersonaDAO( Session session ){
        this.session = session;
    }
    
    public void savePersona( String email, String contrasena, String imagen, TypePerson idTipo_persona ){
        Persona persona = new Persona();
        persona.setEmail(email);
        persona.setContrasena(contrasena);
        persona.setImagen(imagen);
        persona.setIdTipo_persona(idTipo_persona);
        try{
            Transaction t=session.beginTransaction();
            session.save(persona);
            t.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public List<Persona> getAllPersona(){
        return (List<Persona>) this.session.createCriteria( Persona.class ).list();
    }
    
    public  List<Persona> getPersonaById(int id){
        return (List<Persona>) this.session.createCriteria(Persona.class)
                .add(Restrictions.eq("idPersona", id))
                .list();
    }
    
    public void close(){
        HibernateUtil.closeLocalSession();  
    }
}
