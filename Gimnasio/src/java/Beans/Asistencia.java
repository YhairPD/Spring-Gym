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
@Table( name = "asistencia", catalog = "gimnasio")
public class Asistencia {
    
    @GeneratedValue
    @Expose
    @Id
    @Column(name="idAsistencia", nullable = false )
    private Integer idAsistencia;
    
    @Expose
    @Column(name="fecha", nullable = false )
    private Date fecha;
    
    @Expose
    @Column(name="idSocio", nullable = false )
    private Socio idSocio;

    /**
     * @return the idAsistencia
     */
    public Integer getIdAsistencia() {
        return idAsistencia;
    }

    /**
     * @param idAsistencia the idAsistencia to set
     */
    public void setIdAsistencia(Integer idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idSocio
     */
    public Socio getIdSocio() {
        return idSocio;
    }

    /**
     * @param idSocio the idSocio to set
     */
    public void setIdSocio(Socio idSocio) {
        this.idSocio = idSocio;
    }
    
}
