
package tiposdevariaveis;

import java.util.Scanner;

/**
 * @author Moana, Bela, Ariel, Malevóla e TinkerBell
 */
public class TiposDeVariaveis {

    public static void main(String[] args) {
       byte idade = 23;
       int rg = 1195661341;
       float salario = 600.00f;
       double decimoTerceiro = 450.50;
       String nome = "Luana Reis";
       char inicial = 'L';
      
       //Entrevista
       Scanner ler = new Scanner(System.in);
       System.out.println("Digite seu nome:");
       String nomePessoa = ler.nextLine();// nextLine ajuda a ler informações da proxima linha
       System.out.println("Informe sua idade:");
       int idadePessoa = ler.nextInt();
       System.out.println("Informe seu salário:");
       float salarioPessoa = ler.nextFloat();
       
       System.out.println(nomePessoa+" tem "+idadePessoa+" anos e ganha"+salarioPessoa);
       
    }
    
    
}
