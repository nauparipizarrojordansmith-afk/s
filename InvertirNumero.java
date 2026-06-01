import java.util.Scanner;
public class InvertirNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();
        int numeroOriginal = numero;
        int numeroInvertido = 0;
        while (numero != 0) {
            int ultimoDigito = numero % 10;               
            numeroInvertido = (numeroInvertido * 10) + ultimoDigito;
            numero = numero / 10;                           
        }
        System.out.println("El número " + numeroOriginal + " invertido es: " + numeroInvertido);       
        teclado.close();
    }
}