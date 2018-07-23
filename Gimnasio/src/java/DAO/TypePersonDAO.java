/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.TypePerson;
import Beans.TypeRelationship;
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
public class TypePersonDAO {
    
    Session session;
    
    public TypePersonDAO(){
        this.session = HibernateUtil.getLocalSession();
    }
    
    public TypePersonDAO( Session session ){
        this.session = session;
    }
    
    public Boolean saveType( String name){
        
        Date date = new Date();
        
        TypePerson type = new TypePerson();
        type.setName(name);
        type.setRemoved(Boolean.FALSE);
        type.setLastEdited(date);
        
        try{
            Transaction t = session.beginTransaction();
            session.save( type );
            t.commit();
            close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            close();
            return false;
        }
    }
    
    public Boolean updateType( Integer id, TypePerson type ){
        
        Date date = new Date();
        
        TypePerson typeUpdate = new TypePerson();
        typeUpdate.setIdTypePerson( id );
        typeUpdate.setName(type.getName());
        typeUpdate.setRemoved(Boolean.FALSE);
        typeUpdate.setLastEdited(date);
        
        try{
            Transaction t = session.beginTransaction();
            session.update( typeUpdate );
            t.commit();
            close();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            close();
            return false;
        }
    }
    
    public List<TypePerson> getAllTypePerson(){
        List<TypePerson> list = (List<TypePerson>) this.session.createCriteria(TypePerson.class ).list();
        close();
        return list;
    }
    
    public TypePerson getTypeById( Integer id ){
        TypePerson type = (TypePerson)session.load(TypePerson.class, id);
        close();
        return type;
    }
    
    public void close(){
        HibernateUtil.closeLocalSession();  
    }
    
}
