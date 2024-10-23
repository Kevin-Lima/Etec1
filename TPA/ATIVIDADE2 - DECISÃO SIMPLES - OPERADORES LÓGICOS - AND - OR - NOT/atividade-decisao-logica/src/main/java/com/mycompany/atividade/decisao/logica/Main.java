
package com.mycompany.atividade.decisao.logica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade1 = scanner.nextInt();

        System.out.println("Digite a idade do seu amigo(a): ");
        int idade2 = scanner.nextInt();
        
        if(idade1 >= 18 && idade2 >=18){
            System.out.println("Voces ja são de maior.");
            
        }
       else if (idade1 >= 18 || idade2 >= 18) {
            System.out.println("Um de vocês é maior de idade.");
       }
        
       else if( !(idade1 < 18 || idade2 < 18) ){
           System.out.println("Um de vocês é maior de idade.");
       }
        
       else {
           System.out.println("Um de vocês é menor de idade.");
       }
        
       

    }
}
