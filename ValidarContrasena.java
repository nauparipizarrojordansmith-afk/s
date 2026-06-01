import java.util.Scanner;
public class ValidarContrasena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String CONTRASENA_CORRECTA = "Java1234";
        String intentoUsuario;
        System.out.println("--- SISTEMA DE SEGURIDAD ---");
        System.out.print("Introduce la contraseña: ");
        intentoUsuario = teclado.nextLine();
        while (!intentoUsuario.equals(CONTRASENA_CORRECTA)) {
            System.out.println("Contraseña incorrecta. Inténtalo de nuevo.");
            System.out.println("----------------------------------------");
            System.out.print("Introduce la contraseña: ");
            intentoUsuario = teclado.nextLine();
        }
        System.out.println(" ¡Acceso concedido! Bienvenido al sistema.");       
        teclado.close();
    }
}