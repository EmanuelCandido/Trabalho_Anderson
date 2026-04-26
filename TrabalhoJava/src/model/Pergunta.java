
package model;


public class Pergunta {
    private int id_pergunta;
    private String enuciado;
    private int fk_casoCLinico;
    
    public Pergunta(){
        
    }

    public Pergunta(int id_pergunta, String enuciado, int fk_casoCLinico) {
        this.id_pergunta = id_pergunta;
        this.enuciado = enuciado;
        this.fk_casoCLinico = fk_casoCLinico;
    }

    public Pergunta(String enuciado, int fk_casoCLinico) {
        this.enuciado = enuciado;
        this.fk_casoCLinico = fk_casoCLinico;
    }

    public Pergunta(String enuciado) {
        this.enuciado = enuciado;
    }

    public int getId_pergunta() {
        return id_pergunta;
    }

    public void setId_pergunta(int id_pergunta) {
        this.id_pergunta = id_pergunta;
    }

    public String getEnuciado() {
        return enuciado;
    }

    public void setEnuciado(String enuciado) {
        this.enuciado = enuciado;
    }

    public int getFk_casoCLinico() {
        return fk_casoCLinico;
    }

    public void setFk_casoCLinico(int fk_casoCLinico) {
        this.fk_casoCLinico = fk_casoCLinico;
    }
    
    
}
