package Q1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;


public class funcs {
    ArrayList<Contat> AgendaArrayList = new ArrayList();    
    private int CodAgenda = -1;
    private int CodEnd;
    private int Codmail;
    private int CodTel;
    Scanner teclado = new Scanner(System.in);
    String[] dados = new String[20];
    
    public funcs(){
       
    }
    // arrumemo tudo, só falta o Colletions.sort funciona esse LIXO DO CARALHO
    // e colocar a função pra alterar os dados do contato (q basicamente fodase)
   
    public void CriaContato(){
        // Index da agenda
        CodAgenda++;
        // Catando os dados da agenda
        System.out.println("*********Dados Principais*********");
        System.out.println("Digite o nome do contato: ");
        dados[0] = teclado.nextLine();
        System.out.println("Digite a data de nascimento do contato: ");
        dados[1] = teclado.nextLine();
        System.out.println("Digite o RG do contato: ");
        dados[2] = teclado.nextLine();
        
        Contat a = new Contat(dados[1], dados[0] , dados[2], CodAgenda, (Codmail + 1), Codmail, CodEnd, (CodEnd + 1), CodTel, CodTel + 1 , CodTel + 2);
        


        System.out.println("Digite o e-mail principal do contato: ");
        dados[3] = teclado.nextLine();
        a.getMemail().put(Codmail, dados[3]);
        Codmail++;

        System.out.println("Digite o e-mail secundário do contato: ");
        dados[4] = teclado.nextLine();
        a.getSemail().put(Codmail, dados[4]);
        Codmail++;

        System.out.println("Digite o telefone residencial do contato: ");
        dados[5] = teclado.nextLine();
        a.getTelResidencial().put(CodTel, dados[5]);
        CodTel++;

        System.out.println("Digite o telefone comercial do contato: ");
        dados[6] = teclado.nextLine();
        a.getTelComercial().put(CodTel, dados[6]);
        CodTel++;

        System.out.println("Digite o telefone celular do contato: ");
        dados[7] = teclado.nextLine();
        a.getTelCelular().put(CodTel, dados[7]);
        CodTel++;

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
        a.getEndResidencial().put(CodEnd, b);
        CodEnd++;

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
        CodEnd++;

        End c = new End(dados[14],  dados[15], dados[16],  dados[17], dados[18],  dados[19]);
        a.getEndComercial().put(CodEnd, c);
        CodEnd++;
        AgendaArrayList.add(a);
  
        

    }
    public void RemoveContato(){
        Scanner teclado = new Scanner(System.in);
        int op;
        int confirmacao;
        System.out.println("Digite o código do contato que deseja remover: ");
        op = teclado.nextInt();
        System.out.println("Certeza que deseja remover este contato? 1 - S / 0 - N");
        System.out.println(op);
        confirmacao = teclado.nextInt();
        if(confirmacao == 1){
            AgendaArrayList.remove(op);
            System.out.println("Contato removido!");
        }
        teclado.close();
    }

    public void EditaContato(){

    }

    public void ListaContato(){
        Collections.sort(AgendaArrayList);
        
        for (Contat t: AgendaArrayList) {
            System.out.println( "Código do contato: "+ t.getIndexContat() + "\n");
            System.out.println(t);
        }
    }

   
     
}
