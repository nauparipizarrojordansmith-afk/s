import java.util.Scanner;
public class SalirAlNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduce números (el programa terminará si ingresas un negativo):");
        while (true) {
            System.out.print("Ingresa un número: ");
            numero = teclado.nextInt();
            if (numero < 0) {
                System.out.println("Se detectó un número negativo. ¡Adiós!");
                break;
            }
            System.out.println("Ingresaste: " + numero);
        }
        teclado.close();
    }
}