/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4.pkg3.pkg1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class DI_T1A431 extends Application {
    
        
    @Override
    public void start(Stage primaryStage) {
        
        
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        
        
        root.setPadding (new Insets(10, 10, 10, 10));

     
        
        // Creando un círculo y activando sus propiedades
        Circle circle = new Circle(150);

        root.setCenter(circle);
        
        

        
        //DoubleProperty --> Informar del cambio en el valor ,bind --> Enlazar el valor a otro campo del mismo tipo
       
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        
        //botones
        Button aumenta = new Button("Aumenta");
        Button disminuye = new Button("Disminuye");
        
        HBox alineacion = new HBox(10);
        alineacion.setAlignment(Pos.BOTTOM_CENTER);
        alineacion.getChildren().add(aumenta);
        alineacion.getChildren().add(disminuye);
        
        root.setBottom(alineacion);
         
        aumenta.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                circle.setRadius(circle.getRadius() + 10);
            }
        });
        disminuye.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                circle.setRadius(circle.getRadius() - 10);
            }
        });
        
        
        primaryStage.show();
    
    }
  
    
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
