import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        MenuComissao menu = new MenuComissao();

        //definindo que ao fechar a janela, o programa será encerrado. Isso evita que o programa continue rodando em segundo plano
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
