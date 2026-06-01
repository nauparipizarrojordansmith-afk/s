import java.util.Scanner;
public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota;
        double sumaNotas = 0;
        int contadorNotas = 0;
        System.out.println("Ingresa las notas de los alumnos (para terminar y calcular, ingresa -1):");
        System.out.print("Ingresa una nota: ");
        nota = teclado.nextDouble();
        while (nota != -1) {
            sumaNotas += nota;      
            contadorNotas++;      
            System.out.print("Ingresa una nota: ");
            nota = teclado.nextDouble();
        }
        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.println("\n--- Resultados ---");
            System.out.println("Total de notas ingresadas: " + contadorNotas);
            System.out.printf("El promedio final es: %.2f\n", promedio);
        } else {
            System.out.println("\nNo se ingresaron notas para calcular el promedio.");
        }       
        teclado.close();
    }
}