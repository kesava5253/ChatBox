import java.io.*;  
import java.net.*;  
public class client {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("192.168.0.108",4444);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("hi bud its tym to party");  
dout.writeUTF("this is for git");  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  
