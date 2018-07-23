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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Yhair
 */
@Entity
@Table( name = "persona", catalog = "gimnasio" )
public class Persona {
    
    @Expose
    @Id @GeneratedValue
    @Column(name="idPersona", nullable = false)
    private Integer idPersona;
    
    @Expose
    @Column(name="email", nullable = false)
    private String email;
    
    @Expose
    @Column(name="contrasena", nullable = false)
    private String contrasena;
    
    @Expose
    @Column(name="imagen", nullable = false)
    private String imagen;
    
    @Expose
    @ManyToOne
    @JoinColumn(name="idTipoPersona")
    private TypePerson idTipo_persona;

    /**
     * @return the idPersona
     */
    public Integer getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
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
     * @return the contraseña
     */
    public String getContrasena() {
        return contrasena;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
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
     * @return the idTipo_persona
     */
    public TypePerson getIdTipo_persona() {
        return idTipo_persona;
    }

    /**
     * @param idTipo_persona the idTipo_persona to set
     */
    public void setIdTipo_persona(TypePerson idTipo_persona) {
        this.idTipo_persona = idTipo_persona;
    }
    
    
}
