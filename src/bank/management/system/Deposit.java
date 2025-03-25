
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class Deposit extends JFrame implements ActionListener {
    JButton back,deposit;
    JTextField amount;
    String pinnumber;
    
    public Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        
        JLabel img=new JLabel(i3);
        img.setBounds(0,0,900,900);
        add(img);
        
        JLabel text =new JLabel("Enter the amount you want to deposit");
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(170,300,400,20);
        img.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(170,350,320,25);
        img.add(amount);
        
         deposit =new JButton ("Deposit");
        deposit.setBounds(355,485,150,30);
        deposit.addActionListener(this);
        img.add(deposit);
        
        back =new JButton ("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        img.add(back);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getSource()==deposit){
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
            }
            else{
                try{
                Conn c=new Conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+number+" Deposited Successfully");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
                }
                catch(Exception ae){
                    System.out.println(ae);
                }
            }
            
        }else if(e.getSource()==back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
            
        }
        
    }
    public static void main(String [] arg){
        new Deposit("");
    }
    
}
