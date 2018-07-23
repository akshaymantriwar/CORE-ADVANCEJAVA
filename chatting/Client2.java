import java.io.*;
import java.net.*;
class Client2{
public static void main(String args[])throws IOException,UnknownHostException{
Socket s=new Socket("127.0.0.1",1234);
InputStream is=s.getInputStream();
OutputStream os=s.getOutputStream();
PrintStream ps=new PrintStream(os);
BufferedReader br1=new BufferedReader(new InputStreamReader(is));
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String receive;
String send;
while(true){

receive=br1.readLine();
System.out.println(receive);
send=br.readLine();
ps.println(send);

}
}
}
