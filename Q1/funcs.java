package Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class funcs {
    ArrayList<Contat> aulas = new ArrayList<>();
    private HashMap<String,String> Semail;
    private HashMap<String,String> Pemail;
    private HashMap<String,String> telefone;
    private HashMap<String,String> endereco;
    public funcs(){}

    public void CriaContato(){
        Scanner teclado = new Scanner(System.in);
        String[] dados = new String[10];
        System.out.println("Digite o nome do contato: ");
        dados[0] = teclado.nextLine();
        System.out.println("Digite a data de nascimento do contato: ");
        dados[1] = teclado.nextLine();
        System.out.println("Digite o RG do contato: ");
        dados[2] = teclado.nextLine();
        System.out.println("Digite o e-mail principal do contato: ");
        dados[3] = teclado.nextLine();
        System.out.println("Digite o e-mail secundário do contato: ");
        dados[4] = teclado.nextLine();
        System.out.println("Digite o telefone residencial do contato: ");
        dados[5] = teclado.nextLine();
        System.out.println("Digite o telefone comercial do contato: ");
        dados[6] = teclado.nextLine();
        System.out.println("Digite o telefone celular do contato: ");
        dados[7] = teclado.nextLine();
        Contat a = new Contat(dados[1], dados[0], dados[2]);
        
        aulas.add(a);
        Semail n = new Semail(); 
        Semail = (dados[0].dados[3]);

        
    }
    public void RemoveContato(){

    }
    public void EditaContato(){

    }

    public void ListaContato(){

    }

}
