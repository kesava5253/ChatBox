    import java.net.*;  
    import java.io.*;  
    class Server
    {  
    public static void main(String args[])throws Exception{  
    ServerSocket ss=new ServerSocket(3333);  
    Socket s=ss.accept();  
    DataInputStream din=new DataInputStream(s.getInputStream());  
    DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
    String str="",str2="";
    while(!str.equals("stop")){  
    str=din.readUTF();  
    System.out.println("client says: "+str);  
    str2=br.readLine();  
    dout.writeUTF(str2);  
    dout.flush();  
    }  
    din.close();  
<<<<<<< HEAD
    s.close();  
    ss.close();  
    }
}  
=======
    s.close();  //closing socket
    ss.close();//closing serversocket  
    }}  
>>>>>>> 3ba3026183ee827e1115af894a67a6a60bd941d4
