/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Beans.TypeRelationship;
import DAO.TypeRelationshipDAO;
import com.google.gson.Gson;
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
@RequestMapping("/TypeRelationship")
public class TypeRelationshipRestController {
    
    Gson gson;
    JSONObject jsonO;
    TypeRelationshipDAO typeDAO;
    
    @RequestMapping( value = "getAllTypeRelationships", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String getAllTypeRelationships(){
        jsonO = new JSONObject();
        typeDAO = new TypeRelationshipDAO();
        List<TypeRelationship> list = typeDAO.getAllTypeRelationship();
        jsonO.put("respose", list);
        return jsonO.toString();
    }
    
    @RequestMapping ( value = "getTypeRelationshipById", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String getTypeRelationshipById(){
        return "";
    }
    
    @RequestMapping( value = "saveTypeRelationship", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String saveTypeRelationship(
        @RequestParam("name") String name ){
        jsonO = new JSONObject();
        typeDAO = new TypeRelationshipDAO();
        Boolean transaction = typeDAO.saveType(name);
        jsonO.put("response", transaction);
        return jsonO.toString();
    }
    
    @RequestMapping( value = "updateTypeRelationship", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String updateTypeRelationship(
        @RequestParam("name") String name,
        @RequestParam("id") Integer id ){
        jsonO = new JSONObject();
        typeDAO = new TypeRelationshipDAO();
        TypeRelationship type = new TypeRelationship();
        type.setName(name);
        Boolean transaction = typeDAO.updateType(id, type);
        jsonO.put("response", transaction );
        return jsonO.toString();
    }
    
    @RequestMapping( value = "removeTypeRelationship", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String removeTypeRelationship(
        @RequestParam("id") Integer id ){
        jsonO = new JSONObject();
        typeDAO = new TypeRelationshipDAO();
        TypeRelationship type = typeDAO.getTypeById(id);
        type.setRemoved(Boolean.TRUE);
        Boolean transaction = typeDAO.updateType(id, type);
        jsonO.put("response", transaction );
        return jsonO.toString();
    }
    
}
