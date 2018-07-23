/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Yhair
 */
@Controller
@RequestMapping("administrador.htm")
public class AdministradorController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String adminView(Model model){
        return "Administrador";
    }
    
}
