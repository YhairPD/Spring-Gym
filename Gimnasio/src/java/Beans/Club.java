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
@Table( name = "club", catalog = "gimnasio")
public class Club {
    
    @GeneratedValue
    @Expose
    @Id
    @Column(name="idClub", nullable = false )
    private Integer idClub;
    
    @Expose
    @Column(name="nombre", nullable = false )
    private String nombre;
    
    @Expose
    @Column(name="imagen", nullable = false )
    private String imagen;
    
    @Expose
    @Column(name="eliminado", nullable = false )
    private Boolean eliminado;
    
    @Expose
    @Column(name="ultimo_editado", nullable = false )
    private Date ultimo_editado;
    
    @Expose
    @Column(name="email", nullable = false )
    private String email;
    
    @Expose
    @Column(name="sitio_web", nullable = false )
    private String sitio_web;
    
    @Expose
    @Column(name="idPersona", nullable = false )
    private Persona idPersona;

    /**
     * @return the idClub
     */
    public Integer getIdClub() {
        return idClub;
    }

    /**
     * @param idClub the idClub to set
     */
    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
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
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the sitio_web
     */
    public String getSitio_web() {
        return sitio_web;
    }

    /**
     * @param sitio_web the sitio_web to set
     */
    public void setSitio_web(String sitio_web) {
        this.sitio_web = sitio_web;
    }

    /**
     * @return the idPersona
     */
    public Persona getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }
    
    
    
}
