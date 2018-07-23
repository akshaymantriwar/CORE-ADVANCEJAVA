import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


public class ComboBox {

   ComboBox(){
      
     JLabel lab ;
      lab = new JLabel(new ImageIcon("photos"));
     
       JFrame jf = new JFrame();
     jf.setLayout(new FlowLayout());
     jf.setSize(200,200);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jf.setVisible(true);
     
     String[] photos={"a","b","c","d"};
     JComboBox<String> jcb=new JComboBox<String>(photos);
     jf.add(jcb);
     jf.add(lab);   

     jcb.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent ae){
         String s;
         s =jcb.getSelectedItem().toString(); 
         lab.setIcon(new ImageIcon(s+".jpg"));
       }
     });
   }
    public static void main(String[] args) {
        try
        {
            SwingUtilities.invokeAndWait(new Runnable(){
          public void run(){
           new ComboBox();
          }
        });
    }catch(Exception e){System.err.println(e);};
    } 
}
