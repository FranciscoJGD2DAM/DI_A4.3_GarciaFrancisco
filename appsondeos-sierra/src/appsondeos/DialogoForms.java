
package appsondeos;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author jose
 */
public class DialogoForms extends Stage{
    
    public DialogoForms(Stage owner)
    {
        // Llamamos al constructor de la superclase para que cree la escena
        super();
        // Le decimos quien es el propietario del dialogo
        initOwner(owner);
        // Establecemos titulo
        setTitle("Formularios");
        // Le decimos la modalidad del dialogo
        initModality(Modality.APPLICATION_MODAL);
        // Iniciamos el nodo raiz
        BorderPane root = new BorderPane();
        // Creamos la escena
        Scene scene = new Scene(root, 700, 850);
        // Activamos la escena como la escena de al ventana
        setScene(scene);
        
        // Creamos el panel para los tabs
        TabPane panel = new TabPane();
        // Creamos los tabs, le damos nombre y le asignamos su contenido
        Tab deportes = new Tab();
        deportes.setText("Deportes");
        deportes.setContent(new TabDeportes());
        
        Tab animales = new Tab();
        animales.setText("Animales");
        animales.setContent(new TabAnimales());
        
        Tab comidas = new Tab();
        comidas.setText("Comidas");
        comidas.setContent(new TabComidas());
        
        Tab viajes = new Tab();
        viajes.setText("Viajes");
        viajes.setContent(new TabViajes());
        
        Tab lecturas = new Tab();
        lecturas.setText("Lecturas");
        lecturas.setContent(new TabLecturas());
        
        Tab peliculas = new Tab();
        peliculas.setText("Peliculas");
        peliculas.setContent(new TabPeliculas());
        
        Tab musica = new Tab();
        musica.setText("Musica");
        musica.setContent(new TabMusica());
        
        // Añadimos los tabs al panel
        panel.getTabs().addAll(deportes, animales, comidas, viajes, lecturas, peliculas, musica);
        
        // Añadimos estilos
        panel.getStylesheets().add("/resources/css/stylesMain.css");
        
        // Añadimos el panel a la zona superior de la ventana
        root.setTop(panel);
    }
    
}
