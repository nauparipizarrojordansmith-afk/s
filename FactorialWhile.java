import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int numero = teclado.nextInt();
        int copiaNumero = numero; 
        long factorial = 1;  
        while (numero > 1) {
            factorial *= numero;  
            numero--;     
        }
        System.out.println("El factorial de " + copiaNumero + " es: " + factorial);       
        teclado.close();
    }
}