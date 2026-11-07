
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        int[] cargasKg = new int[cant];
    }

    public static int leerCantidad( Scanner sc) {
        int cant = 0;
        do {
            System.out.println("Ingrese la cantidad de cargas:");
            cant = sc.nextInt();
            if (cant <= 0) {
                System.out.println("La cantidad debe ser mayor a cero");
            }
        } while (cant <= 0);
        return cant;
    }

    public static boolean cargasValidas(int cargasKg ) {
        return cargasKg >= 5 && cargasKg <= 200;
    }

    public static void rangoCargas(Scanner sc, int[] cargasKg) {
        int cargasLong = cargasKg.length;
        for (int i = 0; i < cargasLong; i++) {
            do {
                System.out.println("Ingrese el peso de la carga " + (i +1) + " :");
                cargasKg[i] = sc.nextInt();
                if (!cargasValidas(cargasKg[i])) {
                    System.out.println("Cargas no válidas");
                }
            } while (!cargasValidas(cargasKg[i]));
        }
    }

    public static int rango( int[] cargasKg, int minim, int maximo) {
        int cargasLong = cargasKg.length;
        int contador = 0;
        for (int i = 0; i < cargasLong; i++) {
            if (cargasKg >= minimo && cargasKg <= maximo) {
                
            }
        }
    }
}
