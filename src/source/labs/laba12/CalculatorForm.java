package source.labs.laba12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorForm extends JFrame {
    private JTextField number1Field;
    private JTextField number2Field;
    private JComboBox<String> operationComboBox;
    private JButton calculateButton;
    private JLabel resultLabel;

    public CalculatorForm() {
        setTitle("Калькулятор");
        setSize(370, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        number1Field = new JTextField(7);
        number2Field = new JTextField(7);

        String[] operations = {"Сложение (+)", "Вычитание (-)", "Умножение (*)", "Деление (/)", "Возведение в степень"};
        operationComboBox = new JComboBox<>(operations);

        calculateButton = new JButton("Вычислить");
        calculateButton.addActionListener(new CalculateButtonListener());

        resultLabel = new JLabel();

        add(new JLabel("Первое число:"));
        add(number1Field);
        add(new JLabel("Второе число:"));
        add(number2Field);
        add(new JLabel("Операция:"));
        add(operationComboBox);
        add(calculateButton);
        add(resultLabel);
    }

    private class CalculateButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            double number1 = Double.parseDouble(number1Field.getText());
            double number2 = Double.parseDouble(number2Field.getText());

            int operationIndex = operationComboBox.getSelectedIndex();
            double result = 0.0;
            boolean isError = false;

            switch (operationIndex) {
                case 0:
                    result = number1 + number2;
                    break;
                case 1:
                    result = number1 - number2;
                    break;
                case 2:
                    result = number1 * number2;
                    break;
                case 3:
                    if (number2 == 0) {
                        JOptionPane.showMessageDialog(null, "Ошибка: деление на ноль!");
                        isError = true;
                    } else {
                        result = number1 / number2;
                    }
                    break;
                case 4:
                    if (number1 < 0 || number2 % 1 != 0) {
                        JOptionPane.showMessageDialog(null, "Ошибка: невозможно возвести отрицательное число в дробную степень!");
                        isError = true;
                    } else {
                        result = Math.pow(number1, number2);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ошибка: некорректная операция!");
                    isError = true;
                    break;
            }

            if (!isError) {
                resultLabel.setText("Результат: " + result);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CalculatorForm calculatorForm = new CalculatorForm();
                calculatorForm.setVisible(true);
            }
        });
    }
}