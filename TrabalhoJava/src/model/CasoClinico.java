
package model;


public class CasoClinico {
    private int id_casoClinico;
    private String titulo;
    private String descricao;
    private int fk_professor;
    private Professor professor; 
    private Pergunta pergunta;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
    
    

    public CasoClinico(){
        
    }
    
    public CasoClinico(int id_casoClinico, String titulo, String descricao, int fk_professor) {
        this.id_casoClinico = id_casoClinico;
        this.titulo = titulo;
        this.descricao = descricao;
        this.fk_professor = fk_professor;
    }

    public CasoClinico(String titulo, String descricao, int fk_professor) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.fk_professor = fk_professor;
    }

    public CasoClinico(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId_casoClinico() {
        return id_casoClinico;
    }

    public void setId_casoClinico(int id_casoClinico) {
        this.id_casoClinico = id_casoClinico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getFk_professor() {
        return fk_professor;
    }

    public void setFk_professor(int fk_professor) {
        this.fk_professor = fk_professor;
    }
    
    
    
}
