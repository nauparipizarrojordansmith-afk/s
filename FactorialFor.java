import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = teclado.nextInt();
        long factorial = 1; 
        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        teclado.close();
    }
}