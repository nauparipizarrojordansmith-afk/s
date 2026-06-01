public class OmitirMultiplos {
    public static void main(String[] args) {
        System.out.println("Imprimiendo números del 1 al 50 (omitiendo múltiplos de 5):");
        System.out.println("-----------------------------------------------------------");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                continue; 
            }
            System.out.print(i + " ");
        }       
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("¡Bucle finalizado!");
    }
}