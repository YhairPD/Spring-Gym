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
@Table( name = "membresia", catalog = "gimnasio")
public class Membresia {
    
    @GeneratedValue
    @Expose
    @Id
    @Column(name="idMembresia", nullable = false )
    private Integer idMembresia;
}
