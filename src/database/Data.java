package database;

import  Connectivity_sql.Connect;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Data implements ActionListener {

    Connection con;
    Statement stmt;
    ResultSet rs;
    JFrame frame;
    JLabel labelId, labelName, labelCourse, labelFees;
    JTextField textId;
    static JTextField textName;
    JTextField textCourse, textSearch;
    JTextField textFees;
    JButton btnFirst, btnPrev, btnNext, btnLast, btnNew, btnInsert, btnUpdate, btnDelete,btnSearch;
    String val;

    public Data() {

        frame = new JFrame();
        frame.setTitle("Database");
        frame.setBounds(1000, 160, 450, 350);

        labelId = new JLabel();
        labelId.setText("Id :- ");
        labelId.setBounds(10, 12, 50, 40);

        textId = new JTextField();
        textId.setBounds(75, 25, 160, 20);

        labelName = new JLabel();
        labelName.setText("Name :- ");
        labelName.setBounds(10, 50, 50, 40);

        textName = new JTextField();
        textName.setBounds(75, 60, 160, 20);

        labelCourse= new JLabel();
        labelCourse.setText("Course :- ");
        labelCourse.setBounds(10, 90, 60, 40);
        textCourse = new JTextField();
        textCourse.setBounds(75, 100, 160, 20);

        labelFees = new JLabel();
        labelFees.setText("Fees :- ");
        labelFees.setBounds(10, 130, 60, 40);
        textFees = new JTextField();
        textFees.setBounds(75, 140, 160, 20);

        btnFirst = new JButton("First");
        btnFirst.setBounds(10, 190, 78, 30);
        btnPrev = new JButton("Prev");
        btnPrev.setBounds(103, 190, 78, 30);
        btnNext = new JButton("Next");
        btnNext.setBounds(198, 190, 78, 30);
        btnLast = new JButton("Last");
        btnLast.setBounds(10, 230, 78, 30);
        btnNew = new JButton("New");
        btnNew.setBounds(103, 230, 78, 30);
        btnInsert = new JButton("Insert");
        btnInsert.setBounds(198, 230, 78, 30);
        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(55, 270, 78, 30);
        btnDelete = new JButton("Delete");
        btnDelete.setBounds(150, 270, 78, 30);
        textSearch = new JTextField();
        textSearch.setBounds(270,25,120,22);
        btnSearch = new JButton("Search");
        btnSearch.setBounds(290,55,78,20);

        btnNext.addActionListener(this);
        btnPrev.addActionListener(this);
        btnFirst.addActionListener(this);
        btnLast.addActionListener(this);
        btnSearch.addActionListener(this);
        frame.add(btnSearch);
        frame.add(textSearch);
        frame.add(btnDelete);
        frame.add(btnUpdate);
        frame.add(btnInsert);
        frame.add(btnNew);
        frame.add(btnLast);
        frame.add(btnNext);
        frame.add(btnPrev);
        frame.add(textId);
        frame.add(btnFirst);
        frame.add(labelFees);
        frame.add(textFees);
        frame.add(textCourse);
        frame.add(labelCourse);
        frame.add(textName);
        frame.add(labelName);
        frame.add(labelId);
        frame.setLayout(null);
        frame.setVisible(true);

        connectToDB();

    }


    public void connectToDB() {
        try {
            //loaded driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //connection established
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?useTimezone=true&serverTimezone=UTC", "root", "Manjusha@3082");

            getData();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Get Data

    public void getData() {
        try {

            //create and execute sql queries


            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
            rs = stmt.executeQuery("Select * from entry");
            if (rs.next()) {

                ShowData();
            }


        } catch (Exception ex) {

            ex.printStackTrace();
        }
    }


    //show data

    public void ShowData() {
        try {

            textId.setText(rs.getString(1));
            textName.setText(rs.getString(2));
            textCourse.setText(rs.getString(3));
            textFees.setText(rs.getString(4));

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {


           if (e.getSource() == btnNext) {

              if (rs.next()) {
                  ShowData();
              }else {
                  JOptionPane.showMessageDialog(frame,"Op's Sorry No More Data is Available ");
              }
           } else if (e.getSource() == btnPrev) {

               if (rs.previous()){
                   ShowData();
               }else {
                   JOptionPane.showMessageDialog(frame, "First Record");
               }
           } else if (e.getSource() == btnFirst) {

               if (rs.first()){
                   ShowData();
               }
           } else if (e.getSource() == btnLast) {

               if (rs.last()){
                   ShowData();
               }
           } else if(e.getSource() == btnSearch) {
               String n = textSearch.getText();
               int v = Integer.parseInt(n);

               stmt = con.createStatement();
               rs = stmt.executeQuery("Select * from entry where id = "+v);

               if (rs.next()) {
                  ShowData();
               }else {
                   JOptionPane.showMessageDialog(frame,"No Data Found");
               }

           }


        } catch (Exception ex )
           {
              ex.printStackTrace();
           }



        }
    }

































































































