public class Encriptador {

    RecorredorDeLetras recorredorDeLetras = new RecorredorDeLetras();
    String encriptar(String textoSinEncriptar, int clave){
            String textoEncriptado = recorredorDeLetras.recorrerLetrasDePalabra(textoSinEncriptar, clave);
        //System.out.println("clave utilizada : " + clave);
            return textoEncriptado;
        }
}
