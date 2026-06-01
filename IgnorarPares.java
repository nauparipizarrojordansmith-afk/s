public class IgnorarPares {
    public static void main(String[] args) {
        System.out.println("Números impares del 1 al 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; 
            }
            System.out.println(i);
        }
    }
}