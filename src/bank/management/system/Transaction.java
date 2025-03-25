
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transaction extends JFrame implements ActionListener{
    JButton deposit,withdrawal,exit,balanceEnq,fastcash,ministatement,pinchange;
    Transaction(){
        setLayout(null);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i1=img.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i2=new ImageIcon(i1);
        JLabel j=new JLabel(i2);
        j.setBounds(0,0,900,900);
        add(j);
        
        JLabel text =new JLabel("Please select your Transaction");
        text .setBounds(210,300,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway",Font.BOLD,16));
        j.add(text);
        
         deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        j.add(deposit);
        
         withdrawal=new JButton("Cash Withdrawal");
        withdrawal.setBounds(355,415,150,30);
        j.add(withdrawal);
        
         fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        j.add(fastcash);
        
         ministatement=new JButton("Mini Statement");
        ministatement.setBounds(355,450,150,30);
        j.add(ministatement);
        
         pinchange=new JButton("PIN Change");
        pinchange.setBounds(170,485,150,30);
        j.add(pinchange);
        
         balanceEnq=new JButton("Balance Enquiry");
        balanceEnq.setBounds(355,485,150,30);
        j.add(balanceEnq);
        
         exit=new JButton("Exit");
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
            
        }
    }
    public static void main(String[] args){
        new Transaction();
        
    }
    
}
