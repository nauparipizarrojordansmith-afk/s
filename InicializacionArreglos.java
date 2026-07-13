public class InicializacionArreglos {
    public static void main(String[] args) {
        int[] intArreglo = new int[4];
        double[] doubleArreglo = new double[4];
        char[] charArreglo = new char[4];
        boolean[] booleanArreglo=new boolean[4];
        String[] stringArreglo = new String[4];

        for(int indice=0; indice<4; indice++){
                                System.out.print( intArreglo[indice] + "-" );
        }
        System.out.println();

        for(int indice=0; indice<4; indice++){
            System.out.print( doubleArreglo[indice] + "-" );
        }
        System.out.println();

        for(int indice=0; indice<4; indice++){
            System.out.print( charArreglo[indice] + "-" );
        }
        System.out.println();

        for(int indice=0; indice<4; indice++){
            System.out.print( booleanArreglo[indice] + "-" );
        }
        System.out.println();

        for(int indice=0; indice<4; indice++){
            System.out.print( stringArreglo[indice] + "-" );
        }
        System.out.println();
    }
}