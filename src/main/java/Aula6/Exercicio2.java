/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula6;

import java.util.Scanner;

/** Nesta aula aprendemos a utilizar a estrutura de repetição while.
 *
 *
 * @author Catiane
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int i, f;
         
        System.out.println("inicio: ");
        i =input.nextInt();
        System.out.println("fim: ");
        f = input.nextInt();
       
       
        
        if(i<f){
            System.out.printf("%d deve ser maior que %d \n", i,f);
        } else {
        
        while(i >=f){
            System.out.println("i: " + i);
            i--;
        }
    }
    
}
}