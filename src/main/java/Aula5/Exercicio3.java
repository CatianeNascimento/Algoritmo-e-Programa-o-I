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
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String usuario, user;
        int senha, pwd;
       //dados "armazenados" para serem válidados.
       
       user = "Teste123"; 
       pwd = 123; 
        
       
       for(int i=1; i<=3; i++) {
           System.out.println("Usuário: ");
           usuario = input.next();
           System.out.println("Senha: ");
           senha = input.nextInt();
           
           if(usuario.equals(user) && senha == pwd) {
               System.out.println("Login efetuado");
               break;
           }else {
              
               System.out.println("Tente novamente, você possui " + (3-i) + " tentativas");
           }
       } 
       
    }
    
}
