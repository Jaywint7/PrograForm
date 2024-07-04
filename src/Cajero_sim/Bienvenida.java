package Cajero_sim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenida extends JFrame {
    private JTextField password;
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
    private JPanel JPanel_ingreso;

    public Bienvenida(){
        super("Bienvenido al Banco Lavish");
        setContentPane(JPanel_ingreso);

        botones();

        btnenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contra = "12345";
                String contraIngresada = password.getText();
                if(contra.equals(contraIngresada)){
                    Menu vent_Men = new Menu();
                    vent_Men.iniciar();
                    dispose();
                }else{

                    JOptionPane.showMessageDialog(null, "Intentar otra vez", "Usuario incorrecto", JOptionPane.ERROR_MESSAGE);
                    password.setText("");
                }
            }
        });
    }

    //Metodo para iniciar
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
                password.setText(password.getText()+"0");
            }
        });
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"3");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"4");
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"6");
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"8");
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password.setText(password.getText()+"9");
            }
        });
    }
}
