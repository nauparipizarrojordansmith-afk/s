public class PrimerMultiplo {
    public static void main(String[] args) {
        int inicio = 30;
        int fin = 40;
        int primerMultiplo = -1;
        boolean encontrado = false;
        for (int i = inicio; i <= fin; i++) {
            if (i % 7 == 0) {
                primerMultiplo = i;
                encontrado = true;
                break; 
            }
        }
        if (encontrado) {
            System.out.println("El primer múltiplo de 7 entre " + inicio + " y " + fin + " es: " + primerMultiplo);
        } else {
            System.out.println("No se encontraron múltiplos de 7 en el rango especificado.");
        }
    }
}