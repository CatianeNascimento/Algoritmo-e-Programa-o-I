/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PROVA;

import java.util.Scanner;

/**
 *
 * 
 */
public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        int quantidadeNotas, cont = 1;
        float notas, soma = 0, media, maior = 0, menor = 10;

        System.out.println("Digite o nome do aluno: ");
        nome = input.next();
        System.out.println("Digite a quantidade de notas que deseja inserir de " + nome );
        quantidadeNotas = input.nextInt();

        while (cont <= quantidadeNotas) {
            System.out.println("Insira a " +  cont + "º nota de " + nome);
            notas = input.nextFloat();
            soma = soma + notas;

            if (notas > maior) {
                maior = notas;
            } 
            if (notas < menor) {
                menor = notas;
            }
            cont++;
        }

        media = soma / quantidadeNotas;
        System.out.println(" A maior nota de " + nome + " foi " + maior + " e a menor foi "
                + menor + ". A média de " + nome + " foi " + media);

    }

}
