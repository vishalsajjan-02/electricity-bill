package electricity.billing.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class deposit_details extends JFrame implements ActionListener
{
    Choice search_meter_choice,search_month_choice;
    JTable table;
    JButton search,print,close;
    deposit_details()
    {
        super("Deposite Details");
        getContentPane().setBackground(Color.MAGENTA);
        setSize(700,500);
        setLocation(400,200);
        setLayout(null);

        JLabel searchmeter=new JLabel("Search by meter number");
        searchmeter.setBounds(20,20,150,20);
        add(searchmeter);

        search_meter_choice=new Choice();
        search_meter_choice.setBounds(180,20,150,20);
        add(search_meter_choice);

        try
        {
            database c=new database();
            ResultSet resultSet=c.statement.executeQuery("select * from bill");
            while(resultSet.next())
            {
                search_meter_choice.add(resultSet.getString("meter_no"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        JLabel searchmonth=new JLabel("Search by name");
        searchmonth.setBounds(400,20,100,20);
        add(searchmonth);

        search_month_choice=new Choice();
        search_month_choice.add("January");
        search_month_choice.add("February");
        search_month_choice.add("March");
        search_month_choice.add("April");
        search_month_choice.add("May");
        search_month_choice.add("June");
        search_month_choice.add("July");
        search_month_choice.add("August");
        search_month_choice.add("October");
        search_month_choice.add("November");
        search_month_choice.add("December");
        search_month_choice.setBounds(520,20,150,20);
        add(search_month_choice);

        table=new JTable();
        try
        {
            database c=new database();
            ResultSet resultSet=c.statement.executeQuery("select * from bill");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        JScrollPane scrollPane=new JScrollPane(table);
        scrollPane.setBounds(0,100,700,500);
        scrollPane.setBackground(Color.WHITE);
        add(scrollPane);

        search=new JButton("Search");
        search.setBackground(Color.WHITE);
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);

        print=new JButton("Print");
        print.setBackground(Color.WHITE);
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);

        close=new JButton("Close");
        close.setBackground(Color.WHITE);
        close.setBounds(600,70,80,20);
        close.addActionListener(this);
        add(close);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==search)
        {
            String query_search="select * from bill where meter_no='"+search_meter_choice.getSelectedItem()+"' and month ='"+search_month_choice.getSelectedItem()+"'  ";
            try
            {
                database c=new database();
                ResultSet resultSet =c.statement.executeQuery(query_search);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

            }
            catch (Exception e1)
            {
                e1.printStackTrace();
            }
        }
        else if (e.getSource()==print)
        {
            try
            {
                table.print();
            }
            catch (Exception E)
            {
                E.printStackTrace();
            }
        }
        else
        {
            setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        new deposit_details();
    }
}
