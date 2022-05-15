/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula6;

import java.util.Scanner;

/** Nesta aula aprendemos a utilizar a estrutura de repetição while e do-while.

 *
 * @author Catiane
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x, soma=0, i=0;
        
        while(i < 10) {
            System.out.println("Numero: ");
            x = input.nextInt();
            
            if(x <0) {
                break;
            }
            
            soma+=x; //soma=soma+x;
            i++;
            
            
        }
        System.out.println("Resultado " + soma);
    }   

    
}
