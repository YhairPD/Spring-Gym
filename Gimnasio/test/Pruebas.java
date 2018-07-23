/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Beans.Address;
import Beans.Genero;
import Beans.TypePerson;
import Beans.TypeRelationship;
import DAO.AddressDAO;
import DAO.GeneroDAO;
import DAO.TypePersonDAO;
import DAO.TypeRelationshipDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yhair
 */
public class Pruebas {
    
    public Pruebas() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Pruebas. For example:
    //
    @Test
    public void hello() {
        JSONObject jsonObject = new JSONObject();
        
        TypePersonDAO tipo_personaDAO = new TypePersonDAO();
        TypeRelationshipDAO tipo_relacionDAO = new TypeRelationshipDAO();
        AddressDAO direccionDAO = new AddressDAO();
        GeneroDAO generoDAO = new GeneroDAO();
                
        //TIPO PERSONA
        tipo_personaDAO.saveType("Administrador");
        
        /*
        List<Tipo_persona> lista = tipo_personaDAO.getAllTipoPersona();
        jsonObject.put("tipo_persona", lista);
        System.out.println("" + jsonObject.toString());
        */
    
        //TIPO RELACION
        //tipo_relacionDAO.saveTipo("Familiar");
        
        /*
        List<Tipo_relacion> listaTipopersona = tipo_relacionDAO.getAllTipoRelacion();
        jsonObject.put("tipo_relacion", listaTipopersona);
        System.out.println("" + jsonObject.toString());
        */
        
        //DIRECCION
        //direccionDAO.savePersona("Fernando Espinoza", "622", "44810", "Guadalajara", "Jalisco", "Mexico");
        
        /*
        List<Direccion> listaDireccion = direccionDAO.getAllDireccion();
        jsonObject.put("direccion", listaDireccion);
        System.out.println("" + jsonObject.toString());
        */
        
        //GENERO
        //generoDAO.saveGenero("Masculino");
        
        /*
        List<Genero> listaGenero = generoDAO.getAllGenero();
        jsonObject.put("genero", listaGenero);
        System.out.println("" + jsonObject.toString());
        */
        
    }
}
