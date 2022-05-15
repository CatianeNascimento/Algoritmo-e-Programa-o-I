/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO3;

import java.util.Scanner;

/** Exercício 2 - Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, 
um valor por linha,inclusive o X, se for o caso.
 *
 * @author Catiane
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num; 
        System.out.println("Insira um número maior que 1: ");
        num= input.nextInt();
        
        for(int i=1; i<=num; i++) {
           if(i % 2 != 0) {  
                System.out.println(i + " é número ímpar");
           }         
       
           }
    }
    
}
