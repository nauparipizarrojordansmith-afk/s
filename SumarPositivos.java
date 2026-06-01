import java.util.Scanner;
public class SumarPositivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0;
        int numero;
        System.out.println("Vas a ingresar 5 números.");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa el número " + i + ": ");
            numero = teclado.nextInt();
            if (numero < 0) {
                System.out.println("Número negativo ignorado.");
                continue; 
            }
            suma += numero; 
        }
        System.out.println("---");
        System.out.println("La suma total de los números positivos es: " + suma);
        teclado.close();
    }
}