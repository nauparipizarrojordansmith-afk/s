public class ArregloEnteros {
    public static void main(String[] args) {
        int[] numeros = new int[5];

        for(int indice=0; indice<5; 
                    indice=indice+1){
            System.out.println("Índice: "+ indice  + ", Valor: " + numeros[indice]);
        }
        System.out.println();

        numeros[0] = 10;
        numeros[1] = 30;
        numeros[2] = 50;
        numeros[3] = 70;
        numeros[4] = 90;

        for(int indice=0; indice<5; indice++ ){
            System.out.println("Índice: "+ indice + ", Valor: " + numeros[indice]);
        }
    }
} 