package com.mycompany.atividade2;


import javax.swing.JOptionPane;

public class Atividade2 {

    public static void main(String[] args) {
        
        // Define o limite de peso permitido para 100 kg
        double pesolimite = 100, pesopeixe = 0;

        // Pede para o usuário informar o peso do peixe pescado e armazena em pesopeixe
        pesopeixe = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do peixe pescado em kg: "));
  
        // Verifica se o peso do peixe ultrapassa o limite de 100 kg
        if (pesopeixe > 100) {
            // Calcula o valor da multa (R$ 8 por kg excedente)
            double valormulta = (pesopeixe - pesolimite) * 8;
            // Mostra mensagem dizendo que o limite foi ultrapassado e o valor da multa
            JOptionPane.showMessageDialog(null, "Você passou do limite de peso! O valor da multa é: R$ " + valormulta);
        } else {
            // Mostra mensagem dizendo que o peso está dentro do limite permitido
            JOptionPane.showMessageDialog(null, "Peso está dentro do limite permitido.");
        }
    }
}

