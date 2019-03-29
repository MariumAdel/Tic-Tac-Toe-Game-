package tic;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.Vector;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class replayGame2 extends Pane {

    protected final ImageView no;
    protected final Text myText;
    protected final Pane pane;
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
    protected final ImageView replayBtn;
    protected final ImageView replayBtn1;
    
    /////
    boolean turnFlag=true;
     static Vector<ImageView> grayImages = new Vector<ImageView>();


    public replayGame2() {

        no = new ImageView();
        myText = new Text();
        pane = new Pane();
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
        replayBtn = new ImageView();
        replayBtn1 = new ImageView();

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

        pane.setMaxHeight(USE_PREF_SIZE);
        pane.setMaxWidth(USE_PREF_SIZE);
        pane.setMinHeight(USE_PREF_SIZE);
        pane.setMinWidth(USE_PREF_SIZE);
        pane.setPrefHeight(400.0);
        pane.setPrefWidth(600.0);

        imageView.setFitHeight(406.0);
        imageView.setFitWidth(607.0);
        imageView.setLayoutX(-1.0);
        imageView.setLayoutY(-1.0);
        imageView.setImage(new Image(getClass().getResource("55.jpg").toExternalForm()));

        var1.setFitHeight(105.0);
        var1.setFitWidth(105.0);
        var1.setLayoutX(366.0);
        var1.setLayoutY(23.0);
        var1.setPreserveRatio(true);
        var1.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var2.setFitHeight(105.0);
        var2.setFitWidth(105.0);
        var2.setLayoutX(251.0);
        var2.setLayoutY(23.0);
        var2.setPreserveRatio(true);
        var2.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var3.setFitHeight(105.0);
        var3.setFitWidth(105.0);
        var3.setLayoutX(135.0);
        var3.setLayoutY(23.0);
        var3.setPreserveRatio(true);
        var3.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var4.setFitHeight(105.0);
        var4.setFitWidth(105.0);
        var4.setLayoutX(366.0);
        var4.setLayoutY(139.0);
        var4.setPreserveRatio(true);
        var4.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var5.setFitHeight(105.0);
        var5.setFitWidth(105.0);
        var5.setLayoutX(251.0);
        var5.setLayoutY(139.0);
        var5.setPreserveRatio(true);
        var5.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var6.setFitHeight(105.0);
        var6.setFitWidth(105.0);
        var6.setLayoutX(135.0);
        var6.setLayoutY(139.0);
        var6.setPreserveRatio(true);
        var6.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var7.setFitHeight(105.0);
        var7.setFitWidth(105.0);
        var7.setLayoutX(366.0);
        var7.setLayoutY(255.0);
        var7.setPreserveRatio(true);
        var7.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var8.setFitHeight(105.0);
        var8.setFitWidth(105.0);
        var8.setLayoutX(251.0);
        var8.setLayoutY(255.0);
        var8.setPreserveRatio(true);
        var8.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        var9.setFitHeight(105.0);
        var9.setFitWidth(105.0);
        var9.setLayoutX(135.0);
        var9.setLayoutY(255.0);
        var9.setPreserveRatio(true);
        var9.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        backBtn.setFitHeight(105.0);
        backBtn.setFitWidth(105.0);
        backBtn.setLayoutX(481.0);
        backBtn.setLayoutY(37.0);
        backBtn.setPreserveRatio(true);
        backBtn.setImage(new Image(getClass().getResource("replay.jpg").toExternalForm()));

        replayBtn.setFitHeight(105.0);
        replayBtn.setFitWidth(105.0);
        replayBtn.setLayoutX(14.0);
        replayBtn.setLayoutY(335.0);
        replayBtn.setPreserveRatio(true);
        replayBtn.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        replayBtn1.setFitHeight(105.0);
        replayBtn1.setFitWidth(105.0);
        replayBtn1.setLayoutX(481.0);
        replayBtn1.setLayoutY(139.0);
        replayBtn1.setPreserveRatio(true);
        replayBtn1.setImage(new Image(getClass().getResource("jturn.jpg").toExternalForm()));

        getChildren().add(no);
        getChildren().add(myText);
        pane.getChildren().add(imageView);
        pane.getChildren().add(var1);
        pane.getChildren().add(var2);
        pane.getChildren().add(var3);
        pane.getChildren().add(var4);
        pane.getChildren().add(var5);
        pane.getChildren().add(var6);
        pane.getChildren().add(var7);
        pane.getChildren().add(var8);
        pane.getChildren().add(var9);
        pane.getChildren().add(backBtn);
        pane.getChildren().add(replayBtn);
        pane.getChildren().add(replayBtn1);
        getChildren().add(pane);
        /////////////
        new re();
        ////////////////////
        grayImages.add(0,var1);
        grayImages.add(1,var2);
        grayImages.add(2,var3);
        grayImages.add(3,var4);
        grayImages.add(4,var5);
        grayImages.add(5,var6);
        grayImages.add(6,var7);
        grayImages.add(7,var8);
        grayImages.add(8,var9);
        grayImages.add(9,replayBtn1);
        
         ////////////////////////
        backBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                new re();
              
            }
            
        }); 
        ////////////////////////
        ////////////////////////
        replayBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
if(Tic.gamePhase==0){Parent root = new game1v1_2();        
                    Scene scene = new Scene(root);        
                    Tic.stage2.setScene(scene);
                    Tic.stage2.show();}
else if(Tic.gamePhase==1){
                    Parent root = new game1vComp();        
                    Scene scene = new Scene(root);        
                    Tic.stage2.setScene(scene);
                    Tic.stage2.show();}
else if(Tic.gamePhase==2){
                    Parent root = new nova5();        
                    Scene scene = new Scene(root);        
                    Tic.stage2.setScene(scene);
                    Tic.stage2.show();}
                    
                    
            
            }
        }); 
        ////////////////////////
    }
}

////////////////
class re extends Thread
{
Integer counter=new Integer(0);
boolean flag=true;
public re() 
{
    
    start();
        }
public void run()
{
    for(int i=0 ; i<9;i++)
    {
        replayGame2.grayImages.get(i).setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));
    }
 replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("jturn.jpg").toExternalForm()));

       while(true)
        {
            if(Tic.gamePhase==0){if(flag==true)
            {
replayGame2.grayImages.get(game1v1_2.counteArr[counter]-1).setImage(new Image(getClass().getResource("jerry.jpg").toExternalForm()));
 replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("tturn.jpg").toExternalForm()));
   flag=false;
            }
            else if(flag==false)
            {
replayGame2.grayImages.get(game1v1_2.counteArr[counter]-1).setImage(new Image(getClass().getResource("tom.jpg").toExternalForm()));
 replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("jturn.jpg").toExternalForm()));
   flag=true;
            }}
            else if(Tic.gamePhase==1){if(flag==true)
            {
replayGame2.grayImages.get(game1vComp.counteArr[counter]-1).setImage(new Image(getClass().getResource("jerry.jpg").toExternalForm()));
 replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("tturn.jpg").toExternalForm()));
   flag=false;
            }
            else if(flag==false)
            {
replayGame2.grayImages.get(game1vComp.counteArr[counter]-1).setImage(new Image(getClass().getResource("tom.jpg").toExternalForm()));
 replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("jturn.jpg").toExternalForm()));
   flag=true;
            }}
            else if(Tic.gamePhase==2){if(flag==true)
            {
replayGame2.grayImages.get(onlineGameFinal.counteArr[counter]-1).setImage(new Image(getClass().getResource("jerry.jpg").toExternalForm()));
 replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("tturn.jpg").toExternalForm()));
   flag=false;
            }
            else if(flag==false)
            {
replayGame2.grayImages.get(onlineGameFinal.counteArr[counter]-1).setImage(new Image(getClass().getResource("tom.jpg").toExternalForm()));
 replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("jturn.jpg").toExternalForm()));
   flag=true;
            }}
            
//////////////////////
            if(Tic.gamePhase==0){
            if(counter<game1v1_2.count-1){counter++;
                System.out.println(counter);
            System.out.println(game1v1_2.count);}
            else{ replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("finished.jpg").toExternalForm()));
stop();}}else if(Tic.gamePhase==1){
if(counter<game1vComp.count-2){counter++;
                System.out.println(counter);
            System.out.println(game1vComp.count);}
            else{ replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("finished.jpg").toExternalForm()));
stop();}}else if(Tic.gamePhase==2){
if(counter<onlineGameFinal.count-1){counter++;
                System.out.println(counter);
            System.out.println(onlineGameFinal.count);}
            else{ replayGame2.grayImages.get(9).setImage(new Image(getClass().getResource("finished.jpg").toExternalForm()));
stop();}}
            
            
         try{
        sleep(1000);
        }catch (Exception ex) {
             System.out.println(ex);                }
            
        }}
               
}