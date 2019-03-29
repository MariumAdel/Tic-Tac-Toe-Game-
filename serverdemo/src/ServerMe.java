
import com.sun.corba.se.spi.activation.Server;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed
 */
public class ServerMe {

ServerSocket serverSocket;

    public ServerMe ()
{
    
        try{
       serverSocket= new ServerSocket(5005);
       while(true)
       {
       Socket s = serverSocket.accept();
       new gameHandler(s);
       }
       }catch (IOException ex) {
                   Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
               }
 
}
public static void main(String[] args)
{
new ServerMe();
}
}
class gameHandler extends Thread
{
DataInputStream dis;
PrintStream ps;
Socket soc;
String name;
boolean activeFlag=true;
int clientCounter=0;
 static ArrayList<gameHandler> clientsVector = new ArrayList<gameHandler>(20);
 static ArrayList<gameHandler> clientsVectorShadow = new ArrayList<gameHandler>(20);
//static ArrayList<String> clientsName = new ArrayList<String>(10);
//static Vector<gameHandler> clientsVector= new Vector<gameHandler>();
public gameHandler(Socket cs) 
{
    this.soc=cs;
        try{
    dis = new DataInputStream(soc.getInputStream());
    ps= new PrintStream(soc.getOutputStream());
    name= new String();
     clientsVector.add(this);
     clientsVectorShadow.add(this);
     
     //System.out.println(name);
   
//    clientCounter++;
    start();
    }catch (IOException ex) {
                         System.out.println(ex);}}
public void run()
{
       while(true)
        {
        try{
            //check for opening
                     
                    ///////////////////////
        String str= dis.readLine();
        String [] skr = str.split("\\.");
                
        if(skr[0].equals("0"))
        {
          
            this.name =  skr[1];
           System.out.println(this.name);
           System.out.println(clientsVector.size());
           for(int i=0;i<clientsVector.size();i++){
                      System.out.println(i);
                      System.out.println(clientsVector.get(i).name);
                     }
        
        displayOnlineNames();
        }
        else if(skr[0].equals("3"))
        {
            for(int i=0;i<clientsVector.size();i++){
                         if(clientsVector.get(i).name.equals(skr[1])){
                    clientsVector.remove(i);
//                    clientsVector.get(i).stop();
//                    break;
                         }
                     }  
            
                displayOnlineNames();  
                   
            }
        else if(skr[0].equals("4"))//client sent me invitation
        {
            for(int i=0;i<clientsVector.size();i++){
                         if(clientsVector.get(i).name.equals(skr[1])){
                    System.out.println(skr[1]);
                         clientsVector.get(i).ps.println("5."+skr[2]);
                         }
                     }          
                
            }
        else if(skr[0].equals("6"))//client accept invitation
        {
            for(int i=0;i<clientsVector.size();i++){
                         if(clientsVector.get(i).name.equals(skr[1])){
                    System.out.println(skr[1]);
                         clientsVector.get(i).ps.println("8."+skr[2]);
                         }
                     }  
             for(int i=0;i<clientsVector.size();i++){
                         if(clientsVector.get(i).name.equals(skr[1])){
                    clientsVector.remove(i);
//                    clientsVector.get(i).stop();
                    ////
                    
                         }}
             
             
             for(int i=0;i<clientsVector.size();i++){
                         if(clientsVector.get(i).name.equals(skr[2])){
                    clientsVector.remove(i);
//                    clientsVector.get(i).stop();
            
                         }
                     }
             
            
                displayOnlineNames(); 
                
            }
        else if(skr[0].equals("7"))// client refused invitation
        {
            for(int i=0;i<clientsVector.size();i++){
                         if(clientsVector.get(i).name.equals(skr[1])){
                    System.out.println(skr[1]);
                         clientsVector.get(i).ps.println("9."+skr[2]);
                         }
                     }          
                
            }
        else if(skr[0].equals("10"))// client refused invitation
        {
            System.out.println(str);
            for(int i=0;i<clientsVectorShadow.size();i++){
                         if(clientsVectorShadow.get(i).name.equals(skr[1])){
                    System.out.println(skr[1]);
                         clientsVectorShadow.get(i).ps.println("11."+skr[2]+"."+skr[3]);
                         }
                     }          
                
            }
        
        
       
//      displayOnlineNames(str);
        }catch (IOException ex) {
                    System.out.println("k");
                }
        }}
                void displayOnlineNames()
                {
//                    this.ps.println(msg+  "\n");
                    
//                    clientsVector.get(0).ps.println(msg+  "\n");
//                    int j=clientsVector.size();
                    for(gameHandler ch: clientsVector)
                    {
                     for(int i=0;i<clientsVector.size();i++){
                         
                     ch.ps.println("1"+"."+clientsVector.get(i).name);
                         
                     }
                    
                    }
                      for(gameHandler ch: clientsVector)
                    {
                     
                     ch.ps.println("2.");
                     
                    
                    }  
                      
                    //////////
                   /* try{
       System.out.println(clientsVector.get(0).name);
        }catch (Exception ex) {
                  System.out.println(ex);
                }*/
                    
                  
                    
                }
}
