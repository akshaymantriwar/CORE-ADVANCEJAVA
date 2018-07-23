import java.awt.*;
import java.applet.*;

public class demo extends Applet{
	String msg="";
	public void init(){
			
		setForeground(Color.red);
		
		
	
		
		msg+="inint";
		
	}
	
	public void start(Graphics g){
		
		
				g.drawString("start",10,20);

		msg+="start";
	}
	
	public void stop(){
		
		msg+= "stop";
	}
	public void destroy(){
		msg+="destroy";
	}
	
	
}