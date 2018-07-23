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
@Table( name = "sucursal", catalog = "gimnasio")
public class Sucursal {
    
    @GeneratedValue
    @Expose
    @Id
    @Column(name="idSucursal", nullable = false )
    private Integer idSucursal;
    
    @Expose
    @Column(name="nombre", nullable = false )
    private String nombre;
    
    @Expose
    @Column(name="telefono", nullable = false )
    private String telefono;
    
    @Expose
    @Column(name="eliminado", nullable = false )
    private Boolean eliminado;
    
    @Expose
    @Column(name="ultimo_editado", nullable = false )
    private Date ultimo_editado;
    
    @Expose
    @Column(name="idDireccion", nullable = false )
    private Address idDireccion; 
    
    @Expose
    @Column(name="idClub", nullable = false )
    private Club idClub; 

    /**
     * @return the idSucursal
     */
    public Integer getIdSucursal() {
        return idSucursal;
    }

    /**
     * @param idSucursal the idSucursal to set
     */
    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
     * @return the idDireccion
     */
    public Address getIdDireccion() {
        return idDireccion;
    }

    /**
     * @param idDireccion the idDireccion to set
     */
    public void setIdDireccion(Address idDireccion) {
        this.idDireccion = idDireccion;
    }

    /**
     * @return the idClub
     */
    public Club getIdClub() {
        return idClub;
    }

    /**
     * @param idClub the idClub to set
     */
    public void setIdClub(Club idClub) {
        this.idClub = idClub;
    }
    
}
