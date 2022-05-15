/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Atividade1;

import java.util.Scanner;

/** Fazer um algoritmo que lê dois números e imprime a soma dos quadrados dos dois números. O quadrado 
de um número A é representado por A2 = A * A.
 *
 * @author Catiane
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criação de objeto scanner
        Scanner imput = new Scanner (System.in);
        
        //declaração de váriaveis 
        int n1, n2;
        double qn1, qn2, soma;
             
       //entrada de dados
       System.out.println("Soma de dois expoentes");
       System.out.println("Digite o primeiro número ");
       n1 = imput.nextInt();
       System.out.println("Digite o segundo número");
       n2 = imput.nextInt();
       
       //processamento de dados
       qn1 = Math.pow(n1, 2);
       qn2 = Math.pow(n2, 2);
       soma = qn1 + qn2;
       
       //saída de dados
        System.out.println("A potência do primeiro número é " + qn1);
        System.out.println("E do segundo número é " + qn2);
        System.out.println("O resultado da soma das duas potências é " + soma);
       
    }
    
}
