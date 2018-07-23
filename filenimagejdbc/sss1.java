import java.io.*;
import java.sql.*;
public class sss1 {
	public static void main(String args[]) throws Exception{
		String url = "jdbc:mysql://localhost:3306/file";
		String username = "root";
	        String password = "akshay";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url,username,password);
	    Statement st  = conn.createStatement();
	    ResultSet rs  = st.executeQuery("select * from file");
	    rs.next();
	    Clob b=rs.getClob(1);
	    System.out.println("File size="+b.length());
	   Reader b11 = b.getCharacterStream();
	       int ch;
	   File f = new File("new.txt");
	   FileWriter fw = new FileWriter(f);
	   f.createNewFile();
	   while((ch=b11.read())!=-1){
		   fw.write((char)ch);
		  
		   
	   }
	   conn.close();
	   fw.close();
	}
}
