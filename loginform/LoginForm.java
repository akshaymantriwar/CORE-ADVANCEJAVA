import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;

    public class LoginForm extends JFrame implements ActionListener {  
    
    JTextField user;
    JButton btn ; 
    JPasswordField pass; 
        
   public LoginForm(){ 
           setVisible(true);

        setSize(800, 800);

        setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE); 
     setTitle("Login Form "); 
      user=new JTextField("USERNAME");
      pass=new JPasswordField("PASSWORD");
       btn = new JButton("LogIn");
      add(user);
      add(pass);
      add(btn);
      user.setBounds(300, 70, 200, 30);
      pass.setBounds(300, 110, 200, 30);
      btn.setBounds(300, 160, 100, 30);

     btn.addActionListener(this);
    }  
    public void actionPerformed(ActionEvent e)

    {
 
        login();

    }
public void login(){
             JFrame f;  
    JMenuBar mb;  
    JMenu file,color,help;  
    JMenuItem red,yellow,pink,green;  
    JTextArea ta;  
          
    String str1 = user.getText();

        char[] p = pass.getPassword();

        String str2 = new String(p);
    f=new JFrame();  
      
    green=new JMenuItem("green");  
    red=new JMenuItem("red");  
    yellow=new JMenuItem("yellow");  
    pink=new JMenuItem("pink");

  try{
           Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "akshay");

            PreparedStatement ps = con.prepareStatement("select user from login where user=? and pass=?");

            ps.setString(1, str1);

            ps.setString(2, str2);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
{
    
       
    green.addActionListener(this);  
    red.addActionListener(this);  
    yellow.addActionListener(this);  
    pink.addActionListener(this);  

      
    mb=new JMenuBar();  
    mb.setBounds(5,5,400,40);  
      
    file=new JMenu("File");  
    color=new JMenu("Edit");  
      
    color.add(green);color.add(red);color.add(yellow);color.add(pink);  
    
      
    mb.add(file);mb.add(color);
      
    ta=new JTextArea();  
    ta.setBounds(5,30,460,460);  
      
    f.add(mb);f.add(ta);  
      
    f.setLayout(null);  
    f.setSize(500,500);  
    f.setVisible(true);  

    

}
else{
JOptionPane.showMessageDialog(null,

                   "Incorrect email-Id or password..Try Again with correct detail");
}
}
catch (Exception ex)

        {

            System.out.println(ex);}

}
      
    public static void main(String[] args) {  
        new  LoginForm();
         
        
    }  
    } 
