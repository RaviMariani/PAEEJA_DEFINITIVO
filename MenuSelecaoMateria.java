package questionario;


import com.sun.source.tree.UsesTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuSelecaoMateria {
    JPanel painelMateria = new JPanel();
    JFrame Frame = new JFrame("PEEJA");
    JLabel notaMat = new JLabel("");
    JLabel notaPort = new JLabel("");
    JLabel notaHist = new JLabel("");
    JLabel notaCien = new JLabel("");
    JButton btnMatematica = new JButton("Matemática");
    JButton btnPortugues = new JButton("Português");
    JButton btnHistoria = new JButton("História");
    JButton btnCiencias = new JButton("Ciências");

    public MenuSelecaoMateria() {

        //CONFIGURANDO O FRAME DO MENU SELECAO MATERIA
        Frame.add(painelMateria);
        Frame.setSize(1500, 700);

        //CONFIGURANDO A POSIÇÃO DO FRAME PARA O MEIO DA TELA
        Frame.setLocationRelativeTo(null);
        Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Frame.setResizable(false); //BLOQUEANDO AJUSTE DE TELA

        painelMateria.setBackground(new Color(243, 242, 242)); //DEFININDO BACKGROUND DO PAINEL

        //CRIANDO E CONFIGURANDO A LOGO DA EMPRESA

        //Criando a variavel e definindo a imagem
        ImageIcon Marca = new ImageIcon("C:/Users/Saulo/Downloads/logopeeja1.png");
        //Pegando a imagem e definindo o tamanho da logo
        Marca.setImage(Marca.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        //Criando uma JLabel para armazenar o icone
        JLabel logoMarca = new JLabel(Marca);
        //Centralizando a Horizontal da Logo
        logoMarca.setAlignmentX(Component.CENTER_ALIGNMENT);
        //Criando um espaçamento entre a logo e os outros componentes
        logoMarca.setBorder(BorderFactory.createEmptyBorder(20, 0, 50, 0));
        //Adicionando o icone ao painel
        painelMateria.add(logoMarca);

        //CRIANDO E CONFIGURANDO O TITULO DO FRAME
        JLabel label_titulo = new JLabel("Qual prova deseja fazer?\n ");
        label_titulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        label_titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        painelMateria.add(label_titulo);

        //DEFININDO FONTE DO TÍTULO
        Font TituloFont = new Font("Arial", Font.BOLD, 20);
        label_titulo.setFont(TituloFont);

        //DEFININDO FONTE DOS BOTÕES
        Font fonteCheckBox = new Font("Arial", Font.PLAIN, 19);
        btnMatematica.setFont(fonteCheckBox);
        btnPortugues.setFont(fonteCheckBox);
        btnHistoria.setFont(fonteCheckBox);
        btnCiencias.setFont(fonteCheckBox);

        //UTILIZANDO O BOXLAYOUT PARA ORGANIZAR A POSIÇÃO DOS BOTÕES E DOS JLABEL
        painelMateria.setLayout(new BoxLayout(painelMateria, BoxLayout.Y_AXIS));
        painelMateria.setAlignmentX(Component.CENTER_ALIGNMENT);

                        //CRIANDO BOTÕES

        // CRIANDO E ATRIBUINDO O BOTÃO DE MATEMATICA
        btnMatematica.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnMatematica.setMaximumSize(new Dimension(120, 40));
        painelMateria.add(btnMatematica);
        btnMatematica.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2));
        btnMatematica.setBackground(new Color(215, 120, 120));
        btnMatematica.setForeground(new Color(0, 0, 0));

        //Configurando a exibição da nota de Matematica
        notaMat.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(notaMat);

        //Criando espaçamento entre os botões
        painelMateria.add(Box.createRigidArea(new Dimension(0, 5)));

        // CRIANDO E ATRIBUINDO O BOTÃO DE PORTUGUÊS
        btnPortugues.setMaximumSize(new Dimension(120, 40)); // Alinha o botão no centro horizontalmente
        btnPortugues.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(btnPortugues);
        btnPortugues.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        btnPortugues.setBackground(new Color(120, 139, 215));
        btnPortugues.setForeground(new Color(0, 0, 0));

        //Configurando a exibição da nota de português
        notaPort.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(notaPort);

        //Criando espaçamento entre os botões
        painelMateria.add(Box.createRigidArea(new Dimension(0, 5)));

        // CRIANDO E ATRIBUINDO O BOTÃO DE HISTORIA
        btnHistoria.setAlignmentX(Component.CENTER_ALIGNMENT); // Alinha o botão no centro horizontalmente
        btnHistoria.setMaximumSize(new Dimension(120, 40));
        painelMateria.add(btnHistoria);
        btnHistoria.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2));
        btnHistoria.setBackground(new Color(176, 146, 139));
        btnHistoria.setForeground(new Color(0, 0, 0));

        //Configurando a exibição da nota de história
        notaHist.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(notaHist);

        //Criando espaçamento entre os botões
        painelMateria.add(Box.createRigidArea(new Dimension(0, 5)));

        // CRIANDO E ATRIBUINDO O BOTÃO DE CIENCIAS
        btnCiencias.setAlignmentX(Component.CENTER_ALIGNMENT);// Alinha o botão no centro horizontalmente
        btnCiencias.setMaximumSize(new Dimension(120, 40));
        painelMateria.add(btnCiencias);
        btnCiencias.setBorder( BorderFactory.createLineBorder(Color.BLACK, 2));
        btnCiencias.setBackground(new Color(172, 206, 113));
        btnCiencias.setForeground(new Color(0, 0, 0));

        //Configurando a exibição da nota de ciências
        notaCien.setAlignmentX(Component.CENTER_ALIGNMENT);
        painelMateria.add(notaCien);

        //CRIANDO A AÇÃO DO BOTÃO DE MATEMATICA
        btnMatematica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.dispose();// TORNAR O FRAME ATUAL INVISIVEL
                new PerguntasMat(btnMatematica, Frame, notaMat).exibirPerguntas(); //EXECUTANDO O METODO DA SUBCLASS PERGUNTASPORT

            }
        });

        //CRIANDO A AÇÃO DO BOTÃO DE PORTUGUÊS
        btnPortugues.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Frame.dispose();//TORNAR O FRAME ATUAL INVISIVEL
                new PerguntasPort(btnPortugues, Frame, notaPort).exibirPerguntas();//EXECUTANDO O METODO DA SUBCLASS PERGUNTASPORT
            }
        });

        //CRIANDO A AÇÃO DO BOTÃO DE HISTÓRIA
        btnHistoria.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Frame.dispose();//TORNAR O FRAME ATUAL INVISIVEL
                new PerguntasHist(btnHistoria, Frame, notaHist).exibirPerguntas();//EXECUTANDO O METODO DA SUBCLASS PERGUNTASHIST
            }
        });

        //CRIANDO A AÇÃO DO BOTÃO DE CIÊNCIAS
        btnCiencias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Frame.dispose();//TORNAR O FRAME ATUAL INVISIVEL
                new PerguntasCien(btnCiencias, Frame, notaCien).exibirPerguntas();//EXECUTANDO O METODO DA SUBCLASS PERGUNTASCIEN
            }
        });

    }

    //MÉTODO PARA DEIXAR O FRAME VISIVEL
    public void exibirMenu(){
        Frame.setVisible(true);
    }

    public static void main(String[] args){
        new MenuSelecaoMateria().exibirMenu();
    }

}