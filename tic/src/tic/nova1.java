package tic;

import java.awt.event.MouseEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class nova1 extends Pane {
    
    boolean XOflag=false;
    protected final Circle circle;
    protected final ImageView imageView;
    protected final Button bt;

    public nova1() {
        
        circle = new Circle();
        imageView = new ImageView();
        bt = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        circle.setFill(javafx.scene.paint.Color.DODGERBLUE);
        circle.setLayoutX(260.0);
        circle.setLayoutY(144.0);
        circle.setRadius(100.0);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);

        imageView.setFitHeight(150.0);
        imageView.setFitWidth(200.0);
        imageView.setLayoutX(372.0);
        imageView.setLayoutY(169.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("img1.jpg").toExternalForm()));

        bt.setLayoutX(80.0);
        bt.setLayoutY(255.0);
        bt.setMnemonicParsing(false);
        bt.setText("Button");

        getChildren().add(circle);
        getChildren().add(imageView);
        getChildren().add(bt);
        ////////////////////////
        imageView.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOflag==false){
                imageView.setImage(new Image(nova1.this.getClass().getResource("img2.jpg"
                ).toExternalForm()));
                XOflag=true  ;}
                else{
                imageView.setImage(new Image(nova1.this.getClass().getResource("img1.jpg"
                ).toExternalForm()));
                XOflag=false;}
                
                
            }
        }); 
        ////////////////////////
        bt.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root = new GameLayout();
                Stage newWindow = new Stage();
                Scene secondScene = new Scene(root);
                newWindow.setTitle("Second Stage");
                newWindow.setScene(secondScene);
                newWindow.show();
imageView.setImage(new Image(getClass().getResource("img2.jpg").toExternalForm()));
            }
        });

    }
}
