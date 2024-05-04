public class RecorredorDeLetras {
    private char recorrerLetra(char letraSinEncriptar, int clave) {
        int codigoDeLetraEncriptada = letraSinEncriptar + clave;
        char letraEncriptada = (char) codigoDeLetraEncriptada;
        return letraEncriptada;
    }

    String recorrerLetrasDePalabra(String textoOriginal, int clave){
        StringBuilder creadorDeCadenas = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            char caracterSinEncriptar =  textoOriginal.charAt(i);
            char letraEncriptada = recorrerLetra(caracterSinEncriptar, clave);
            creadorDeCadenas.append(letraEncriptada);
        }
        String textoEncriptado = creadorDeCadenas.toString();
        return textoEncriptado;
    }
}
