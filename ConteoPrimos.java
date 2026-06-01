public class ConteoPrimos {
    public static void main(String[] args) {
        int inicio = 1;
        int fin = 100;
        int contadorPrimos = 0;
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                contadorPrimos++; 
            }
        }
        System.out.println("Entre " + inicio + " y " + fin + " hay " + contadorPrimos + " números primos.");
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true;
    }
}