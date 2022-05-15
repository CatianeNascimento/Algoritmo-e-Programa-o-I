/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que lê dois números, a base e o expoente, e imprime a potência (base elevada ao 
expoente). Dica: use a função matemática Math.pow(). Exemplo: 5 elevado ao cubo ficaria 
Math.pow(5, 3). Você pode trocar esses números por variáveis
 *
 * @author Catiane
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criação de objeto scanner 
        Scanner imput = new Scanner (System.in);
        
        //declaração de variáveis
        double n1, n2, produto;
        
        // entrada de dados
        System.out.println("Potenciação");
        System.out.println("Insira o número base ");
        n1 = imput.nextDouble();
        System.out.println("Insira o expoente do número base ");
        n2 = imput.nextDouble();
        
        //processamento de dados
        produto =  Math.pow(n1, n2);
           
        System.out.println("A potência dos números inseridos é: "+ produto);
    }
    
}
