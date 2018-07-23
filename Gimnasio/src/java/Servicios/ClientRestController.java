/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import com.google.gson.Gson;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yhair
 */
@RestController
@RequestMapping("/rest")
public class ClientRestController {
    
    Gson gson;
    JSONObject jsonO;
    
    
    @RequestMapping(value = "entrar", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody String getPersona(
                @RequestParam String correo,
                @RequestParam String contrasena
                ){
        jsonO = new JSONObject();
        
        return jsonO.toString();
    }
    
    
}
