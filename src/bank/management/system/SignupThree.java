
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    public SignupThree( String formno){
        this.formno=formno;
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel(" Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,150,20);
        r1.setBackground(Color.white);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,220,250,20);
        r2.setBackground(Color.white);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,150,20);
        r3.setBackground(Color.white);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,180,250,20);
        r4.setBackground(Color.white);
        add(r4);
        
        ButtonGroup gb=new ButtonGroup();
        gb.add(r1);
        gb.add(r2);
        gb.add(r3);
        gb.add(r4);
        
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-5432");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetails=new JLabel("Your 16 Digit Card Number");
        carddetails.setFont(new Font("Raleway",Font.BOLD,12));
        carddetails.setBounds(100,330,300,20);
        add(carddetails);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        JLabel pindetails=new JLabel("Your 4 Digit PIN");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,400,200,20);
        add(pindetails);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,300,30);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        c1.setBackground(Color.WHITE);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        c2.setBackground(Color.WHITE);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4=new JCheckBox("Emai and SMS Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        c4.setBackground(Color.WHITE);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        c5.setBackground(Color.WHITE);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        c6.setBackground(Color.WHITE);
        add(c6);
        
        c7=new JCheckBox("I hereby decleares that the above entered details are correct to the best of my knowledge.");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        c7.setBackground(Color.WHITE);
        add(c7);
        
        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(220,720,100,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);
        
        submit=new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(420,720,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(850,820);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accounttype=null;
            if(r1.isSelected()){
                accounttype="Saving Account";
            }
            else if(r2.isSelected()){
                accounttype="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accounttype="Current Account";
            }
            else if(r4.isSelected()){
                accounttype="Recurring Deposit Account";
            }
            Random random =new Random();
            String cardNumber=""+Math.abs((random.nextLong()%90000L)+5040936000000000L);
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
            String facility="";
            if(c1.isSelected()){
                facility=facility+" ATM Card";
            }
             if(c2.isSelected()){
                facility=facility+" Internet Banking";
            }
             if(c3.isSelected()){
                facility=facility+" Mobile Banking";
            }
             if(c4.isSelected()){
                facility=facility+" Email and SMS Alerts";
            }
             if(c5.isSelected()){
                facility=facility+" Cheque Book";
            }
             if(c6.isSelected()){
                facility=facility+" E-Statement";
            }
            
            try{
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Select Account Type");
                }
                else{
                    Conn c=new Conn();
                String query1="insert into signupthree values('"+formno+"','"+accounttype+"','"+cardNumber+"','"+pinnumber+"','"+facility+"')";
                String query2="insert into login values('"+formno+"','"+cardNumber+"','"+pinnumber+"')";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null,"Card Number: "+cardNumber+"\n Pin: "+pinnumber);
                }
                
            }
            catch(Exception e){
                System.out.println(e);
                
            }
            
        }
        else if(ae.getSource()==cancel){
            
        }
    }
    public static void main(String[] args){
        new SignupThree("");
        
    }
    
}
