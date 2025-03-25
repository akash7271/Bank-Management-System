
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    
    JButton login,signup,clear;
    JTextField cardField;
    JPasswordField pinField;
   
    public Login(){
        setLayout(null);
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
       
        JLabel text =new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        JLabel cardNumber =new JLabel("Card No:");
        cardNumber.setFont(new Font("Raleway",Font.BOLD,28));
        cardNumber.setBounds(120,150,200,30);
        add(cardNumber);
       cardField=new JTextField();
        cardField.setBounds(300,150,200,30);
        cardField.setFont(new Font("Arial",Font.BOLD,14));
        add(cardField);
        
        JLabel pin =new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,28));
        pin.setBounds(120,220,200,30);
        add(pin);
        pinField=new JPasswordField();
        pinField.setBounds(300,220,200,30);
        pinField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinField);
        
         login= new JButton("SIGN IN");
        login.setFont(new Font("Osward",Font.BOLD,10));
        login.setBounds(300,270,80,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
         clear= new JButton("CLEAR");
        clear.setFont(new Font("Osward",Font.BOLD,10));
        clear.setBounds(420,270,80,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
         signup= new JButton("SIGN UP");
        signup.setFont(new Font("Osward",Font.BOLD,10));
        signup.setBounds(300,320,200,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        
         getContentPane().setBackground(Color.white);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    @Override
    public void  actionPerformed(ActionEvent e){
        if(e.getSource()==clear){
            cardField.setText("");
            pinField.setText("");
            
            
        }
        else if(e.getSource()==login){
            Conn c=new Conn();
            String cardnumber=cardField.getText();
            String pinnumber=pinField.getText();
            String query="select* from login where cardnumber ='"+cardnumber+"'and pin='"+pinnumber+"'";
            try{
               ResultSet rs= c.s.executeQuery(query);
               if(rs.next()){
                   setVisible(false);
                   new Transaction(pinnumber).setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
               }
                
            }
            catch(Exception ae){
                System.out.println(ae);
            }
            
            
        }
        else if(e.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
        
    }
    public static void main(String[] args){
        new Login();
    }
    
}
