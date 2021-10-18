/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4.pkg3.pkg7;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author frang
 */
public class DI_T1A437 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        
        Ellipse circulo = new Ellipse(10,10,100,50);
        circulo.setFill(Color.RED);
        
        circulo.centerXProperty().bind(root.widthProperty().divide(2));
        circulo.centerYProperty().bind(root.heightProperty().divide(2));
        
        circulo.setFill(Color.RED);
  
        FadeTransition movimiento = new FadeTransition(Duration.millis(5000), circulo);
       
        movimiento.setFromValue(1.0);
        movimiento.setToValue(0.1);
        movimiento.setCycleCount(Timeline.INDEFINITE);
        movimiento.setAutoReverse(true);
        circulo.setOnMouseReleased(e->movimiento.play());
        circulo.setOnMousePressed(e->movimiento.pause());
  
        
        Scene scene = new Scene(root, 400, 350);
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        
        
        root.getChildren().add(circulo);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
