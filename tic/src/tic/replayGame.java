package tic;

import com.sun.corba.se.spi.activation.Server;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class replayGame extends Pane {

    protected final ImageView no;
     static protected  Text myText;

    public replayGame() {

        no = new ImageView();
        myText = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        no.setFitHeight(410.0);
        no.setFitWidth(610.0);
        no.setLayoutX(-5.0);
        no.setLayoutY(-7.0);
        no.setImage(new Image(getClass().getResource("jwin.jpg").toExternalForm()));

        myText.setFill(javafx.scene.paint.Color.valueOf("#eeff00"));
        myText.setLayoutX(286.0);
        myText.setLayoutY(73.0);
        myText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        myText.setStrokeWidth(0.0);
        myText.setText("Jerry Win - X");
        myText.setWrappingWidth(288.13671875);
        myText.setFont(new Font("MV Boli", 37.0));

        getChildren().add(no);
        getChildren().add(myText);
        new re();
        
    }
}

////////////////
class rex extends Thread
{
Integer i=new Integer(0);
public rex() 
{
    start();
        }
public void run()
{
       while(true)
        {
            Integer j=game1v1_2.counteArr[i];
            replayGame.myText.setText(j.toString());
        i++;
         try{
        sleep(1800);
        }catch (Exception ex) {
             System.out.println(ex);                }
            
        }}
               
}
