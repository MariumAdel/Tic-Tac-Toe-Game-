package tic;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class nova5 extends Pane {
    protected final ImageView imageView;
    protected final ImageView singleGame;
    protected final ImageView multiGame;
    protected final ImageView onlineGame;
    protected final ImageView ExitMainPage;
    protected final ImageView howTo;
    protected final Text text;
    Parent root;

    public nova5() {

        imageView = new ImageView();
        singleGame = new ImageView();
        multiGame = new ImageView();
        onlineGame = new ImageView();
        ExitMainPage = new ImageView();
        howTo = new ImageView();
        text = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        imageView.setFitHeight(420.0);
        imageView.setFitWidth(620.0);
        imageView.setLayoutX(-3.0);
        imageView.setLayoutY(-1.0);
        imageView.setImage(new Image(getClass().getResource("gameback.jpg").toExternalForm()));

        singleGame.setFitHeight(48.0);
        singleGame.setFitWidth(133.0);
        singleGame.setLayoutX(32.0);
        singleGame.setLayoutY(43.0);
        singleGame.setPreserveRatio(true);
        singleGame.setImage(new Image(getClass().getResource("single.jpg").toExternalForm()));

        multiGame.setFitHeight(48.0);
        multiGame.setFitWidth(133.0);
        multiGame.setLayoutX(32.0);
        multiGame.setLayoutY(111.0);
        multiGame.setPreserveRatio(true);
        multiGame.setImage(new Image(getClass().getResource("multi.jpg").toExternalForm()));

        onlineGame.setFitHeight(48.0);
        onlineGame.setFitWidth(133.0);
        onlineGame.setLayoutX(32.0);
        onlineGame.setLayoutY(186.0);
        onlineGame.setPreserveRatio(true);
        onlineGame.setImage(new Image(getClass().getResource("online.jpg").toExternalForm()));

        ExitMainPage.setFitHeight(48.0);
        ExitMainPage.setFitWidth(133.0);
        ExitMainPage.setLayoutX(14.0);
        ExitMainPage.setLayoutY(338.0);
        ExitMainPage.setPreserveRatio(true);
        ExitMainPage.setImage(new Image(getClass().getResource("exit.jpg").toExternalForm()));

        howTo.setFitHeight(48.0);
        howTo.setFitWidth(54.0);
        howTo.setLayoutX(428.0);
        howTo.setLayoutY(67.0);
        howTo.setImage(new Image(getClass().getResource("how.jpg").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#c9ff00"));
        text.setLayoutX(385.0);
        text.setLayoutY(51.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("How to play ");
        text.setFont(new Font("MV Boli", 26.0));

        getChildren().add(imageView);
        getChildren().add(singleGame);
        getChildren().add(multiGame);
        getChildren().add(onlineGame);
        getChildren().add(ExitMainPage);
        getChildren().add(howTo);
        getChildren().add(text);
        ////////////////////////
        singleGame.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
               Parent root = new game1vComp();
                //newWindow = new Stage();
                Scene secondScene = new Scene(root);
//                Tic.stage2.setTitle("Second Stage");
                Tic.stage2.setScene(secondScene);
                Tic.stage2.show();   
                Tic.clip.stop();
                }
            
        }); 
        ///////////////////////////////
        multiGame.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
               Parent root = new game1v1_2();
                //newWindow = new Stage();
                Scene secondScene = new Scene(root);
//                Tic.stage2.setTitle("Second Stage");
                Tic.stage2.setScene(secondScene);
                Tic.stage2.show();   
                Tic.clip.stop();
                }
            
        });
        ///////////////////////////////
        onlineGame.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
               Parent root = new loginPage();
                //newWindow = new Stage();
                Scene secondScene = new Scene(root);
//                Tic.stage2.setTitle("Second Stage");
                Tic.stage2.setScene(secondScene);
                Tic.stage2.show();   
                Tic.clip.stop();
                }
            
        });
        ///////////////////////////////
        ExitMainPage.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
              
                Tic.stage2.close();
                
                }
            
        });
        ///////////////////////////////
        howTo.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
              Parent root = new howToPlay();
                Scene secondScene = new Scene(root);
                Tic.stage2.setScene(secondScene);
                Tic.stage2.show();   
                Tic.clip.stop();
                }
            
        });

        
//               
//        try{
//        newWindow.setOnCloseRequest(e -> {
//             
//          System.out.println("sadf");
//             
//            e.consume();
//          newWindow.close(); 
//          inGameFlag=true;
//        });
//        } catch (Exception e) {
//            System.out.println(e);        }
//                
           
        ////////////////////////
        
           
    }
}
