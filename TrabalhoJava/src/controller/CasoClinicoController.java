/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.CasoClinico;
import model.CasoClinicoService;
import model.Professor;

/**
 *
 * @author emano
 */
public class CasoClinicoController {
        private CasoClinicoService service;
        
    public CasoClinicoController(){
        service = new CasoClinicoService();
    }
        
    public void salvar(CasoClinico caso,String nome)throws Exception{
        service.salvar(caso,nome);
    }
    
    
    
    
}
