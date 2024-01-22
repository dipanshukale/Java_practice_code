package Calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator_gui {

    JFrame frame;
    JLabel label;
    JTextField text;

    JButton btn, btn1, btn2,btn3,btn4,
    btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15, btn16;


     public  Calculator_gui(){

         frame = new JFrame();
         frame.setBounds(1000, 100, 254, 385);
         frame.setTitle("Calculator");

         ImageIcon img = new ImageIcon("src/Calculator/cal.jpg");
         frame.setIconImage(img.getImage());

         text = new JTextField();
         text.setBounds(6,20,227,57);
         text.setFont(new Font("Arial",Font.BOLD,18));

         Container n = frame.getContentPane();
         n.setBackground(new Color(241, 250, 238));

         btn = new JButton("*");
         btn.setBounds(6,84,50,40);
         btn1 = new JButton("-");
         btn1.setBounds(64,84,50,40);
         btn2 = new JButton("/");
         btn2.setBounds(123,84,50,40);
         btn3 = new JButton("%");
         btn3.setBounds(182,84,50,40);
         btn4 = new JButton("7");
         btn4.setBounds(6,136,50,40);
         btn5 = new JButton("8");
         btn5.setBounds(64,136,50,40);
         btn6 = new JButton("9");
         btn6.setBounds(123,136,50,40);
         btn7 = new JButton("4");
         btn7.setBounds(6,188,50,40);
         btn8 = new JButton("5");
         btn8.setBounds(64,188,50,40);
         btn9 = new JButton("6");
         btn9.setBounds(123,188,50,40);
         btn10 = new JButton("1");
         btn10.setBounds(6,240,50,40);
         btn11 = new JButton("2");
         btn11.setBounds(64,240,50,40);
         btn12 = new JButton("3");
         btn12.setBounds(123,240,50,40);
         btn13 = new JButton("0");
         btn13.setBounds(6,292,107,40);
         btn14 = new JButton("+");
         btn14.setBounds(182,136,50,145);
         btn15 = new JButton(".");
         btn15.setBounds(123,292,50,40);
         btn16 = new JButton("=");
         btn16.setBounds(182,292,50,40);

         frame.add(btn16);
         frame.add(btn15);
         frame.add(btn14);
         frame.add(btn13);
         frame.add(btn12);
         frame.add(btn11);
         frame.add(btn10);
         frame.add(btn9);
         frame.add(btn8);
         frame.add(btn7);
         frame.add(btn6);
         frame.add(btn5);
         frame.add(btn4);
         frame.add(btn3);
         frame.add(btn2);
         frame.add(btn1);
         frame.add(btn);
         frame.add(text);
         frame.setLayout(null);
         frame.setVisible(true);



     }
}
