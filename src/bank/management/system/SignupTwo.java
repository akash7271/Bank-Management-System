
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;

import java.awt.event.*;



public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField aadharField,panField;
    JButton next;
    JRadioButton yes,no,eyes,eno;
    JComboBox dropreligion,dropCategory,dropIncome,dropEducation,dropOccupation;
    String formno;
    public SignupTwo( String formno){
        this.formno=formno;
       
        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setBounds(250,80,300,40);
        additionalDetails.setFont(new Font("Arial",Font.BOLD,25));
        add(additionalDetails);
        
        JLabel religion=new JLabel("Religion: ");
        religion.setBounds(100,140,200,30);
        religion.setFont(new Font("Arial",Font.BOLD,20));
        add(religion);
        
        String valReligion[]={"Hindu", "Muslim","Sikh","Christian","Other"};
         dropreligion=new JComboBox(valReligion);
        dropreligion.setFont(new Font("Raleway",Font.BOLD,14));
        dropreligion.setBackground(Color.white);
        dropreligion.setBounds(300,140,400,30);
        add(dropreligion);
        
        JLabel category=new JLabel("Category: ");
        category.setBounds(100,190,150,30);
        category.setFont(new Font("Arial",Font.BOLD,20));
        add(category);
        
        String valCategory[]={"General", "OBC","SC","ST","Other"};
         dropCategory=new JComboBox(valCategory);
        dropCategory.setFont(new Font("Raleway",Font.BOLD,14));
        dropCategory.setBackground(Color.white);
        dropCategory.setBounds(300,190,400,30);
        add(dropCategory);
                
        JLabel income=new JLabel("Income: ");
        income.setBounds(100,240,200,30);
        income.setFont(new Font("Arial",Font.BOLD,20));
        add(income);
        
        String valIncome[]={"Null", "<1,50,000","<2,50,000","<5,00,000","Up to 10,00,000"};
         dropIncome=new JComboBox(valIncome);
        dropIncome.setFont(new Font("Raleway",Font.BOLD,14));
        dropIncome.setBackground(Color.white);
        dropIncome.setBounds(300,240,400,30);
        add(dropIncome);
        
        JLabel education=new JLabel("Educational");
        education.setBounds(100,320,200,30);
        education.setFont(new Font("Arial",Font.BOLD,20));
        add(education);
        
        
        
        JLabel qualification=new JLabel("Qualification: ");
        qualification.setBounds(100,340,200,30);
        qualification.setFont(new Font("Arial",Font.BOLD,20));
        add(qualification);
        
        String valEducation[]={"Non Graduation", "Graduation","Post- Graduation","Doctrate","other"};
         dropEducation=new JComboBox(valEducation);
        dropEducation.setFont(new Font("Raleway",Font.BOLD,14));
        dropEducation.setBackground(Color.white);
        dropEducation.setBounds(300,340,400,30);
        add(dropEducation);
        
        
        
        JLabel occupation=new JLabel("Occupation: ");
        occupation.setBounds(100,390,200,30);
        occupation.setFont(new Font("Arial",Font.BOLD,20));
        add(occupation);
        
        String valOccupation[]={"Salaried", "Self-Employed","Business","Student","Retired","other"};
         dropOccupation=new JComboBox(valOccupation);
        dropOccupation.setFont(new Font("Raleway",Font.BOLD,14));
        dropOccupation.setBackground(Color.white);
        dropOccupation.setBounds(300,390,400,30);
        add(dropOccupation);
        
        JLabel panno=new JLabel("PAN Number: ");
        panno.setBounds(100,440,200,30);
        panno.setFont(new Font("Arial",Font.BOLD,20));
        add(panno);
        
        panField=new JTextField();
        panField.setFont(new Font("Raleway",Font.BOLD,14));
        panField.setBounds(300,440,400,30);
        add(panField);
        
        JLabel aadhar=new JLabel("Aadhar Number: ");
        aadhar.setBounds(100,490,200,30);
        aadhar.setFont(new Font("Arial",Font.BOLD,20));
        add(aadhar);
        
        aadharField=new JTextField();
        aadharField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharField.setBounds(300,490,400,30);
        add(aadharField);
        
        JLabel seniorCitizen=new JLabel("Senior Citizen: ");
        seniorCitizen.setBounds(100,540,200,30);
        seniorCitizen.setFont(new Font("Arial",Font.BOLD,20));
        add(seniorCitizen);
        
         yes=new JRadioButton("YES");
        yes.setFont(new Font("Raleway",Font.BOLD,14));
        yes.setBounds(300,540,100,30);
        yes.setBackground(Color.white);
        add(yes);
         no=new JRadioButton("NO");
        no.setFont(new Font("Raleway",Font.BOLD,14));
        no.setBounds(450,540,100,30);
        no.setBackground(Color.white);
        add(no);
        
        ButtonGroup citizen=new ButtonGroup();
        citizen.add(yes);
        citizen.add(no);
        
        JLabel existing=new JLabel("Existing Account: ");
        existing.setBounds(100,590,200,30);
        existing.setFont(new Font("Arial",Font.BOLD,20));
        add(existing);
        
         eyes=new JRadioButton("YES");
        eyes.setFont(new Font("Raleway",Font.BOLD,14));
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
         eno=new JRadioButton("NO");
        eno.setFont(new Font("Raleway",Font.BOLD,14));
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup existingAcc=new ButtonGroup();
        existingAcc.add(eyes);
        existingAcc.add(eno);
        
        next=new JButton("NEXT");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(600,640,100,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setLayout(null);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
    public void actionPerformed(ActionEvent e){
        String religion=(String)dropreligion.getSelectedItem();
        String category=(String)dropCategory.getSelectedItem();
        String income=(String)dropIncome.getSelectedItem();
        String education=(String)dropEducation.getSelectedItem();
        String occupation=(String)dropOccupation.getSelectedItem();
        String pancard=panField.getText();
        String aadhar=aadharField.getText();
        String citizen="";
        if(yes.isSelected()){
            citizen="Yes";
        }
        else if(no.isSelected()){
            citizen="No";
        }
        String exist="";
        if(eyes.isSelected()){
            exist="Yes";
        }
        else if(eno.isSelected()){
            exist="No";
        }
        
        try{
            
            Conn c=new Conn();
            String query="insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pancard+"','"+aadhar+"','"+citizen+"','"+exist+"')";
            c.s.executeUpdate(query);
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        
        }
        catch(Exception ae){
            System.out.println(e);
        }
    }
    public static void main(String [] args){
        new SignupTwo("");
    }
    
}
