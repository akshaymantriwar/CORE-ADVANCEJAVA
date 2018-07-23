import java.io.*;
import java.sql.*;
public class sss {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, FileNotFoundException{
	String url = "jdbc:mysql://localhost:3306/file";
	String username = "root";
    String password = "akshay";
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection(url,username,password);
	PreparedStatement Statment1 = conn.prepareStatement("insert into file values(?,?)");
	File f = new File("sss.java");
	FileInputStream st = new FileInputStream(f);
	
	Statment1.setBinaryStream(1,st,(int)f.length());
	Statment1.setInt(2, 10);
	System.out.println("Length of file"+" "+f.length());
	System.out.println("No of rows are affected"+" "+Statment1.executeUpdate());
	}
}
