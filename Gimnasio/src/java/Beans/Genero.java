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
@Table( name = "genero", catalog  = "gimnasio")
public class Genero {
    
    @GeneratedValue
    @Expose
    @Id 
    @Column(name="idGenero", nullable = false )
    private Integer idGenero;
    
    @Expose
    @Column(name="nombre", nullable = false )
    private String nombre;
    
    @Expose
    @Column(name="eliminado", nullable = false )
    private Boolean eliminado;
    
    @Expose
    @Column(name="ultimo_editado", nullable = false )
    private Date ultimo_editado;

    /**
     * @return the idGenero
     */
    public Integer getIdGenero() {
        return idGenero;
    }

    /**
     * @param idGenero the idGenero to set
     */
    public void setIdGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the eliminado
     */
    public Boolean getEliminado() {
        return eliminado;
    }

    /**
     * @param eliminado the eliminado to set
     */
    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    /**
     * @return the ultimo_editado
     */
    public Date getUltimo_editado() {
        return ultimo_editado;
    }

    /**
     * @param ultimo_editado the ultimo_editado to set
     */
    public void setUltimo_editado(Date ultimo_editado) {
        this.ultimo_editado = ultimo_editado;
    }
    
    
    
}
