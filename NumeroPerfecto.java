import java.util.Scanner;
public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número para verificar si es perfecto: ");
        int numero = teclado.nextInt();
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        if (sumaDivisores == numero && numero > 0) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " NO es un número perfecto.");
        }       
        teclado.close();
    }
}