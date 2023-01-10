public class Main {

    public static void main(String[] args) {

        String[] palabras = {"Desde", "ayer", "no", "he", "podido", "ver", "tu", "hermosa", "sonrisa"};

        String texto = "";
        for (int i = 0; i < palabras.length; i++) {
            if (i != palabras.length - 1) texto += palabras[i] + " ";
            else texto += palabras[i] + ".";
        }

        System.out.println(texto);
    }
}