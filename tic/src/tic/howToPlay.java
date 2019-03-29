package tic;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public  class howToPlay extends Pane {

    protected final ImageView imageView;
    protected final ImageView backBtn;
    protected final Text text;

    public howToPlay() {

        imageView = new ImageView();
        backBtn = new ImageView();
        text = new Text();

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

        backBtn.setFitHeight(105.0);
        backBtn.setFitWidth(105.0);
        backBtn.setLayoutX(33.0);
        backBtn.setLayoutY(299.0);
        backBtn.setPreserveRatio(true);
        backBtn.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        text.setLayoutX(44.0);
        text.setLayoutY(64.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("MAKE ROW OR COLUMN OR DIAGONAL LINE OF 3 X's OR 3 O's TO WIN");
        text.setWrappingWidth(497.9830722808838);

        getChildren().add(imageView);
        getChildren().add(backBtn);
        getChildren().add(text);
        ////////////
         backBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
              Parent root = new nova5();
                Scene secondScene = new Scene(root);
                Tic.stage2.setScene(secondScene);
                Tic.stage2.show();   
                Tic.clip.stop();
                }
            
        });

    }
}
