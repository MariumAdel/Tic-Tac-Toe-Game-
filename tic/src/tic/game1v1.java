package tic;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class game1v1 extends Pane {

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

    public game1v1() {

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
        replayBtn.setImage(new Image(getClass().getResource("replay.jpg").toExternalForm()));

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
        ////////////////////////
        backBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                
                Stage stage = (Stage) backBtn.getScene().getWindow();
    stage.close();
                
                
            }
        }); 
        ////////////////////////
        ////////////////////////
        replayBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
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
                
                if(XOFlag=='x' && var1Flag==1){
                var1.setImage(new Image(game1v1.this.getClass().getResource("jerry.jpg"
                ).toExternalForm()));
                XOFlag='o'  ;
                var1Flag=0;
                }
                else if(XOFlag=='o' && var1Flag==1){
                var1.setImage(new Image(game1v1.this.getClass().getResource("tom.jpg"
                ).toExternalForm()));
                XOFlag='x';
                var1Flag=0;
                }
                
                
            }
        }); 
        ////////////////////////

    }
}
