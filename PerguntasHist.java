package questionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PerguntasHist {
    public double nota = 0.0;
    public JLabel Quest1;
    public JCheckBox alternativa1A;
    public JCheckBox alternativa1B;
    public JPanel PainelPrincipal;
    public JCheckBox alternativa1C;
    public JButton enviarResposta;
    public JButton finalizarProva;
    public JLabel Quest2;
    public JCheckBox alternativa2A;
    public JCheckBox alternativa2B;
    public JCheckBox alternativa2C;
    public JLabel Quest3;
    public JCheckBox alternativa3A;
    public JCheckBox alternativa3B;
    public JCheckBox alternativa3C;
    private JLabel correcao1A;
    private JLabel correcao1B;
    private JLabel correcao1C;
    private JLabel correcao2A;
    private JLabel correcao2B;
    private JLabel correcao2C;
    private JLabel correcao3A;
    private JLabel correcao3B;
    private JLabel correcao3C;
    public boolean rQuestao1;
    char resposta1;
    char resposta2;
    char resposta3;
    JFrame frame = new JFrame("PEEJA");

    public PerguntasHist(JButton btnHist, JFrame menuFrame, JLabel notaHist) {

        MenuSelecaoMateria selecMateria = new MenuSelecaoMateria();

        frame.setSize(1500, 700);
        frame.setLocationRelativeTo(null);
        frame.add(PainelPrincipal);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PainelPrincipal.setBackground(new Color(243, 242, 242)); //DEFININDO BACKGROUND DO PAINEL
        Font questoesFont = new Font("Arial", Font.BOLD, 15);
        Quest1.setFont(questoesFont);
        Quest2.setFont(questoesFont);
        Quest3.setFont(questoesFont);

        Font fonteCheckBox = new Font("Arial", Font.PLAIN, 15);
        alternativa1A.setFont(fonteCheckBox);
        alternativa1B.setFont(fonteCheckBox);
        alternativa1C.setFont(fonteCheckBox);
        alternativa2A.setFont(fonteCheckBox);
        alternativa2B.setFont(fonteCheckBox);
        alternativa2C.setFont(fonteCheckBox);
        alternativa3A.setFont(fonteCheckBox);
        alternativa3B.setFont(fonteCheckBox);
        alternativa3C.setFont(fonteCheckBox);

        finalizarProva.setVisible(false);

        alternativa1A.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2
                    alternativa1B.setSelected(false);
                    alternativa1C.setSelected(false);
                    resposta1 = 'a';
                } else {
                    resposta1 = 's';
                }
            }
        });

        alternativa1B.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa1A.setSelected(false);
                    alternativa1C.setSelected(false);
                    resposta1 = 'b';
                } else {
                    resposta1 = 's';
                }
            }
        });

        alternativa1C.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa1B.setSelected(false);
                    alternativa1A.setSelected(false);
                    resposta1 = 'c';
                } else {
                    resposta1 = 's';
                }
            }
        });

        alternativa2A.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa2B.setSelected(false);
                    alternativa2C.setSelected(false);
                    resposta2 = 'a';
                } else {
                    resposta2 = 's';
                }
            }
        });

        alternativa2B.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa2A.setSelected(false);
                    alternativa2C.setSelected(false);
                    resposta2 = 'b';
                } else {
                    resposta2 = 's';
                }
            }
        });

        alternativa2C.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa2B.setSelected(false);
                    alternativa2A.setSelected(false);
                    resposta2 = 'c';
                } else {
                    resposta2 = 's';
                }
            }
        });

        alternativa3A.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa3B.setSelected(false);
                    alternativa3C.setSelected(false);
                    resposta3 = 'a';
                } else {
                    resposta3 = 's';
                }
            }
        });

        alternativa3B.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa3A.setSelected(false);
                    alternativa3C.setSelected(false);
                    resposta3 = 'b';
                } else {
                    resposta3 = 's';
                }
            }
        });

        alternativa3C.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Se a checkBox1 foi selecionada, desmarca a checkBox2 e adicionar valor a variavel resposta
                    alternativa3B.setSelected(false);
                    alternativa3A.setSelected(false);
                    resposta3 = 'c';
                } else {
                    resposta3 = 's';
                }
            }
        });

        //CONFIGURANDO A AÇÃO DO BOTÃO ENVIAR RESPOSTAS
        enviarResposta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                alternativa1A.setEnabled(false);
                alternativa1B.setEnabled(false);
                alternativa1C.setEnabled(false);
                alternativa2A.setEnabled(false);
                alternativa2B.setEnabled(false);
                alternativa2C.setEnabled(false);
                alternativa3A.setEnabled(false);
                alternativa3B.setEnabled(false);
                alternativa3C.setEnabled(false);
                enviarResposta.setEnabled(false);

                //AMOSTRAR RESULTADO CORRETO E CALCULAR A NOTA DO USUARIO
                correcao3B.setForeground(new Color(34, 127, 0, 255));
                correcao3A.setForeground(new Color(127, 0, 0, 255));
                correcao3C.setForeground(new Color(127, 0, 0, 255));

                if (resposta3 == 'a') {
                    correcao3A.setText("⬅ Alternativa incorreta!");
                    correcao3B.setText("⬅ Alternativa correta!");
                } else if (resposta3 == 'b') {
                    correcao3B.setText("⬅ Você Acertou!");
                    nota += 3;
                } else if (resposta3 == 'c') {
                    correcao3C.setText("⬅ Alternativa incorreta!");
                    correcao3B.setText("⬅ Alternativa correta!");
                }

                correcao2A.setForeground(new Color(127, 0, 0, 255));
                correcao2B.setForeground(new Color(127, 0, 0, 255));
                correcao2C.setForeground(new Color(34, 127, 0, 255));
                if (resposta2 == 'a') {
                    correcao2A.setText("⬅ Alternativa incorreta!");
                    correcao2C.setText("⬅ Alternativa correta!");
                } else if (resposta2 == 'b') {
                    correcao2B.setText("⬅ Alternativa incorreta!");
                    correcao2C.setText("⬅ Alternativa correta!");
                } else if (resposta2 == 'c') {
                    correcao2C.setText("⬅ Você Acertou!");
                    nota += 3.5;
                }

                correcao1C.setForeground(new Color(127, 0, 0, 255));
                correcao1B.setForeground(new Color(127, 0, 0, 255));
                correcao1A.setForeground(new Color(34, 127, 0, 255));
                if (resposta1 == 'a') {
                    correcao1A.setText("⬅ Você Acertou!");
                    nota += 3.5;
                } else if (resposta1 == 'b') {
                    correcao1B.setText("⬅ Alternativa incorreta!");
                    correcao1A.setText("⬅ Alternativa correta!");
                } else if (resposta1 == 'c') {
                    correcao1C.setText("⬅ Alternativa incorreta!");
                    correcao1A.setText("⬅ Alternativa correta!");
                }

                //TORNAR O BOTAO MENU VISIVEL AO CLICAR NO BOTÃO ENVIAR RESPOSTAS
                finalizarProva.setVisible(true);
                finalizarProva.setEnabled(true);
            }
        });


        finalizarProva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                menuFrame.setVisible(true);
                notaHist.setText(""+getNotaHist());
                btnHist.setEnabled(false);
            }
        });
    }

    public void exibirPerguntas(){
        frame.setVisible(true);
    }

    public double getNotaHist(){

        return nota;
    }
}