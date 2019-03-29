package tic;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class loginNetwork extends Pane {

    protected final ImageView imageView;
    protected final ImageView login;
    protected final TextField userName;
    protected final Text text;
    protected final TextField pass;
    protected final Text text0;
    protected final ImageView login1;
    static String playerName;
    static String playerPassword;
    public loginNetwork() {

        imageView = new ImageView();
        login = new ImageView();
        userName = new TextField();
        text = new Text();
        pass = new TextField();
        text0 = new Text();
        login1 = new ImageView();
         playerName=new String();
         playerPassword=new String();

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

        login.setFitHeight(105.0);
        login.setFitWidth(105.0);
        login.setLayoutX(237.0);
        login.setLayoutY(251.0);
        login.setPreserveRatio(true);
        login.setImage(new Image(getClass().getResource("login.jpg").toExternalForm()));

        userName.setLayoutX(326.0);
        userName.setLayoutY(96.0);
        userName.setPrefHeight(39.0);
        userName.setPrefWidth(160.0);

        text.setLayoutX(141.0);
        text.setLayoutY(126.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Name");
        text.setWrappingWidth(148.50781801342964);
        text.setFont(new Font(29.0));

        pass.setLayoutX(326.0);
        pass.setLayoutY(181.0);
        pass.setPrefHeight(39.0);
        pass.setPrefWidth(160.0);

        text0.setLayoutX(141.0);
        text0.setLayoutY(211.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Password");
        text0.setWrappingWidth(148.50781801342964);
        text0.setFont(new Font(29.0));

        login1.setFitHeight(105.0);
        login1.setFitWidth(105.0);
        login1.setLayoutX(237.0);
        login1.setLayoutY(315.0);
        login1.setPreserveRatio(true);
        login1.setImage(new Image(getClass().getResource("reg.jpg").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(login);
        getChildren().add(userName);
        getChildren().add(text);
        getChildren().add(pass);
        getChildren().add(text0);
        getChildren().add(login1);
        //////////////////////////////
         login.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             
             playerName=userName.getText();
             Parent root = new playerChoice2();
             playerPassword=pass.getText();
             Scene secondScene = new Scene(root);
             Tic.stage2.setTitle("Second Stage");
             Tic.stage2.setScene(secondScene);
             System.out.println(playerName+"c");
             Tic.stage2.show();
        });
    }
}
