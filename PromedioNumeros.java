import java.util.Scanner;
public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas ingresar?: ");
        int n = teclado.nextInt();
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingresa el valor " + i + ": ");
            double valor = teclado.nextDouble();
            suma += valor;
        }
        double promedio = (n > 0) ? (suma / n) : 0;
        System.out.println("\nEl promedio de los " + n + " números es: " + promedio);
        teclado.close();
    }
}