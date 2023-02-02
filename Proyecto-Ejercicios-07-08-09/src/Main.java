import javax.print.attribute.standard.Finishings;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

//        // FUNCION REVERSE
//        String newTexto = reverse("Hola, mucho gusto!!");
//        System.out.println(newTexto);
//
//
//        // N°1 ----------------------------
//        String arrayUni[] = {
//                "Brasil",
//                "Perú",
//                "Argentina",
//                "Colombia",
//                "Ecuador"
//        };
//
//        for (String element : arrayUni) {
//            System.out.println(element);
//        }
//
//
//        // N°2 ------------------------------
//        int arrayBi[][] = new int[2][5];
//        arrayBi[0][0] = 1;
//        arrayBi[0][1] = 2;
//        arrayBi[0][2] = 3;
//        arrayBi[0][3] = 4;
//        arrayBi[0][4] = 5;
//
//        arrayBi[1][0] = 14;
//        arrayBi[1][1] = 34;
//        arrayBi[1][2] = 72;
//        arrayBi[1][3] = 23;
//        arrayBi[1][4] = 53;
//
//        for (int i = 0; i < arrayBi.length; i++) {
//            for (int j = 0; j < arrayBi[i].length; j++) {
//                System.out.println("Este elemento se encuentra en la posición: " + i + ", valor: " + j);
//            }
//        }
//
//
//        // N°3 --------------------------------
//        Vector<String> vector = new Vector(1,5);
//        vector.add("perro");
//        vector.add("gato");
//        vector.add("canario");
//        vector.add("tortuga");
//        vector.add("iguana");
//        System.out.println("Datos del vector: " + vector);
//
//        vector.remove(2);
//        vector.remove(1);
//
//        System.out.println("Datos actualizado del vector: " + vector);
//
//
//        // N°4: Esta vector se dupiclaria cada vez que el vector sobrepase su capacidad, esto haria que el procesamiento del proceso incremente y este demore más.
//
//
//        // N°5 ------------------------------------------
//        ArrayList<String> lista = new ArrayList<String>();
//        lista.add("oro");
//        lista.add("plata");
//        lista.add("mercurio");
//        lista.add("magnesio");
//
//        System.out.println("Elementos del ArrayList:");
//        for (String elemento : lista) {
//            System.out.print(elemento + " ");
//        }
//
//        LinkedList<String> linkList = new LinkedList<String>(lista);
//
//        System.out.println("Elementos de la linkedList:");
//        for (String element : linkList) {
//            System.out.print(element + " ");
//        }
//
//
//        // N°6 ----------------------------------------
//        ArrayList<Integer> listaIn = new ArrayList<Integer>();
//        int a = 1;
//        while (listaIn.size() < 10) {
//            listaIn.add(a);
//            a++;
//        }
//        System.out.println(listaIn);
//
//        for (int i = 0; i < listaIn.size(); i++) {
//            if (listaIn.get(i) % 2 == 0) {
//                listaIn.remove(i);
//            }
//        }
//        System.out.println(listaIn);
//
//
//        // N°7
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingresar números: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        try {
//            System.out.println(dividir(a, b));
//        } catch (ArithmeticException e) {
//            System.out.println("Esto no puede hacerse");
//        } finally {
//            System.out.println("Demo de código");
//        }
//
//
//        // N°8
//        Scanner escanear = new Scanner(System.in);
//        System.out.print("Copiar el fichero: ");
//        String fileIn = escanear.nextLine();
//        System.out.print("A este fichero: ");
//        String fileOut = escanear.nextLine();
//        copiarFichero(fileIn, fileOut);


        // N°9 ----------------------------------------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos");
        System.out.print("Ingrese el fichero de origen: ");
        String fileIn = scanner.nextLine();
        System.out.print("Ingrese el fichero de destino: ");
        String fileOut = scanner.nextLine();
        archivar(fileIn, fileOut);

        HashMap<String, String> coleccion = new HashMap<>();
        coleccion.put(fileIn, fileOut);

        Object[] objArray = coleccion.entrySet().toArray();

        System.out.println(Arrays.toString(objArray));

    }


    // N°9 ----------------------------------------
    public static void archivar(String archivo, String duplicado) {

        try {
            InputStream file = new FileInputStream(archivo);
            byte[] datos = file.readAllBytes();
            file.close();

            PrintStream copy = new PrintStream(duplicado);
            copy.write(datos);
            copy.close();
            System.out.println("El fichero se copio correctamente");


        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }


//    public static void copiarFichero(String fileIn, String fileOut) throws FileNotFoundException {
//
//        try {
//            InputStream ingresaFichero = new FileInputStream(fileIn);
//            byte[] datos = ingresaFichero.readAllBytes();
//            ingresaFichero.close();
//
//            PrintStream sacarFichero = new PrintStream(fileOut);
//            sacarFichero.write(datos);
//            sacarFichero.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }


//    public static int dividir(int x, int y) throws ArithmeticException {
//
//        return x / y;
//    }


//    public static String reverse(String texto) {
//
//        String textoInvertido = "";
//        for (int i = 0; i < texto.length(); i++) {
//            textoInvertido = texto.charAt(i) + textoInvertido;
//        }
//        return textoInvertido;
//    }
}


