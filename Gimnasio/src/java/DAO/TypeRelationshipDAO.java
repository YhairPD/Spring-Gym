/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.TypeRelationship;
import HibernateUtil.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Yhair
 */
public class TypeRelationshipDAO {
    
    Session session;
    
    public TypeRelationshipDAO(){
        this.session = HibernateUtil.getLocalSession();
    }
    
    public TypeRelationshipDAO( Session session ){
        this.session = session;
    }
    
    public Boolean saveType( String name ){
        
        Date date = new Date();
        
        TypeRelationship type = new TypeRelationship();
        
        type.setName( name );
        type.setRemoved(Boolean.FALSE);
        type.setLastEdited(date);
        
        try{
            Transaction t = session.beginTransaction();
            session.save( type );
            t.commit();
            close();
            return true;
        }catch( Exception e ){
            e.printStackTrace();
            close();
            return false;
        }
    }
    
    public Boolean updateType( Integer id, TypeRelationship type ){
        
        Date date = new Date();
        
        TypeRelationship typeUpdate = new TypeRelationship();
        
        typeUpdate.setName( type.getName() );
        typeUpdate.setRemoved(Boolean.FALSE);
        typeUpdate.setLastEdited(date);
        
        try{
            Transaction t = session.beginTransaction();
            session.update( typeUpdate );
            t.commit();
            close();
            return true;
        }catch( Exception e ){
            e.printStackTrace();
            close();
            return false;
        }
    }
    
    public List<TypeRelationship> getAllTypeRelationship(){
        List list = (List<TypeRelationship>) this.session.createCriteria(TypeRelationship.class).list();
        close();
        return list;
    }
    
    public TypeRelationship getTypeById( Integer id ){
        TypeRelationship type = (TypeRelationship)session.load(TypeRelationship.class, id);
        close();
        return type;
    }
    
    public void close(){
        HibernateUtil.closeLocalSession();  
    }
    
}
