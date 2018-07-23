import java.sql.*;
import java.io.*;
public class blob {
public static void main(String args[])throws Exception{
	String url = "jdbc:mysql://localhost:3306/image";
	String username = "root";
    String	password = "akshay";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection(url,username,password);
	PreparedStatement Statment1 = conn.prepareStatement("insert into image(photo,no) values(?,?)");
	File f = new File("car-animated-rv0yeb-clipart.png");
	FileInputStream st = new FileInputStream(f);
	
	Statment1.setBinaryStream(1,st,(int)f.length());
	Statment1.setInt(2, 11);
	Statment1.executeUpdate();

}
}
