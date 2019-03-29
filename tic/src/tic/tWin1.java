package tic;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class tWin1 extends Pane  {

    protected final ImageView no;
    protected final Text text;
    protected final ImageView backToOtherGame;
    protected final ImageView ReplayButton;

    public tWin1() {

        no = new ImageView();
        text = new Text();
        backToOtherGame = new ImageView();
        ReplayButton = new ImageView();

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
        no.setImage(new Image(getClass().getResource("twin.jpg").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#c30a00"));
        text.setLayoutX(14.0);
        text.setLayoutY(245.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Tom Win - O");
        text.setWrappingWidth(288.13671875);
        text.setFont(new Font("MV Boli", 37.0));

        backToOtherGame.setFitHeight(90.0);
        backToOtherGame.setFitWidth(115.0);
        backToOtherGame.setLayoutX(22.0);
        backToOtherGame.setLayoutY(310.0);
        backToOtherGame.setPreserveRatio(true);
        backToOtherGame.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        ReplayButton.setFitHeight(90.0);
        ReplayButton.setFitWidth(115.0);
        ReplayButton.setLayoutX(460.0);
        ReplayButton.setLayoutY(310.0);
        ReplayButton.setPreserveRatio(true);
        ReplayButton.setImage(new Image(getClass().getResource("replay.jpg").toExternalForm()));

        getChildren().add(no);
        getChildren().add(text);
        getChildren().add(backToOtherGame);
        getChildren().add(ReplayButton);
        
        ///////////////////////
        backToOtherGame.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                Parent root;
              if(Tic.gamePhase==0){ root = new game1v1_2();
              Scene scene = new Scene(root);        
        Tic.stage2.setScene(scene);
        Tic.stage2.show();}
              else if(Tic.gamePhase==1){ root = new game1vComp();
              Scene scene = new Scene(root);        
        Tic.stage2.setScene(scene);
        Tic.stage2.show();}
                       
              
            }
            
        }); 
        ///////////////////
        ReplayButton.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
              
                Parent root = new replayGame2();        
        Scene scene = new Scene(root);        
        Tic.stage2.setScene(scene);
        Tic.stage2.show();        
            }
            
        }); 

    }
}
