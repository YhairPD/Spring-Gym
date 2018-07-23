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
@Table( name = "instructor", catalog = "gimnasio")
public class Instructor {
    
    @GeneratedValue
    @Expose
    @Id
    @Column(name="idInstructor", nullable = false )
    private Integer idInstructor;
    
}
