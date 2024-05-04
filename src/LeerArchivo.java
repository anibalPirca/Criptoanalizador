import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LeerArchivo {

    private String texto;

    public LeerArchivo(String rutaArchivo) {
        this.texto = leerTexto(rutaArchivo);
    }

    private String leerTexto(String rutaArchivo) {
        StringBuilder contenido = new StringBuilder();
        try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
            lector.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }

    public String getTexto() {
        return texto;
    }

}
