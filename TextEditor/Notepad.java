//notepad

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.event.*; 
public class Notepad extends JFrame  {
    private JTextArea area = new JTextArea(20,120);
    private JFileChooser dialog = new JFileChooser(System.getProperty("user.dir"));
    private String currentFile = "Untitled";
    private boolean changed = false;
    public Notepad() {
    	area.setFont(new Font("Monospaced",Font.PLAIN,12));
    	JScrollPane scroll = new JScrollPane(area,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    	add(scroll,BorderLayout.CENTER);
    	JMenuBar JMB = new JMenuBar();
    	setJMenuBar(JMB);
         String country[]={"Red","Green","Blue","Yellow","Orange"};        
   JList li=new JList(country);  
     
    	JMenu file = new JMenu("File");
    	JMenu edit = new JMenu("Edit");
        JMenu font = new JMenu("font");
        JMenu color = new JMenu("color");
        JCheckBox jc = new JCheckBox("Bold");
        JCheckBox jc2 = new JCheckBox("Italic");
    	JMB.add(file); JMB.add(edit);edit.add(font);edit.add(color);color.add(li);font.add(jc);
        font.add(jc2);
    	file.add(Open);file.addSeparator();
    	file.add(Save);file.addSeparator();
    	file.add(SaveAs);file.addSeparator();
    	file.add(Quit);
    	//edit.add(Cut);edit.addSeparator();edit.add(Copy);edit.addSeparator();edit.add(Paste);
    	JToolBar tool = new JToolBar();
    	add(tool,BorderLayout.NORTH);
    	tool.add(Open);tool.add(Save);
    	tool.addSeparator();
    	JButton cut = tool.add(Cut), cop = tool.add(Copy),pas = tool.add(Paste);
    	cut.setText(null); cut.setIcon(new ImageIcon("cut.jpg"));
    	cop.setText(null); cop.setIcon(new ImageIcon("copy.png"));
    	pas.setText(null); pas.setIcon(new ImageIcon("paste.png"));
    	Save.setEnabled(false);
    	SaveAs.setEnabled(false);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	pack();
    	area.addKeyListener(k1);
           li.addListSelectionListener(
                new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent e){
                        JList lis=(JList) e.getSource();
                        String s1 = (String)lis.getSelectedValue();
                           if(s1.equals("Red"))
                        {
            area.setBackground(Color.red);
                        }
                        else if(s1.equals("Green")){
             area.setBackground(Color.green);}


            
          else if(s1.equals("Blue"))
             {
area.setBackground(Color.blue); 
            }
             else if(s1.equals("Yellow"))
             {
 area.setBackground(Color.yellow);
             }
             else  
             {
 area.setBackground(Color.orange);
             }
                        }
                        
                       
                    
                         
                    
                });            
            
                 
            
    	setTitle(currentFile);
    	setVisible(true);
    }
    private KeyListener k1 = new KeyAdapter() {
	public void keyPressed(KeyEvent e) {
		changed = true;
		Save.setEnabled(true);
		SaveAs.setEnabled(true);
	}
    };
    Action Open = new AbstractAction("Open", new ImageIcon("rsz_open.png")) {
	public void actionPerformed(ActionEvent e) {
		saveOld();
		if(dialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
		    readInFile(dialog.getSelectedFile().getAbsolutePath());
		}
		SaveAs.setEnabled(true);
	}
    };
    Action Save = new AbstractAction("Save", new ImageIcon("rsz_save.png")) {
	public void actionPerformed(ActionEvent e) {
		if(!currentFile.equals("Untitled"))
		    saveFile(currentFile);
		else
		    saveFileAs();
	}
    };
    Action SaveAs = new AbstractAction("Save as...") {
	public void actionPerformed(ActionEvent e) {
		saveFileAs();
	}
    };
    Action Quit = new AbstractAction("Quit") {
	public void actionPerformed(ActionEvent e) {
		saveOld();
		System.exit(0);
	}
    };
    ActionMap m = area.getActionMap();
    Action Cut = m.get(DefaultEditorKit.cutAction);
    Action Copy = m.get(DefaultEditorKit.copyAction);
    Action Paste = m.get(DefaultEditorKit.pasteAction);
    private void saveFileAs() {
	if(dialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
	    saveFile(dialog.getSelectedFile().getAbsolutePath());
    }
    private void saveOld() {
	if(changed) {
	    if(JOptionPane.showConfirmDialog(this, "Would you like to save "+ currentFile +" ?","Save",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
		saveFile(currentFile);
	}
    }
    private void readInFile(String fileName) {
	try {
	    FileReader r = new FileReader(fileName);
	    area.read(r,null);
	    r.close();
	    currentFile = fileName;
	    setTitle(currentFile);
	    changed = false;
	}
	catch(IOException e) {
	    Toolkit.getDefaultToolkit().beep();
	    JOptionPane.showMessageDialog(this,"Editor can't find the file called "+fileName);
	}
    }
    private void saveFile(String fileName) {
	try {
	    FileWriter w = new FileWriter(fileName);
	    area.write(w);
	    w.close();
	    currentFile = fileName;
	    setTitle(currentFile);
	    changed = false;
	    Save.setEnabled(false);
	}
	catch(IOException e) {
	}
    }
    public static void main(String[] args) {
        new Notepad();
    }
}
    
