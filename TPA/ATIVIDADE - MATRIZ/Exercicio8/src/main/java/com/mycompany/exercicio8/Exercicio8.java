
package com.mycompany.exercicio8;

public class Exercicio8 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 42, 23, 14, 51}, {22, 32, 55, 54, 12}};

        //algumas alterações aqui tbm
        
        System.out.println("Exibindo apenas os elementos pares da matriz:");

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (matriz[linha][coluna] % 2 == 0) {
                    System.out.print(matriz[linha][coluna] + " ");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}