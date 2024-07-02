package Cajero_sim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dep extends JFrame {

    private JTextField valores_dep;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn9;
    private JButton btn8;
    private JButton btn7;
    private JButton btn0;
    private JButton btnenter;
    private JButton menúButton;
    private JPanel JPanel_dep;

    public Dep(){
        super("Deposito");
        setContentPane(JPanel_dep);

        botones();

        menúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu bnv = new Menu();
                bnv.iniciar();
                dispose();
            }
        });
    }
    public void iniciar(){
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void botones(){
        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores_dep.setText(valores_dep.getText()+"9");
            }
        });
    }
}
