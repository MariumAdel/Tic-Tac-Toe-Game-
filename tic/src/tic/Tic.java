/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import static javafx.stage.StageStyle.TRANSPARENT;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author Ahmed
 */
public class Tic extends Application {
    static int gamePhase;
    static Clip clip;
    Scene scene;
    static Parent root;
    static Stage stage2;
    @Override
    public void start(Stage stage) throws Exception {
         root = new nova5() ;
        
        scene = new Scene(root);
         stage2=new Stage();
         stage2.setResizable(false);
        //StageStyle.UNDECORATED
        stage2.setScene(scene);
        stage2.show();
        music();
    }
     
    
    public static void music() 
{
   try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("song.wav").getAbsoluteFile());
         clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
  }
  catch (Exception e)
  {
      System.out.print(e.toString());
  }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
