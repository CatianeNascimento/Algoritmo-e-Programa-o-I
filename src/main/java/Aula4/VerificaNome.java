/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula4;

import java.util.Scanner;

/**Nesta aula aprendemos a utilizar a estrutura condicional switch case.
 *
 * @author Catiane
 */
public class VerificaNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String nome, sobrenome;
        
        System.out.println("Nome ");
        nome = input.next();
        
        switch(nome) {
            case "Catiane":
            case "CATIANE":
            case "catiane":
                System.out.println("Sobrenome: ");
                sobrenome = input.next();
                
        if(sobrenome.equals("SOUZA") || sobrenome.equals("souza") || sobrenome.equals("Souza")) {
                    System.out.println("PASSOU");
                    break;
        }else {
            System.out.println("Usuário não cadastrado");
        }
            default: {
                System.out.println("Usuário não cadastrado");
            }
    }
  }
}
