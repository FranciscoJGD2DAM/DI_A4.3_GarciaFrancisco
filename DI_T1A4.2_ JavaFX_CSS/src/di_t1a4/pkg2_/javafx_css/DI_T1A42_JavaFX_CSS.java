/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t1a4.pkg2_.javafx_css;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author usuario
 */
public class DI_T1A42_JavaFX_CSS extends Application {
    
    @Override
    public void start(Stage primaryStage) {
      
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(25 , 25, 25, 25));
   
        Scene scene = new Scene(root, 600, 425);
        Text scenetitle = new Text("Welcome");
        scenetitle.setId("welcome-text");
        
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        
        root.add(scenetitle, 0, 0, 2, 1);
        
        Label userName = new Label("User Name:");
        root.add(userName, 0, 1);
        
        TextField userTextField = new TextField();
        root.add(userTextField, 1 ,1);
        
        
        Label pw = new Label("Password:");
        root.add(pw, 0, 2);
        
        PasswordField pwBox = new PasswordField();
        root.add(pwBox, 1, 2);
        
        Button btn = new Button("Sign in");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        root.add(hbBtn, 1, 4);
        
        final Text actiontarget = new Text();
            root.add(actiontarget, 1, 6);
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent e){
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
            }
        });
        actiontarget.setId("actiontarget");
        
        primaryStage.setTitle("JavaFx Welcome");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(DI_T1A42_JavaFX_CSS.class.getResource("/resources/css/style.css").toExternalForm());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
