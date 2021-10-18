package appsondeos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import javafx.scene.text.Text;

public class FileHandler 
{
    private FileWriter fw;
    private File file;
    private LocalDate date;
    private LocalTime time;
    private String dateTime;
    private String filename;
    private String filecontent;
    public FileHandler(String tab_name, String tab_toString,Text submitlbl)
    {
        filename = tab_name + ".csv";
        file = new File(filename);
        date = LocalDate.now();
        time = LocalTime.now();
        dateTime = "[" +date.toString() + "//" + time.getHour() + ":" +time.getMinute() + "];";
        filecontent = dateTime + tab_toString;
        
        try
        {
            fw = new FileWriter("Formularios/" + filename, true);
            fw.append(filecontent);
            fw.flush();
            fw.close();
        }catch(IOException e)
        {
            submitlbl.setText("Error al escribir en el fichero");
        }
        submitlbl.setText("Datos almacenados con exito");
    }  
}
