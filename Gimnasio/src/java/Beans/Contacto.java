/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import com.google.gson.annotations.Expose;
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
@Table( name = "contacto", catalog = "gimnasio")
public class Contacto {
    
    @GeneratedValue
    @Expose
    @Id
    @Column(name="idContacto", nullable = false )
    private Integer idContacto;
    
    @Expose
    @Column(name="nombre", nullable = false )
    private String nombre;
    
    @Expose
    @Column(name="email", nullable = false )
    private String email;
    
    @Expose
    @Column(name="celular", nullable = false )
    private String celular;
    
    @Expose
    @Column(name="casa", nullable = false )
    private String casa;
    
    @Expose
    @Column(name="trabajo", nullable = false )
    private String trabajo;
    
    @Expose
    @Column(name="idTipo_relacion", nullable = false )
    private TypeRelationship idTipo_relacion;

    /**
     * @return the idContacto
     */
    public Integer getIdContacto() {
        return idContacto;
    }

    /**
     * @param idContacto the idContacto to set
     */
    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
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
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the casa
     */
    public String getCasa() {
        return casa;
    }

    /**
     * @param casa the casa to set
     */
    public void setCasa(String casa) {
        this.casa = casa;
    }

    /**
     * @return the trabajo
     */
    public String getTrabajo() {
        return trabajo;
    }

    /**
     * @param trabajo the trabajo to set
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    /**
     * @return the idTipo_relacion
     */
    public TypeRelationship getIdTipo_relacion() {
        return idTipo_relacion;
    }

    /**
     * @param idTipo_relacion the idTipo_relacion to set
     */
    public void setIdTipo_relacion(TypeRelationship idTipo_relacion) {
        this.idTipo_relacion = idTipo_relacion;
    }
    
}
