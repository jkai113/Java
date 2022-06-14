package Q1;

import java.util.Scanner;

public class Main {
    private  static int op;
    static funcs p = new funcs();
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        while(true){
            
            System.out.println("********MENU********");
            System.out.println("O que deseja fazer? \n 1- Criar contato. \n 2 - Remover contato. \n 3- Editar contato \n 4 - Listar em orderm alfabética.");
            op = teclado.nextInt();
            switch(op){
                case 1:
                p.CriaContato();
                break;
                case 2:
                p.RemoveContato();
                break;
                case 3:
                p.EditaContato();
                break;
                case 4:
                p.ListaContato();
                break;
                default:
                System.out.println("Inválido");
                break;
            }
                
        }
        


    }

}