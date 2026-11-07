
import java.util.Scanner;

public class MATERIALRECICLAJE {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int cant = leerCantidad(sc);
        int[] cargasKg = new int[cant];
        rangoCargas(sc, cargasKg);
        int menor80 = rango(cargasKg, 5, 80);
        int mayor80 = cargasKg.length - menor80;
        int suma = totalPeso(cargasKg);
        double prom = promedio(cargasKg, suma);
        int mayor = mayorCrgas(cargasKg);
        double mayorPromedio = mayorPromedio(cargasKg, prom);

        mostrarResultados(menor80, mayor80, suma, prom, mayor, mayorPromedio);
        listadoCargas(cargasKg, cant);
        sc.close();
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

    public static int rango( int[] cargasKg, int minimo, int maximo) {
        int cargasLong = cargasKg.length;
        int contador = 0;
        for (int i = 0; i < cargasLong; i++) {
            if (cargasKg[i] >= minimo && cargasKg[i] <= maximo) {
                contador++;
            }
        }
        return contador;
    }
public static int totalPeso( int[] cargasKg) {
    int cargasLong = cargasKg.length;
    int suma = 0;
    for (int i = 0; i < cargasLong; i++) {
        suma += cargasKg[i];
    }
    return suma;
}

public static double promedio( int[] cargasKg, int suma) {
    int prom = 0;
    return prom = suma / cargasKg.length;
}
public static int mayorCrgas( int[] cargasKg) {
    int cargasLong = cargasKg.length;
    int mayor = cargasKg[0];
    for (int i = 0; i < cargasLong; i++) {
        if (cargasKg[i] > mayor) {
            mayor = cargasKg[i];
        }
    }
    return mayor;
}

public static double mayorPromedio( int[] cargasKg, double prom) {
    int cargasLong = cargasKg.length;
    prom = cargasKg[0];
    for (int i = 0; i < cargasLong; i++) {
        if (cargasKg[i] > prom) {
            prom = cargasKg[i];
        }
    }
    return prom;
}

public static void mostrarResultados( int menor80, int mayor80, int suma, double prom, int mayor, double  mayorPromedio) {
    System.out.println("La cantidad de cargas con peso entre 5 y 80 kg: " + menor80);
    System.out.println("La cantidad de cargas con peso mayor a 80 kg: " + mayor80);
    System.out.println("La suma de pesos de las cargas : " + suma);
    System.out.println("El promedio de los pesos es: : " + prom); 
    System.out.println("El mayor peso registrado: " + mayor);
    System.out.println("El peso mayor que el promedio: " + mayorPromedio);

}

public static void listadoCargas( int[] cargasKg, int cant) {
    int cargasLong = cargasKg.length;
    for (int i = 0; i < cargasLong; i++) {
        System.out.println("La carga " + (i + 1) + " :" + cargasKg[i] );
    }
}
}
