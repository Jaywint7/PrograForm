package Cajero_sim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro extends JFrame {

    private JButton btn1;
    private JButton btn3;
    private JButton btn2;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btnenter;
    private JTextField valores;
    private JButton menúButton;
    private JPanel JPanel_retiro;

    private int saldoActual = 10000;

    public Retiro(){
        super("Retiro");
        setContentPane(JPanel_retiro);

        botones();

        menúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu bnv = new Menu();
                bnv.iniciar();
                dispose();
            }
        });
        btnenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Eliminar caracteres no numéricos
                    String valor = valores.getText().replaceAll("[^0-9]", "");
                    int monto = Integer.parseInt(valor);
                    if (monto <= saldoActual) {
                        saldoActual -= monto;
                        JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: " + saldoActual);
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido", "Error", JOptionPane.ERROR_MESSAGE);
                }
                valores.setText("");
                valores.setText("$ ");
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
                valores.setText(valores.getText()+"0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valores.setText(valores.getText()+"9");
            }
        });
    }
}
