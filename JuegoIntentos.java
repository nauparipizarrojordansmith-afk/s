import java.util.Scanner;
public class JuegoIntentos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String CLAVE_CORRECTA = "Jordan777";
        int maxIntentos = 3;
        boolean accesoConcedido = false;
        System.out.println("=== SISTEMA DE ACCESO ===");
        for (int intento = 1; intento <= maxIntentos; intento++) {
            System.out.print("Intento [" + intento + "/" + maxIntentos + "] - Ingresa la clave: ");
            String claveIngresada = teclado.next();
            if (claveIngresada.equals(CLAVE_CORRECTA)) {
                accesoConcedido = true;
                break; 
            }
            System.out.println("Clave incorrecta.");
        }
        System.out.println("-------------------------");
        if (accesoConcedido) {
            System.out.println("¡Acceso concedido! Bienvenido al sistema.");
        } else {
            System.out.println("Se han agotado los 3 intentos. Cuenta bloqueada.");
        }
        teclado.close();
    }
}