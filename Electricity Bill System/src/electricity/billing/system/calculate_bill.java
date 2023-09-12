package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class calculate_bill extends JFrame implements ActionListener
{
    Choice meternumcho,monthchoice;
    TextField unitText;
    JLabel nameText,addresstext;
    JButton submit,cancel;
    calculate_bill()
    {
        setSize(650,400);
        setLocation(400,200);
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        add(panel);

        JLabel heading=new JLabel("Calculate Electricity Bill");
        heading.setBounds(70,10,300,20);
        heading.setFont(new Font("arial",Font.BOLD,20));
        panel.add(heading);

        JLabel meternum =new JLabel("Meter Number");
        meternum.setBounds(50,80,100,20);
        panel.add(meternum);

        meternumcho =new Choice();
        try
        {
            database c=new database();
            ResultSet resultSet =c.statement.executeQuery("select * from new_customer");
            while (resultSet.next())
            {
                meternumcho.add(resultSet.getString("meter_no"));
            }
        }
        catch (Exception E2)
        {
            E2.printStackTrace();
        }
        meternumcho.setBounds(180,80,100,20);
        panel.add(meternumcho);

        JLabel name=new JLabel("Name");
        name.setBounds(50,120,100,20);
        panel.add(name);

        nameText=new JLabel("");
        nameText.setBounds(180,120,150,20);
        panel.add(nameText);

        JLabel address=new JLabel("Address");
        address.setBounds(50,160,100,20);
        panel.add(address);

        addresstext =new JLabel("");
        addresstext.setBounds(180,160,150,20);
        panel.add(addresstext);



        meternumcho.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent e)
            {
                try
                {
                    database c=new database();
                    ResultSet resultSet=c.statement.executeQuery("select * from new_customer where meter_no='"+meternumcho.getSelectedItem()+"'");
                    while (resultSet.next())
                    {
                        nameText.setText(resultSet.getString("name"));
                        addresstext.setText(resultSet.getString("address"));
                    }
                }
                catch (Exception E3)
                {
                    E3.printStackTrace();
                }
            }
        });

        JLabel unitconsumed=new JLabel("Unit Consumed");
        unitconsumed.setBounds(50,200,100,20);
        panel.add(unitconsumed);

        unitText=new TextField();
        unitText.setBounds(180,200,150,20);
        panel.add(unitText);

        JLabel month =new JLabel("Month");
        month.setBounds(50,240,100,20);
        panel.add(month);

        monthchoice=new Choice();
        monthchoice.add("January");
        monthchoice.add("February");
        monthchoice.add("March");
        monthchoice.add("April");
        monthchoice.add("May");
        monthchoice.add("June");
        monthchoice.add("July");
        monthchoice.add("August");
        monthchoice.add("October");
        monthchoice.add("November");
        monthchoice.add("December");
        monthchoice.setBounds(180,240,150,20);
        panel.add(monthchoice);

        submit=new JButton("Submit");
        submit.setBounds(80,300,100,25);
        submit.setBackground(Color.BLACK);
        submit.setFont(new Font("arial",Font.BOLD,20));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        panel.add(submit);

        cancel=new JButton("Cancel");
        cancel.setBounds(220,300,100,25);
        cancel.setBackground(Color.BLACK);
        cancel.setFont(new Font("arial",Font.BOLD,20));
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        panel.add(cancel);

        setLayout(new BorderLayout());
        add(panel,"Center");
        ImageIcon imageIcon =new ImageIcon(ClassLoader.getSystemResource("icon/budget.png"));
        Image image =imageIcon.getImage().getScaledInstance(250,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel imagelabel=new JLabel(imageIcon1);
        add(imagelabel,"East");

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==submit)
        {
            String smeterno=meternumcho.getSelectedItem();
            String sunit=unitText.getText();
            String smonth=monthchoice.getSelectedItem();
            int totalbill=0;
            int units =Integer.parseInt(sunit);
            String query_text="select * from tax1";
            try
            {
                database c=new database();
                ResultSet resultSet=c.statement.executeQuery(query_text);
                while(resultSet.next())
                {
                    totalbill += units * Integer.parseInt(resultSet.getString("cast_per_unit"));
                    totalbill += Integer.parseInt(resultSet.getString("meter_rent"));
                    totalbill += Integer.parseInt(resultSet.getString("service_charge"));
                    totalbill += Integer.parseInt(resultSet.getString("service_tax"));
                    totalbill += Integer.parseInt(resultSet.getString("swacch_bharat"));
                    totalbill += Integer.parseInt(resultSet.getString("fixed_tax"));
                }
            }
            catch (Exception E4)
            {
                   E4.printStackTrace();
            }
              String query_total_bill="insert into bill values('"+ smeterno+"','"+smonth+"','"+sunit+"','"+totalbill+"','Not Paid')";
            try
            {
                database c=new database();
                c.statement.executeUpdate(query_total_bill);
                JOptionPane.showMessageDialog(null,"Customer bill updated succssfully");
                setVisible(false);
            }
            catch (Exception E5)
            {
                E5.printStackTrace();
            }

        }
        else
        {
            setVisible(false);
        }

    }

    public static void main(String[] args)
    {
        new calculate_bill();
    }
}
