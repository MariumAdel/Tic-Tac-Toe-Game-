package tic;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class demo2 extends Pane {

    protected final ImageView imageView;
    protected final ImageView getBtn;
    protected final TextField gette;

    public demo2() {

        imageView = new ImageView();
        getBtn = new ImageView();
        gette = new TextField();
        new client();

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

        getBtn.setFitHeight(105.0);
        getBtn.setFitWidth(105.0);
        getBtn.setLayoutX(303.0);
        getBtn.setLayoutY(89.0);
        getBtn.setPreserveRatio(true);
        getBtn.setImage(new Image(getClass().getResource("replay.jpg").toExternalForm()));

        gette.setLayoutX(437.0);
        gette.setLayoutY(102.0);

        getChildren().add(imageView);
        getChildren().add(getBtn);
        getChildren().add(gette);
        
        getBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
              client.ps.println(gette.getText());
                gette.setText("");
            }
        }); 
        

    }
}
