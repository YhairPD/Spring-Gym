/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Yhair
 */
@Controller
@RequestMapping("/membresia")
public class MemebresiaRestController {
    
    Gson gson;
    JSONObject jsonO;
    
    @RequestMapping( value = "", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String getAllMembresias(){
        return "";
    }
    
    @RequestMapping( value = "", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String saveMembresia(){
        return "";
    }
    
    @RequestMapping( value = "", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String updateMembresia(){
        return "";
    }
    
    @RequestMapping( value = "", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String deleteMembresia(){
        return "";
    }
    
}
