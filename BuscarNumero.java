import java.util.Scanner;
public class BuscarNumero {
    public static void main(String[] args) {
        int[] numeros = {12, 45, 78, 5, 23, 90, 32};
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número que deseas buscar: ");
        int numeroBuscado = teclado.nextInt();
        boolean encontrado = false;
        int posicion = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                encontrado = true;
                posicion = i; 
                break;        
            }
        }
        if (encontrado) {
            System.out.println("¡Número encontrado! Está en la posición (índice): " + posicion);
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
        teclado.close();
    }
}