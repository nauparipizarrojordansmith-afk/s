public class FiltrarCaracteres {
    public static void main(String[] args) {
        String texto = "J2or4d7an 2026! @Prog";
        System.out.println("Texto original: " + texto);
        System.out.print("Solo letras: ");
        for (int i = 0; i < texto.length(); i++) {
            char caracterActual = texto.charAt(i);
            if (Character.isDigit(caracterActual)) {
                continue; 
            }
            System.out.print(caracterActual);
        }
        System.out.println(); 
    }
}