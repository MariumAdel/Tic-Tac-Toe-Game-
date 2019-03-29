package tic;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public  class GameLayout extends Pane {

    protected final ImageView imageView;
    protected final Button bt;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final ImageView imageView6;
    protected final ImageView imageView7;

    public GameLayout() {

        imageView = new ImageView();
        bt = new Button();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();
        imageView7 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        imageView.setFitHeight(100.0);
        imageView.setFitWidth(100.0);
        imageView.setLayoutX(459.0);
        imageView.setLayoutY(27.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        bt.setLayoutX(31.0);
        bt.setLayoutY(337.0);
        bt.setMnemonicParsing(false);
        bt.setText("Button");

        imageView0.setFitHeight(100.0);
        imageView0.setFitWidth(100.0);
        imageView0.setLayoutX(459.0);
        imageView0.setLayoutY(137.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView1.setFitHeight(100.0);
        imageView1.setFitWidth(100.0);
        imageView1.setLayoutX(459.0);
        imageView1.setLayoutY(250.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView2.setFitHeight(100.0);
        imageView2.setFitWidth(100.0);
        imageView2.setLayoutX(250.0);
        imageView2.setLayoutY(250.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView3.setFitHeight(100.0);
        imageView3.setFitWidth(100.0);
        imageView3.setLayoutX(353.0);
        imageView3.setLayoutY(250.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView4.setFitHeight(100.0);
        imageView4.setFitWidth(100.0);
        imageView4.setLayoutX(353.0);
        imageView4.setLayoutY(137.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView5.setFitHeight(100.0);
        imageView5.setFitWidth(100.0);
        imageView5.setLayoutX(250.0);
        imageView5.setLayoutY(137.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView6.setFitHeight(100.0);
        imageView6.setFitWidth(100.0);
        imageView6.setLayoutX(250.0);
        imageView6.setLayoutY(27.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView7.setFitHeight(100.0);
        imageView7.setFitWidth(100.0);
        imageView7.setLayoutX(353.0);
        imageView7.setLayoutY(27.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);
        imageView7.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(bt);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(imageView3);
        getChildren().add(imageView4);
        getChildren().add(imageView5);
        getChildren().add(imageView6);
        getChildren().add(imageView7);
        ////////////////////////
        bt.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage stage = (Stage) bt.getScene().getWindow();
    stage.close();
            }
        });

    }
}
