import java.util.Scanner;
import java.util.Random;
public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        int contadorIntentos = 0;
        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("He pensado un número entre 1 y 100. ¿Puedes adivinar cuál es?");
        do {
            System.out.print("Introduce tu número: ");
            intento = teclado.nextInt();
            contadorIntentos++;
            if (intento < numeroSecreto) {
                System.out.println("¡El número secreto es MAYOR!");
            } else if (intento > numeroSecreto) {
                System.out.println("¡El número secreto es MENOR!");
            } else {
                System.out.println("\n¡FELICIDADES! Has adivinado el número.");
                System.out.println("Te tomó " + contadorIntentos + " intentos.");
            }
            System.out.println("------------------------------------");
        } while (intento != numeroSecreto); 
        teclado.close();
    }
}