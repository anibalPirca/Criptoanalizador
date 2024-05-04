import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Encriptar");
            System.out.println("2. Desencriptar");
            System.out.println("0. Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    manejarEncriptar(scanner);
                    break;
                case 2:
                    manejarDesencriptar(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 0);
        scanner.close();
        }

        /*
    private static void manejarEncriptar(Scanner scanner) {
        System.out.print("Por favor, ingrese el nombre del archivo a encriptar: ");
        String nombreArchivoOriginal = scanner.next();
        String rutaArchivo = "D:\\" + nombreArchivoOriginal + ".txt";
        LeerArchivo fileReaderHelper = new LeerArchivo(rutaArchivo);
        String textoDelArchivo = fileReaderHelper.getTexto();
        Encriptador encriptador = new Encriptador();
        String textoEncriptado = encriptador.encriptar(textoDelArchivo, 1);
        System.out.println("Texto encriptado: " + textoEncriptado);
    }*/


    private static void manejarEncriptar(Scanner scanner) {
        System.out.print("Por favor, ingrese el nombre del archivo a encriptar (sin extensión): ");
        String nombreArchivoOriginal = scanner.next();
        String rutaArchivo = nombreArchivoOriginal + ".txt";
        LeerArchivo fileReaderHelper = new LeerArchivo(rutaArchivo);
        String textoDelArchivo = fileReaderHelper.getTexto();
        Encriptador encriptador = new Encriptador();
        String textoEncriptado = encriptador.encriptar(textoDelArchivo, 1);
        System.out.println("*****************************************");
        System.out.println("'TEXTO ENCRIPTADO'\n" +textoEncriptado);
        System.out.println("*****************************************");
    }


    private static void manejarDesencriptar(Scanner scanner) {
        System.out.print("Por favor, ingrese el nombre del archivo a desencriptar (sin extensión): ");
        String nommbreArchivoEncriptado = scanner.next();
        //String rutaArchivo = "D:\\" + nombreArchivoEncriptado + ".txt";
        String rutaArchivo = nommbreArchivoEncriptado + ".txt";
        LeerArchivo fileReaderHelper = new LeerArchivo(rutaArchivo);
        String textoDelArchivo = fileReaderHelper.getTexto();
        System.out.println("*****************************************");
        DesencriptadorPorFuerzaBruta desencriptador = new DesencriptadorPorFuerzaBruta();
        desencriptador.desencriptarPorFuerzaBruta(textoDelArchivo);
        System.out.println("*****************************************");
    }
    }

