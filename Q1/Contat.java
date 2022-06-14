package Q1;

import java.sql.Date;
import java.util.HashMap;


public class Contat implements Comparable<Contat>{
    private String nome;
    private String Rg;
    private String dataNasci;

    private HashMap<Integer,String> Semail;
    private HashMap<Integer,String> Memail;
    private HashMap<Integer,String> telComercial;
    private HashMap<Integer,String> telCelular;
    private HashMap<Integer,String> telResidencial;
    private HashMap<Integer,End> EndComercial;
    private HashMap<Integer,End> EndResidencial;

  

  

    //criando a construtora
    public Contat(String dataNasci, String nome, String Rg) {
        this.nome = nome;
        this.Rg = Rg;
        this.dataNasci = dataNasci;
        this.Semail = new HashMap<Integer, String>();
        this.Memail = new HashMap<Integer, String>();
        this.telComercial = new HashMap<Integer, String>();
        this.telCelular = new HashMap<Integer, String>();
        this.telResidencial = new HashMap<Integer, String>(); 
        this.EndComercial = new HashMap<Integer, End>(); 
        this.EndResidencial = new HashMap<Integer, End>();
    }
    public String getNome() {
        return nome;
    }
    public String getRg() {
        return Rg;
    }
    public String getDataNasci() {
        return dataNasci;
    }
    public HashMap<Integer, End> getEndComercial() {
        return EndComercial;
    }
    public HashMap<Integer, End> getEndResidencial() {
        return EndResidencial;
    }
    public HashMap<Integer, String> getMemail() {
        return Memail;
    }
    public HashMap<Integer, String> getSemail() {
        return Semail;
    }
    public HashMap<Integer, String> getTelCelular() {
        return telCelular;
    }
    public HashMap<Integer, String> getTelComercial() {
        return telComercial;
    }
    public HashMap<Integer, String> getTelResidencial() {
        return telResidencial;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRg(String rg) {
        this.Rg = rg;
    }
    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }
    public void setEndComercial(HashMap<Integer, End> endComercial) {
        EndComercial = endComercial;
    }
    public void setEndResidencial(HashMap<Integer, End> endResidencial) {
        EndResidencial = endResidencial;
    }
    public void setMemail(HashMap<Integer, String> memail) {
        Memail = memail;
    }
    public void setSemail(HashMap<Integer, String> semail) {
        Semail = semail;
    }
    public void setTelCelular(HashMap<Integer, String> telCelular) {
        this.telCelular = telCelular;
    }
    public void setTelComercial(HashMap<Integer, String> telComercial) {
        this.telComercial = telComercial;
    }
    public void setTelResidencial(HashMap<Integer, String> telResidencial) {
        this.telResidencial = telResidencial;
    }
    @Override
    public int compareTo(Pessoa o) {
        //typecast de o para Pessoa
        //Pessoa p = (Pessoa) o;
        if(this.idade > o.idade){
            return 1;
        }else if(this.idade < o.idade){
            return -1;
        }
        return 0;
    }
}