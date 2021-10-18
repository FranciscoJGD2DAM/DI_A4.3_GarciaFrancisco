package appsondeos;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 *Anotaciones para el grupo:
 * Sobreescribir el toString() --> que termine en ";\n"
 * Se pasan al filehandler los parametros ("nombre_tab",toString(),nombre_label)
 * No puede haber un togglegroup con ninguna seleccion
 */
public class AppSondeos extends Application {
    
    // Atributos
    Image java = new Image("/resources/images/java.png");
    
    @Override
    public void start(Stage primaryStage) {
        // Establecemos titulo a la ventana
        primaryStage.setTitle("AppSondeos");
        // Establecemos icono de ventana
        primaryStage.getIcons().add(java);
        primaryStage.setResizable(false);
        // Creamos el nodo raiz de la escena que será un grupo
        BorderPane root = new BorderPane();
        // Creamos ID para el root de la ventana principal
        root.setId("Main");
        
        // Creamos el primer menu
        final Menu menu1 = new Menu("Encuestas");
        final Menu menu2 = new Menu("Help");
        
        // Creamos la barra de menu
        MenuBar menuBar = new MenuBar();
        
        // Creamos los objetos del menu encuestas
        MenuItem encuestas = new MenuItem("Encuestas");
        MenuItem salir = new MenuItem("Salir");
        
        // Añadimos los objetos al menu
        menu1.getItems().add(encuestas);
        menu1.getItems().add(salir);
        
        // Añadimos los menus al menuBar
        menuBar.getMenus().addAll(menu1, menu2);
        
        // Añadimos el menuBar al nodo raiz de la escena
        root.setTop(menuBar);
        
        // Creamos la escena con nodo raiz en root
        Scene scene = new Scene(root, 700, 800);
        
        // establecemos el ancho del menuBar en base al ancho de la escena
        //menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        // Ya no hace falta porq es un BorderPane, los objetos se redimensionan para abarcar el ancho
        
        // La escena activa en el escenario será la escena creada
        primaryStage.setScene(scene);
        // Añadimos el estilo a la escena
        //scene.getStylesheets().add(AppSondeos.class.getResource("/resources/css/stylesMain.css").toString());
        scene.getStylesheets().add("/resources/css/stylesMain.css");
        // Mostramos el escenario
        primaryStage.show();
        
        // Al pulsar el menu encuestas se despliega la segunda ventana
        encuestas.setOnAction(e -> {
            Stage formularios = new DialogoForms(primaryStage);
            formularios.setResizable(false);
            formularios.show();
        });
        
        salir.setOnAction(e -> {
            System.exit(0);
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        launch(args);
    }
}
