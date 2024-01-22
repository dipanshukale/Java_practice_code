package Event_listener;

import javax.swing.*;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;

public class Gui implements ActionListener {

    JFrame frame;
    JLabel label, label2, label3, label4,label5,label6,
            label7,label8;
    JTextField text,text2,text3,text4,text5,text6;
    JComboBox drop;

    JButton btn,btn1;
    Font font;

public Gui() {


        font = new Font("Arial",Font.BOLD, 17);
        frame = new JFrame();
        frame.setBounds(1000, 100, 380, 395);
        frame.setTitle("Venus Book Store ");
        ImageIcon img = new ImageIcon("src/Event_listener/new.png");
        frame.setIconImage(img.getImage());

        frame.setContentPane(new JLabel (new ImageIcon("src/Event_listener/px.jpg")));
        frame.setLayout(new FlowLayout());


//        Container n = frame.getContentPane();
//        n.setBackground(new Color(253, 255, 182));


        label = new JLabel();
        label.setText("Enter Book Name : ");
        label.setBounds(10, 10, 150, 19);
        text = new JTextField();
        text.setBounds(120, 13, 150, 18);
        text.setBorder(BorderFactory.createLineBorder(Color.black,1));


        label2 = new JLabel();
        label2.setText("Enter Book Price : ");
        label2.setBounds(10, 42, 150, 19);
        text2 = new JTextField();
        text2.setBounds(120, 47, 150, 18);
        text2.setBorder(BorderFactory.createLineBorder(Color.black,1));


        label3 = new JLabel();
        label3.setText("Books Quantity :  ");

        String [] a = {"1","2","3","4","5","6","7","8","9","10"};

        drop = new JComboBox<>(a);
        drop.setBounds(150, 81, 60, 18);
        drop.setBorder(BorderFactory.createLineBorder(Color.black,1));


        label4 = new JLabel();
        label4.setText("Enter Book's Quantity : ");
        label4.setBounds(10,80,150,18);


        label5 = new JLabel();
        label5.setText("Total Amount :  ");
        label5.setBounds(10,125,150,18);
        text3 = new JTextField();
        text3.setBounds(93,128,150,18);
        text3.setBorder(BorderFactory.createLineBorder(Color.black,1));


        label6 = new JLabel();
        label6.setText("Enter Discount : ");
        label6.setBounds(10,165,150,18);
        text4 = new JTextField();
        text4.setBounds(105,165,150,18);
        text4.setBorder(BorderFactory.createLineBorder(Color.black,1));


        label7 = new JLabel();
        label7.setText("Your Discount Amount : ");
        label7.setBounds(10,201,150,18);
        text5= new JTextField();
        text5.setBounds(150,200,140,18);
        text5.setBorder(BorderFactory.createLineBorder(Color.black,1));


        label8 = new JLabel();
        label8.setText("Pay Amount : ");
        label8.setBounds(10,235,150,18);
        text6 = new JTextField();
        text6.setBounds(102,237,150,18);
        text6.setBorder(BorderFactory.createLineBorder(Color.black,1));



        btn = new JButton("Submit");
        btn.setBounds(80,295,80,20);
        btn1 = new JButton("Clear");
        btn1.setBounds(165,295,80,20);
        btn.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btn1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btn.setBackground(new Color(187, 208, 255));
        btn1.setBackground(new Color(187, 208, 255));

        btn.addActionListener(this);
        btn1.addActionListener(this);
        frame.add(btn1);
        frame.add(btn);
        frame.add(label8);
        frame.add(text6);
        frame.add(text5);
        frame.add(label7);
        frame.add(label6);
        frame.add(text4);
        frame.add(text3);
        frame.add(label5);
        frame.add(label4);
        frame.add(drop);
        frame.add(text2);
        frame.add(label2);
        frame.add(text);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

            try {

                    if (e.getSource() == btn) {

                            String price = text2.getText();
                            text3.setText(price);


                            String value = null;
                            for (int i = 0; i<11; i++){
                                value = (String) drop.getSelectedItem();
                            }

                            assert value != null;
                            int drops = Integer.parseInt(value);
                            String d = text4.getText();
                            int discount = Integer.parseInt(d);
                            int amount = Integer.parseInt(price);
                            float dis = (float) discount / 100;
                            float discount_price = (amount * drops ) * dis;
                            float total_amt = ( amount * drops ) - discount_price;

                            String dis1 = Float.toString(discount_price);
                            text5.setText(dis1);



                            String pay = Float.toString(total_amt);
                            text6.setText(pay);
                    } else if (e.getSource() == btn1) {
                            text.setText("");
                            text2.setText("");
                            text3.setText("");
                            text4.setText("");
                            text5.setText("");
                            text6.setText("");
                    }




            } catch (Exception ex) {
                    ex.printStackTrace();
            }

    }
}
