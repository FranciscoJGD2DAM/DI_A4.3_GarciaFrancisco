/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4.pkg3.pkg5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import static javafx.scene.input.KeyCode.DOWN;
import static javafx.scene.input.KeyCode.LEFT;
import static javafx.scene.input.KeyCode.RIGHT;
import static javafx.scene.input.KeyCode.UP;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class DI_T1A435 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        Pane root = new Pane();
        
        Text text =new Text(20,20,"A");
        
        text.setFocusTraversable(true);
        
        text.setOnKeyPressed( e ->{
            switch (e.getCode()) {
               
                case UP:
                   text.setY(text.getY() - 10);
                 
                   break;
                case DOWN:
                    text.setY(text.getY() + 10);
                    
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX() + 10);
                
                break;
            }    
            /*
            if (e.getCode().equals(KeyCode.UP)){
                
                text.setY(text.getY() - 5);
            }else if(e.getCode().equals(KeyCode.DOWN)){
                text.setY(text.getY() + 5);
            }
            else if(e.getCode().equals(KeyCode.LEFT)){
                text.setX(text.getX() - 5);
            }
            else if(e.getCode().equals(KeyCode.RIGHT)){
                text.setX(text.getX() + 5);
            }
            */
        });
        
         
        
        
        root.getChildren().add(text);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
