import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;
    public class TextEditor implements ActionListener{  
    JFrame f;  
    JMenuBar mb;  
    JMenu file,color,help;  
    JMenuItem red,yellow,pink,green;  
    JTextArea ta;  
          
   public TextEditor(){  
    f=new JFrame();  
      
    green=new JMenuItem("green");  
    red=new JMenuItem("red");  
    yellow=new JMenuItem("yellow");  
    pink=new JMenuItem("pink");  
       
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
      
    public void actionPerformed(ActionEvent e) {  
    if(e.getSource()==green)  
    ta.setBackground(Color.green); 
    if(e.getSource()==red)  
    ta.setBackground(Color.red); 
    if(e.getSource()==yellow)  
    ta.setBackground(Color.yellow);  
    if(e.getSource()==pink)  
    ta.setBackground(Color.pink);  
    
    }  
      
    public static void main(String[] args) {  
        TextEditor txt=new TextEditor(); 
         
        
    }  
    }  
