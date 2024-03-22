package Java;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package javaapplication2;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;

public class JavaApplication2 {
public static void main(String[] args) {
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/ke001";
String user="root";
String pwd="";
Connection con=DriverManager.getConnection(url, user, pwd);

String q="insert into book values(?,?)";
PreparedStatement pstmt=con.prepareStatement(q);
pstmt.setInt(1,101);
pstmt.setString(2,"Adv Java");
pstmt.executeUpdate();

con.close();

}catch(Exception e)
{
e.printStackTrace();
}
}
}