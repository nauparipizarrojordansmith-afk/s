import java.util.Scanner;
public class ContarVocales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = teclado.nextLine();
        int contadorVocales = 0;
        String textoMinuscula = texto.toLowerCase();
        for (int i = 0; i < textoMinuscula.length(); i++) {
            char caracter = textoMinuscula.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("El texto contiene " + contadorVocales + " vocales.");
        teclado.close();
    }
}