import java.util.Scanner;
public class FibonacciWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos términos de la serie de Fibonacci deseas generar?: ");
        int n = teclado.nextInt();
        int a = 0;
        int b = 1;
        int contador = 1;
        System.out.println("Los primeros " + n + " términos de la serie son:");
        while (contador <= n) {
            System.out.print(a + " ");
            int siguiente = a + b; 
            a = b;    
            b = siguiente;      
            contador++;
        }       
        System.out.println(); 
        teclado.close();
    }
}