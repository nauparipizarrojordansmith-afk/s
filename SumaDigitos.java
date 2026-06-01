import java.util.Scanner;
public class SumaDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
        int numeroOriginal = numero; 
        int suma = 0;
        numero = Math.abs(numero);
        while (numero > 0) {
            int ultimoDigito = numero % 10; 
            suma += ultimoDigito;         
            numero = numero / 10;         
        }        
        System.out.println("La suma de los dígitos de " + numeroOriginal + " es: " + suma);        
        teclado.close();
    }
}