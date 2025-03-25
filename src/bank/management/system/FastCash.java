
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;




public class FastCash extends JFrame implements ActionListener{
    JButton deposit,withdrawal,exit,balanceEnq,fastcash,ministatement,pinchange;
    String pinnumber;
    FastCash( String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i1=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        JLabel j=new JLabel(i2);
        j.setBounds(0,0,900,900);
        add(j);
        
        JLabel text =new JLabel("Select Withdrawal Amount");
        text .setBounds(210,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        j.add(text);
        
         deposit=new JButton("Rs 100");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        j.add(deposit);
        
         withdrawal=new JButton("Rs 500");
        withdrawal.setBounds(355,415,150,30);
        withdrawal.addActionListener(this);
        j.add(withdrawal);
        
         fastcash=new JButton("Rs 1000");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        j.add(fastcash);
        
         ministatement=new JButton("Rs 2000");
        ministatement.setBounds(355,450,150,30);
        ministatement.addActionListener(this);
        j.add(ministatement);
        
         pinchange=new JButton("Rs 5000");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        j.add(pinchange);
        
         balanceEnq=new JButton("Rs 10000");
        balanceEnq.setBounds(355,485,150,30);
        balanceEnq.addActionListener(this);
        j.add(balanceEnq);
        
         exit=new JButton("Back");
        exit.setBounds(355,520,150,30);
        exit.addActionListener(this);
        j.add(exit);
        
        setSize(900,900);
//        setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==exit){
           setVisible(false);
           new Transaction(pinnumber).setVisible(true);
        }
        else {
            String amount=((JButton)e.getSource()).getText().substring(3);
            try{
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery("select* from bank where pin='"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));
                    }
                    else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(e.getSource()!=exit && balance <Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                Date date=new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawal',"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+" Debited Successfully" );
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                
            }catch(Exception ae){
                System.out.println(e);
                
            }
        }
    }
    public static void main(String[] args){
        new FastCash("");
        
    }
    
}
