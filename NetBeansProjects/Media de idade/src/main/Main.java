
package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner tst = new Scanner(System.in);   
        int idade=1, alunoqt=0, soma=0;
        double media=0;
    
    while (idade != 0){
    
        System.out.println("Digite a idade do aluno ou 0 pra sair");
         idade=tst.nextInt();
         
         alunoqt=alunoqt+idade;
         soma++;
         
        }
    soma=soma-1;
    media= alunoqt/soma;
    
    System.out.println("A média das idades é:  " +media);
    }
    
}
