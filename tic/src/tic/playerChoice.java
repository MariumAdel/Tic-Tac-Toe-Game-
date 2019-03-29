package tic;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import static tic.loginNetwork.playerName;

public class playerChoice extends Pane {

    protected final ImageView imageView;
    protected final ImageView back;
    protected final ImageView player1;
    protected final Text t1;
    protected final ImageView player2;
    protected final Text t2;
    protected final ImageView player3;
    protected final Text t3;
    protected final ImageView player4;
    protected final Text t4;
    protected final ImageView player5;
    protected final Text t5;
    protected final ImageView player6;
    protected final Text t6;
     Socket mySocket;
        DataInputStream dis ;
        PrintStream ps;
        boolean ack=false;
        String str1;
        int playerCounter=0;
static ArrayList<ImageView> playerVector = new ArrayList<ImageView>(10);
static ArrayList<Text> textVector = new ArrayList<Text>(10);
    public playerChoice() {
       

        imageView = new ImageView();
        back = new ImageView();
        player1 = new ImageView();
        t1 = new Text();
        player2 = new ImageView();
        t2 = new Text();
        player3 = new ImageView();
        t3 = new Text();
        player4 = new ImageView();
        t4 = new Text();
        player5 = new ImageView();
        t5 = new Text();
        player6 = new ImageView();
        t6 = new Text();
        str1=new String();
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

        back.setFitHeight(105.0);
        back.setFitWidth(105.0);
        back.setLayoutX(41.0);
        back.setLayoutY(315.0);
        back.setPreserveRatio(true);
        back.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        player1.setFitHeight(31.0);
        player1.setFitWidth(84.0);
        player1.setLayoutX(357.0);
        player1.setLayoutY(35.0);
        player1.setPreserveRatio(true);
        player1.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t1.setLayoutX(435.0);
        t1.setLayoutY(56.0);
        t1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t1.setStrokeWidth(0.0);
        t1.setText("Text");
        t1.setWrappingWidth(141.6708984375);
        t1.setFont(new Font(15.0));

        player2.setFitHeight(31.0);
        player2.setFitWidth(84.0);
        player2.setLayoutX(357.0);
        player2.setLayoutY(83.0);
        player2.setPreserveRatio(true);
        player2.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t2.setLayoutX(435.0);
        t2.setLayoutY(104.0);
        t2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t2.setStrokeWidth(0.0);
        t2.setText("Text");
        t2.setWrappingWidth(141.6708984375);
        t2.setFont(new Font(15.0));

        player3.setFitHeight(31.0);
        player3.setFitWidth(84.0);
        player3.setLayoutX(357.0);
        player3.setLayoutY(126.0);
        player3.setPreserveRatio(true);
        player3.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t3.setLayoutX(435.0);
        t3.setLayoutY(147.0);
        t3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t3.setStrokeWidth(0.0);
        t3.setText("Text");
        t3.setWrappingWidth(141.6708984375);
        t3.setFont(new Font(15.0));

        player4.setFitHeight(31.0);
        player4.setFitWidth(84.0);
        player4.setLayoutX(357.0);
        player4.setLayoutY(171.0);
        player4.setPreserveRatio(true);
        player4.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t4.setLayoutX(435.0);
        t4.setLayoutY(192.0);
        t4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t4.setStrokeWidth(0.0);
        t4.setText("Text");
        t4.setWrappingWidth(141.6708984375);
        t4.setFont(new Font(15.0));

        player5.setFitHeight(31.0);
        player5.setFitWidth(84.0);
        player5.setLayoutX(357.0);
        player5.setLayoutY(216.0);
        player5.setPreserveRatio(true);
        player5.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t5.setLayoutX(435.0);
        t5.setLayoutY(237.0);
        t5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t5.setStrokeWidth(0.0);
        t5.setText("Text");
        t5.setWrappingWidth(141.6708984375);
        t5.setFont(new Font(15.0));

        player6.setFitHeight(31.0);
        player6.setFitWidth(84.0);
        player6.setLayoutX(357.0);
        player6.setLayoutY(263.0);
        player6.setPreserveRatio(true);
        player6.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t6.setLayoutX(435.0);
        t6.setLayoutY(284.0);
        t6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t6.setStrokeWidth(0.0);
        t6.setText("Text");
        t6.setWrappingWidth(141.6708984375);
        t6.setFont(new Font(15.0));

        getChildren().add(imageView);
        getChildren().add(back);
        getChildren().add(player1);
        getChildren().add(t1);
        getChildren().add(player2);
        getChildren().add(t2);
        getChildren().add(player3);
        getChildren().add(t3);
        getChildren().add(player4);
        getChildren().add(t4);
        getChildren().add(player5);
        getChildren().add(t5);
        getChildren().add(player6);
        getChildren().add(t6);
        /////////////////////////////
        player1.setVisible(false);
        player2.setVisible(false);
        player3.setVisible(false);
        player4.setVisible(false);
        player5.setVisible(false);
        player6.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(false);
        playerVector.add(0,player1);
        playerVector.add(1,player2);
        playerVector.add(2,player3);
        playerVector.add(3,player4);
        playerVector.add(4,player5);
        playerVector.add(5,player6);
        textVector.add(0,t1);
        textVector.add(1,t2);
        textVector.add(2,t3);
        textVector.add(3,t4);
        textVector.add(4,t5);
        textVector.add(5,t6);
        //////////////////////////////
         try
        {
        mySocket= new Socket("127.0.0.1", 5005);
        dis = new DataInputStream(mySocket.getInputStream());
        ps= new PrintStream(mySocket.getOutputStream());
        }
        catch(IOException ex)
        {
System.out.println(ex);        }
         new Thread(new Runnable() {
                @Override
                public void run() {
                while(true) 
                {
                    try { 
                      if(ack==false)
                      {
                          
                        
                         str1="0."+loginNetwork.playerName;
                        System.out.println(loginNetwork.playerName); 
                        ps.println(str1);
                      ack=true;
                      
                      }                        
                       String reply =dis.readLine();
                       String [] skr=reply.split("\\.");
     //conditions
                       if(skr[0].equals("1")){
                       playerVector.get(playerCounter).setVisible(true);
                       textVector.get(playerCounter).setVisible(true);
                       textVector.get(playerCounter).setText(skr[1]);
                       playerCounter++;
                       }
                       if(skr[0].equals("2")){
                       playerCounter=0;
                       }
                       
                       
                       
      //End of Conditions
                    } catch (IOException ex) {
System.out.println(ex);                    }
                }
                }
                
        }).start();
        /////////////////////////////
        back.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginNetwork.playerName);
        });
    }
}
