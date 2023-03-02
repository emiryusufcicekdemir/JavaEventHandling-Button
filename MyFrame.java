import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    JButton button;
    JLabel label;
    MyFrame(){

        label = new JLabel();
        label.setBounds(103,120,120,120);
        label.setBackground(Color.RED);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,106,160,60);
        button.setText("Gonder");
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  System.out.println("Gonderildi");
                label.setVisible(true);
                label.setText("Gonderildi");
                label.setBackground(Color.RED);
            }
        });

        this.setTitle("JAVA EventHandling");
        this.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        this.setLayout(null);
        this.add(button);
        this.setSize(420,420);
        this.setVisible(true);
        this.add(label);

    }

    }
