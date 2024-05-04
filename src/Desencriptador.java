public class Desencriptador {

    RecorredorDeLetras recorredorDeLetras = new RecorredorDeLetras();

    String desencriptar(String textoEncriptado, int clave){
        int claveNegativa = -clave;
        String textoDesencriptado = recorredorDeLetras.recorrerLetrasDePalabra(textoEncriptado, claveNegativa);
       return textoDesencriptado;
    }

}
