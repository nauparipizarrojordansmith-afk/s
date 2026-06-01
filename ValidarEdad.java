import java.util.Scanner;
public class ValidarEdad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        while (true) {
            System.out.print("Por favor, introduce tu edad (debe ser entre 18 y 80 años): ");
            edad = teclado.nextInt();
            if (edad < 18 || edad > 80) {
                System.out.println("Error: Edad no válida. Inténtalo de nuevo.");
                continue; 
            }
            break; 
        }
        System.out.println("¡Edad registrada con éxito! Tu edad es: " + edad);
        teclado.close();
    }
}