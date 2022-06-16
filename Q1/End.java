package Q1;


public class End {
    private  String Logradouro;
    private String numero;
    private String Complemento;
    private String Bairro;
    private String CEP;
    private String Cidade;

    public End(String Logradouro, String numero, String Complemento, String Bairro, String CEP, String Cidade){
        this.Logradouro = Logradouro;
        this.numero = numero;
        this.Complemento = Complemento;
        this.Bairro = Bairro;
        this.CEP = CEP;
        this.Cidade = Cidade;
    }
    public String getBairro() {
        return Bairro;
    }
    public String getCEP() {
        return CEP;
    }
    public String getCidade() {
        return Cidade;
    }
    public String getComplemento() {
        return Complemento;
    }
    public String getLogradouro() {
        return Logradouro;
    }
    public int getNumero() {
        return numero;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    public void setCEP(String cEP) {
        CEP = cEP;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public void setComplemento(String complemento) {
        Complemento = complemento;
    }
    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    @Override
    public String toString() {
       
        return String.format(" Logradouro: " +  Logradouro + 
        "\n Numero: " + numero +
        "\n Complemento: " + Complemento +
        "\n Bairro: " + Bairro + 
        "\n CEP: " + CEP + 
        "\n Cidade: " +Cidade); 
  
    }

    
}