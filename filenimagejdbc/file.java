import java.sql.*;
class file{
public static void main(String args[]) throws SQLException{
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/file","root","akshay");
Statement st=conn.CreateStatement();
int n=st.executeUpdate("insert into file values("")");
ResultSet rs=st.executeQuery("select * from file");
System.out.println(rs,getBLob());
conn.close();
}
}
