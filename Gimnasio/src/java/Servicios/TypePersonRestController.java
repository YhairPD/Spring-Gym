/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Beans.TypePerson;
import DAO.TypePersonDAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Yhair
 */
@Controller
@RequestMapping("/TypePerson")
public class TypePersonRestController {
    
    Gson gson;
    JSONObject jsonO;
    TypePersonDAO type_person;
    
    //http://localhost:8080/Gimnasio/TypePerson/getTypePersons.htm
    @RequestMapping( value = "getTypePersons", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String getAllTypePersons(){
        type_person = new TypePersonDAO();
        jsonO = new JSONObject();
        List<TypePerson> list = type_person.getAllTypePerson();
        jsonO.put("person_kind", list);
        return jsonO.toString();
    }
    
    @RequestMapping( value = "getTypePersonById", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String getTypePersonById(
        @RequestParam("id") Integer id ){
        type_person = new TypePersonDAO();
        jsonO = new JSONObject();
        gson = new  Gson();
        TypePerson type = type_person.getTypeById( id );
        //jsonO.put("kind_person", (List)kind);
        jsonO.put("kind_person", type);
        //gson.toJson( kind, TypePerson.class );
        System.out.println(gson.toJson(type, TypePerson.class));
        //System.out.println(gson.toJson(kind, TypePerson.class));
        System.out.println(jsonO.toString());
        return jsonO.toString();
    }
    
    //http://localhost:8080/Gimnasio/TypePerson/saveTypePerson.htm?name=Administrador
    @RequestMapping( value = "saveTypePerson", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String saveTypePerson(
        @RequestParam("name") String name){
        type_person = new TypePersonDAO();
        jsonO = new JSONObject();
        Boolean transaction = type_person.saveType( name );
        jsonO.put("response", transaction);
        return jsonO.toString();
    }
    
    //http://localhost:8080/Gimnasio/TypePerson/updateTypePerson.htm?id=1&name=Administrador
    @RequestMapping( value = "updateTypePerson", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String updateTypePerson(
        @RequestParam("id") Integer id,
        @RequestParam("name") String name ){
        type_person = new TypePersonDAO();
        jsonO = new JSONObject();
        TypePerson typePersonUpdate = new TypePerson();
        typePersonUpdate.setName(name);
        Boolean transaction = type_person.updateType(id, typePersonUpdate);
        jsonO.put("response", transaction ); 
        return jsonO.toString();
    }
    
    //http://localhost:8080/Gimnasio/TypePerson/deleteTypePerson.htm?id=1
    @RequestMapping( value = "deleteTypePerson", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String deleteTypePerson(
        @RequestParam("id") Integer id ){
        type_person = new TypePersonDAO();
        jsonO = new JSONObject();
        TypePerson type = type_person.getTypeById( id );
        type.setRemoved(Boolean.TRUE);
        Boolean transaction = type_person.updateType(id, type);
        jsonO.put("response", transaction );
        return jsonO.toString();
    }
    
}
