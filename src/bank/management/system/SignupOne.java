package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameField,fnameField,emailField,addressField,cityField,stateField,pincodeField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    public SignupOne(){
        Random ran=new Random();
        random =Math.abs((ran.nextLong()%9000L)+1000L);
        setTitle("NEW ACCOUNT APPLICATION FORM - Page 1");
        
        JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
        formno.setBounds(140,20,600,40);
        formno.setFont(new Font("Arial",Font.BOLD,38));
        add(formno);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details");
        personalDetails.setBounds(250,80,300,40);
        personalDetails.setFont(new Font("Arial",Font.BOLD,25));
        add(personalDetails);
        
        JLabel name=new JLabel("Name: ");
        name.setBounds(100,140,200,30);
        name.setFont(new Font("Arial",Font.BOLD,20));
        add(name);
        
        nameField=new JTextField();
        nameField.setFont(new Font("Raleway",Font.BOLD,14));
        nameField.setBounds(300,140,400,30);
        add(nameField);
        
        JLabel fname=new JLabel("Father's Name: ");
        fname.setBounds(100,190,150,30);
        fname.setFont(new Font("Arial",Font.BOLD,20));
        add(fname);
        
        fnameField=new JTextField();
        fnameField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameField.setBounds(300,190,400,30);
        add(fnameField);
        
        JLabel dob=new JLabel("Date of Birth: ");
        dob.setBounds(100,240,200,30);
        dob.setFont(new Font("Arial",Font.BOLD,20));
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setFont(new Font("Ariel",Font.BOLD,14));
        dateChooser.setForeground(Color.black);
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender: ");
        gender.setBounds(100,290,200,30);
        gender.setFont(new Font("Arial",Font.BOLD,20));
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        male.setFont(new Font("Arial",Font.BOLD,14));
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setFont(new Font("Arial",Font.BOLD,14));
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email=new JLabel("Email: ");
        email.setBounds(100,340,200,30);
        email.setFont(new Font("Arial",Font.BOLD,20));
        add(email);
        
        emailField=new JTextField();
        emailField.setFont(new Font("Raleway",Font.BOLD,14));
        emailField.setBounds(300,340,400,30);
        add(emailField);
        
        JLabel marital=new JLabel("Marital Status: ");
        marital.setBounds(100,390,200,30);
        marital.setFont(new Font("Arial",Font.BOLD,20));
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        married.setBackground(Color.WHITE);
        married.setFont(new Font("Arial",Font.BOLD,14));
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        unmarried.setFont(new Font("Arial",Font.BOLD,14));
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(600,390,120,30);
        other.setFont(new Font("Arial",Font.BOLD,14));
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalGroup=new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        
        JLabel address=new JLabel("Address: ");
        address.setBounds(100,440,200,30);
        address.setFont(new Font("Arial",Font.BOLD,20));
        add(address);
        
        addressField=new JTextField();
        addressField.setFont(new Font("Raleway",Font.BOLD,14));
        addressField.setBounds(300,440,400,30);
        add(addressField);
        
        JLabel city=new JLabel("City: ");
        city.setBounds(100,490,200,30);
        city.setFont(new Font("Arial",Font.BOLD,20));
        add(city);
        
        cityField=new JTextField();
        cityField.setFont(new Font("Raleway",Font.BOLD,14));
        cityField.setBounds(300,490,400,30);
        add(cityField);
        
        JLabel state=new JLabel("State: ");
        state.setBounds(100,540,200,30);
        state.setFont(new Font("Arial",Font.BOLD,20));
        add(state);
        
        stateField=new JTextField();
        stateField.setFont(new Font("Raleway",Font.BOLD,14));
        stateField.setBounds(300,540,400,30);
        add(stateField);
        
        JLabel pincode=new JLabel("Pin Code: ");
        pincode.setBounds(100,590,200,30);
        pincode.setFont(new Font("Arial",Font.BOLD,20));
        add(pincode);
        
        pincodeField=new JTextField();
        pincodeField.setFont(new Font("Raleway",Font.BOLD,14));
        pincodeField.setBounds(300,590,400,30);
        add(pincodeField);
        
        next=new JButton("NEXT");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(600,640,100,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);

        
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String formno=""+random;//""+ conver to string
        String name=nameField.getText();
        String fname=fnameField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="male";
        }
        else if(female.isSelected()){
            gender ="female";
        }
        String email=emailField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="married";
        }
        else if(unmarried.isSelected()){
            marital="unmarried";
        }
        else if(other.isSelected()){
            marital="other";
        }
        String address=addressField.getText();
        String city=cityField.getText();
        String state=stateField.getText();
        String pincode=pincodeField.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }
            else{
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
            }
        }
        catch(Exception ae){
            System.out.println(ae);
        }
        
    }
    
    public static void main(String[] args){
        new SignupOne();
        
    }
    
}
