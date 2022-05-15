/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula6;

import java.util.Scanner;

/** Nesta aula aprendemos a utilizar a estrutura de repetição while e do-while.
 *
 *
 * @author Catiane
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int op;
        do {
        System.out.println("1- Adição");
        System.out.println("4- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("Opção: ");
        op = input.nextInt();
        
       } while(op >4 || op<1); 
        
    }
    
}
