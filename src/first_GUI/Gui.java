package first_GUI;
import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame objframe;
    JLabel objlabel;

    JTextField objtextfield;
    JLabel pass;
    JPasswordField pass1;
    JButton btn;




    public Gui()  {
       objframe = new JFrame();
       objframe.setBounds(600,220, 400, 400);
       objframe.setTitle("Tata Consultancy Services");
//       objframe.setExtendedState(Frame.MAXIMIZED_BOTH);   //for fullScreen
//       Container n = objframe.getContentPane();     //
//        Color c = new Color(149, 213, 178);
//        n.setBackground(c);
        ImageIcon image = new ImageIcon("src/Tata-logo-480x228.png");
        objframe.setIconImage(image.getImage());

        objlabel = new JLabel();
       objframe.setContentPane(new JLabel (new ImageIcon("src/form.jpeg")));
       objframe.setLayout(new FlowLayout());

       objlabel.setText(" Enter Your E-mail : ");
       objlabel.setBounds(10,50,150,11);


       objtextfield = new JTextField();
       objtextfield.setBounds(140,50,150,16);
       objtextfield.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));



       pass = new JLabel();
       pass.setText("Enter Your Password : ");
       pass.setBounds(10,80,150,11);

       pass1 = new JPasswordField();
       pass1.setBounds(140,80,150,16);
       pass1.setBorder(BorderFactory.createLineBorder(Color.black,1,true));

       btn = new JButton();
       btn.setText("Login");
       btn.setBounds(160,140,80,20);
       btn.setBackground(new Color(58, 134, 255, 255));
       btn.setBorder(BorderFactory.createLineBorder(Color.black));


       objframe.add(btn);
       objframe.add(pass1);
       objframe.add(pass);
       objframe.add(objlabel);
       objframe.add(objlabel);
       objframe.add(objtextfield);


        objframe.setLayout(null);
        objframe.setVisible(true);
    }





}
