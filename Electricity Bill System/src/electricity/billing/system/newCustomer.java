package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class newCustomer extends JFrame implements ActionListener
{
    JLabel CustomerName,heading,meternum,address1,city1,state1,email1,phone1,meternumText;
    JTextField nameText,addressText,city1Text,state1Text,email1Text,phone1Text;
    JButton next1,cancel1;
    newCustomer() {
        super("New Customer");
        setSize(700, 500);
        setLocation(400, 200);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        add(panel);

        heading = new JLabel("New Customer");
        heading.setBounds(180, 10, 200, 20);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(heading);

        CustomerName = new JLabel("New Customer");
        CustomerName.setBounds(50, 80, 100, 20);
        panel.add(CustomerName);

        nameText=new JTextField();
        nameText.setBounds(180,80,150,20);
        panel.add(nameText);
//================================
        meternum = new JLabel("Meter Number");
        meternum.setBounds(50, 120, 100, 20);
        panel.add(meternum);
        
        meternumText=new JLabel();
        meternumText.setBounds(180,120,150,20);
        panel.add(meternumText);
//===============================
        Random ran=new Random();
        long number =ran.nextLong()%1000000;
        meternumText.setText(""+Math.abs(number));
//=====================================
        address1 = new JLabel("Address");
        address1.setBounds(50, 160, 100, 20);
        panel.add(address1);

        addressText=new JTextField();
        addressText.setBounds(180,160,150,20);
        panel.add(addressText);
//================================
        city1 = new JLabel("City");
        city1.setBounds(50, 200, 100, 20);
        panel.add(city1);

        city1Text=new JTextField();
        city1Text.setBounds(180,200,150,20);
        panel.add(city1Text);
//=======================
        state1 = new JLabel("State");
        state1.setBounds(50, 240, 100, 20);
        panel.add(state1);

        state1Text=new JTextField();
        state1Text.setBounds(180,240,150,20);
        panel.add(state1Text);
//==============================

        email1 = new JLabel("Email");
        email1.setBounds(50, 280, 100, 20);
        panel.add(email1);

        email1Text=new JTextField();
        email1Text.setBounds(180,280,150,20);
        panel.add(email1Text);
//==============================
        phone1 = new JLabel("Phone_No");
        phone1.setBounds(50, 320, 100, 20);
        panel.add(phone1);

        phone1Text=new JTextField();
        phone1Text.setBounds(180,320,150,20);
        panel.add(phone1Text);
//============================
        next1=new JButton("Next");
        next1.setBounds(120,390,100,25);
        next1.setBackground(Color.BLACK);
        next1.setForeground(Color.WHITE);
        next1.setFont(new Font("arial",Font.BOLD,20));
        next1.addActionListener(this);
        panel.add(next1);

//=========================
        cancel1=new JButton("Cancel");
        cancel1.setBounds(230,390,100,25);
        cancel1.setBackground(Color.BLACK);
        cancel1.setForeground(Color.WHITE);
        cancel1.setFont(new Font("arial",Font.BOLD,20));
        cancel1.addActionListener(this);
        panel.add(cancel1);

        setLayout(new BorderLayout());
        add(panel,"Center");

        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icon/boy.png"));
        Image I2= I1.getImage().getScaledInstance(230,200,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel ImgLabel =new JLabel(I3);
        add(ImgLabel,"West");


        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
           if(e.getSource() == next1)
           {
                   String sname=nameText.getText();
                   String smeter=meternumText.getText();
                   String saddress=addressText.getText();
                   String scity =city1Text.getText();
                   String sstate =state1Text.getText();
                   String semail=email1Text.getText();
                   String sphone=phone1Text.getText();


                   String query_customer1 ="insert into new_customer values('"+sname+"','"+smeter+"','"+saddress+"','"+scity+"','"+sstate+"','"+semail+"','"+sphone+"')";
                   String query_Signup = " insert into Signup values('"+smeter+"','','"+sname+"','','')";
                   try
                   {
                       database c =new database();
                       c.statement.executeUpdate(query_customer1);
                       c.statement.executeUpdate(query_Signup);
                       JOptionPane.showMessageDialog(null,"Customer details added successfully");
                       setVisible(false);
                       new meterInfo(smeter);

                   }
                   catch (Exception Ae)
                   {
                       Ae.printStackTrace();
                   }
           }
           else
           {
               setVisible(false);
           }
    }

    public static void main(String[] args)
    {
        new newCustomer();
    }
}
