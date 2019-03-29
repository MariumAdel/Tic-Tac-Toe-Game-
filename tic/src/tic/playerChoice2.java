package tic;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public  class playerChoice2 extends Pane {
    static int playingStatus;

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
    protected final ImageView back1;
    protected final Text t11;
    protected final Text oppo;
    protected final ImageView yes;
    protected final ImageView no;
    
    Socket mySocket;
        DataInputStream dis ;
        PrintStream ps;
        boolean ack=false;
        String str1;
        int playerCounter=0;
static ArrayList<ImageView> playerVector = new ArrayList<ImageView>(10);
static ArrayList<Text> textVector = new ArrayList<Text>(10);

    public playerChoice2() {

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
        back1 = new ImageView();
        t11 = new Text();
        oppo = new Text();
        yes = new ImageView();
        no = new ImageView();

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

        back1.setFitHeight(179.0);
        back1.setFitWidth(347.0);
        back1.setLayoutX(130.0);
        back1.setLayoutY(106.0);
        back1.setPreserveRatio(true);
        back1.setImage(new Image(getClass().getResource("backyesandno.jpg").toExternalForm()));

        t11.setLayoutX(167.0);
        t11.setLayoutY(158.0);
        t11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t11.setStrokeWidth(0.0);
        t11.setText("Do you want to play with");
        t11.setWrappingWidth(189.6708984375);
        t11.setFont(new Font(15.0));

        oppo.setLayoutX(338.0);
        oppo.setLayoutY(158.0);
        oppo.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        oppo.setStrokeWidth(0.0);
        oppo.setText("text");
        oppo.setWrappingWidth(189.6708984375);
        oppo.setFont(new Font(15.0));

        yes.setFitHeight(31.0);
        yes.setFitWidth(84.0);
        yes.setLayoutX(178.0);
        yes.setLayoutY(201.0);
        yes.setPreserveRatio(true);
        yes.setImage(new Image(getClass().getResource("yes.jpg").toExternalForm()));

        no.setFitHeight(31.0);
        no.setFitWidth(84.0);
        no.setLayoutX(368.0);
        no.setLayoutY(201.0);
        no.setPreserveRatio(true);
        no.setImage(new Image(getClass().getResource("no.jpg").toExternalForm()));

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
        getChildren().add(back1);
        getChildren().add(t11);
        getChildren().add(oppo);
        getChildren().add(yes);
        getChildren().add(no);
///////////////////////////
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
        back1.setVisible(false);
        t11.setVisible(false);
        oppo.setVisible(false);
        yes.setVisible(false);
        no.setVisible(false);
        
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
         Thread k=new Thread(new Runnable() {
                @Override
                public void run() {
                while(true) 
                {
                    
                    try { 
                      if(ack==false)
                      {
                          
                        
                         str1="0."+loginPage.playerName;
                        System.out.println(loginPage.playerName); 
                        ps.println(str1);
                      ack=true;
                      
                      }                        
                       String reply =dis.readLine();
                       String [] skr=reply.split("\\.");
     //conditions
                       if(skr[0].equals("1") ){
                        if(!skr[1].equals(loginPage.playerName)){
                       playerVector.get(playerCounter).setVisible(true);
                       textVector.get(playerCounter).setVisible(true);
                       textVector.get(playerCounter).setText(skr[1]);
                       playerCounter++;
                       }}
                       if(skr[0].equals("2")){
                       playerCounter=0;
                       }
                       
                       
                       
                       
      //End of Conditions
      //play
       if(skr[0].equals("5") ){
                       
                       back1.setVisible(true);
                        t11.setVisible(true);
                        oppo.setVisible(true);
                        yes.setVisible(true);
                        no.setVisible(true);
                        oppo.setText(skr[1]);
    ///
    yes.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("6."+skr[1]+"."+loginPage.playerName);
            
             ////
             Parent root = new onlineGame();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
             playingStatus=0;
        });
    ////
    no.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("7."+skr[1]+"."+loginPage.playerName);
             back1.setVisible(false);
                        t11.setVisible(false);
                        oppo.setVisible(false);
                        yes.setVisible(false);
                        no.setVisible(false);
             
        });
                       }
       if(skr[0].equals("8") ){
           System.out.println("what t f");
           playingStatus=1;
        Parent root = new onlineGame();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
             
       
       
       
       }
       
      //play
      
                    } catch (IOException ex) {
System.out.println(ex);                    }
                }
                }
                
        });
                 k.start();
        /////////////////////////////
        back.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginPage.playerName);
             k.stop();
                        try
           {
                ps.close();
                dis.close();
                mySocket.close();
                }
                catch(Exception ex)
                {
                ex.printStackTrace();
                }
                        
                        Parent root = new loginPage();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        
        
        ///////////////////////////
        player1.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(0).getText()+"."+loginPage.playerName);
             player1.setImage(new Image(playerChoice2.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player2.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(1).getText()+"."+loginPage.playerName);
             player2.setImage(new Image(playerChoice2.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player3.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(2).getText()+"."+loginPage.playerName);
             player3.setImage(new Image(playerChoice2.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player4.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(3).getText()+"."+loginPage.playerName);
             player4.setImage(new Image(playerChoice2.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player5.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(4).getText()+"."+loginPage.playerName);
             player5.setImage(new Image(playerChoice2.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player6.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(5).getText()+"."+loginPage.playerName);
             player6.setImage(new Image(playerChoice2.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////////////*/
    }
}

