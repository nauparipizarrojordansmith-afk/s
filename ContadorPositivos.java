import java.util.Scanner;
public class ContadorPositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        int contadorPositivos = 0;
        System.out.println("Introduce números enteros (el programa termina cuando ingreses 0):");
        do {
            System.out.print("Ingresa un número: ");
            numero = teclado.nextInt();
            if (numero > 0) {
                contadorPositivos++; 
            }
        } while (numero != 0); 
        System.out.println("\n--- Fin del programa ---");
        System.out.println("Cantidad de números positivos ingresados: " + contadorPositivos);       
        teclado.close();
    }
}