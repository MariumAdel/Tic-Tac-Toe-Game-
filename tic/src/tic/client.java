/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ahmed
 */
public class client {
    
    Socket mySocket;
        DataInputStream dis ;
         static PrintStream ps;
         public client() {
       
                try
        {
        mySocket= new Socket("127.0.0.1", 5005);
        dis = new DataInputStream(mySocket.getInputStream());
        ps= new PrintStream(mySocket.getOutputStream());
        }
        catch(IOException ex)
        {
System.out.println(ex);        }
    
                
                
                
}}
