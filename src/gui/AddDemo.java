package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDemo {
    private JButton btnResult;
    private JPanel panel1;
    private JButton btnHindi;
    private JButton btnClkose;
    private JTextField txt1;
    private JTextField txt2;
    private JLabel lblResult;

    public static void main(String[] args) {
        JFrame frame = new JFrame("AddDemo");
        frame.setContentPane(new AddDemo().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public AddDemo() {
        btnResult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int i = Integer.parseInt(txt1.getText());
                int j = Integer.parseInt(txt2.getText());
                int k=  i+ j;
                lblResult.setText(k + "");

            }
        });
        btnClkose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }


}
