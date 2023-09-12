//package  electricity.billing.system;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//
//public class Login extends JFrame implements ActionListener
//{
//
//    JTextField userText,passwordText;
//    Choice loginChoice;
//    JButton loginButton,cancelButton,signupButton;
//
//    Login()
//    {
//        super("Login");
//        getContentPane().setBackground(Color.white);
//        JLabel username = new JLabel("UserName");
//        username.setBounds(300,60,100,20);
//        add(username);
//
//        userText = new JTextField();
//        userText.setBounds(400,60,150,20);
//        add(userText);
//
//        JLabel password = new JLabel("Password");
//        password.setBounds(300,100,100,20);
//        add(password);
//
//        passwordText = new JTextField();
//        passwordText.setBounds(400,100,150,20);
//        add(passwordText);
//
//        JLabel loggin = new JLabel("Loggin In As");
//        loggin.setBounds(300,140,100,20);
//        add(loggin);
//
//        loginChoice = new Choice();
//        loginChoice.add("Admin");
//        loginChoice.add("Customer");
//        loginChoice.setBounds(400,140,150,20);
//        add(loginChoice);
//
//        loginButton = new JButton("Login");
//        loginButton.setBounds(330,180,100,20);
//        loginButton.addActionListener(this);
//        add(loginButton);
//
//        cancelButton = new JButton("Cancel");
//        cancelButton.setBounds(460,180,100,20);
//        cancelButton.addActionListener(this);
//        add(cancelButton);
//
//        signupButton = new JButton("Signup");
//        signupButton.setBounds(400,215,100,20);
//        signupButton.addActionListener(this);
//        add(signupButton);
//
//        ImageIcon profileOne =  new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
//        Image profileTow = profileOne.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
//        ImageIcon fprofileOne = new ImageIcon(profileTow);
//        JLabel profileLable = new JLabel(fprofileOne);
//        profileLable.setBounds(5,5,250,250);
//        add(profileLable);
//
//
//
//        setSize(640,300);
//        setLocation(400,200);
//        setLayout(null);
//        setVisible(true);
//
//
//
//
//
//
//
//
////
////        usertext=new JTextField();
////        usertext.setBounds(400,60,150,20);
////        add(usertext);
////        //-------------------------------
////        JLabel password=new JLabel("password");
////        password.setBounds(300,100,100,20);
////        add(password);
////        passwordtext=new JTextField();
////        passwordtext.setBounds(400,100,150,20);
////        add(passwordtext);
////
////
////        //=============
////        JLabel loggin=new JLabel("Loggin in As");
////        loggin.setBounds(300,140,100,20);
////        add(loggin);
////
////        loginchoice=new Choice();
////        loginchoice.add("Admin");
////        loginchoice.add("Customer");
////        loginchoice.setBounds(400,140,150,20);
////        add(loginchoice);
//////---------------------------------------
////        loginbutton =new JButton("Login");
////        loginbutton.setBounds(330,180,100,20);
////        loginbutton.addActionListener(this);
////        add(loginbutton);
////
////        cancelbutton=new JButton("Cancel");
////        cancelbutton.setBounds(460,180,100,20);
////        cancelbutton.addActionListener(this);
////        add(cancelbutton);
////
////        signupbutton=new JButton("Signup");
////        signupbutton.setBounds(400,215,100,20);
////        signupbutton.addActionListener(this);
////        add(signupbutton);
////        //-------------------------------
////        ImageIcon profileOne =new ImageIcon(ClassLoader.getSystemResource("icon/profile.jpg"));
////        Image profiletwo =profileOne.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
////        ImageIcon fprofileone=new ImageIcon(profiletwo);
////        JLabel profileLabel=new JLabel(fprofileone);
////        profileLabel.setBounds(0,0,250,250);
////        add(profileLabel);
////        //----------------------------
////        setSize(640,300);
////        setLocation(400,200);
////        setLayout(null);
////        setVisible(true);
//    }
//
////    public void actionPerformed(ActionEvent AE)
////    {
////        if(AE.getSource()==loginbutton)
////        {
////                String susername=usertext.getText();
////                String spassword =passwordtext.getText();
////                String suser = loginchoice.getSelectedItem();
////                try
////                {
////                    database c=new database();
////                    String query="select * from Signup  where username='"+susername+"' and password='"+spassword+"' and usertype = '"+suser+"'";
////                    ResultSet resultSet =c.statement.executeQuery(query);
////                    if(resultSet.next())
////                    {
////
////                        String meter =resultSet.getString("meter_no");
////                        setVisible(false);
////                        new main_class(suser,meter);
////                    }
////                    else
////                    {
////                      JOptionPane.showMessageDialog(null,"Invalid Login");
////
////                    }
////                }
////                catch (Exception e)
////                {
////e.printStackTrace();
////                }
////        }
////        else if (AE.getSource()==cancelbutton)
////        {
////            setVisible(false);
////        }
////        else if (AE.getSource()==signupbutton)
////        {
////            setVisible(false);
////            new Signup();
////        }
////    }
////    public static void main(String[] args)
////    {
////        new login();
////    }
////}
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==loginButton){
//            String susername = userText.getText();
//            String spassword = passwordText.getText();
//            String suser = loginChoice.getSelectedItem();
//
//            try{
//                database d = new database();
//                String queryy = "select * from Signup where username = '"+susername+"' and password = '"+spassword+"' and usertype ='"+suser+"'";
//                ResultSet resultSet = d.statement.executeQuery(queryy);
//
//                if (resultSet.next()){
//                    String meter = resultSet.getString("meter_no");
//                    setVisible(false);
//                    new main_class(suser,meter);
//                }else {
//                    JOptionPane.showMessageDialog(null ,"Invalid Login");
//                }
//
//            }catch (Exception E){
//                E.printStackTrace();
//            }
//        } else if (e.getSource()==cancelButton) {
//            setVisible(false);
//        } else if (e.getSource()==signupButton) {
//            setVisible(false);
//            new Signup();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        new Login();
//    }
//}


//--------------------------------
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JTextField userText,passwordText;
    Choice loginChoice;

    JButton loginButton,cancelButton,signupButton;

    Login(){
        super("Login");
        getContentPane().setBackground(Color.white);
        JLabel username = new JLabel("UserName");
        username.setBounds(300,60,100,20);
        add(username);

        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);

        JLabel password = new JLabel("Password");
        password.setBounds(300,100,100,20);
        add(password);

        passwordText = new JTextField();
        passwordText.setBounds(400,100,150,20);
        add(passwordText);

        JLabel loggin = new JLabel("Loggin In As");
        loggin.setBounds(300,140,100,20);
        add(loggin);

        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400,140,150,20);
        add(loginChoice);

        loginButton = new JButton("Login");
        loginButton.setBounds(330,180,100,20);
        loginButton.addActionListener(this);
        add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(460,180,100,20);
        cancelButton.addActionListener(this);
        add(cancelButton);

        signupButton = new JButton("Signup");
        signupButton.setBounds(400,215,100,20);
        signupButton.addActionListener(this);
        add(signupButton);

        ImageIcon profileOne =  new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileTow = profileOne.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon fprofileOne = new ImageIcon(profileTow);
        JLabel profileLable = new JLabel(fprofileOne);
        profileLable.setBounds(5,5,250,250);
        add(profileLable);



        setSize(640,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==loginButton)
        {
            if(e.getSource()==loginButton)
            {
                String susername=userText.getText();
                String spassword =passwordText.getText();
                String suser =loginChoice.getSelectedItem();
                try
                {
                    database c=new database();
                    String query ="select * from Signup where username='"+susername+"' and password ='"+spassword+"'and usertype='"+suser+"'";
                    ResultSet resultSet=c.statement.executeQuery(query);
                    if(resultSet.next())
                    {
                        String meter = resultSet.getString("meter_no");
                        setVisible(false);
                        new main_class(suser,meter);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Invalid Loin");
                    }
                }
                catch (Exception e2)
                {
                      e2.printStackTrace();
                }
            }

        } else if (e.getSource()==cancelButton)
        {
            setVisible(false);
        }
        else if (e.getSource()==signupButton)
        {
            setVisible(false);
            new Signup();
        }
    }


//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==loginButton){
//            String susername = userText.getText();
//            String spassword = passwordText.getText();
//            String suser = loginChoice.getSelectedItem();
//
//            try{
//                database d = new database();
//                String queryy = "select * from Signup where username = '"+susername+"' and password = '"+spassword+"' and usertype ='"+suser+"'";
//                ResultSet resultSet = d.statement.executeQuery(queryy);
//
//                if (resultSet.next()){
//                    String meter = resultSet.getString("meter_no");
//                    setVisible(false);
//                    new main_class(suser,meter);
//                }else {
//                    JOptionPane.showMessageDialog(null ,"Invalid Login");
//                }
//
//            }catch (Exception E){
//                E.printStackTrace();
//            }
//        } else if (e.getSource()==cancelButton) {
//            setVisible(false);
//        } else if (e.getSource()==signupButton) {
//            setVisible(false);
//            new Signup();
//        }
//
//    }


    public static void main(String[] args) {
        new Login();
    }
}