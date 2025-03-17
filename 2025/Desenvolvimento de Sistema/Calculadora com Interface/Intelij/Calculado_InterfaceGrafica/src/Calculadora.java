/* Este comando importa todas as classes do pacote javax.swing,
   que é usado para criar interfaces gráficas em Java */
import javax.swing.*;

/* Este comando importa todas as classes do pacote java.awt,
   que também é usado para construir interfaces gráficas, permitindo adicionar cor,
   tamanho das fontes, estilo das fontes, etc */
import java.awt.*;

/* Este comando importa todas as classes do pacote java.awt.event, que são usadas para
   capturar eventos, como cliques de botão, teclas, movimentação do mouse, etc */
import java.awt.event.*;

public class Calculadora extends JFrame {
    // O JLabel é um rótulo de texto exibido na interface gráfica. Ele não permite entrada de dados, apenas exibe informações para o usuário
    JLabel rotulo1, rotulo2,exibir;

    // O JTextField é uma caixa de texto onde o usuário pode digitar informações, como números ou palavras
    JTextField texto1, texto2;

    //O JButton representa um botão interativo. Quando o usuário clica nele, alguma ação pode ser executada, como somar dois números
    JButton somar, subtrair, multiplicar, dividir, restoDivisao, dobro, quadrado, cubo,  raizQuadrada,  porcentagem;

    public Calculadora () {
        super("Calculadora");

        // O Container é o "painel invisível" que armazena os elementos visuais dentro da janela
        Container tela = getContentPane();

        // isso significa que agnte vai ter que posicionar cada elemento manualmente: setBounds(x, y, largura, altura);
        setLayout(null);

        rotulo1 = new JLabel("1 Numero: ");
        rotulo2 = new JLabel("2 Numero: ");

        // Criando campos de texto para entrada de dados, com largura para 5 caracteres, ou seja, passou de 5 o usuario não vai mais conseguir ver
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        //Cria um JLabel vazio (""), que vai ser usado para mostrar o resultado depois
        exibir = new JLabel ("");

        //cria um botao com o texto e quando clicado vai executar uma ação (que ainda não foi definida)
        somar = new JButton("Somar");
        subtrair = new JButton("Subtrair");
        multiplicar = new JButton("Multiplicar");
        dividir = new JButton("Dividir");
        restoDivisao = new JButton("Resto da Divisão");
        dobro = new JButton("Dobro");
        quadrado = new JButton("Quadrado");
        cubo = new JButton("Cubo");
        raizQuadrada = new JButton("Raiz Quadrada");
        porcentagem = new JButton("Porecentagem");

// Essa função define a posiçao e o tamanho de cada componente na tela: componente.setBounds(posiçãoX, posiçãoY, largura, altura);


        rotulo1.setBounds(50, 20, 100, 25);
        rotulo2.setBounds(50, 60, 100, 25);


        texto1.setBounds(140, 20, 600, 25);
        texto2.setBounds(140, 60, 600, 25);


        exibir.setBounds(50, 200, 500, 20);

        somar.setBounds(50, 100, 130, 25);
        subtrair.setBounds(190, 100, 130, 25);
        multiplicar.setBounds(330, 100, 130, 25);
        dividir.setBounds(470, 100, 130, 25);
        porcentagem.setBounds(610, 100, 130, 25);

        restoDivisao.setBounds(50, 150, 130, 25);
        dobro.setBounds(190, 150, 130, 25);
        quadrado.setBounds(330, 150, 130, 25);
        cubo.setBounds(470, 150, 130, 25);
        raizQuadrada.setBounds(610, 150, 130, 25);


        //Aumentando o tamanho do texto
        rotulo1.setFont(new Font("Arial", Font.PLAIN, 16));
        rotulo2.setFont(new Font("Arial", Font.PLAIN, 16));

        texto1.setFont(new Font("Arial", Font.PLAIN, 15));
        texto2.setFont(new Font("Arial", Font.PLAIN, 15));

        //adicionando um ouvinte (listener) para o botão somar. O addActionListener é usado para definir uma ação (evento) que será executada quando o usuário clicar no botão somar
        ActionListener operacao = new ActionListener() {
                /*está criando uma instância anônima(basicamente esse metodo so vai funcionar dentro desse codigo, com as mesmas caracteristicas que eu coloquei. entao ele existe so
                na classe Calculadora) de um ActionListener, ou seja, uma implementação direta de como o botão vai agir quando clicado. Criar uma instância anônima do ActionListener
                é uma forma prática de implementar eventos sem a necessidade de criar uma classe separada.*/
            //new ActionListener()

            // ele basicamente ta reescrevendo um metodo. Se tiver algum erro, o @Override ajuda a apontar onde ta
            @Override

            // esse metodo é chamado automaticamente quando um botão é clicado. o "ActionEvent e" tem informações sobre o evento que ocorreu, como qual botão foi clicado e qual comando está ligado a ele
            public void actionPerformed(ActionEvent e) {// Ele guarda informações sobre um evento (como um clique em um botão), permitindo identificar qual botão foi clicado e executar a função correspondente

                //O bloco try-catch é usado para capturar e tratar erros (exceções). Isso não deixa que o programa pare de funcionar de forma inesperada caso ocorra um problema
                try {
                    // Código que pode gerar um erro


                    //aqui ta pegando a entrada do usuario que é String e ta passando pra double
                    double numero1 = Double.parseDouble(texto1.getText());
                    double numero2 = Double.parseDouble(texto2.getText());

                    double resultado = 0;
                    String operacao = "";

                    //esse "e.getSource()" vai no OBJETO somar e verifica se ele foi acionado
                    if (e.getSource() == somar) {
                        resultado = numero1 + numero2;
                        operacao = "A Soma é: ";
                    }
                    else if (e.getSource() == subtrair) {
                        resultado = numero1 - numero2;
                        operacao = "A Subtração é: ";
                    }
                    else if (e.getSource() == multiplicar) {
                        resultado = numero1 * numero2;
                        operacao = "A Multiplicação é: ";
                    }
                    else if (e.getSource() == dividir) {
                        if (numero2 == 0) {
                            exibir.setText("Erro: Divisão por zero!");
                            exibir.setVisible(true);
                            return;//ele ja retorna o valor pra que caso o if seja verdadeiro a conta não continua
                        }
                        resultado = numero1 / numero2;
                        operacao = "A Divisão é: ";
                    }
                    else if (e.getSource() == restoDivisao) {
                        if (numero2 == 0) {
                            exibir.setText("Erro: Divisão por zero!");
                            exibir.setVisible(true);
                            return;
                        }
                        resultado = numero1 % numero2;
                        operacao = "O Resto da Divisão é: ";
                    }
                    else if (e.getSource() == dobro) {
                        resultado = numero1 * 2;
                        operacao = "O Dobro é: ";
                    }
                    else if (e.getSource() == quadrado) {
                        resultado = Math.pow(numero1, 2);
                        operacao = "O Quadrado é: ";
                    }
                    else if (e.getSource() == cubo) {
                        resultado = Math.pow(numero1, 3);
                        operacao = "O Cubo é: ";
                    }
                    else if(e.getSource() == raizQuadrada){
                        if(numero1 < 0){
                            exibir.setText("Erro: Raiz de número negativo!");
                            exibir.setVisible(true);
                            return;
                        }
                        resultado = Math.sqrt(numero1);
                        operacao = "A Raiz Quadrada é: ";
                    }
                    else if (e.getSource() == porcentagem) {
                        // Verifica se o primeiro numero (total) não é zero para evitar divisão por zero
                        if (numero1 == 0) {
                            exibir.setText("Erro: Total não pode ser zero!");
                            exibir.setVisible(true);
                            return;
                        }
                        // Calcula a porcentagem: (parte / total) * 100. EX: (10 / 100) * 100 = 10
                        resultado = (numero2 / numero1) * 100;
                        operacao = "A Porcentagem é: ";
                    }


                    //exibindo o resultado da soma
                    exibir.setText(operacao + resultado);
                } catch (NumberFormatException ex) {//NumberFormatException (erro ao converter texto para número). ex é um objeto que tem detalhes sobre o erro
                    // Código a ser executado caso ocorra um erro
                    // Se o usuário digitou algo inválido, mostra um aviso
                    exibir.setText("Erro: Digite números válidos!");
                }
                //esta deixando o exibir visivel
                exibir.setVisible(true);
            }
        };

        // Associando o ActionListener aos botões
        somar.addActionListener(operacao);
        subtrair.addActionListener(operacao);
        multiplicar.addActionListener(operacao);
        dividir.addActionListener(operacao);
        restoDivisao.addActionListener(operacao);
        dobro.addActionListener(operacao);
        quadrado.addActionListener(operacao);
        cubo.addActionListener(operacao);
        raizQuadrada.addActionListener(operacao);
        porcentagem.addActionListener(operacao);

// Aqui agente está adicionando um outro método para os botões que só precisam de um número pra realizar o cálculo.
// Quando o usuário clicar em um botão, a conta vai ser feita e tudo que tiver dentro desse método também vai ser executado.
        ActionListener newLayout = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Como na raiz quadrada agente só usa 1 número, os campos do segundo número eu vou tirar temporariamente
                texto2.setVisible(false);
                rotulo2.setVisible(false);

                // Ajustando as posições dos outros elementos e redimensionar a janela

                texto1.setBounds(140, 20, 400, 25);

                // Botões de operações básicas (soma, subtração, multiplicação, divisão)
                somar.setBounds(50, 60, 130, 25);
                subtrair.setBounds(190, 60, 130, 25);
                multiplicar.setBounds(330, 60, 130, 25);
                dividir.setBounds(470, 60, 130, 25);

                porcentagem.setBounds(50, 100, 130, 25);
                restoDivisao.setBounds(190, 100, 130, 25);
                dobro.setBounds(330, 100, 130, 25);
                quadrado.setBounds(470, 100, 130, 25);

                // Botão Resto da Divisão
                cubo.setBounds(50, 140, 130, 25); // Resto da Divisão
                raizQuadrada.setBounds(190, 140, 130, 25);

                // Campo de exibição do resultado
                exibir.setBounds(50, 180, 480, 25); // Ajusta a posição do resultado

                // Redimensionar a janela para acomodar todos os componentes
                setSize(650, 280);



            }
        };

        //vai fazer a restauração do Layout quando algum botao que seja ligado a esse metodo for acionado
        ActionListener resetLayout = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                // Restaurar visibilidade e posição dos elementos
                texto2.setVisible(true);
                rotulo2.setVisible(true);


                texto1.setBounds(140, 20, 600, 25);



                exibir.setBounds(50, 200, 500, 20);

                somar.setBounds(50, 100, 130, 25);
                subtrair.setBounds(190, 100, 130, 25);
                multiplicar.setBounds(330, 100, 130, 25);
                dividir.setBounds(470, 100, 130, 25);
                porcentagem.setBounds(610, 100, 130, 25);

                restoDivisao.setBounds(50, 150, 130, 25);
                dobro.setBounds(190, 150, 130, 25);
                quadrado.setBounds(330, 150, 130, 25);
                cubo.setBounds(470, 150, 130, 25);
                raizQuadrada.setBounds(610, 150, 130, 25);

                // Redimensionar a janela
                setSize(810, 400);
            }
        };

        //como esse botoes precisam de dois numeros, entao o Layout volta ao normal
        restoDivisao.addActionListener(newLayout);
        dobro.addActionListener(newLayout);
        quadrado.addActionListener(newLayout);
        cubo.addActionListener(newLayout);
        raizQuadrada.addActionListener(newLayout);

        //como esse botoes precisam de dois numeros, entao o Layout volta ao normal
        somar.addActionListener(resetLayout);
        subtrair.addActionListener(resetLayout);
        multiplicar.addActionListener(resetLayout);
        dividir.addActionListener(resetLayout);

        //Esta linha torna o exibir invisível quando a janela é aberta. Isso impede que uma mensagem indesejada apareça antes do usuário interagir
        exibir.setVisible(false);

        //aqui agente so esta adicionando as coisas no container
        tela.add(rotulo1);
        tela.add(rotulo2);

        tela.add(texto1);
        tela.add(texto2);

        tela.add(exibir);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(restoDivisao);
        tela.add(dobro);
        tela.add(quadrado);
        tela.add(cubo);
        tela.add(raizQuadrada);
        tela.add(porcentagem);

        //definindo o tamanho da tela 400 = largura 250 = altura
        setSize(810,400);

        //tornando a janela visivel
        setVisible(true);
    }

    public static void main(String[] args) {
            //agente esta instanciando a classe ddcalculaadora pra que agente possa usar os elementos dela no metodo main
            Calculadora calculadora = new Calculadora();

            //definindo que ao fechar a janela, o programa será encerrado. Isso evita que o programa continue rodando em segundo plano
            calculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}