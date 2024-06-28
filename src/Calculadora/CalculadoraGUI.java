package Calculadora;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CalculadoraGUI {

    JFrame frame;
    JTextField textField;
    double num1, num2, result;
    String operador;

    public static void main(String[] args) {
                    CalculadoraGUI ventana = new CalculadoraGUI();
                    ventana.frame.setVisible(true);
        }

        public CalculadoraGUI() {
            iniciar();
        }

        public void iniciar() {
            frame = new JFrame();
            frame.setBounds(100, 100, 405, 450);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().setLayout(null);

            textField = new JTextField();
            textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
            textField.setBounds(10, 10, 370, 50);
            frame.getContentPane().add(textField);
            textField.setColumns(10);

            JButton btn7 = new JButton("7");
            btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn7.setBounds(10, 70, 70, 50);
            btn7.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn7);

            JButton btn8 = new JButton("8");
            btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn8.setBounds(85, 70, 70, 50);
            btn8.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn8);

            JButton btn9 = new JButton("9");
            btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn9.setBounds(160, 70, 70, 50);
            btn9.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn9);

            JButton btnDiv = new JButton("/");
            btnDiv.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnDiv.setBounds(235, 70, 70, 50);
            btnDiv.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnDiv);

            JButton btnSin = new JButton("sin");
            btnSin.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnSin.setBounds(310, 70, 70, 50);
            btnSin.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnSin);

            JButton btn4 = new JButton("4");
            btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn4.setBounds(10, 125, 70, 50);
            btn4.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn4);

            JButton btn5 = new JButton("5");
            btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn5.setBounds(85, 125, 70, 50);
            btn5.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn5);

            JButton btn6 = new JButton("6");
            btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn6.setBounds(160, 125, 70, 50);
            btn6.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn6);

            JButton btnMul = new JButton("*");
            btnMul.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnMul.setBounds(235, 125, 70, 50);
            btnMul.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnMul);

            JButton btnCos = new JButton("cos");
            btnCos.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnCos.setBounds(310, 125, 70, 50);
            btnCos.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnCos);

            JButton btn1 = new JButton("1");
            btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn1.setBounds(10, 180, 70, 50);
            btn1.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn1);

            JButton btn2 = new JButton("2");
            btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn2.setBounds(85, 180, 70, 50);
            btn2.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn2);

            JButton btn3 = new JButton("3");
            btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn3.setBounds(160, 180, 70, 50);
            btn3.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn3);

            JButton btnSub = new JButton("-");
            btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnSub.setBounds(235, 180, 70, 50);
            btnSub.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnSub);

            JButton btnTan = new JButton("tan");
            btnTan.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnTan.setBounds(310, 180, 70, 50);
            btnTan.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnTan);

            JButton btn0 = new JButton("0");
            btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btn0.setBounds(10, 235, 70, 50);
            btn0.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btn0);

            JButton btnDot = new JButton(".");
            btnDot.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnDot.setBounds(85, 235, 70, 50);
            btnDot.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnDot);

            JButton btnEq = new JButton("=");
            btnEq.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnEq.setBounds(160, 235, 70, 50);
            btnEq.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnEq);

            JButton btnAdd = new JButton("+");
            btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnAdd.setBounds(235, 235, 70, 50);
            btnAdd.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnAdd);

            JButton btnSqrt = new JButton("√");
            btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnSqrt.setBounds(310, 235, 70, 50);
            btnSqrt.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnSqrt);

            JButton btnClear = new JButton("C");
            btnClear.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnClear.setBounds(10, 290, 70, 50);
            btnClear.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnClear);

            JButton btnLog = new JButton("log");
            btnLog.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnLog.setBounds(85, 290, 70, 50);
            btnLog.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnLog);

            JButton btnLn = new JButton("ln");
            btnLn.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnLn.setBounds(160, 290, 70, 50);
            btnLn.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnLn);

            JButton btnPow = new JButton("^");
            btnPow.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnPow.setBounds(235, 290, 70, 50);
            btnPow.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnPow);

            JButton btnAbs = new JButton("|x|");
            btnAbs.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnAbs.setBounds(310, 290, 70, 50);
            btnAbs.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnAbs);

            JButton btnExit = new JButton("End");
            btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnExit.setBounds(10, 345, 70, 50);
            btnExit.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnExit);

            JButton btnExp = new JButton("exp");
            btnExp.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnExp.setBounds(85, 345, 70, 50);
            btnExp.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnExp);

            JButton btnAtan = new JButton("atan");
            btnAtan.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnAtan.setBounds(160, 345, 70, 50);
            btnAtan.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnAtan);

            JButton btnRound = new JButton("round");
            btnRound.setFont(new Font("Tahoma", Font.PLAIN, 18));
            btnRound.setBounds(235, 345, 145, 50);
            btnRound.addActionListener(new ButtonClickListener());
            frame.getContentPane().add(btnRound);
        }

        private class ButtonClickListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comando = e.getActionCommand();

                try {
                    switch (comando) {
                        case "C":
                            textField.setText("");
                            break;
                        case "=":
                            if (operador.equals("/")) {
                                num2 = Double.parseDouble(textField.getText());
                                if (num2 == 0) {
                                    textField.setText("Error dividir por cero - Presione 'C'");
                                    return;
                                }
                            } else {
                                num2 = Double.parseDouble(textField.getText());
                            }
                            calcular();
                            textField.setText(String.valueOf(result));
                            break;
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                        case "^":
                            num1 = Double.parseDouble(textField.getText());
                            operador = comando;
                            textField.setText("");
                            break;
                        case "sin":
                        case "cos":
                        case "tan":
                        case "√":
                        case "log":
                        case "ln":
                        case "|x|":
                        case "round":
                        case "exp":
                        case "atan":
                            num1 = Double.parseDouble(textField.getText());
                            operador = comando;
                            calcular();
                            textField.setText(String.valueOf(result));
                            break;
                        case "End":
                            System.exit(0);
                            break;
                        default:
                            textField.setText(textField.getText() + comando);
                    }
                } catch (NumberFormatException ex) {
                    textField.setText("Error");
                }
            }

            public void calcular() {
                switch (operador) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("No se puede dividir por cero");
                            return;
                        }
                        break;
                    case "^":
                        result = Math.pow(num1, num2);
                        break;
                    case "exp":
                        result = Math.exp(num1);
                        break;
                    case "atan":
                        result = Math.atan(num1);
                        break;
                    case "sin":
                        result = Math.sin(num1);
                        break;
                    case "cos":
                        result = Math.cos(num1);
                        break;
                    case "tan":
                        result = Math.tan(num1);
                        break;
                    case "√":
                        result = Math.sqrt(num1);
                        break;
                    case "log":
                        result = Math.log10(num1);
                        break;
                    case "ln":
                        result = Math.log(num1);
                        break;
                    case "|x|":
                        result = Math.abs(num1);
                        break;
                    case "round":
                        result = Math.round(num1);
                        break;
                }
            }
        }
}
