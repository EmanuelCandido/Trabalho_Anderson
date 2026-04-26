/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
import util.conexao;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author emano
 */
public class ProfessorDao {
    public void cadastrar(Professor prof) throws SQLException{
        conexao conect = new conexao();
        Connection conn = conect.conectar();
        String sqlInserir = "INSERT INTO professor(nome,especialidade) values"+
                "('"+ prof.getNome()+"','"+ prof.getEspcialidade()+"')";
        System.out.println("100% em parabens\n"+ sqlInserir);
        conn.prepareStatement(sqlInserir).execute();
    }
    
    public Boolean login(Professor prof) throws SQLException{
        conexao conect = new conexao();
        Connection conn = conect.conectar();
        String sqlnome = "Select nome from professor where nome like '"+ prof.getNome()+"'";
        ResultSet resultado = conn.prepareStatement(sqlnome).executeQuery();
        if (resultado.next()){
            String nome = resultado.getString("nome");
            System.out.println("Nome encontrado no banco: " + nome);
            return true;
        }else{
            return false;
        }
        
        
        
        
    }
}
