package Cajero_sim;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JButton irSaldo;
    private JButton irRetiro;
    private JButton irDep;
    private JButton irSalir;
    private JPanel JPanel_men;

    public Menu(){
        super("Transacción a realizar");
        setContentPane(JPanel_men);


        irSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Saldo vent_Sal = new Saldo();
                vent_Sal.iniciar();
                dispose();
            }
        });


        irRetiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Retiro vent_Ret = new Retiro();
                vent_Ret.iniciar();
                dispose();
            }
        });

        irDep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Dep vent_Dep = new Dep();
                vent_Dep.iniciar();
                dispose();
            }
        });

        irSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Muchas gracias", "Muchas gracias", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        });

    }

    public void iniciar(){
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

