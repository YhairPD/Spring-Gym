/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import com.google.gson.annotations.Expose;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Yhair
 */
@Entity
@Table( name = "tipo_relacion", catalog = "gimnasio")
public class TypeRelationship {
    
    @GeneratedValue
    @Expose
    @Id
    @Column(name="idTipo_relacion", nullable = false )
    private Integer idTypeRelationship;
    
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
     * @return the idTypeRelationship
     */
    public Integer getIdTypeRelationship() {
        return idTypeRelationship;
    }

    /**
     * @param idTypeRelationship the idTypeRelationship to set
     */
    public void setIdTypeRelationship(Integer idTypeRelationship) {
        this.idTypeRelationship = idTypeRelationship;
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
     * @param lastEdited the last_edited to set
     */
    public void setLastEdited( Date lastEdited ) {
        this.lastEdited = lastEdited;
    }

    
}
