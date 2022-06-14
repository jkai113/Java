package Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class funcs {
    ArrayList<Contat> AgendaArrayList = new ArrayList<>();
    private int CodAgenda = -1;
    Scanner teclado = new Scanner(System.in);
    String[] dados = new String[20];
    public funcs(){
       
    }


    public void CriaContato(){
        CodAgenda++;
        System.out.println("*********Dados Principais*********");
        System.out.println("Digite o nome do contato: ");
        dados[0] = teclado.nextLine();
        System.out.println("Digite a data de nascimento do contato: ");
        dados[1] = teclado.nextLine();
        System.out.println("Digite o RG do contato: ");
        dados[2] = teclado.nextLine();

        Contat a = new Contat(dados[1], dados[0], dados[2]);
       

        System.out.println("Digite o e-mail principal do contato: ");
        dados[3] = teclado.nextLine();
        a.getMemail().put(CodAgenda, dados[3]);

        System.out.println("Digite o e-mail secundário do contato: ");
        dados[4] = teclado.nextLine();
        a.getSemail().put(CodAgenda, dados[4]);

        System.out.println("Digite o telefone residencial do contato: ");
        dados[5] = teclado.nextLine();
        a.getTelResidencial().put(CodAgenda, dados[5]);

        System.out.println("Digite o telefone comercial do contato: ");
        dados[6] = teclado.nextLine();
        a.getTelComercial().put(CodAgenda, dados[6]);

        System.out.println("Digite o telefone celular do contato: ");
        dados[7] = teclado.nextLine();
        a.getTelCelular().put(CodAgenda, dados[7]);

        System.out.println("*********Endereço Residencial*********");

        System.out.println("Digite o logradouro do contato: ");
        dados[8] = teclado.nextLine();

        System.out.println("Digite o número de endereço do contato: ");
        dados[9] = teclado.nextLine();

        System.out.println("Digite o complemento de endereço do contato: ");
        dados[10] = teclado.nextLine();

        System.out.println("Digite o bairro de endereço do contato: ");
        dados[11] = teclado.nextLine();

        System.out.println("Digite o CEP de endereço do contato: ");
        dados[12] = teclado.nextLine();

        System.out.println("Digite a Cidade de endereço do contato: ");
        dados[13] = teclado.nextLine();
        
        End b = new End(dados[8],  dados[9], dados[10],  dados[11], dados[12],  dados[13]);
        a.getEndResidencial().put(CodAgenda, b);

        System.out.println("*********Endereço Comercial*********");

        System.out.println("Digite o logradouro do contato: ");
        dados[14] = teclado.nextLine();

        System.out.println("Digite o número de endereço do contato: ");
        dados[15] = teclado.nextLine();

        System.out.println("Digite o complemento de endereço do contato: ");
        dados[16] = teclado.nextLine();

        System.out.println("Digite o bairro de endereço do contato: ");
        dados[17] = teclado.nextLine();

        System.out.println("Digite o CEP de endereço do contato: ");
        dados[18] = teclado.nextLine();

        System.out.println("Digite a Cidade de endereço do contato: ");
        dados[19] = teclado.nextLine();

        End c = new End(dados[14],  dados[15], dados[16],  dados[17], dados[18],  dados[19]);
        a.getEndResidencial().put(CodAgenda, c);
    }
    public void RemoveContato(){

    }
    public void EditaContato(){


    }

    public void ListaContato(){
        Colletions.sort(Contat);
        for (Contat af : AgendaArrayList) {
            System.out.println(af);
        }

    }

    //Criando a Saida
     @Override 
     public String toString()  {        
         return String.format();
     }
     
}
