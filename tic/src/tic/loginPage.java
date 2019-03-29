package tic;
import java.sql.DriverManager;
import java.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
//import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.derby.jdbc.EmbeddedDriver;
import static tic.loginPage.reg_accepted;


public  class loginPage extends Pane {

    static GameDB Obj;
    
    protected final ImageView imageView;
    protected final ImageView loginBtn;
    protected final ImageView regBtn;
    protected final ImageView backBtn;
    protected final ImageView backgroundView;
    protected final ImageView okBtn;
    protected final Text text;
    protected final TextField userName;
    protected final TextField userPass;
    static String playerName;
    static String playerPassword;
    static boolean access_granted;
    static boolean reg_accepted;

    public loginPage() {
        Tic.gamePhase=2;
        reg_accepted=false;
        access_granted=false;
        playerName=new String();
         playerPassword=new String();
        imageView = new ImageView();
        loginBtn = new ImageView();
        regBtn = new ImageView();
        backBtn = new ImageView();
        backgroundView = new ImageView();
        okBtn = new ImageView();
        text = new Text();
        userName = new TextField();
        userPass = new PasswordField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        imageView.setFitHeight(407.0);
        imageView.setFitWidth(610.0);
        imageView.setPickOnBounds(true);
        imageView.setImage(new Image(getClass().getResource("log.jpg").toExternalForm()));

        loginBtn.setFitHeight(44.0);
        loginBtn.setFitWidth(134.0);
        loginBtn.setLayoutX(245.0);
        loginBtn.setLayoutY(249.0);
        loginBtn.setPickOnBounds(true);
        loginBtn.setPreserveRatio(true);
        loginBtn.setImage(new Image(getClass().getResource("login.jpg").toExternalForm()));

        regBtn.setFitHeight(44.0);
        regBtn.setFitWidth(134.0);
        regBtn.setLayoutX(245.0);
        regBtn.setLayoutY(304.0);
        regBtn.setPickOnBounds(true);
        regBtn.setPreserveRatio(true);
        regBtn.setImage(new Image(getClass().getResource("reg.jpg").toExternalForm()));

        backBtn.setFitHeight(44.0);
        backBtn.setFitWidth(134.0);
        backBtn.setLayoutX(32.0);
        backBtn.setLayoutY(326.0);
        backBtn.setPickOnBounds(true);
        backBtn.setPreserveRatio(true);
        backBtn.setImage(new Image(getClass().getResource("back.jpg").toExternalForm()));

        backgroundView.setFitHeight(253.0);
        backgroundView.setFitWidth(308.0);
        backgroundView.setLayoutX(152.0);
        backgroundView.setLayoutY(140.0);
        backgroundView.setPickOnBounds(true);
        backgroundView.setPreserveRatio(true);
        backgroundView.setImage(new Image(getClass().getResource("backyesandno.jpg").toExternalForm()));

        okBtn.setFitHeight(44.0);
        okBtn.setFitWidth(134.0);
        okBtn.setLayoutX(259.0);
        okBtn.setLayoutY(227.0);
        okBtn.setPickOnBounds(true);
        okBtn.setPreserveRatio(true);
        okBtn.setImage(new Image(getClass().getResource("ok.jpg").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.RED);
        text.setLayoutX(149.0);
        text.setLayoutY(203.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Choose another Name");
        text.setWrappingWidth(314.13671875);
        text.setFont(new Font("MV Boli", 27.0));

        userName.setLayoutX(157.0);
        userName.setLayoutY(127.0);
        userName.setPrefHeight(44.0);
        userName.setPrefWidth(295.0);
        userName.setText("name");

        userPass.setLayoutX(158.0);
        userPass.setLayoutY(192.0);
        userPass.setPrefHeight(44.0);
        userPass.setPrefWidth(295.0);
        userPass.setText("password");

        getChildren().add(imageView);
        getChildren().add(loginBtn);
        getChildren().add(regBtn);
        getChildren().add(backBtn);
        getChildren().add(backgroundView);
        getChildren().add(okBtn);
        getChildren().add(text);
        getChildren().add(userName);
        getChildren().add(userPass);
        //////////////////
        backgroundView.setVisible(false);
        okBtn.setVisible(false);
        text.setVisible(false);
        /////////////////////
         Obj = new GameDB();
        Obj.displaygame();
        //////////////////////////////
         loginBtn.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             
             playerName=userName.getText();
             
             playerPassword=userPass.getText();
             
             Obj.login(playerName,playerPassword);
             if(access_granted==true){
                 
//                 try {
//Obj.con.close();   
//                 } catch (SQLException ex) {
//            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
//
//        }
             Parent root = new onlineGameFinal();
             Scene secondScene = new Scene(root);
             Tic.stage2.setScene(secondScene);
             System.out.println(playerName+"c");
             Tic.stage2.show();}
             else{
             backgroundView.setVisible(true);
             okBtn.setVisible(true);
             text.setVisible(true);
             userName.setVisible(false);
             userPass.setVisible(false);
             text.setText("Wrong User name ");
             okBtn.setOnMousePressed((javafx.scene.input.MouseEvent ev) -> {
               backgroundView.setVisible(false);
             okBtn.setVisible(false);
             text.setVisible(false); 
             userName.setVisible(true);
             userPass.setVisible(true);
             });
             
             }
        });
         //////////////////////////////
         regBtn.setOnMousePressed((javafx.scene.input.MouseEvent evt) -> {
             
             playerName=userName.getText();
             
             playerPassword=userPass.getText();
             
             Obj.register(playerName,playerPassword);
             if(reg_accepted==true){
             backgroundView.setVisible(true);
             okBtn.setVisible(true);
             text.setVisible(true);
             userName.setVisible(false);
             userPass.setVisible(false);
             text.setText("user exists ");
             okBtn.setOnMousePressed((javafx.scene.input.MouseEvent ev) -> {
               backgroundView.setVisible(false);
             okBtn.setVisible(false);
             text.setVisible(false); 
             userName.setVisible(true);
             userPass.setVisible(true);
             });   
             }
             else{
             backgroundView.setVisible(true);
             okBtn.setVisible(true);
             text.setVisible(true);
             userName.setVisible(false);
             userPass.setVisible(false);
             text.setText("thank you for reg.");
             okBtn.setOnMousePressed((javafx.scene.input.MouseEvent ev) -> {
               backgroundView.setVisible(false);
             okBtn.setVisible(false);
             text.setVisible(false); 
             userName.setVisible(true);
             userPass.setVisible(true);
             });
             
             }
        });
         //////////////////////
          backBtn.setOnMousePressed(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent evt) {
                           try {
Obj.con.close();   
                 } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);

        }
              Parent root = new nova5();
                Scene secondScene = new Scene(root);
                Tic.stage2.setScene(secondScene);
                Tic.stage2.show();   
                
                Tic.clip.stop();
                }
            
        });
       

    }
}
/////////////////////////////////

 class GameDB  {
 public static Stage stageTest;
    int score;
    int status;
    int i = 1;
    String uname, pass, uname1, uname2, winnerName;

    PreparedStatement createUserTable;
    PreparedStatement createGameTable;
    PreparedStatement createRecordTable;
    PreparedStatement alterGameTable;
    PreparedStatement insertIntoUser;
    PreparedStatement alterPassUser;
    PreparedStatement select;
    PreparedStatement gSelect;

    PreparedStatement register;
    PreparedStatement chkUser;
    PreparedStatement insertScore;
    PreparedStatement oldScore;
    PreparedStatement finishGame;

    ResultSet rs;
    Connection con;

    public GameDB() {
        System.out.println("mariam 3adel");
        try {
            DriverManager.registerDriver(new EmbeddedDriver());
        } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        try {
            con = DriverManager.getConnection("jdbc:derby:~/GameDatabase; create=true");
        } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }

        try {
            createUserTable = con.prepareStatement("CREATE TABLE users ( userName varchar(25) PRIMARY KEY , password varchar(25), score int )");
            createUserTable.executeUpdate();
        } catch (SQLException ex) {
            //Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            createGameTable = con.prepareStatement("CREATE TABLE game (Gid int PRIMARY KEY  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), userName1 varchar(25) , userName2 varchar(25) , status int , winnerName varchar(25))");
            createGameTable.executeUpdate();
        } catch (SQLException ex) {
            //  Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void register(String userName, String password) {
        uname = userName;
        pass = password;
        // String exists;

        try {
            chkUser = con.prepareStatement("SELECT * FROM users  where userName= ? And password = ?");
            chkUser.setString(1, uname);
            chkUser.setString(2, pass);
            rs = chkUser.executeQuery();

            if (rs.next()) {
                loginPage.reg_accepted=true;
                System.out.println("this username already exists please please login");
                
                
            } else {
                loginPage.reg_accepted=false;
                System.out.println("new user");
                insertIntoUser = con.prepareStatement("INSERT INTO users VALUES (? , ? ,0)");
                insertIntoUser.setString(1, uname);
                insertIntoUser.setString(2, pass);
                insertIntoUser.executeUpdate();

            }

        } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void login(String userName, String password) {

        uname = userName;
        pass = password;
        try {
            chkUser = con.prepareStatement("SELECT * FROM users where userName= ? AND password= ? ");
            chkUser.setString(1, uname);
            chkUser.setString(2, pass);
            rs = chkUser.executeQuery();

            if (rs.next()) {
                loginPage.access_granted=true;
                System.out.println("your are successfully logged in");
                //here when the user is logged in the scene of the game is opened and he is now online 
                // and can choose another user to play with ,,
                
            } else {
                loginPage.access_granted=false;
                System.out.println("you are not registered please register");
                //back to registeration page
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int insertScore(String userName, int gameScore) {
        score = gameScore;
        uname = userName;

        int old=0;
        try {
            oldScore = con.prepareStatement("SELECT score FROM users  where userName= ?");
            oldScore.setString(1, uname);
            rs = oldScore.executeQuery();
            rs.next();
            old = rs.getInt("score");
            insertScore = con.prepareStatement("UPDATE users set score = ? where userName= ? ");
            insertScore.setInt(1, (score + old));
            insertScore.setString(2, uname);
            insertScore.executeUpdate();
            try {
                select = con.prepareStatement("SELECT * FROM users");
                rs = select.executeQuery();
                while (rs.next()) {
                    while (i < 4) {

                        System.out.println(rs.getString(i));
                        i++;
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return old+score;
    }

    public void saveGame(String player1, String player2, int gameStatus, String winner) {
        uname1 = player1;
        uname2 = player2;
        status = gameStatus;
        winnerName = winner;

        try {
            finishGame = con.prepareStatement("INSERT INTO game (userName1, userName2, status, winnerName) VALUES (?, ? , ? ,?)");
            finishGame.setString(1, uname1);
            finishGame.setString(2, uname2);
            finishGame.setInt(3, status);
            finishGame.setString(4, winnerName);
            finishGame.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void displaygame() {
            
        try {
            gSelect = con.prepareStatement("SELECT * FROM users");
            rs = gSelect.executeQuery();
            while (rs.next()) {
                //while (i < 4) {

                    System.out.println(rs.getString(1));
                    System.out.println(rs.getString(2));
                    System.out.println(rs.getString(3));
                   // System.out.println(rs.getString(4));
                    //System.out.println(rs.getString(5));
                  //  i++;
                //}
            }
        } catch (SQLException ex) {
            Logger.getLogger(GameDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    
//     public static void main(String[] args) {
//        launch(args);
//        // TODO code application logic here
//        GameDB DbObj = new GameDB();
//        DbObj.displaygame();
//   //   DbObj.login("mariam","1234");
//   //DbObj.register("karim", "4567");
////      DbObj.insertScore("mariam", 5);
////            DbObj.saveGame("maria", "hii", 0, "hii");
////         DbObj.saveGame("rahma", "hossam", 1 , "rahma"); 
//   
//       // DbObj.saveGame("karim", "rahma", 2, "karim");
//        
//       
//    }
    
}
   