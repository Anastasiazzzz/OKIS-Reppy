package org.example;

import javax.swing.*;

public class Interface {

    public static class UserInterface extends JFrame {
        public JLabel label;
        public JButton button;

        public UserInterface() {
            super("Пользовательский интерфейс");

            label = new JLabel("Нажмите кнопку");
            button = new JButton("Первая кнопка");

            button.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Кнопка была нажата!");
            });

            JPanel panel = new JPanel();
            panel.add(label);
            panel.add(button);

            add(panel);

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300, 200);
            setVisible(true);
        }

        public void Start() {
            new UserInterface();
        }
    }
}
