package tic;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import static tic.Tic.stage2;

public  class game1v1_2 extends Pane {

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
    boolean finishFlag=false;

    public game1v1_2() {
        Tic.gamePhase=0;
           count=0;
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

        replayBtn.setFitHeight(105.0);
        replayBtn.setFitWidth(105.0);
        replayBtn.setLayoutX(26.0);
        replayBtn.setLayoutY(88.0);
        replayBtn.setPreserveRatio(true);
        replayBtn.setImage(new Image(getClass().getResource("newgame.jpg").toExternalForm()));

        replayBtn1.setFitHeight(105.0);
        replayBtn1.setFitWidth(105.0);
        replayBtn1.setLayoutX(69.0);
        replayBtn1.setLayoutY(158.0);
        replayBtn1.setPreserveRatio(true);
        replayBtn1.setImage(new Image(getClass().getResource("jturn.jpg").toExternalForm()));

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
        getChildren().add(replayBtn);
        getChildren().add(replayBtn1);
        ////////////////////////
        backBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                rollBack();
              
                Parent root = new nova5();        
        Scene scene = new Scene(root);        
        Tic.stage2.setScene(scene);
        Tic.stage2.show();
        Tic.music();
               
               
                
            }
            
        }); 
        ////////////////////////
        ////////////////////////
        replayBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
//                rollBack();
                    Parent root = new game1v1_2();        
                    Scene scene = new Scene(root);        
                    Tic.stage2.setScene(scene);
                    Tic.stage2.show();
                    
//                if(gameFinishedFlag==false){
//                Stage stage = (Stage) replayBtn.getScene().getWindow();
//    stage.close();
//                }
                
                
            }
        }); 
        ////////////////////////
        var1.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var1Flag==1 && gameFinishedFlag==false){
                var1.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var1Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x1=1;
                }
                else if(XOFlag=='o' && var1Flag==1 && gameFinishedFlag==false){
                var1.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var1Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o1=1;
                }  
                counteArr[count]=1;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var2.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                //var1.setVisible(false);
                if(XOFlag=='x' && var2Flag==1 && gameFinishedFlag==false){
                var2.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var2Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x2=1;
                }
                else if(XOFlag=='o' && var2Flag==1 && gameFinishedFlag==false ){
                var2.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var2Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o2=1;
                }  
                counteArr[count]=2;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var3.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var3Flag==1 && gameFinishedFlag==false){
                var3.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var3Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x3=1;
                }
                else if(XOFlag=='o' && var3Flag==1 && gameFinishedFlag==false){
                var3.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var3Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o3=1;
                }  
                counteArr[count]=3;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var4.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var4Flag==1 && gameFinishedFlag==false){
                var4.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var4Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x4=1;
                }
                else if(XOFlag=='o' && var4Flag==1 && gameFinishedFlag==false){
                var4.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var4Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o4=1;
                }  
                counteArr[count]=4;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var5.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var5Flag==1 && gameFinishedFlag==false){
                var5.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var5Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x5=1;
                }
                else if(XOFlag=='o' && var5Flag==1 && gameFinishedFlag==false){
                var5.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var5Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o5=1;
                }  
                counteArr[count]=5;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var6.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var6Flag==1 && gameFinishedFlag==false){
                var6.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var6Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x6=1;
                }
                else if(XOFlag=='o' && var6Flag==1 && gameFinishedFlag==false){
                var6.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var6Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o6=1;
                }  
                counteArr[count]=6;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var7.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var7Flag==1 && gameFinishedFlag==false){
                var7.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var7Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x7=1;
                }
                else if(XOFlag=='o' && var7Flag==1 && gameFinishedFlag==false){
                var7.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var7Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o7=1;
                }  
                counteArr[count]=7;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var8.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var8Flag==1 && gameFinishedFlag==false){
                var8.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var8Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x8=1;
                }
                else if(XOFlag=='o' && var8Flag==1 && gameFinishedFlag==false){
                var8.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var8Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o8=1;
                }  
                counteArr[count]=8;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        ////////////////////////
        var9.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOFlag=='x' && var9Flag==1 && gameFinishedFlag==false){
                var9.setImage(new Image(game1v1_2.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var9Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("tturn.jpg"
                ).toExternalForm()));
                x9=1;
                }
                else if(XOFlag=='o' && var9Flag==1 && gameFinishedFlag==false){
                var9.setImage(new Image(game1v1_2.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var9Flag=0;
                replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("jturn.jpg"
                ).toExternalForm()));
                o9=1;
                }  
                counteArr[count]=9;
                count++;
                checkFinishing();
              }
        }); 
        ////////////////////////
        
        

    }
    public void checkFinishing()
    {
//        System.out.println("tic.game1v1_2.checkFinishing()");
    if(x1+x2+x3==3 || x4+x5+x6==3 || x7+x8+x9==3 
      || x1+x5+x9==3 || x3+x5+x7 ==3 ||x1+x4+x7==3
      || x2+x5+x8 ==3 || x3+x6+x9==3){
    
    replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("gameback.jpg"
                ).toExternalForm()));
//    nova5.inGameFlag =true;
    finishFlag=true;
    win(0);
    }
    //////////////////////////
    if(o1+o2+o3==3 || o4+o5+o6==3 || o7+o8+o9==3 
      || o1+o5+o9==3 || o3+o5+o7 ==3 ||o1+o4+o7==3
      || o2+o5+o8 ==3 || o3+o6+o9==3){
    
    replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("blank.jpg"
                ).toExternalForm()));
//    nova5.inGameFlag =true;
    finishFlag=true;
    win(1);
    }
    //////////////////////////
    if(count==9 && finishFlag==false){
        replayBtn1.setImage(new Image(game1v1_2.this.getClass().getResource("back.jpg"
                ).toExternalForm()));
//    nova5.inGameFlag =true;
    win(2);
    }
    //////////////////
    }
    //////////////////////////////////////////
    
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
     if(status==0)
     {
     Parent root = new jWin();        
        Scene scene = new Scene(root);        
        Tic.stage2.setScene(scene);
        Tic.stage2.show();
    }
     else if(status==1)
     {
     Parent root = new tWin();        
        Scene scene = new Scene(root);        
        Tic.stage2.setScene(scene);
        Tic.stage2.show();
    }
     else if(status==2)
     {
     Parent root = new gameDraw();        
        Scene scene = new Scene(root);        
        Tic.stage2.setScene(scene);
        Tic.stage2.show();
    }
      
    
    }
}
