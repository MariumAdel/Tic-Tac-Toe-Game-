package tic;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class nova3 extends Pane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView var1;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final ImageView backBtn;
    protected final ImageView imageView6;
    protected final ImageView imageView7;
    protected final ImageView imageView8;
    boolean XOflag=true;

    public nova3() {

        imageView = new ImageView();
        imageView0 = new ImageView();
        var1 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        backBtn = new ImageView();
        imageView6 = new ImageView();
        imageView7 = new ImageView();
        imageView8 = new ImageView();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        imageView.setFitHeight(400.0);
        imageView.setFitWidth(600.0);
        imageView.setPickOnBounds(true);
        imageView.setImage(new Image(getClass().getResource("11.jpg").toExternalForm()));

        imageView0.setFitHeight(369.0);
        imageView0.setFitWidth(586.0);
        imageView0.setLayoutX(-77.0);
        imageView0.setLayoutY(27.0);
        imageView0.setPickOnBounds(true);
        imageView0.setImage(new Image(getClass().getResource("back2.jpg").toExternalForm()));

        var1.setFitHeight(100.0);
        var1.setFitWidth(100.0);
        var1.setLayoutX(459.0);
        var1.setLayoutY(27.0);
        var1.setPickOnBounds(true);
        var1.setPreserveRatio(true);
        var1.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView1.setFitHeight(100.0);
        imageView1.setFitWidth(100.0);
        imageView1.setLayoutX(459.0);
        imageView1.setLayoutY(137.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView2.setFitHeight(100.0);
        imageView2.setFitWidth(100.0);
        imageView2.setLayoutX(459.0);
        imageView2.setLayoutY(250.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView3.setFitHeight(100.0);
        imageView3.setFitWidth(100.0);
        imageView3.setLayoutX(250.0);
        imageView3.setLayoutY(250.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView4.setFitHeight(100.0);
        imageView4.setFitWidth(100.0);
        imageView4.setLayoutX(353.0);
        imageView4.setLayoutY(250.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView5.setFitHeight(100.0);
        imageView5.setFitWidth(100.0);
        imageView5.setLayoutX(353.0);
        imageView5.setLayoutY(137.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        backBtn.setFitHeight(43.0);
        backBtn.setFitWidth(106.0);
        backBtn.setLayoutX(29.0);
        backBtn.setLayoutY(322.0);
        backBtn.setPickOnBounds(true);
        backBtn.setPreserveRatio(true);
        backBtn.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        imageView6.setFitHeight(100.0);
        imageView6.setFitWidth(100.0);
        imageView6.setLayoutX(250.0);
        imageView6.setLayoutY(137.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView7.setFitHeight(100.0);
        imageView7.setFitWidth(100.0);
        imageView7.setLayoutX(250.0);
        imageView7.setLayoutY(27.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);
        imageView7.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        imageView8.setFitHeight(100.0);
        imageView8.setFitWidth(100.0);
        imageView8.setLayoutX(353.0);
        imageView8.setLayoutY(27.0);
        imageView8.setPickOnBounds(true);
        imageView8.setPreserveRatio(true);
        imageView8.setImage(new Image(getClass().getResource("blank.jpg").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(var1);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(imageView3);
        getChildren().add(imageView4);
        getChildren().add(imageView5);
        getChildren().add(backBtn);
        getChildren().add(imageView6);
        getChildren().add(imageView7);
        getChildren().add(imageView8);
            ////////////////////////
        backBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                Stage stage = (Stage) backBtn.getScene().getWindow();
    stage.close();
                
                
            }
        }); 
        ////////////////////////
        var1.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                if(XOflag==false){
                var1.setImage(new Image(nova3.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOflag=true  ;}
                else{
                var1.setImage(new Image(nova3.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOflag=false;}
                
                
            }
        }); 
        ////////////////////////
        ////////////////////////
    }
}
