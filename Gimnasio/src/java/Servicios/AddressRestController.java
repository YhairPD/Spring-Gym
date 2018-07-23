/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Beans.Address;
import DAO.AddressDAO;
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
@RequestMapping("/address")
public class AddressRestController {
    
    Gson gson;
    JSONObject jsonO;
    Address address;
    AddressDAO addressDAO;
    
    @RequestMapping( value = "getAllAddresses", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String getAllAddress(){
        jsonO = new JSONObject();
        addressDAO = new AddressDAO();
        return jsonO.toString();
    }
    
    @RequestMapping( value = "getAddressById", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String getAddressById(){
        jsonO = new JSONObject();
        addressDAO = new AddressDAO();
        return jsonO.toString();
    }
    
    @RequestMapping( value = "saveAddress", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String saveAddress(){
        jsonO = new JSONObject();
        addressDAO = new AddressDAO();
        return jsonO.toString();
    }
    
    @RequestMapping( value = "updateAddress", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String updateAddress(){
        jsonO = new JSONObject();
        addressDAO = new AddressDAO();
        return jsonO.toString();
    }
    
    @RequestMapping( value = "removeAddress", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody String removeAddress(){
        jsonO = new JSONObject();
        addressDAO = new AddressDAO();
        return jsonO.toString();
    }
    
}
