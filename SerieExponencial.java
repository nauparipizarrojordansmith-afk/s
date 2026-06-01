import java.util.Scanner;
public class SerieExponencial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el valor de x: ");
        double x = teclado.nextDouble();
        System.out.print("Ingresa el valor máximo del exponente (n): ");
        int n = teclado.nextInt();
        double suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += Math.pow(x, i);
        }
        System.out.println("\nEl resultado de la serie exponencial es: " + suma);
        teclado.close();
    }
}