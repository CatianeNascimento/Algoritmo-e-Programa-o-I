/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula5;

import java.util.Scanner;

/**Nesta aula aprendemos a utilizar a estrutura de repetição for.
 *
 * @author Catiane
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, somaP = 0, somaI = 0;
        String nome = "Catiane";
        
        for(int i=0; i<5; i++) {
            System.out.println("Número: ");
            num = input.nextInt();
            
            if(num % 2 == 0) {
            somaP = somaP + num;
                System.out.printf("%s, o número %d é par \n", nome, num);
        } else {
                somaI = somaI + num; 
                System.out.printf("%s,o número %d é impar \n", nome, num);
            }
        }
        System.out.printf("%s, o total de números pares foi %d,\n e o total de números "
                + "ímpares foi %d", nome, somaP, somaI);
    
    

    
}
}
