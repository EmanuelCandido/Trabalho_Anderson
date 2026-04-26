
package model;


public class Professor {
    private int id_professor;
    private String nome;
    private String Espcialidade;
    
    public Professor(){
        
    }

    public Professor(int id_professor, String nome, String Espcialidade) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.Espcialidade = Espcialidade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }
    
    

    public Professor(String nome, String Espcialidade) {
        this.nome = nome;
        this.Espcialidade = Espcialidade;
    }

    public int getId_professor() {
        return id_professor;
    }

    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspcialidade() {
        return Espcialidade;
    }

    public void setEspcialidade(String Espcialidade) {
        this.Espcialidade = Espcialidade;
    }

    
    
}
