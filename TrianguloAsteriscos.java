import java.util.Scanner;
public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el número de filas para el triángulo: ");
        int filas = teclado.nextInt();
        System.out.println("\n--- Tu Triángulo ---");
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("^"); 
            }
            System.out.println();
        }
        teclado.close();
    }
}