package com.mycompany.atividade1;

import javax.swing.JOptionPane;

public class Atividade1 {

    public static void main(String[] args) {
        // Declaração das variáveis para armazenar as notas e a média
        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, nota5 = 0, media = 0;
        
        // Pede para o usuário digitar a 1ª nota e armazena em nota1
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota"));
        // Pede para o usuário digitar a 2ª nota e armazena em nota2
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota"));
        // Pede para o usuário digitar a 3ª nota e armazena em nota3
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota"));
        // Pede para o usuário digitar a 4ª nota e armazena em nota4
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4ª nota"));
        // Pede para o usuário digitar a 5ª nota e armazena em nota5
        nota5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 5ª nota"));

        // Calcula a média das notas
        media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        
        // Verifica se a média é maior ou igual a 5
        if (media > 5) {
            // Se a média é 5 ou maior, exibe mensagem de aprovação
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado com média: " + media);
        } else {
            // Se a média é menor que 5, exibe mensagem de reprovação
            JOptionPane.showMessageDialog(null, "O aluno não foi aprovado. Média: " +media);
        }
    }
}

