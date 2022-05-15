/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ADO3;

/** Exercício 3 - Crie um laço que imprima uma contagem regressiva de 100 a 0, 
mas que decremente de 5 em 5.
*
 * @author catiane
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ordem regressiva de 100 a 0");
        
        for(int i=100; i>=0; i--) {
            if(i % 5 ==0) {
                
                System.out.println(i);
            }
        }
    }
    
}
