/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/**Fazer um algoritmo que lê dois números inteiros e imprime os números consecutivos desses números.
 * (Por exemplo: se o usuário digitar 2 e -9, a saída deverá ser 3 e -8, porque 3 é consecutivo de 2.
 * –8 é consecutivo de –9)
 *
 * @author Catiane
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // criação de objeto scanner
    Scanner imput = new Scanner (System.in);
    
    // declaração de váriavéis 
    double n1, n2, c1, c2;
    
    // entrada de dados
    System.out.println("Números consecutivos");
    System.out.println("Digite n1 ");
    n1 = imput.nextDouble();
    System.out.println("Digite n2 ");
    n2 = imput.nextDouble();
    
    // processamento de dados
    c1 = n1 + 1;
    c2 = n2 + 1;
    
    //saída de dados
    System.out.println("O número consecultivo de n1 é " + c1 + " E o número consecultivo de n2 é " + c2);
 
    }
}
