import java.io.*;
import java.net.*;
class Server{
public static void main(String args[])throws IOException,UnknownHostException{
ServerSocket s=new ServerSocket(1235);
Socket client=s.accept();
InputStream is=client.getInputStream();
OutputStream os=client.getOutputStream();
PrintStream ps=new PrintStream(os);


BufferedReader br1=new BufferedReader(new InputStreamReader(is));
String send;
String receive;
while(true){

receive=br1.readLine();
ps.println(receive.toUpperCase());
}
}
}
