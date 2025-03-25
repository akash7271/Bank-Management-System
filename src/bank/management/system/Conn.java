
package bank.management.system;
import java.sql.*;
//Register the Driver
//Create Connection
//Create statement
//Execute Query
//Close Connection

public class Conn {
    Connection c;
    Statement s;
    
    public Conn(){
    try{
//        Class.forName(com.mysql.cj.jdbc.Driver);
        c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Akash");
        s=c.createStatement();
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    
    
    
    public static void main(String [] args){
        
    }
    
}
