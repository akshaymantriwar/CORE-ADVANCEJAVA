import java.awt.*;
import java.applet.*;
public class MickyMouse extends Applet{
public void paint(Graphics g){
g.setColor(Color.black);
setBackground(Color.green);  
g.fillOval(400,80,80,80);  
g.fillOval(360,70,50,50);
g.fillOval(470,70,50,50);
 

int x[]={420,470,510,500,490,470,470,410,410,390,370,420};
int y[]={160,160,220,230,220,190,220,220,210,210,190,160};

 
int n=12;
g.fillPolygon(x,y,n);

int x1[]={450,465,480,465,450};
int y1[]={220,270,270,220,220};
int n1=4;
g.fillPolygon(x1,y1,n1);

int x2[]={415,430,445,430,415};
int y2[]={220,270,270,220,220};
int n2=4;
g.fillPolygon(x2,y2,n2);

g.setColor(Color.yellow);
g.fillOval(375,268,100,50);
g.setColor(Color.black);
g.drawOval(375,268,100,50);

g.setColor(Color.yellow);
g.fillOval(410,268,100,50);
g.setColor(Color.black);
g.drawOval(410,268,100,50);




 g.setColor(Color.pink);
g.fillOval(421,100,40,35);
g.fillArc(400,80,80,80,180,180);

 g.setColor(Color.black);
int x3[]={431,451,441,431};
int y3[]={100,100,110,100};
int n3=4;
g.fillPolygon(x3,y3,n3);


g.setColor(Color.white);
g.fillArc(425,105,18,40,0,180);
g.fillArc(445,105,18,40,0,180);
g.setColor(Color.black);
g.fillRoundRect(435,125,20,10,50,50);
g.fillOval(430,110,10,15);
g.fillOval(450,110,10,15);
g.drawArc(420,130,50,20,190,170);
g.drawArc(417,137,15,20,95,85);
g.drawArc(457,137,15,20,85,-85);
g.fillArc(435,140,30,20,180,200);
g.setColor(Color.red);
g.fillArc(443,155,15,10,10,165);








g.setColor(Color.white);
g.fillOval(390,190,50,40);
g.setColor(Color.red);
g.fillArc(348,170,133,60,0,90);
g.fillArc(408,160,40,80,135,135);
g.fillRect(428,200,52,39);
g.setColor(Color.white);
g.fillOval(470,200,50,40);
g.fillOval(420,180,20,20);
g.fillOval(440,180,20,20);
g.setColor(Color.black);
g.drawArc(440,198,20,40,180,88);












}
}
