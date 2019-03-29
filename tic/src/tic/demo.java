package tic;

import com.sun.corba.se.spi.activation.Server;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class demo extends Pane {

    protected final ImageView imageView;
    protected final ImageView okBtn;
    protected final TextField t1;
    protected final TextField t2;
    protected final Text ttt;
    
  
    public demo() {

        imageView = new ImageView();
        okBtn = new ImageView();
        t1 = new TextField();
        t2 = new TextField();
        ttt = new Text();
        

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        imageView.setFitHeight(406.0);
        imageView.setFitWidth(607.0);
        imageView.setLayoutX(-1.0);
        imageView.setLayoutY(-1.0);
        imageView.setImage(new Image(getClass().getResource("55.jpg").toExternalForm()));

        okBtn.setFitHeight(105.0);
        okBtn.setFitWidth(105.0);
        okBtn.setLayoutX(303.0);
        okBtn.setLayoutY(89.0);
        okBtn.setPreserveRatio(true);
        okBtn.setImage(new Image(getClass().getResource("replay.jpg").toExternalForm()));

        t1.setLayoutX(424.0);
        t1.setLayoutY(89.0);

        t2.setLayoutX(424.0);
        t2.setLayoutY(127.0);

        ttt.setLayoutX(452.0);
        ttt.setLayoutY(183.0);
        ttt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ttt.setStrokeWidth(0.0);
        ttt.setText("cdc");

        getChildren().add(imageView);
        getChildren().add(okBtn);
        getChildren().add(t1);
        getChildren().add(t2);
        getChildren().add(ttt);
        // ttt.setVisible(false);
        
        new server(); 
        okBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
             // ttt.setVisible(true);
             ttt.setText(ChatHandler.str); 
               
                
            }
        }); 
        /////////////////////////
         
         ///////////////////////
        
         ////////////////

    }
    
}
