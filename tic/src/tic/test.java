package tic;

import static java.lang.Thread.sleep;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public  class test extends Pane {

    protected final ImageView no;
    static Text myText;

    public test() {

        no = new ImageView();
        myText = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        no.setFitHeight(410.0);
        no.setFitWidth(610.0);
        no.setLayoutX(-5.0);
        no.setLayoutY(-7.0);
        no.setImage(new Image(getClass().getResource("jwin.jpg").toExternalForm()));

        myText.setFill(javafx.scene.paint.Color.valueOf("#eeff00"));
        myText.setLayoutX(286.0);
        myText.setLayoutY(73.0);
        myText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        myText.setStrokeWidth(0.0);
        myText.setText("Jerry Win - X");
        myText.setWrappingWidth(288.13671875);
        myText.setFont(new Font("MV Boli", 37.0));

        getChildren().add(no);
        getChildren().add(myText);
        new rand();

    }
}

////////////////
class rand extends Thread
{
Random rand = new Random(); 
Integer value = new Integer(0); 
Integer checkValue = new Integer(0); 
int ar[] = {2,1,5};
boolean existFlag=false;
public rand() 
{
   
    start();
        }
public void run()
{
    while(true){
    checkValue=value;
    value = rand.nextInt(5)+1;
    for(int i=0;i<ar.length;i++){
    if(value==ar[i]){existFlag=false;break;}else{existFlag=true;}
    }
    while(checkValue==value || existFlag==false )
    {value = rand.nextInt(5)+1;
     for(int i=0;i<ar.length;i++){
    if(value==ar[i]){existFlag=false;break;}else{existFlag=true;}
    }   
    
    }
        
        
        test.myText.setText(value.toString());
         try{
        sleep(800);
        
        }catch (Exception ex) {
             System.out.println(ex);                }
            
        }}
               
}