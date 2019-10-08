import java.net.*;  
import java.io.*;  
class MyClient{  
public static void main(String args[])throws Exception{  
Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2=""; 
//System.out.println("slecet the request ask or reserve and enter stop to exit."); 
while(!str.equals("stop")){ 
System.out.println("\nslecet the request ask,reserve or enter stop to exit.");  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println(str2);  
}  
  
dout.close();  
s.close();  
}}  