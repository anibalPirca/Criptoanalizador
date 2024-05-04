public class DesencriptadorPorFuerzaBruta {

    Desencriptador desencriptador = new Desencriptador();
 String desencriptarPorFuerzaBruta(String textoEncriptado){

     String textoPosiblementeDesencriptado = "nada por aqui";

     for (int i = 1; i <=9 ; i++) {

         textoPosiblementeDesencriptado = desencriptador.desencriptar(textoEncriptado, i);

         boolean contienePalabraEnEspanol =  contieneAlgunaPalabraEnEspanol(textoPosiblementeDesencriptado);
         if(contienePalabraEnEspanol){
             //System.out.println("la clave es : " + i);
             System.out.println("'TEXTO DESENCRIPTADO' : \n" + textoPosiblementeDesencriptado);
         }
     }
     return textoPosiblementeDesencriptado;
 }

  boolean contieneAlgunaPalabraEnEspanol(String texto){
      String[] palabrasEnEspanol = new String[4];
      palabrasEnEspanol[0] = " de ";
      palabrasEnEspanol[1] = " en ";
      palabrasEnEspanol[2] = " el ";
      palabrasEnEspanol[3] = " la ";
      for (int i = 0; i < palabrasEnEspanol.length; i++) {
          if(texto.toLowerCase().contains(palabrasEnEspanol[i])){
              return true;
          }
      }
      return false;
 }

}
