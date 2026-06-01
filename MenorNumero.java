import java.util.Scanner;
public class MenorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int menor = Integer.MAX_VALUE; 
        int contador = 0;
        System.out.println("Ingresa números enteros (el programa termina cuando ingreses 0):");
        do {
            System.out.print("Ingresa un número: ");
            numero = teclado.nextInt();
            if (numero != 0) {
                contador++;
                if (numero < menor) {
                    menor = numero; 
                }
            }
        } while (numero != 0);
        System.out.println("\n--- Fin del programa ---");
        if (contador > 0) {
            System.out.println("El menor número ingresado fue: " + menor);
        } else {
            System.out.println("No se ingresaron números válidos para evaluar.");
        }
        teclado.close();
    }
}