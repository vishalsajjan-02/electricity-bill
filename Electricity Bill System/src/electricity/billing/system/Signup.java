//package electricity.billing.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.ResultSet;
//
////public class Signup extends JFrame implements ActionListener
////{
//////    Choice loginascho;
//////    TextField metertext,employertext,usernametext,nametext,passwordtext;
//////    JButton create,back;
////Choice loginASCho;
////    TextField meterText,EmployerText,userNameText,nameText,passwordText;
////    JButton create,back;
////    Signup()
////    {
//////        super("signup page");
//////        getContentPane().setBackground(new Color(169, 232, 148));
//////        JLabel createAs= new JLabel("Create Account As");
//////        createAs.setBounds(30,50,125,20);
//////        add(createAs);
//////
//////        loginascho=new Choice();
//////        loginascho.add("Admin");
//////        loginascho.add("Customer");
//////        loginascho.setBounds(170,50,120,20);
//////        add(loginascho);
////////----------------------------------------------------------------
//////       JLabel meterNo=new JLabel("Meter Number");
//////       meterNo.setBounds(30,100,125,20);
//////       meterNo.setVisible(false);
//////       add(meterNo);
//////
//////       metertext=new TextField();
//////       metertext.setBounds(170,100,125,20);
//////       metertext.setVisible(false);
//////       add(metertext);
////////-------------------------------------------------------------------
//////        JLabel employer=new JLabel("Employer ID");
//////        employer.setBounds(30,100,125,20);
//////        employer.setVisible(true);
//////        add(employer);
//////
//////        employertext=new TextField();
//////        employertext.setBounds(170,100,125,20);
//////        employertext.setVisible(true);
//////        add(employertext);
////////-----------------------------------------------------------------------
//////        JLabel username=new JLabel("UserName");
//////        username.setBounds(30,140,125,20);
//////        add(username);
//////
//////        usernametext=new TextField();
//////        usernametext.setBounds(170,140,125,20);
//////        add(usernametext);
////////-------------------------------------------------------------------------
//////       JLabel name=new JLabel("Name");
//////       name.setBounds(30,180,125,20);
//////       add(name);
//////
//////       nametext=new TextField();
//////       nametext.setBounds(170,180,125,20);
//////       add(nametext);
////        super("Signup Page");
////        getContentPane().setBackground(new Color(168,203,255));
////
////        JLabel createAs = new JLabel("Create Account As");
////        createAs.setBounds(30,50,125,20);
////        add(createAs);
////
////        loginASCho = new Choice();
////        loginASCho.add("Admin");
////        loginASCho.add("Customer");
////        loginASCho.setBounds(170,50,120,20);
////        add(loginASCho);
////
////        JLabel meterNo = new JLabel("Meter Number");
////        meterNo.setBounds(30,100,125,20);
////        meterNo.setVisible(false);
////        add(meterNo);
////
////        meterText = new TextField();
////        meterText.setBounds(170,100,125,20);
////        meterText.setVisible(false);
////        add(meterText);
////
////        JLabel Employer = new JLabel("Employer ID");
////        Employer.setBounds(30,100,125,20);
////        Employer.setVisible(true);
////        add(Employer);
////
////        EmployerText = new TextField();
////        EmployerText.setBounds(170,100,125,20);
////        EmployerText.setVisible(true);
////        add(EmployerText);
////
////        JLabel userName = new JLabel("UserName");
////        userName.setBounds(30,140,125,20);
////        add(userName);
////
////        userNameText = new TextField();
////        userNameText.setBounds(170,140,125,20);
////        add(userNameText);
////
////        JLabel name = new JLabel("Name");
////        name.setBounds(30,180,125,20);
////        add(name);
////
////        nameText = new TextField("");
////        nameText.setBounds(170,180,125,20);
////        add(nameText);
//
////        meterText.addFocusListener(new FocusListener() {
////           public void focusGained(FocusEvent e) {
////
////           }
////           public void focusLost(FocusEvent e)
////           {
////               try
////               {
////                   database c=new database();
////                   ResultSet resultSet=c.statement.executeQuery("select * from Signup where meter_no='"+meterText.getText()+"'");
////                   if(resultSet.next())
////                   {
////                       nameText.setText(resultSet.getString("name"));
////                   }
////               }
////               catch (Exception E)
////               {
////                   E.printStackTrace();
////               }
////           }
////       });
//////---------------------------------------------------------------------------
////        JLabel password=new JLabel("Password");
////        password.setBounds(30,220,125,20);
////        add(password);
////
////        passwordtext=new TextField();
////        passwordtext.setBounds(170,220,125,20);
////        add(passwordtext);
//////--------------------------------------------------------------------------------
////   loginascho.addItemListener(new ItemListener()
////   {
////       public void itemStateChanged(ItemEvent e)
////       {
////           String user = loginascho.getSelectedItem();
////           if(user.equals("Customer"))
////           {
////               employer.setVisible(false);
////               nametext.setEditable(false);
////               employertext.setVisible(false);
////               meterNo.setVisible(true);
////               metertext.setVisible(true);
////           }
////           else
////           {
////               employer.setVisible(true);
////               employertext.setVisible(true);
////               meterNo.setVisible(false);
////               metertext.setVisible(false);
////           }
////       }
////   });
//// //----------------------------------------------------------
////        create=new JButton("Create");
////        create.setBounds(50,285,100,25);
////        create.setFont(new Font("arial",Font.BOLD,20));
////        create.setForeground(Color.GRAY);
////        create.setBackground(Color.orange);
////        create.addActionListener(this);
////        add(create);
////
////        back=new JButton("Back");
////        back.setBounds(180,285,100,25);
////        back.setFont(new Font("arial",Font.BOLD,20));
////        back.setForeground(Color.GRAY);
////        back.setBackground(Color.orange);
////        back.addActionListener(this);
////        add(back);
//////------------------------------------------------
////        ImageIcon boyicon =new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
////        Image boying=boyicon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
////        ImageIcon boyicon2 =new ImageIcon(boying);
////        JLabel boylebal =new JLabel(boyicon2);
////        boylebal.setBounds(300,20,250,250);
////        add(boylebal);
////
////        // --------------------------------------------------------------------------
////        setSize(600,380);
////        setLocation(500,200);
////        setLayout(null);
////        setVisible(true);
////    }
////    public void actionPerformed (ActionEvent ae1)
////    {
////        if(ae1.getSource() == create)
////        {
////            String sloginAs = loginascho.getSelectedItem();
////            String susername =usernametext.getText();
////            String sname = nametext.getText();
////            String spassword =passwordtext.getText();
////            String smeter = metertext.getText();
////            try
////            {
////                 database c1 =new database();
////                 String query = null;
////                 if(loginascho.equals("Admin")) {
////                     query = "insert into Signup value('" + smeter + "','" + susername + "','" + sname + "','" + spassword + "','" + sloginAs + "')";
////                 }
////                 else
////                 {
////                     query="update Signup set username='"+susername+"',password='"+spassword+"',usertype='"+sloginAs+"'where meter_no='"+smeter+"'";
////                 }
////                 c1.statement.executeUpdate(query);
//////                 c1.statement.executeUpdate("insert into Signup value('"+smeter+"','"+susername +"','"+sname+"','"+spassword+"','"+sloginAs+"')");
////               JOptionPane.showMessageDialog(null,"account created");
////               setVisible(false);
////                new login();
////        }
////            catch (Exception e)
////            {
////                e.printStackTrace();
////            }
////        }
////        else if (ae1.getSource()==back)
////        {
////            setVisible(false);
////            new login();
////        }
////    }
////    public static void main(String[] args)
////    {
////        new Signup();
////    }
////}
//
//public class Signup extends JFrame implements ActionListener {
//    Choice loginASCho;
//    TextField meterText,EmployerText,userNameText,nameText,passwordText;
//    JButton create,back;
//    Signup(){
//        super("Signup Page");
//        getContentPane().setBackground(new Color(168,203,255));
//
//        JLabel createAs = new JLabel("Create Account As");
//        createAs.setBounds(30,50,125,20);
//        add(createAs);
//
//        loginASCho = new Choice();
//        loginASCho.add("Admin");
//        loginASCho.add("Customer");
//        loginASCho.setBounds(170,50,120,20);
//        add(loginASCho);
//
//        JLabel meterNo = new JLabel("Meter Number");
//        meterNo.setBounds(30,100,125,20);
//        meterNo.setVisible(false);
//        add(meterNo);
//
//        meterText = new TextField();
//        meterText.setBounds(170,100,125,20);
//        meterText.setVisible(false);
//        add(meterText);
//
//        JLabel Employer = new JLabel("Employer ID");
//        Employer.setBounds(30,100,125,20);
//        Employer.setVisible(true);
//        add(Employer);
//
//        EmployerText = new TextField();
//        EmployerText.setBounds(170,100,125,20);
//        EmployerText.setVisible(true);
//        add(EmployerText);
//
//        JLabel userName = new JLabel("UserName");
//        userName.setBounds(30,140,125,20);
//        add(userName);
//
//        userNameText = new TextField();
//        userNameText.setBounds(170,140,125,20);
//        add(userNameText);
//
//
//        JLabel name = new JLabel("Name");
//        name.setBounds(30,180,125,20);
//        add(name);
//
//        nameText = new TextField("");
//        nameText.setBounds(170,180,125,20);
//        add(nameText);
//
//        meterText.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                try{
//                    database c = new database();
//                    ResultSet resultSet = c.statement.executeQuery("select * from Signup  where meter_no = '"+meterText.getText()+"'");
//                    if (resultSet.next()){
//                        nameText.setText(resultSet.getString("name"));
//                    }
//
//                }catch (Exception E){
//                    E.printStackTrace();
//                }
//            }
//        });
//
//        JLabel password = new JLabel("Password");
//        password.setBounds(30,220,125,20);
//        add(password);
//
//        passwordText = new TextField();
//        passwordText.setBounds(170,220,125,20);
//        add(passwordText);
//
//
//        loginASCho.addItemListener(new ItemListener() {
//            @Override
//            public void itemStateChanged(ItemEvent e) {
//                String user = loginASCho.getSelectedItem();
//                if (user.equals("Customer")){
//                    Employer.setVisible(false);
//                    nameText.setEditable(false);
//                    EmployerText.setVisible(false);
//                    meterNo.setVisible(true);
//                    meterText.setVisible(true);
//                }else {
//                    Employer.setVisible(true);
//                    EmployerText.setVisible(true);
//                    meterNo.setVisible(false);
//                    meterText.setVisible(false);
//                }
//
//            }
//        });
//
//        create = new JButton("Create");
//        create.setBackground(new Color(66,127,219));
//        create.setForeground(Color.black);
//        create.setBounds(50,285,100,25);
//        create.addActionListener(this);
//        add(create);
//
//        back = new JButton("Back");
//        back.setBackground(new Color(66,127,219));
//        back.setForeground(Color.black);
//        back.setBounds(180,285,100,25);
//        back.addActionListener(this);
//        add(back);
//
//        ImageIcon boyIcon = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
//        Image boyImg = boyIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
//        ImageIcon boyIcon2 = new ImageIcon(boyImg);
//        JLabel boyLabel = new JLabel(boyIcon2);
//        boyLabel.setBounds(320,30,250,250);
//        add(boyLabel);
//
//
//        setSize(600,380);
//        setLocation(500,200);
//        setLayout(null);
//        setVisible(true);
//    }
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()== create){
//            String sloginAs = loginASCho.getSelectedItem();
//            String susername = userNameText.getText();
//            String sname = nameText.getText();
//            String spassword = passwordText.getText();
//            String smeter = meterText.getText();
//            try{
//                database c = new database();
//                String query= null;
//                if (loginASCho.equals("Admin")) {
//                    query = "insert into Signup value('" + smeter + "', '" + susername + "', '" + sname + "','" + spassword + "','" + sloginAs + "')";
//                }
//                else
//                {
//                    query = "update Signup set username = '"+susername+"', password = '"+spassword+"', usertype = '"+sloginAs+"' where meter_no = '"+smeter+"'";
//                }
//                c.statement.executeUpdate(query);
//                JOptionPane.showMessageDialog(null,"Account Created");
//                setVisible(false);
//                new Login();
//            }catch (Exception E){
//                E.printStackTrace();
//            }
//        } else if (e.getSource()==back) {
//            setVisible(false);
//            new Login();
//        }
//    }
//    public static void main(String[] args) {
//        new Signup();
//    }
//}
//package electricity.billing.system;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.ResultSet;
//
//public class Signup extends JFrame implements ActionListener {
//    Choice loginASCho;
//    TextField meterText,EmployerText,userNameText,nameText,passwordText;
//    JButton create,back;
//    Signup(){
//        super("Signup Page");
//        getContentPane().setBackground(new Color(168,203,255));
//
//        JLabel createAs = new JLabel("Create Account As");
//        createAs.setBounds(30,50,125,20);
//        add(createAs);
//
//        loginASCho = new Choice();
//        loginASCho.add("Admin");
//        loginASCho.add("Customer");
//        loginASCho.setBounds(170,50,120,20);
//        add(loginASCho);
//
//        JLabel meterNo = new JLabel("Meter Number");
//        meterNo.setBounds(30,100,125,20);
//        meterNo.setVisible(false);
//        add(meterNo);
//
//        meterText = new TextField();
//        meterText.setBounds(170,100,125,20);
//        meterText.setVisible(false);
//        add(meterText);
//
//        JLabel Employer = new JLabel("Employer ID");
//        Employer.setBounds(30,100,125,20);
//        Employer.setVisible(true);
//        add(Employer);
//
//        EmployerText = new TextField();
//        EmployerText.setBounds(170,100,125,20);
//        EmployerText.setVisible(true);
//        add(EmployerText);
//
//        JLabel userName = new JLabel("UserName");
//        userName.setBounds(30,140,125,20);
//        add(userName);
//
//        userNameText = new TextField();
//        userNameText.setBounds(170,140,125,20);
//        add(userNameText);
//
//
//        JLabel name = new JLabel("Name");
//        name.setBounds(30,180,125,20);
//        add(name);
//
//        nameText = new TextField("");
//        nameText.setBounds(170,180,125,20);
//        add(nameText);
//
//        meterText.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//
//            }
//
//            @Override
//            public void focusLost(FocusEvent e) {
//                try{
//                    database c = new database();
//                    ResultSet resultSet = c.statement.executeQuery("select * from Signup  where meter_no = '"+meterText.getText()+"'");
//                    if (resultSet.next()){
//                        nameText.setText(resultSet.getString("name"));
//                    }
//
//                }catch (Exception E){
//                    E.printStackTrace();
//                }
//            }
//        });
//
//        JLabel password = new JLabel("Password");
//        password.setBounds(30,220,125,20);
//        add(password);
//
//        passwordText = new TextField();
//        passwordText.setBounds(170,220,125,20);
//        add(passwordText);
//
//
//        loginASCho.addItemListener(new ItemListener()
//        {
//            public void itemStateChanged(ItemEvent e) {
//                String user = loginASCho.getSelectedItem();
//                if (user.equals("Customer")){
//                    Employer.setVisible(false);
//                    nameText.setEditable(false);
//                    EmployerText.setVisible(false);
//                    meterNo.setVisible(true);
//                    meterText.setVisible(true);
//                }else {
//                    Employer.setVisible(true);
//                    EmployerText.setVisible(true);
//                    meterNo.setVisible(false);
//                    meterText.setVisible(false);
//                }
//
//            }
//        });
//
//        create = new JButton("Create");
//        create.setBackground(new Color(66,127,219));
//        create.setForeground(Color.black);
//        create.setBounds(50,285,100,25);
//        create.addActionListener(this);
//        add(create);
//
//        back = new JButton("Back");
//        back.setBackground(new Color(66,127,219));
//        back.setForeground(Color.black);
//        back.setBounds(180,285,100,25);
//        back.addActionListener(this);
//        add(back);
//
//        ImageIcon boyIcon = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
//        Image boyImg = boyIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
//        ImageIcon boyIcon2 = new ImageIcon(boyImg);
//        JLabel boyLabel = new JLabel(boyIcon2);
//        boyLabel.setBounds(320,30,250,250);
//        add(boyLabel);
//
//
//        setSize(600,380);
//        setLocation(500,200);
//        setLayout(null);
//        setVisible(true);
//    }
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()== create){
//            String sloginAs = loginASCho.getSelectedItem();
//            String susername = userNameText.getText();
//            String sname = nameText.getText();
//            String spassword = passwordText.getText();
//            String smeter = meterText.getText();
//            try{
//                database c = new database();
//                String query= null;
//                if (loginASCho.equals("Admin")) {
//                    query = "insert into Signup value('" +smeter+ "', '" +susername+ "', '" + sname + "','" + spassword + "','" + sloginAs + "')";
//                }else {
//                    query = "update Signup set username = '"+susername+"', password = '"+spassword+"', usertype = '"+sloginAs+"' where meter_no = '"+smeter+"'";
//                }
//                c.statement.executeUpdate(query);
//
//                JOptionPane.showMessageDialog(null,"Account Created");
//                setVisible(false);
//                new Login();
//
//            }catch (Exception E){
//                E.printStackTrace();
//            }
//        } else if (e.getSource()==back) {
//            setVisible(false);
//            new Login();
//        }
//    }
//
//    public static void main(String[] args) {
//        new Signup();
//    }
//}

package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Signup extends JFrame implements ActionListener {
    Choice loginASCho;
    TextField meterText,EmployerText,userNameText,nameText,passwordText;
    JButton create,back;
    Signup(){
        super("Signup Page");
        getContentPane().setBackground(new Color(168,203,255));

        JLabel createAs = new JLabel("Create Account As");
        createAs.setBounds(30,50,125,20);
        add(createAs);

        loginASCho = new Choice();
        loginASCho.add("Admin");
        loginASCho.add("Customer");
        loginASCho.setBounds(170,50,120,20);
        add(loginASCho);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30,100,125,20);
        meterNo.setVisible(false);
        add(meterNo);

        meterText = new TextField();
        meterText.setBounds(170,100,125,20);
        meterText.setVisible(false);
        add(meterText);

        JLabel Employer = new JLabel("Employer ID");
        Employer.setBounds(30,100,125,20);
        Employer.setVisible(true);
        add(Employer);

        EmployerText = new TextField();
        EmployerText.setBounds(170,100,125,20);
        EmployerText.setVisible(true);
        add(EmployerText);

        JLabel userName = new JLabel("UserName");
        userName.setBounds(30,140,125,20);
        add(userName);

        userNameText = new TextField();
        userNameText.setBounds(170,140,125,20);
        add(userNameText);


        JLabel name = new JLabel("Name");
        name.setBounds(30,180,125,20);
        add(name);

        nameText = new TextField("");
        nameText.setBounds(170,180,125,20);
        add(nameText);

        meterText.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
            }
            public void focusLost(FocusEvent e) {
                try{
                    database c = new database();
                    ResultSet resultSet = c.statement.executeQuery("select * from Signup  where meter_no = '"+meterText.getText()+"'");
                    if (resultSet.next()){
                        nameText.setText(resultSet.getString("name"));
                    }

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JLabel password = new JLabel("Password");
        password.setBounds(30,220,125,20);
        add(password);

        passwordText = new TextField();
        passwordText.setBounds(170,220,125,20);
        add(passwordText);


        loginASCho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String user = loginASCho.getSelectedItem();
                if (user.equals("Customer")){
                    Employer.setVisible(false);
//                    nameText.setEditable(false);
                    EmployerText.setVisible(false);
                    meterNo.setVisible(true);
                    meterText.setVisible(true);
                }else {
                    Employer.setVisible(true);
                    EmployerText.setVisible(true);
                    meterNo.setVisible(false);
                    meterText.setVisible(false);
                }

            }
        });

        create = new JButton("Create");
        create.setBackground(new Color(66,127,219));
        create.setForeground(Color.black);
        create.setBounds(50,285,100,25);
        create.addActionListener(this);
        add(create);

        back = new JButton("Back");
        back.setBackground(new Color(66,127,219));
        back.setForeground(Color.black);
        back.setBounds(180,285,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon boyIcon = new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image boyImg = boyIcon.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon boyIcon2 = new ImageIcon(boyImg);
        JLabel boyLabel = new JLabel(boyIcon2);
        boyLabel.setBounds(320,30,250,250);
        add(boyLabel);


        setSize(600,380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==create)
        {
             String sloginAs=loginASCho.getSelectedItem();
             String susername=userNameText.getText();
             String sname =nameText.getText();
             String spassword =passwordText.getText();
             String smeter =meterText.getText();
             try
             {
                 database c=new database();
                 String query =null;
                 query= "insert into Signup value('"+smeter+"','"+susername+"','"+sname+"','"+spassword+"','"+sloginAs+"')";
                 c.statement.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Account Created");
                 setVisible(false);
                 new Login();

             }
             catch (Exception e1)
             {
                 e1.printStackTrace();
             }
        }
        else if (e.getSource()==back)
        {
            setVisible(false);
            new Login();
        }
    }



//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()== create){
//            String sloginAs = loginASCho.getSelectedItem();
//            String susername = userNameText.getText();
//            String sname = nameText.getText();
//            String spassword = passwordText.getText();
//            String smeter = meterText.getText();
//            try{
//                database c = new database();
//                String query= null;
//                if (loginASCho.equals("Admin")) {
//                    query = "insert into Signup value('" + smeter + "', '" + susername + "', '" + sname + "','" + spassword + "','" + sloginAs + "')";
//                }else {
//                    query = "update Signup set username = '"+susername+"', password = '"+spassword+"', usertype = '"+sloginAs+"' where meter_no = '"+smeter+"'";
//                }
//                c.statement.executeUpdate(query);
//
//                JOptionPane.showMessageDialog(null,"Account Created");
//                setVisible(false);
//                new Login();
//
//            }catch (Exception E){
//                E.printStackTrace();
//            }
//        } else if (e.getSource()==back) {
//            setVisible(false);
//            new Login();
//        }
//    }

    public static void main(String[] args) {
        new Signup();
    }
}