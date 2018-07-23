import java.io.*;
import java.net.*;
class Client1{
public static void main(String args[])throws IOException,UnknownHostException{
ServerSocket s=new ServerSocket(1234);
Socket client=s.accept();
InputStream is=client.getInputStream();
OutputStream os=client.getOutputStream();
PrintStream ps=new PrintStream(os);

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
BufferedReader br1=new BufferedReader(new InputStreamReader(is));
String send;
String receive;
while(true){
send=br.readLine();
ps.println(send);
receive=br1.readLine();
System.out.println(receive);

}
}
}
