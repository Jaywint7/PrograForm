package Cajero_sim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo extends JFrame {

    private JButton menuButton;
    private JPanel JPanel_saldo;
    private JLabel mostrar;

    private int saldoActual = 10000;

    public Saldo(){
        super("Saldo");
        setContentPane(JPanel_saldo);
        mostrar.setText(mostrar.getText()+getSaldoActual());

        menuButton.addActionListener(new ActionListener() {
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

    public int getSaldoActual() {
        return saldoActual;
    }
}
