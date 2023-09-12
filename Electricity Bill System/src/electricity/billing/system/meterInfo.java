package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class meterInfo extends JFrame implements ActionListener
{
    Choice meterlocchoice,metertypechoice,phasecodechoice,billtyoechoice;
    JButton submit1;
    String meternumber;
    meterInfo(String meternumber)
    {
        this.meternumber=meternumber;
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);
        add(panel);

        JLabel heading1=new JLabel("Meter Information");
        heading1.setBounds(180,10,200,20);
        heading1.setFont(new Font("arial",Font.BOLD,20));
        panel.add(heading1);

        JLabel Meternumber1=new JLabel("Meter Locaion");
        Meternumber1.setBounds(50,80,100,20);
        panel.add(Meternumber1);

        JLabel meternumber1Text=new JLabel(meternumber);
        meternumber1Text.setBounds(180,80,150,20);
        panel.add(meternumber1Text);

        JLabel MeterLoc=new JLabel("Meter Number");
        MeterLoc.setBounds(50,120,100,20);
        panel.add(MeterLoc);

        meterlocchoice =new Choice();
        meterlocchoice.add("Outside");
        meterlocchoice.add("Inside");
        meterlocchoice.setBounds(180,120,150,20);
        panel.add(meterlocchoice);

        JLabel MeterType=new JLabel("Meter Type");
        MeterType.setBounds(50,160,100,20);
        panel.add(MeterType);

        metertypechoice=new Choice();
        metertypechoice.add("Electric Meter");
        metertypechoice.add("Solar Meter");
        metertypechoice.add("Smart Meter");
        metertypechoice.setBounds(180,160,150,20);
        panel.add(metertypechoice);

        JLabel PhaseCode=new JLabel("Phase Code");
        PhaseCode.setBounds(50,200,100,20);
        panel.add(PhaseCode);
        phasecodechoice =new Choice();
        phasecodechoice.add("011");
        phasecodechoice.add("022");
        phasecodechoice.add("033");
        phasecodechoice.add("044");
        phasecodechoice.add("055");
        phasecodechoice.add("066");
        phasecodechoice.add("077");
        phasecodechoice.add("088");
        phasecodechoice.add("099");
        phasecodechoice.setBounds(180,200,150,20);
        panel.add(phasecodechoice);

        JLabel billtype=new JLabel("Bill Type");
        billtype.setBounds(50,240,100,20);
        panel.add(billtype);
        billtyoechoice=new Choice();
        billtyoechoice.add("Normal");
        billtyoechoice.add("Indrustrial");
        billtyoechoice.setBounds(180,240,150,20);
        panel.add(billtyoechoice);

        JLabel Day1=new JLabel("30 Days Billing Time...");
        Day1.setBounds(50,280,150,20);
        panel.add(Day1);

        JLabel Note1=new JLabel("Note:-");
        Note1.setBounds(50,320,100,20);
        panel.add(Note1);

        JLabel Note2=new JLabel("By default Bill is calculayed for 30 days only:-");
        Note2.setBounds(50,340,300,20);
        panel.add(Note2);

        submit1=new JButton("Submit");
        submit1.setBounds(220,390,100,25);
        submit1.setBackground(Color.BLACK);
        submit1.setForeground(Color.WHITE);
        submit1.setFont(new Font("arial",Font.BOLD,20));
        submit1.addActionListener(this);
        panel.add(submit1);
        setLayout(new BorderLayout());
        add(panel,"Center");
        ImageIcon I1=new ImageIcon(ClassLoader.getSystemResource("icon/details.png"));
        Image I2=I1.getImage().getScaledInstance(230,300,Image.SCALE_DEFAULT);
        ImageIcon I3=new ImageIcon(I2);
        JLabel imagebabel =new JLabel(I3);
        add(imagebabel,"East");
//============================================
         setSize(700,500);
         setLocation(400,200);
         setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource()==submit1)
         {
             String smeternum =meternumber;
             String smeterlocation=meterlocchoice.getSelectedItem();
             String smetertype=metertypechoice.getSelectedItem();
             String sphasecode=phasecodechoice.getSelectedItem();
             String sbilltype=billtyoechoice.getSelectedItem();
             String sday="30";
             String query_meterinfo="insert into meter_info values('"+smeternum+"','"+smeterlocation+"','"+smetertype+"','"+sphasecode+"','"+sbilltype+"','"+sday+"')";
             try
             {
                 database c=new database();
                 c.statement.executeUpdate(query_meterinfo);
                 JOptionPane.showMessageDialog(null,"Meter Information submitted successfully");
                 setVisible(false);
             }
             catch (Exception E1)
             {
                 E1.printStackTrace();
             }
         }
         else
         {
             setVisible(false);
         }
    }

    public static void main(String[] args)
    {
        new meterInfo("");
    }

}
