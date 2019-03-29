/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic;

import com.sun.corba.se.spi.activation.Server;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed
 */
public class server {
    

ServerSocket serverSocket;
    public server ()
{
    
        try{
       serverSocket= new ServerSocket(5005);
       while(true){
       Socket s = serverSocket.accept();
       new ChatHandler(s);
       }
       }catch (IOException ex) {
System.out.println(ex);               }
 
}
}
class ChatHandler extends Thread
{
static String str;
int i=0;
        DataInputStream dis;
PrintStream ps;

public ChatHandler(Socket cs) 
{
        try{
    dis = new DataInputStream(cs.getInputStream());
    ps= new PrintStream(cs.getOutputStream());
    start();
    }catch (IOException ex) {
                      System.out.println(ex);}}
public void run()
{
             
        try{
            while (true) {
                i++;
         str= i+dis.readLine();
        //this.sleep(500);
            }
        }catch (Exception ex) {
System.out.println(ex);
        }
    }
        
        
        
               
}

    

