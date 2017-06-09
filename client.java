import java.io.*;  
import java.net.*;  
public class client 
{  
public static void main(String[] args) {  
try{      
Socket s=new Socket("192.168.0.108",4444);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
<<<<<<< HEAD
dout.writeUTF("hi bud its tym to party");  
dout.writeUTF("this is for git");  
=======
dout.writeUTF("hi bud its tym to party");//text to server  
>>>>>>> 9c55a98538c5f73bfdc17c7f1461c1978551fab3
dout.flush();  
dout.close();  
s.close();  
}
catch(Exception e){System.out.println(e);}  
}  
} //closed main socket 
