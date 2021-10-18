/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4.pkg3.pkg3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.lang.Math;
/**
 *
 * @author frang
 */
public class DI_t1a433 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane root = new GridPane();
        
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25 , 25, 25, 25));
   
        Scene scene = new Scene(root, 320, 250);
        
        Label userName = new Label("Anual Interest Rate:");
        root.add(userName, 0, 1);
        
        TextField userTextField = new TextField();
        root.add(userTextField, 1 ,1);
        userTextField.setAlignment(Pos.CENTER_RIGHT);
        userTextField.addEventHandler(KeyEvent.KEY_TYPED, new FlitroDeNUmeros());
        
        
        Label userName2 = new Label("Number of Years:");
        root.add(userName2, 0, 2);
        
        TextField userTextField2 = new TextField();
        root.add(userTextField2, 1 ,2);
        userTextField2.setAlignment(Pos.CENTER_RIGHT);
        userTextField2.addEventHandler(KeyEvent.KEY_TYPED, new FlitroDeNUmeros());
        
        Label userName3 = new Label("Loan Amount:");
        root.add(userName3, 0, 3);
        
        TextField userTextField3 = new TextField();
        root.add(userTextField3, 1 ,3);
        userTextField3.setAlignment(Pos.CENTER_RIGHT);
        userTextField3.addEventHandler(KeyEvent.KEY_TYPED, new FlitroDeNUmeros());
        
        Label userName4 = new Label("Monthly Payment:");
        root.add(userName4, 0, 4);
        
        TextField userTextField4 = new TextField();
        root.add(userTextField4, 1 ,4);
        userTextField4.setAlignment(Pos.CENTER_RIGHT);
        userTextField4.setText(userTextField.getText());
        userTextField4.getText();
        userTextField4.addEventHandler(KeyEvent.KEY_TYPED, new ManejadorFilter());
        
        Label userName5 = new Label("Total Payment:");
        root.add(userName5, 0, 5);
        
        TextField userTextField5 = new TextField();
        root.add(userTextField5, 1 ,5);
        userTextField5.setAlignment(Pos.CENTER_RIGHT);
        userTextField5.addEventHandler(KeyEvent.KEY_TYPED, new ManejadorFilter());
        
        Button btn = new Button("Calculate");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        root.add(hbBtn, 1, 6);
        
        //btn.setOnAction(Calcula);
        
        primaryStage.setTitle("");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        class Calcula implements EventHandler<ActionEvent> {
        @Override
            public void handle(ActionEvent e) {
                double i = Double.parseDouble(userTextField.getText());
                double n = Double.parseDouble(userTextField2.getText());
                double h = Double.parseDouble(userTextField3.getText());
                double numero = 0;
                double r = 0;
                double m = 0;
                double total = 0;
                
                r = i/(100*12);
                numero = (1+r);
                m = Math.pow(numero,(-12*n));
                m = -m + 1;
                m = (h*r)/m;
                total=(m*12)*n;
                
                m = Math.round(m*100.0)/100.0;
                total = Math.round(total*100.0)/100.0;
                
                
                System.out.println(i);
                System.out.println(n);
                System.out.println(h);
                System.out.println(r);
                System.out.println(m);
                System.out.println(total);
                
                userTextField4.setText(String.valueOf(m));
                userTextField5.setText(String.valueOf(total));
                userTextField5.getText();

            }
        }
        
        btn.setOnAction(new Calcula());
        
    }
      class ManejadorFilter implements EventHandler<KeyEvent> {
      
        @Override
        public void handle(KeyEvent e) {
            String type = e.getEventType().getName();
            String source = e.getSource().getClass().getSimpleName();
            String target = e.getTarget().getClass().getSimpleName();

            //System.out.println("filter: " + type + ", " + source + ", " + target);

            
            e.consume();
            
        }
    } 
    class FlitroDeNUmeros implements EventHandler<KeyEvent> {

        @Override
        public void handle(KeyEvent e) {
            String type = e.getEventType().getName();
            String source = e.getSource().getClass().getSimpleName();
            String target = e.getTarget().getClass().getSimpleName();
                
            System.out.println("Handler: " + type + ", " + source + ", " + target);
                
            if (!Character.isDigit(e.getCharacter().charAt(0))) {
                e.consume();
            }
        }
    } 
      
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
