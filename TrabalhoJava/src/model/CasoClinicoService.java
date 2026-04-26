/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author emano
 */
public class CasoClinicoService {
    
    
    
    public void salvar(CasoClinico caso,String nome) throws Exception{
        if (caso.getDescricao().isEmpty() || caso.getTitulo().isEmpty()){
            throw new Exception("Não é Possivel Salvar com espaço vazio");
        }else{
            CasoClinicoDao dao = new CasoClinicoDao();
            dao.salvar(caso,nome);
        }
    }
    
    
}
