/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author vitoria.csilva15
 */
public class CalculaMediaAlgoritmos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis
        double nota1, nota2, media;

        //Constante em java é FINAL 
        final double p1 = 0.4;
        final double p2 = 0.6;

        System.out.println("Welcome Bitch, vamos calcular a médias!");
        
        // usuário colocar dados
        System.out.println("nota 1:");
        nota1 = sc.nextDouble();

        System.out.println("nota 2:");
        nota2 = sc.nextDouble();

        System.out.println("Coloque a nota 1:");
        nota1 = sc.nextDouble();
        
        media = (nota1*p1) + (nota2+p2);
        
        System.out.println("A média: " + media);
    }
}
