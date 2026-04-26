/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import util.conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author emano
 */
public class CasoClinicoDao {
    
    
    
    public void salvar(CasoClinico caso,String nome) throws SQLException{
        conexao conect = new conexao();
        Connection conn = conect.conectar();
        String sqlId = "SELECT id_professor from professor where nome ilike '"+ nome+"'";
        ResultSet resultado = conn.prepareStatement(sqlId).executeQuery();
        if (resultado.next()){
            int id = resultado.getInt("id_professor");
            String sqlInserir = "INSERT INTO caso_clinico(titulo,descricao,id_professor) values"+
                "('"+ caso.getTitulo()+"','"+ caso.getDescricao()+"',"+ id+")";
            conn.prepareStatement(sqlInserir).execute();
        }
        

    }
    
    public List<CasoClinico>listarTodos() throws SQLException{
        List<CasoClinico> lista = new ArrayList<>();
        conexao conect = new conexao();
        String sqlLista = "select p.nome,c.titulo,c.descricao,per.enunciado from caso_clinico c inner join professor p on c.id_professor = p.id_professor inner join pergunta per on per.id_casoclinico = c.id_casoclinico";
        try(Connection conn = conect.conectar();
        ResultSet rs = conn.prepareStatement(sqlLista).executeQuery()){
            while (rs.next()) {
                Professor prof = new Professor();
                prof.setNome(rs.getString("nome"));
                
                Pergunta per = new Pergunta();
                per.setEnuciado(rs.getString("enunciado"));
                
                
                CasoClinico caso = new CasoClinico();
                caso.setTitulo(rs.getString("titulo"));
                caso.setDescricao(rs.getString("descricao"));
                caso.setProfessor(prof);
                caso.setPergunta(per);
                lista.add(caso);
            }
        }catch (SQLException e) {
        System.err.println("Erro no DAO: " + e.getMessage());
    }
        return lista;
    }
    
    public List<CasoClinico>listarLeft() throws SQLException{
        List<CasoClinico> lista = new ArrayList<>();
        conexao conect = new conexao();
        String sqlLista = "select p.nome,c.titulo,c.descricao,per.enunciado from caso_clinico c left join professor p on c.id_professor = p.id_professor left join pergunta per on per.id_casoclinico = c.id_casoclinico";
        try(Connection conn = conect.conectar();
        ResultSet rs = conn.prepareStatement(sqlLista).executeQuery()){
            while (rs.next()) {
                Professor prof = new Professor();
                prof.setNome(rs.getString("nome"));
                
                Pergunta per = new Pergunta();
                per.setEnuciado(rs.getString("enunciado"));
                
                
                CasoClinico caso = new CasoClinico();
                caso.setTitulo(rs.getString("titulo"));
                caso.setDescricao(rs.getString("descricao"));
                caso.setProfessor(prof);
                caso.setPergunta(per);
                lista.add(caso);
            }
        }catch (SQLException e) {
        System.err.println("Erro no DAO: " + e.getMessage());
    }
        return lista;
    }
    
    public void editarDescricao(String titulo,String novaDescricao) throws SQLException{
        conexao conect = new conexao();
        Connection conn = conect.conectar();
        String sqlEditar = "update caso_clinico set descricao = '"+novaDescricao+"' where titulo = '"+titulo+"'";
        conn.prepareStatement(sqlEditar).execute();
        
    }
    
    public void excluir(String titulo,String novaDescricao) throws SQLException{
        conexao conect = new conexao();
        Connection conn = conect.conectar();
        String sqlPergunta = "delete from pergunta where id_casoclinico = (select id_casoclinico from caso_clinico where descricao = '"+novaDescricao+"' and titulo = '"+titulo+"')";
        conn.prepareStatement(sqlPergunta).execute();
        String sqlExcluir = "delete from caso_clinico where descricao = '"+novaDescricao+"' and titulo = '"+titulo+"'";
        conn.prepareStatement(sqlExcluir).execute();
        
    }
    
    public void perguntaAdd(String titulo,String Descricao,String pergunta) throws SQLException{
        conexao conect = new conexao();
        Connection conn = conect.conectar();
        String sqlId = "Select id_casoclinico from caso_clinico where titulo like '"+titulo+"' and descricao like '"+Descricao+"'";
        ResultSet resultado = conn.prepareStatement(sqlId).executeQuery();
        if (resultado.next()){
            int id = resultado.getInt("id_casoclinico");
            String sqlInserir = "INSERT INTO pergunta(enunciado,id_casoclinico) values"+
                "('"+pergunta+"',"+ id+")";
            conn.prepareStatement(sqlInserir).execute();
        }
        
    }
    
}
