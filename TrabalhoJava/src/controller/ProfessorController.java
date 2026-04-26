/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.SQLException;
import model.ProfessorService;
import model.Professor;

/**
 *
 * @author emano
 */
public class ProfessorController {
    private ProfessorService service;
    public ProfessorController(){
        service = new ProfessorService();
    }
    
    public void cadastrar(Professor prof) throws Exception{
        service.cadastrar(prof);
    }
    
    public Boolean login(Professor prof) throws SQLException, Exception{
        return service.login(prof);
    }
}
