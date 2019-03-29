package tic;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public abstract class proto extends Pane {

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
    protected final Text opponent;
    protected final Text score;
    protected final Text text;
    protected final Pane pane;
    protected final ImageView imageView0;
    protected final ImageView back;
    protected final ImageView player1;
    protected final Text t1;
    protected final ImageView player2;
    protected final Text t2;
    protected final ImageView player3;
    protected final Text t3;
    protected final ImageView player4;
    protected final Text t4;
    protected final ImageView player5;
    protected final Text t5;
    protected final ImageView player6;
    protected final Text t6;
    protected final ImageView back1;
    protected final Text t11;
    protected final Text oppo;
    protected final ImageView yes;
    protected final ImageView no;
    protected final Pane pane0;
    protected final ImageView bgc;
    protected final ImageView backc;
    protected final ImageView replayc;

    public proto() {

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
        opponent = new Text();
        score = new Text();
        text = new Text();
        pane = new Pane();
        imageView0 = new ImageView();
        back = new ImageView();
        player1 = new ImageView();
        t1 = new Text();
        player2 = new ImageView();
        t2 = new Text();
        player3 = new ImageView();
        t3 = new Text();
        player4 = new ImageView();
        t4 = new Text();
        player5 = new ImageView();
        t5 = new Text();
        player6 = new ImageView();
        t6 = new Text();
        back1 = new ImageView();
        t11 = new Text();
        oppo = new Text();
        yes = new ImageView();
        no = new ImageView();
        pane0 = new Pane();
        bgc = new ImageView();
        backc = new ImageView();
        replayc = new ImageView();

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

        opponent.setLayoutX(43.0);
        opponent.setLayoutY(124.0);
        opponent.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        opponent.setStrokeWidth(0.0);
        opponent.setText("Text");
        opponent.setWrappingWidth(146.9830722808838);

        score.setLayoutX(90.0);
        score.setLayoutY(153.0);
        score.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        score.setStrokeWidth(0.0);
        score.setText("Text");

        text.setLayoutX(43.0);
        text.setLayoutY(153.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Score");

        pane.setMaxHeight(USE_PREF_SIZE);
        pane.setMaxWidth(USE_PREF_SIZE);
        pane.setMinHeight(USE_PREF_SIZE);
        pane.setMinWidth(USE_PREF_SIZE);
        pane.setPrefHeight(400.0);
        pane.setPrefWidth(600.0);

        imageView0.setFitHeight(406.0);
        imageView0.setFitWidth(607.0);
        imageView0.setLayoutX(-1.0);
        imageView0.setLayoutY(-1.0);
        imageView0.setImage(new Image(getClass().getResource("55.jpg").toExternalForm()));

        back.setFitHeight(105.0);
        back.setFitWidth(105.0);
        back.setLayoutX(41.0);
        back.setLayoutY(315.0);
        back.setPreserveRatio(true);
        back.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        player1.setFitHeight(31.0);
        player1.setFitWidth(84.0);
        player1.setLayoutX(357.0);
        player1.setLayoutY(35.0);
        player1.setPreserveRatio(true);
        player1.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t1.setLayoutX(435.0);
        t1.setLayoutY(56.0);
        t1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t1.setStrokeWidth(0.0);
        t1.setText("Text");
        t1.setWrappingWidth(141.6708984375);
        t1.setFont(new Font(15.0));

        player2.setFitHeight(31.0);
        player2.setFitWidth(84.0);
        player2.setLayoutX(357.0);
        player2.setLayoutY(83.0);
        player2.setPreserveRatio(true);
        player2.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t2.setLayoutX(435.0);
        t2.setLayoutY(104.0);
        t2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t2.setStrokeWidth(0.0);
        t2.setText("Text");
        t2.setWrappingWidth(141.6708984375);
        t2.setFont(new Font(15.0));

        player3.setFitHeight(31.0);
        player3.setFitWidth(84.0);
        player3.setLayoutX(357.0);
        player3.setLayoutY(126.0);
        player3.setPreserveRatio(true);
        player3.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t3.setLayoutX(435.0);
        t3.setLayoutY(147.0);
        t3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t3.setStrokeWidth(0.0);
        t3.setText("Text");
        t3.setWrappingWidth(141.6708984375);
        t3.setFont(new Font(15.0));

        player4.setFitHeight(31.0);
        player4.setFitWidth(84.0);
        player4.setLayoutX(357.0);
        player4.setLayoutY(171.0);
        player4.setPreserveRatio(true);
        player4.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t4.setLayoutX(435.0);
        t4.setLayoutY(192.0);
        t4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t4.setStrokeWidth(0.0);
        t4.setText("Text");
        t4.setWrappingWidth(141.6708984375);
        t4.setFont(new Font(15.0));

        player5.setFitHeight(31.0);
        player5.setFitWidth(84.0);
        player5.setLayoutX(357.0);
        player5.setLayoutY(216.0);
        player5.setPreserveRatio(true);
        player5.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t5.setLayoutX(435.0);
        t5.setLayoutY(237.0);
        t5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t5.setStrokeWidth(0.0);
        t5.setText("Text");
        t5.setWrappingWidth(141.6708984375);
        t5.setFont(new Font(15.0));

        player6.setFitHeight(31.0);
        player6.setFitWidth(84.0);
        player6.setLayoutX(357.0);
        player6.setLayoutY(263.0);
        player6.setPreserveRatio(true);
        player6.setImage(new Image(getClass().getResource("btnp.jpg").toExternalForm()));

        t6.setLayoutX(435.0);
        t6.setLayoutY(284.0);
        t6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t6.setStrokeWidth(0.0);
        t6.setText("Text");
        t6.setWrappingWidth(141.6708984375);
        t6.setFont(new Font(15.0));

        back1.setFitHeight(179.0);
        back1.setFitWidth(347.0);
        back1.setLayoutX(130.0);
        back1.setLayoutY(106.0);
        back1.setPreserveRatio(true);
        back1.setImage(new Image(getClass().getResource("backyesandno.jpg").toExternalForm()));

        t11.setLayoutX(167.0);
        t11.setLayoutY(158.0);
        t11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        t11.setStrokeWidth(0.0);
        t11.setText("Do you want to play with");
        t11.setWrappingWidth(189.6708984375);
        t11.setFont(new Font(15.0));

        oppo.setLayoutX(338.0);
        oppo.setLayoutY(158.0);
        oppo.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        oppo.setStrokeWidth(0.0);
        oppo.setText("text");
        oppo.setWrappingWidth(189.6708984375);
        oppo.setFont(new Font(15.0));

        yes.setFitHeight(31.0);
        yes.setFitWidth(84.0);
        yes.setLayoutX(178.0);
        yes.setLayoutY(201.0);
        yes.setPreserveRatio(true);
        yes.setImage(new Image(getClass().getResource("yes.jpg").toExternalForm()));

        no.setFitHeight(31.0);
        no.setFitWidth(84.0);
        no.setLayoutX(368.0);
        no.setLayoutY(201.0);
        no.setPreserveRatio(true);
        no.setImage(new Image(getClass().getResource("no.jpg").toExternalForm()));

        pane0.setMaxHeight(USE_PREF_SIZE);
        pane0.setMaxWidth(USE_PREF_SIZE);
        pane0.setMinHeight(USE_PREF_SIZE);
        pane0.setMinWidth(USE_PREF_SIZE);
        pane0.setPrefHeight(400.0);
        pane0.setPrefWidth(600.0);

        bgc.setFitHeight(406.0);
        bgc.setFitWidth(607.0);
        bgc.setImage(new Image(getClass().getResource("twin.jpg").toExternalForm()));

        backc.setFitHeight(51.0);
        backc.setFitWidth(105.0);
        backc.setLayoutX(33.0);
        backc.setLayoutY(305.0);
        backc.setPreserveRatio(true);
        backc.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        replayc.setFitHeight(51.0);
        replayc.setFitWidth(105.0);
        replayc.setLayoutX(443.0);
        replayc.setLayoutY(45.0);
        replayc.setPreserveRatio(true);
        replayc.setImage(new Image(getClass().getResource("replay.jpg").toExternalForm()));

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
        getChildren().add(opponent);
        getChildren().add(score);
        getChildren().add(text);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(back);
        pane.getChildren().add(player1);
        pane.getChildren().add(t1);
        pane.getChildren().add(player2);
        pane.getChildren().add(t2);
        pane.getChildren().add(player3);
        pane.getChildren().add(t3);
        pane.getChildren().add(player4);
        pane.getChildren().add(t4);
        pane.getChildren().add(player5);
        pane.getChildren().add(t5);
        pane.getChildren().add(player6);
        pane.getChildren().add(t6);
        pane.getChildren().add(back1);
        pane.getChildren().add(t11);
        pane.getChildren().add(oppo);
        pane.getChildren().add(yes);
        pane.getChildren().add(no);
        getChildren().add(pane);
        pane0.getChildren().add(bgc);
        pane0.getChildren().add(backc);
        pane0.getChildren().add(replayc);
        getChildren().add(pane0);

    }
}
