//code by AKSHAYKUMAR PRAKASH MANTRIWAR TYCSE ADIV A51
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Student implements ActionListener{
     
JFrame f;
JMenuBar mb;
JMenu student,help;
JMenuItem nw,search,abt,hlp;
Student(){

f=new JFrame("STUDENT REGISTRATION SYSTEM");
  
mb=new JMenuBar();
mb.setBounds(5,5,400,40);
f.setJMenuBar(mb);
 
student =new JMenu("Student");
help=new JMenu("Help");
mb.add(student);
mb.add(help);

nw=new JMenuItem("New Student");
search=new JMenuItem("Search");
abt=new JMenuItem("About us");
hlp=new JMenuItem("Help");

student.add(nw);
student.add(search);
help.add(abt);
help.add(hlp);
nw.addActionListener(this); 
search.addActionListener(this);
abt.addActionListener(this);
hlp.addActionListener(this);
f.setVisible(true);
f.setSize(500,500);
f.setLayout(null);
f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
}
public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==nw)
new NewStudent();
if(ae.getSource()==search)
new Search();
if(ae.getSource()==abt)
new About();
if(ae.getSource()==hlp)
new Help();
}
   public static void main(String args[]){
    new Student();
    }
}

//New STUDENT
class NewStudent{
 JFrame f;
 JLabel l1,l2,l3,l4,l5,l6,head;
 JComboBox branch,year;
 JTextField t1,t2,t3,t4,t5;
 JTextArea ta;
 JButton btn1,btn2;
JRadioButton r1,r2;
ButtonGroup bg;

NewStudent(){
f=new JFrame("New Student");
head=new JLabel("NEW REGISTRATION");
l1=new JLabel("RegNo");
l2=new JLabel("FullName");
l3=new JLabel("Branch");
l4=new JLabel("Gender");
l5=new JLabel("Year");
l6=new JLabel("Address");
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(head);
head.setBounds(80,-25,300,100);
l1.setBounds(0,10,100,100);
l2.setBounds(0,40,100,100);
l3.setBounds(0,70,100,100);
l4.setBounds(0,100,100,100);
l5.setBounds(0,130,100,100);
l6.setBounds(0,160,100,100);

t1=new JTextField();
f.add(t1);
t2=new JTextField();
f.add(t2);
ta=new JTextArea();
f.add(ta);

String br[]={"cse","IT","MECH","CHEM","PROD","CIVIL","TEXT","INSTRU","ELEC","EXTC"};
branch=new JComboBox(br);
f.add(branch);
String br1[]={"FY","SY","TY","BTECH"};
year=new JComboBox(br1);
f.add(year);

t1.setBounds(150,50,200,25);
t2.setBounds(150,80,200,25);
branch.setBounds(150,110,200,25);
year.setBounds(150,170,200,25);
ta.setBounds(150,210,300,100);




JRadioButton r1=new JRadioButton("Male");    
JRadioButton r2=new JRadioButton("Female");    
r1.setBounds(150,140,100,25);    
r2.setBounds(300,140,100,25);    
bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);    
f.add(r1);f.add(r2);      

btn1=new JButton("Submit");
btn2=new JButton("Reset");
f.add(btn1);f.add(btn2);
btn1.setBounds(150,330,100,30);
btn2.setBounds(300,330,100,30);
btn1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            insert(); 
        }  
    });  



f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
f.setVisible(true);
f.setSize(1000,1000);
f.setLayout(null);
  }

//for update
NewStudent(String s1,String s2,String s3,String s4,String s5,String s6){
System.out.println("update new  entry");
f=new JFrame("UPDATE");
head=new JLabel("UPDATE");
l1=new JLabel("RegNo");
l2=new JLabel("FullName");
l3=new JLabel("Branch");
l4=new JLabel("Gender");
l5=new JLabel("Year");
l6=new JLabel("Address");
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(head);
head.setBounds(80,-25,300,100);
l1.setBounds(0,10,100,100);
l2.setBounds(0,40,100,100);
l3.setBounds(0,70,100,100);
l4.setBounds(0,100,100,100);
l5.setBounds(0,130,100,100);
l6.setBounds(0,160,100,100);

t1=new JTextField();
f.add(t1);
t2=new JTextField();
f.add(t2);
ta=new JTextArea();
f.add(ta);

String br[]={"cse","IT","MECH","CHEM","PROD","CIVIL","TEXT","INSTRU","ELEC","EXTC"};
branch=new JComboBox(br);
f.add(branch);
String br1[]={"FY","SY","TY","BTECH"};
year=new JComboBox(br1);
f.add(year);

t1.setBounds(150,50,200,25);
t2.setBounds(150,80,200,25);
branch.setBounds(150,110,200,25);
year.setBounds(150,170,200,25);
ta.setBounds(150,210,300,100);




 r1=new JRadioButton("Male");    
 r2=new JRadioButton("Female");    
r1.setBounds(150,140,100,25);    
r2.setBounds(300,140,100,25);    
bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);    
f.add(r1);f.add(r2);      

t1.setText(s1);t2.setText(s2);branch.setSelectedItem(s3);year.setSelectedItem(s5);ta.setText(s6);


btn1=new JButton("Submit");
btn2=new JButton("Reset");
f.add(btn1);f.add(btn2);
btn1.setBounds(150,330,100,30);
btn2.setBounds(300,330,100,30);
btn1.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            updat(); 
        }  
    });  



f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
f.setVisible(true);
f.setSize(1000,1000);
f.setLayout(null);
  }

//update completed
void updat(){
  String g;
  if(r1.isSelected()){g="Male";}else{g="Female";}
try{
System.out.println("update entry");
String nm=t2.getText();
String rg=t1.getText();
System.out.println("update entry"+nm+rg);
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT", "root", "akshay");
PreparedStatement ps = con.prepareStatement("update student set regno=?, name=?, branch=?,gender=?, year=?, address=? where name=? or regno=?");

ps.setString(1,t1.getText());
ps.setString(2,t2.getText());
ps.setString(3,branch.getSelectedItem().toString());
ps.setString(4,g);
ps.setString(5,year.getSelectedItem().toString());
ps.setString(6,ta.getText());
ps.setString(8,t1.getText());
ps.setString(7,t2.getText());
System.out.println("update entry"+t1.getText());

int n=ps.executeUpdate();
System.out.println("update entry"+t1.getText()+n);
if(n==2){
JOptionPane.showMessageDialog(null,

                   "updated");
}
}catch(Exception e){System.err.println(e);}
}

//update method completed



void insert(){
  String g;
  if(r1.isSelected()){g="Male";}else{g="Female";}
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT", "root", "akshay");
PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?)");

ps.setString(1,t1.getText());
ps.setString(2,t2.getText());
ps.setString(3,branch.getSelectedItem().toString());
ps.setString(4,g);
ps.setString(5,year.getSelectedItem().toString());
ps.setString(6,ta.getText());
int n1=ps.executeUpdate();

if(n1==1){
JOptionPane.showMessageDialog(null,

                   "registered");
}
}catch(Exception e){}
}

}
//NEW STUDENT COMPLETED

//SEARCH
class Search  {
 JButton b;
public JTextField txt;
Search(){
  JFrame f=new JFrame("search");  
   b=new JButton("search");  
    b.setBounds(0,100,100,25);  
    f.add(b);  
    b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
            new Table(txt.getText());  
        }  
    });  
JRadioButton r1=new JRadioButton("REGNO");    
JRadioButton r2=new JRadioButton("NAME");       
r1.setBounds(10,10,100,20);    
r2.setBounds(10,40,100,20);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);
bg.add(r2);    
f.add(r1);
f.add(r2);

txt=new JTextField();
f.add(txt);
txt.setBounds(0,70,200,25);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
}

}
//SEARCH COMPLETED

// RESULT
class Table{
JFrame f;

int c=0;
JLabel l;
Table(String txt) {
f=new JFrame("SEARCH RESULT");
l=new JLabel("RESULT");

try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT", "root", "akshay");
PreparedStatement ps = con.prepareStatement("select * from student where regno=? or name=?");

ps.setString(1,txt);
ps.setString(2,txt);

ResultSet rs=ps.executeQuery();
 
while(rs.next()){
c++;
System.out.println("entered into rs");
String u1=rs.getString(1),u2=rs.getString(2),u3=rs.getString(3),u4=rs.getString(4),u5=rs.getString(5),u6=rs.getString(6);
String  data[][]= {{ u1,u2,u3,u4,u5,u6}};
String column[]={"RegNo","NAME","Branch","Gender","Year","Address"};

 
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,100,100);          
    JScrollPane sp=new JScrollPane(jt);    
    JButton b=new JButton("Update");
    b.setBounds(150,150,100,25);          
    f.add(b);
    b.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent ae){
try{
   System.out.println("calling new update");
    new NewStudent(u1,u2,u3,u4,u5,u6);}
catch(Exception e){}
 }
});


f.add(sp);    


    f.setSize(800,800);    
    f.setVisible(true);    
}
if(c==0){
JOptionPane.showMessageDialog(null,

                   "Enter valid RegNo or Name");
}
}
catch(Exception e){

}
} 
}
//RESULT COMPLETED

//UPDATE
//UPDATE COMPLETED
//ABOUT US
class About{
JFrame f;
About(){
f=new JFrame("ABOUT US");
   Container cp = f.getContentPane();  
 JTextPane pane = new JTextPane(); 
  pane.setText("Welcome"); 
cp.add(pane);
pane.setBounds(0,0,100,25);
f.setVisible(true);
f.setSize(800,800);
f.setLayout(null) ;
}
}
//ABOUT US COMPLETED

//HELP 
class Help{
JFrame f;
Help(){
f=new JFrame("Help");
   Container cp = f.getContentPane();  
 JTextPane pane = new JTextPane(); 
  pane.setText("Welcome"); 
cp.add(pane);
pane.setBounds(0,0,100,25);
 f.setVisible(true);
f.setSize(800,800);
f.setLayout(null) ;
}
}
//HELP COMPLETED
 
//code by AKSHAYKUMAR PRAKASH MANTRIWAR TYCSE ADIV A51
