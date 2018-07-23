/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import com.google.gson.annotations.Expose;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Yhair
 */
@Entity
@Table( name = "tipo_persona", catalog = "gimnasio")
public class TypePerson {
    
    @GeneratedValue
    @Expose
    @Id 
    @Column(name="idTipo_persona", nullable = false )
    private Integer idTypePerson;
    
    @Expose
    @Column(name="nombre", nullable = false )
    private String name;

    @Expose
    @Column(name="eliminado", nullable = false )
    private Boolean removed;
    
    @Expose
    @Column(name="ultimo_editado", nullable = false )
    private Date lastEdited;

    /**
     * @return the idTypePerson
     */
    public Integer getIdTypePerson() {
        return idTypePerson;
    }

    /**
     * @param idTypePerson the idTypePerson to set
     */
    public void setIdTypePerson(Integer idTypePerson) {
        this.idTypePerson = idTypePerson;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the removed
     */
    public Boolean getRemoved() {
        return removed;
    }

    /**
     * @param removed the removed to set
     */
    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }

    /**
     * @return the lastEdited
     */
    public Date getLastEdited() {
        return lastEdited;
    }

    /**
     * @param lastEdited the lastEdited to set
     */
    public void setLastEdited(Date last_edited) {
        this.lastEdited = lastEdited;
    }
    
    
    
}
