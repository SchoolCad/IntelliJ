package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {

    private JLabel columba;
    private JPanel Colombina;
    private JButton button1;

    public Main () {
        setContentPane(Colombina);
        setTitle("Colombina");
//        setSize(300,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,700);
        setLocationRelativeTo(null);
        setVisible(true);

//        Dimension md = new Dimension(700,700);
//        Dimension lg = new Dimension(701,701);

//        setMinimumSize(md);
//        setMaximumSize(lg);
        button1.addActionListener(new ActionListener() {
            Random rand = new Random();
            @Override
            public void actionPerformed (ActionEvent e) {
                int a = rand.nextInt(1500);

                Dimension little = new Dimension(a,a);
                setSize(little);
            }
        });

    }

    public static void main (String[] args) {
        new Main();
    }
}
