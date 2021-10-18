/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4.pkg3.pkg8;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import com.sun.javafx.perf.PerformanceTracker;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;


/**
 *
 * @author frang
 */
public class DI_T1A438 extends Application {
    
    private static double desplazamientoX = ((Math.random()-0.5)*10);
    private static double desplazamientoY = ((Math.random()-0.5)*10);

    
    @Override
    public void start(Stage primaryStage) {
    
        Group grupo = new Group();
        Scene scene = new Scene(grupo, 300, 300);
        
        Circle circulo = new Circle(10);
        
        circulo.setTranslateX(300 * 0.5);
        circulo.setTranslateY(250 * 0.5);
        circulo.setFill(Color.BLACK);
        
        Label label = new Label();
        label.setTranslateX(10);
        label.setTranslateY(10);
        
        
        grupo.getChildren().addAll(circulo,label);

        
        EventHandler<ActionEvent> eH = e->{
            
            
            PerformanceTracker perfomance = PerformanceTracker.getSceneTracker(scene);
            
            label.setText("FPS (Timeline) = "+ perfomance.getInstantFPS());
        
            if(circulo.getTranslateX()< 0 || circulo.getTranslateX()> 300)
            {
                desplazamientoX*=-1;
            }else if(circulo.getTranslateY()< 0 || circulo.getTranslateY()> 300)
            {
                desplazamientoY*=-1;
            }
            circulo.setTranslateX(circulo.getTranslateX()+desplazamientoX);
            circulo.setTranslateY(circulo.getTranslateY()+desplazamientoY);  
        };
        
        Timeline movimiento = new Timeline(new KeyFrame(Duration.millis(800),eH));
        movimiento.setCycleCount(Timeline.INDEFINITE);
        movimiento.play();        
        
        
        
        
        primaryStage.setTitle("Hello World!");
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
