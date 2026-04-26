/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.ProfessorController;
import java.sql.SQLException;

/**
 *
 * @author emano
 */
public class ProfessorService {
    public void cadastrar(Professor prof) throws Exception{
        if (prof.getNome().isEmpty() || prof.getEspcialidade() == null){
            
            throw new Exception("Informações Incompletas");
        }else{
            ProfessorDao dao = new ProfessorDao();
            dao.cadastrar(prof);
        }
    }
    
    public Boolean login(Professor prof) throws SQLException, Exception{
        if (prof.getNome().isEmpty()){
            throw new Exception("Login vazio");
        }else{
            ProfessorDao dao = new ProfessorDao();
            return dao.login(prof);
        }
    }
}
