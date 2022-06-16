package Q1;

import java.sql.Date;
import java.util.HashMap;


public class Contat implements Comparable<Contat>{
    private String nome;
    private String Rg;
    private String dataNasci;
    private int indexContat;
    private int CodmailP;
    private int CodmailS;
    private int Codendcomerc;
    private int Codendresidencial;
    private int CodTelCel;
    private int CodTelResi;
    private int CodTelComerc;

    private HashMap<Integer,String> Semail;
    private HashMap<Integer,String> Memail;
    private HashMap<Integer,String> telComercial;
    private HashMap<Integer,String> telCelular;
    private HashMap<Integer,String> telResidencial;
    private HashMap<Integer,End> EndComercial;
    private HashMap<Integer,End> EndResidencial;
    

  

  

    //criando a construtora
    public Contat(String dataNasci, String nome, String Rg, int indexContat, int CodmailP, int CodmailS, int Codendcomerc, int Codendresidencial, int CodTelCel, int CodTelResi, int CodTelComerc) {
        this.indexContat = indexContat;
        this.CodmailP = CodmailP;
        this.CodmailS = CodmailS;
        this.Codendcomerc = Codendcomerc;
        this.Codendresidencial =Codendresidencial;
        this.CodTelCel = CodTelCel;
        this.CodTelResi = CodTelResi;
        this.CodTelComerc = CodTelComerc;
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
    public int getCodTelCel() {
        return CodTelCel;
    }
    public int getCodTelComerc() {
        return CodTelComerc;
    }
    public int getCodTelResi() {
        return CodTelResi;
    }
    public int getCodendcomerc() {
        return Codendcomerc;
    }
    public int getCodendresidencial() {
        return Codendresidencial;
    }
    public int getCodmailP() {
        return CodmailP;
    }
    public int getCodmailS() {
        return CodmailS;
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
    public int compareTo(Contat o) {
       return this.nome.compareTo(o.nome);
    }
    @Override
    public String toString() {
        
        return String.format("----------------------------------------- \n Nome: " + nome +" \n"+
                            "RG: " +Rg +"\n" +
                            "Data de Nascimento : " + dataNasci +"\n" +
                            "------------Emails------------------\n" +
                            "Email Principal: " + Memail.get(getCodmailP()) +"\n" +
                            "Email Secundário: "+ Semail.get(getCodmailS()) +"\n" +
                            "------------Telefones------------------\n" +
                            "Telefone Comercial: "+ telComercial.get(getCodTelComerc()) + "\n" +
                            "Telefone Residencial: " + telResidencial.get(getCodTelResi()) + "\n" +
                            "Telefone Celular: " + telCelular.get(getCodTelCel())+ "\n" +
                            "------------Endereços------------------\n" +
                            "Endereço comercial: \n" + EndComercial.get(getCodendcomerc()) +"\n Endereço Residencial: \n"+ EndResidencial.get(getCodTelResi()) );
    }
    
    public int getIndexContat() {
        return indexContat;
    }
}