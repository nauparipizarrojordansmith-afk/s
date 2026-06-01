public class ContarHastaLimite {
    public static void main(String[] args) {
        int sumaAcumulada = 0;
        int limite = 100;
        System.out.println("Iniciando conteo. El límite de la suma es: " + limite);
        System.out.println("----------------------------------------------");
        for (int i = 1; ; i++) {
            sumaAcumulada += i; 
            System.out.println("Número actual: " + i + " | Suma acumulada: " + sumaAcumulada);
            if (sumaAcumulada > limite) {
                System.out.println("----------------------------------------------");
                System.out.println("¡Alto! La suma (" + sumaAcumulada + ") superó el límite de " + limite + ".");
                System.out.println("El conteo se detuvo en el número: " + i);
                break; 
            }
        }
    }
}