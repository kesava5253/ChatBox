    import java.net.*;  
    import java.io.*;  
    class MyClient{  
    public static void main(String args[])throws Exception{  
    Socket s=new Socket("192.168.0.106",4444);  
 Socket s1=new Socket("192.168.0.111",4444);  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
DataInputStream din1=new DataInputStream(s1.getInputStream());  
    DataOutputStream dout1=new DataOutputStream(s1.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      
    String str="",str2="",str3="",str4="";  
    while(!str.equals("stop")){  
    str=br.readLine();  
    dout.writeUTF(str);  
    dout.flush();  
    str2=din.readUTF();  
    System.out.println("Server says: "+str2);  
  str3=br.readLine();  
    dout1.writeUTF(str3);  
    dout1.flush();  
    str4=din1.readUTF();  
    System.out.println("Server says: "+str4);  
    }  
      
    dout.close(); 
dout1.close(); 
    s.close();  
    }}  
