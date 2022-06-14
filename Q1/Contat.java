package Q1;

import java.sql.Date;
import java.util.HashMap;


public class Contat {
    private String nome;
    private String Rg;
    private String dataNaci;

    private HashMap<String,String> email;
    private HashMap<String,String> telefone;
    private HashMap<String,String> enderesso;

    //getters e setters do NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    //getters e setters do RG
    public String getRg() {
        return Rg;
    }
    public void setRg(String rg) {
        this.Rg = rg;
    }
    //getters e setters de EMAIL
    public HashMap<String, String> getEmail() {
        return email;
    }
    public void setEmail(HashMap<String, String> email) {
        this.email = email;
    }
    //getters e setters de Telefone
    public HashMap<String, String> getTelefone() {
        return telefone;
    }
    public void setTelefone(HashMap<String, String> telefone) {
        this.telefone = telefone;
    }

    //criando a construtora
    public Contat(String dataNaci, String nome, String Rg){
        this.nome = nome;
        this.Rg = Rg;
        this.dataNaci = dataNaci;
        this.email = new HashMap<String, String>();
        this.telefone = new HashMap<String, String>();
        this.enderesso = new HashMap<String, String>();
    }
    //Criando a Saida
    @Override 
    public String toString() {        
        return String.format("Nome: %s;RG: %d;Email: %s;Telefone: %s;Enderesso: %s;",nome,Rg,email,telefone,enderesso);
    }
    
}