import java.util.Scanner;
public class DecimalABinario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número decimal entero positivo: ");
        int decimal = teclado.nextInt();
        int numeroOriginal = decimal;
        String binario = ""; 
        if (decimal == 0) {
            binario = "0";
        } else {
            while (decimal > 0) {
                int residuo = decimal % 2;     
                binario = residuo + binario;  
                decimal = decimal / 2;   
            }
        }
        System.out.println("El número decimal " + numeroOriginal + " en binario es: " + binario);       
        teclado.close();
    }
}