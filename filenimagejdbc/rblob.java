import java.sql.*;
import java.io.*;
public class rblob {
	public static void main(String args[]) throws Exception{
	String url = "jdbc:mysql://localhost:3306/image";
	String username = "root";
    String	password = "akshay";
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection( url,username,password);
    Statement st  = conn.createStatement();
    ResultSet rs  = st.executeQuery("select * from image");
    rs.next();
    Blob b = rs.getBlob(1);
    byte b1[] = new byte[(int)b.length()];
    b1 = b.getBytes(1, (int) b.length());
    System.out.println("image size"+b.length());
    File x = new File("x.png");
    x.createNewFile();
    FileOutputStream d  =new FileOutputStream(x);
    d.write(b1);
	}
}
