package com.mycompany.atividade3;

// Importa a classe JOptionPane para mostrar mensagens e pedir informações
import javax.swing.JOptionPane;
// Importa a classe Calendar para trabalhar com datas
import java.util.Calendar;


public class Atividade3 {
   
    public static void main(String[] args) {
        
        // Pede ao usuário para informar o dia de nascimento e guarda na variável diaNascimento
        int diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de nascimento:"));
        
        // Pede ao usuário para informar o mês de nascimento e guarda na variável mesNascimento
        int mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de nascimento:"));
        
        // Pede ao usuário para informar o ano de nascimento e guarda na variável anoNascimento
        int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento:"));

        // Cria um objeto Calendar para obter a data e hora atuais
        Calendar calendario = Calendar.getInstance();
        
        // Obtém o ano atual
        int anoAtual = calendario.get(Calendar.YEAR);
        
        // Obtém o mês atual (os meses vão de 0 a 11, então adiciona 1 para o mês correto)
        int mesAtual = calendario.get(Calendar.MONTH) + 1;
        
        // Obtém o dia atual
        int diaAtual = calendario.get(Calendar.DATE);

        // Calcula a idade baseada na diferença de anos
        int idade = anoAtual - anoNascimento;

        // Ajusta a idade se a pessoa ainda não fez aniversário este ano
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--; // Diminui 1 da idade se o aniversário ainda não aconteceu
        }

        // Mostra uma mensagem diferente dependendo da idade
        if (idade < 18) {
            // Se a idade é menor que 18, mostra "Você é menor de idade."
            JOptionPane.showMessageDialog(null, "Você é menor de idade.");
        } else if (idade == 18) {
            // Se a idade é exatamente 18, mostra "Atingiu a maioridade."
            JOptionPane.showMessageDialog(null, "Atingiu a maioridade.");
        } else if (idade == 60) {
            // Se a idade é exatamente 60, mostra "Você é idoso."
            JOptionPane.showMessageDialog(null, "Você é idoso.");
        } else {
            // Para todas as outras idades, mostra "Você é maior de idade."
            JOptionPane.showMessageDialog(null, "Você é maior de idade.");
        }
    }
}
