package tic;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static tic.playerChoice2.playerVector;

public  class onlineGameFinal extends Pane {
//      GameDB Obj = new GameDB();
    
static int playingStatus;
boolean finishFlag=false;
boolean ProcessingFlag;
boolean jerryFlag;
    protected final ImageView imageView;
    protected final ImageView var1;
    protected final ImageView var2;
    protected final ImageView var3;
    protected final ImageView var4;
    protected final ImageView var5;
    protected final ImageView var6;
    protected final ImageView var7;
    protected final ImageView var8;
    protected final ImageView var9;
    protected final ImageView backBtn;
    protected final Text opponent;
    protected final Text score;
    protected final Text text;
    protected final Pane pane;
    protected final ImageView imageView0;
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
    protected final Pane pane0;
    protected final ImageView bgc;
    protected final ImageView backc;
    protected final ImageView replayc;
    //////////////////
    String Opponentname;
    String []skr=new String[50];
     static int Myvalue;
    static boolean yesFlag=false;
     char XOFlag='x';
     int var1Flag=1;
    int var2Flag=1;
     int var3Flag=1;
   int var4Flag=1;
     int var5Flag=1;
    int var6Flag=1;
    int var7Flag=1;
    int var8Flag=1;
     int var9Flag=1;
    boolean gameFinishedFlag=false;
     int x1=0;
     int o1=0;
     int x2=0;
     int o2=0;
     int x3=0;
    int o3=0;
    int x4=0;
     int o4=0;
     int x5=0;
     int o5=0;
     int x6=0;
 int o6=0;
   int x7=0;
     int o7=0;
     int x8=0;
     int o8=0;
     int x9=0;
     int o9=0;
    static int [] counteArr = new int[9];
    static int count=0;
    ////////////////////
    
    
    
    boolean inGameFlag=false;
    Socket mySocket;
        DataInputStream dis ;
        PrintStream ps;
        boolean ack;
        String str1;
        int playerCounter=0;
static ArrayList<ImageView> playerVector = new ArrayList<ImageView>(10);
static ArrayList<Text> textVector = new ArrayList<Text>(10);

        Integer myScore=new Integer(0);
    public onlineGameFinal() {
        count=0;
            Tic.gamePhase=2;
        ack=false;
        imageView = new ImageView();
        var1 = new ImageView();
        var2 = new ImageView();
        var3 = new ImageView();
        var4 = new ImageView();
        var5 = new ImageView();
        var6 = new ImageView();
        var7 = new ImageView();
        var8 = new ImageView();
        var9 = new ImageView();
        backBtn = new ImageView();
        opponent = new Text();
        score = new Text();
        text = new Text();
        pane = new Pane();
        imageView0 = new ImageView();
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
        pane0 = new Pane();
        bgc = new ImageView();
        backc = new ImageView();
        replayc = new ImageView();

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

        var1.setFitHeight(105.0);
        var1.setFitWidth(105.0);
        var1.setLayoutX(472.0);
        var1.setLayoutY(23.0);
        var1.setPreserveRatio(true);
        var1.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var2.setFitHeight(105.0);
        var2.setFitWidth(105.0);
        var2.setLayoutX(357.0);
        var2.setLayoutY(23.0);
        var2.setPreserveRatio(true);
        var2.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var3.setFitHeight(105.0);
        var3.setFitWidth(105.0);
        var3.setLayoutX(241.0);
        var3.setLayoutY(23.0);
        var3.setPreserveRatio(true);
        var3.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var4.setFitHeight(105.0);
        var4.setFitWidth(105.0);
        var4.setLayoutX(472.0);
        var4.setLayoutY(139.0);
        var4.setPreserveRatio(true);
        var4.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var5.setFitHeight(105.0);
        var5.setFitWidth(105.0);
        var5.setLayoutX(357.0);
        var5.setLayoutY(139.0);
        var5.setPreserveRatio(true);
        var5.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var6.setFitHeight(105.0);
        var6.setFitWidth(105.0);
        var6.setLayoutX(241.0);
        var6.setLayoutY(139.0);
        var6.setPreserveRatio(true);
        var6.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var7.setFitHeight(105.0);
        var7.setFitWidth(105.0);
        var7.setLayoutX(472.0);
        var7.setLayoutY(255.0);
        var7.setPreserveRatio(true);
        var7.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var8.setFitHeight(105.0);
        var8.setFitWidth(105.0);
        var8.setLayoutX(357.0);
        var8.setLayoutY(255.0);
        var8.setPreserveRatio(true);
        var8.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var9.setFitHeight(105.0);
        var9.setFitWidth(105.0);
        var9.setLayoutX(241.0);
        var9.setLayoutY(255.0);
        var9.setPreserveRatio(true);
        var9.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        backBtn.setFitHeight(105.0);
        backBtn.setFitWidth(105.0);
        backBtn.setLayoutX(26.0);
        backBtn.setLayoutY(23.0);
        backBtn.setPreserveRatio(true);
        backBtn.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        opponent.setLayoutX(43.0);
        opponent.setLayoutY(124.0);
        opponent.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        opponent.setStrokeWidth(0.0);
        opponent.setText("Text");
        opponent.setWrappingWidth(146.9830722808838);

        score.setLayoutX(90.0);
        score.setLayoutY(153.0);
        score.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        score.setStrokeWidth(0.0);
        score.setText("Text");

        text.setLayoutX(43.0);
        text.setLayoutY(153.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Score");

        pane.setMaxHeight(USE_PREF_SIZE);
        pane.setMaxWidth(USE_PREF_SIZE);
        pane.setMinHeight(USE_PREF_SIZE);
        pane.setMinWidth(USE_PREF_SIZE);
        pane.setPrefHeight(400.0);
        pane.setPrefWidth(600.0);

        imageView0.setFitHeight(406.0);
        imageView0.setFitWidth(607.0);
        imageView0.setLayoutX(-1.0);
        imageView0.setLayoutY(-1.0);
        imageView0.setImage(new Image(getClass().getResource("55.jpg").toExternalForm()));

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
        
        pane0.setMaxHeight(USE_PREF_SIZE);
        pane0.setMaxWidth(USE_PREF_SIZE);
        pane0.setMinHeight(USE_PREF_SIZE);
        pane0.setMinWidth(USE_PREF_SIZE);
        pane0.setPrefHeight(400.0);
        pane0.setPrefWidth(600.0);

        bgc.setFitHeight(406.0);
        bgc.setFitWidth(607.0);
        bgc.setImage(new Image(getClass().getResource("twin.jpg").toExternalForm()));

        backc.setFitHeight(51.0);
        backc.setFitWidth(105.0);
        backc.setLayoutX(33.0);
        backc.setLayoutY(305.0);
        backc.setPreserveRatio(true);
        backc.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        replayc.setFitHeight(51.0);
        replayc.setFitWidth(105.0);
        replayc.setLayoutX(443.0);
        replayc.setLayoutY(45.0);
        replayc.setPreserveRatio(true);
        replayc.setImage(new Image(getClass().getResource("replay.jpg").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(var1);
        getChildren().add(var2);
        getChildren().add(var3);
        getChildren().add(var4);
        getChildren().add(var5);
        getChildren().add(var6);
        getChildren().add(var7);
        getChildren().add(var8);
        getChildren().add(var9);
        getChildren().add(backBtn);
        getChildren().add(opponent);
        getChildren().add(score);
        getChildren().add(text);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(back);
        pane.getChildren().add(player1);
        pane.getChildren().add(t1);
        pane.getChildren().add(player2);
        pane.getChildren().add(t2);
        pane.getChildren().add(player3);
        pane.getChildren().add(t3);
        pane.getChildren().add(player4);
        pane.getChildren().add(t4);
        pane.getChildren().add(player5);
        pane.getChildren().add(t5);
        pane.getChildren().add(player6);
        pane.getChildren().add(t6);
        pane.getChildren().add(back1);
        pane.getChildren().add(t11);
        pane.getChildren().add(oppo);
        pane.getChildren().add(yes);
        pane.getChildren().add(no);
        getChildren().add(pane);
        pane0.getChildren().add(bgc);
        pane0.getChildren().add(backc);
        pane0.getChildren().add(replayc);
        getChildren().add(pane0);
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
        bgc.setVisible(false);
        backc.setVisible(false);
        replayc.setVisible(false);
        pane0.setVisible(false);
        
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
      
        myScore=loginPage.Obj.insertScore(loginPage.playerName,0);
        score.setText(myScore.toString());
        ///////////////////
        
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
                    
                 /////////////////////////////////////////////start of thred
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
                        skr=reply.split("\\.");
     //conditions
                       if(skr[0].equals("1") && inGameFlag==false){
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
             
             Opponentname=skr[1];
           opponent.setText(skr[1]);
             ProcessingFlag=true;
             inGameFlag=jerryFlag=true;
             hideScene1();
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
           Opponentname=skr[1];
           opponent.setText(skr[1]);
        inGameFlag=jerryFlag=true;
          
       ProcessingFlag=false;
       hideScene1();}
       
       if(skr[0].equals("11") ){
           
           Myvalue=Integer.valueOf(skr[2]);
           System.out.println(Myvalue);
           makeCalc();
         


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
                        
                        Parent root = new nova5();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        ////////////////////////
        backBtn.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
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
                        
                        Parent root = new nova5();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        ////////////////////////
        
        
        ///////////////////////////
        player1.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(0).getText()+"."+loginPage.playerName);
             player1.setImage(new Image(onlineGameFinal.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player2.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(1).getText()+"."+loginPage.playerName);
             player2.setImage(new Image(onlineGameFinal.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player3.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(2).getText()+"."+loginPage.playerName);
             player3.setImage(new Image(onlineGameFinal.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player4.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(3).getText()+"."+loginPage.playerName);
             player4.setImage(new Image(onlineGameFinal.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player5.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(4).getText()+"."+loginPage.playerName);
             player5.setImage(new Image(onlineGameFinal.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////
        player6.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("4."+textVector.get(5).getText()+"."+loginPage.playerName);
             player6.setImage(new Image(onlineGameFinal.this.getClass().getResource("waiting.jpg"
                ).toExternalForm()));
        });
        ///////////////////////////////////*/
    }
    public void hideScene1(){
    pane.setVisible(false);
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
        imageView0.setVisible(false);
        back.setVisible(false);
        
    
    
    
    
     
        
        ////////////////////////
     
        ////////////////////////
        var1.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                 
                 System.out.println(XOFlag);
                 System.out.println(var1Flag);
                 System.out.println(gameFinishedFlag);
                 System.out.println(ProcessingFlag);
                if(XOFlag=='x' && var1Flag==1 && gameFinishedFlag==false && ProcessingFlag==true){
                var1.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                    System.out.println("im here");
                XOFlag='o'  ;
                var1Flag=0;
                
                x1=1;
                 counteArr[count]=1;
                count++;
                ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"1");
                checkFinishing();
                }
                else if(XOFlag=='o' && var1Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var1.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var1Flag=0;
                
                o1=1;
                 counteArr[count]=1;
                count++;
                checkFinishing();
                }  
               
              }
        }); 
        ////////////////////////
        ////////////////////////
        var2.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                //var1.setVisible(false);
                if(XOFlag=='x' && var2Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var2.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var2Flag=0;
                
                x2=1;
                 counteArr[count]=2;
                count++;
ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"2");
checkFinishing();
                }
                else if(XOFlag=='o' && var2Flag==1 && gameFinishedFlag==false && ProcessingFlag==true){
                var2.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var2Flag=0;
                
                o2=1;
                 counteArr[count]=2;
                count++;
                checkFinishing();
                }  
                
              }
        }); 
        ////////////////////////
        ////////////////////////
        var3.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var3Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var3.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var3Flag=0;
                
                x3=1;
                 counteArr[count]=3;
                count++;
                 ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"3");
                checkFinishing();
                }
                else if(XOFlag=='o' && var3Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var3.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var3Flag=0;
                
                o3=1;
                 counteArr[count]=3;
                count++;
                checkFinishing();
                }  
               
              }
        }); 
        ////////////////////////
        ////////////////////////
        var4.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var4Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var4.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var4Flag=0;
                x4=1;
                 counteArr[count]=4;
                count++;
                 ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"4");
                checkFinishing();
                }
                else if(XOFlag=='o' && var4Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var4.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var4Flag=0;
                           o4=1;
                 counteArr[count]=4;
                count++;
                checkFinishing();
                }  
               
              }
        }); 
        ////////////////////////
        ////////////////////////
        var5.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var5Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var5.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var5Flag=0;
                x5=1;
                counteArr[count]=5;
                count++;
                 ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"5");
                checkFinishing();
                }
                else if(XOFlag=='o' && var5Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var5.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var5Flag=0;
                o5=1;
                counteArr[count]=5;
                count++;
                checkFinishing();
                }  
                
              }
        }); 
        ////////////////////////
        ////////////////////////
        var6.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var6Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var6.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var6Flag=0;
                x6=1;
                counteArr[count]=6;
                count++;
                 ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"6");
                checkFinishing();
                }
                else if(XOFlag=='o' && var6Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var6.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var6Flag=0;
                o6=1;
                counteArr[count]=6;
                count++;
                checkFinishing();
                }  
                
              }
        }); 
        ////////////////////////
        ////////////////////////
        var7.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var7Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var7.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var7Flag=0;
                x7=1;
                counteArr[count]=7;
                count++;
                 ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"7");
                checkFinishing();
                }
                else if(XOFlag=='o' && var7Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var7.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var7Flag=0;
                o7=1;
                counteArr[count]=7;
                count++;
                checkFinishing();
                }  
                
              }
        }); 
        ////////////////////////
        ////////////////////////
        var8.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var8Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var8.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var8Flag=0;
                x8=1;
                counteArr[count]=8;
                count++;
                 ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"8");
                checkFinishing();
                }
                else if(XOFlag=='o' && var8Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var8.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var8Flag=0;
                o8=1;
                counteArr[count]=8;
                count++;
                checkFinishing();
                }  
                
              }
        }); 
        ////////////////////////
        ////////////////////////
        var9.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var9Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var9.setImage(new Image(onlineGameFinal.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var9Flag=0;
                x9=1;
                counteArr[count]=9;
                count++;
                 ps.println("10."+Opponentname+"."+loginPage.playerName+"."+"9");
                checkFinishing();
                }
                else if(XOFlag=='o' && var9Flag==1 && gameFinishedFlag==false&& ProcessingFlag==true){
                var9.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var9Flag=0;
                o9=1;
                counteArr[count]=9;
                count++;
                checkFinishing();
                }  
                
              }
        }); 
        ////////////////////////
        
        

    }
    public void checkFinishing()
    {
        System.out.println("my count"+count);
        ProcessingFlag=!ProcessingFlag;
      
//        ProcessingFlag=!true;
    if(x1+x2+x3==3 || x4+x5+x6==3 || x7+x8+x9==3 
      || x1+x5+x9==3 || x3+x5+x7 ==3 ||x1+x4+x7==3
      || x2+x5+x8 ==3 || x3+x6+x9==3){
    
    loginPage.Obj.insertScore(loginPage.playerName,10);
//    nova5.inGameFlag =true;
    finishFlag=true;
    win(0);
    
    }
    //////////////////////////
    if(o1+o2+o3==3 || o4+o5+o6==3 || o7+o8+o9==3 
      || o1+o5+o9==3 || o3+o5+o7 ==3 ||o1+o4+o7==3
      || o2+o5+o8 ==3 || o3+o6+o9==3){
    
 
//    nova5.inGameFlag =true;
    finishFlag=true;
    System.out.println("o win");
    win(1);
    }
    //////////////////////////
    if(count==9 && finishFlag==false){
      
//    nova5.inGameFlag =true;
    win(2);
    }
    //////////////////
//    if(XOFlag=='o'){generateRand();}
    
    
    }
    //////////////////////////////////////////
    
    ////////////////////////////
    
    ////////////////
    public void makeCalc(){
        ///////////////////////////////
        if(Myvalue==1){var1.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var1Flag=0;
                
                o1=1;
                 counteArr[count]=1;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==2){var2.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var2Flag=0;
                o2=1;
                 counteArr[count]=2;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==3){var3.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var3Flag=0;
                o3=1;
                 counteArr[count]=3;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==4){var4.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var4Flag=0;
                o4=1;
                 counteArr[count]=4;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==5){var5.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var5Flag=0;
                o5=1;
                 counteArr[count]=5;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==6){var6.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var6Flag=0;
                o6=1;
                 counteArr[count]=6;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==7){var7.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var7Flag=0;
                o7=1;
                 counteArr[count]=7;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==8){var8.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var8Flag=0;
                o8=1;
                 counteArr[count]=8;
                count++;
                checkFinishing();}
        ///////////////////////////////
        if(Myvalue==9){var9.setImage(new Image(onlineGameFinal.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var9Flag=0;
                o9=1;
                 counteArr[count]=9;
                count++;
                checkFinishing();}

    
    
    }
    /////////////////////////
    public void rollBack()
    {
//    nova5.inGameFlag =true;
    }
    public void win(int status){
     var1Flag=0;
     var2Flag=0;
     var3Flag=0;
     var4Flag=0;
     var5Flag=0;
     var6Flag=0;
     var7Flag=0;
     var8Flag=0;
     var9Flag=0;
     
     //////////////////////////////
//     for(long i=0;i<6000000;i++);
     if(status==0)
     {
     pane0.setVisible(true);
     bgc.setVisible(true);
     if(jerryFlag){bgc.setImage(new Image(onlineGameFinal.this.getClass().getResource("jwin.gif"
                ).toExternalForm()));}
     if(!jerryFlag){bgc.setImage(new Image(onlineGameFinal.this.getClass().getResource("twin.gif"
                ).toExternalForm()));}
        backc.setVisible(true);
        replayc.setVisible(true);
         ////////////////////////
        backc.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginPage.playerName);
            
                        
                        Parent root = new nova5();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        /////////////////////////////
        ////////////////////////
        replayc.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginPage.playerName);
              Parent root=new replayGame2();
//if(jerryFlag){ root = new jWin();}
//     else{ root = new tWin();}                              
                       
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        /////////////////////////////
        
    }
     else if(status==1)
     {
         pane0.setVisible(true);
     bgc.setVisible(true);
     if(jerryFlag){bgc.setImage(new Image(onlineGameFinal.this.getClass().getResource("twin.gif"
                ).toExternalForm()));}
     if(!jerryFlag){bgc.setImage(new Image(onlineGameFinal.this.getClass().getResource("jwin.gif"
                ).toExternalForm()));}
        backc.setVisible(true);
        replayc.setVisible(true);
        ////////////////////////
        backc.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginPage.playerName);
            
                        
                        Parent root = new nova5();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        /////////////////////////////
        ////////////////////////
        replayc.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginPage.playerName);
              Parent root=new replayGame2();
//if(jerryFlag){ root = new tWin();}
//     else{ root = new jWin();}                              
                        
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        /////////////////////////////
    }
     else if(status==2)
     {
     pane0.setVisible(true);
     bgc.setVisible(true);
     bgc.setImage(new Image(onlineGameFinal.this.getClass().getResource("draw.gif"
                ).toExternalForm()));
        backc.setVisible(true);
        replayc.setVisible(true);
        ////////////////////////
        backc.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginPage.playerName);
            
                        
                        Parent root = new nova5();
         
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        /////////////////////////////
        ////////////////////////
        replayc.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             ps.println("3."+loginPage.playerName);
                              Parent root=new replayGame2();
             Scene secondScene = new Scene(root);
             
             Tic.stage2.setScene(secondScene);
          
             Tic.stage2.show();
                        
                        
            });
        /////////////////////////////
    }
     
    
    }
}

