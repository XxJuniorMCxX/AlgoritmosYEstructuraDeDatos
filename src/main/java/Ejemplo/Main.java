package Ejemplo;

import static Ejemplo.MetodosDeBusqueda.metodoInsercion;
import static Ejemplo.MetodosDeBusqueda.metodoSeleccion;
import javax.swing.JOptionPane;

/**
 *
 * @author XxJuniorMxX
 */
public class Main {

    public static void main(String[] args) {
        MetodosDeBusqueda m = new MetodosDeBusqueda();
        for (int i = 0; i <= 2; i++) {
            byte n = Byte.parseByte(JOptionPane.showInputDialog(null, """
                                                                      \tSeleccionar Tipo De Ordenamiento
                                                                      1.-Metodo Burbuja
                                                                      2.-Metodo De Seleccion
                                                                      3.-Metodo De Insercion"""));
            switch (n) {
                case 1:
                    m.metodoBurbuja();
                    System.out.println("");
                    break;
                case 2:
                    metodoSeleccion();
                    System.out.println("");
                    break;
                case 3:
                    metodoInsercion();
                    System.out.println("");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Acaba de Abandonar La Aplicación");
                    System.exit(0);
            }
        }

    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    //Seleccion
//    public static int buscarIdxElementoMin(int[] arreglo, int inicio) {
//        int idxMin = inicio;
//        for (int i = inicio; i < arreglo.length; i++) {
//            if (arreglo[i] < arreglo[idxMin]) {
//                idxMin = i;
//            }
//        }
//        return idxMin;
//    }
//
//    //Metodo De Seleccion
//    public static void metodoSeleccion() {
//        int[] edad = {3, 5, 8, 1, 5};
//
//        System.out.println("\nArreglo Creado De Seleccion");
//        for (int mostrar : edad) {
//            System.out.println(mostrar + " ");
//        }
//        System.out.println("Ordenando con Selecion");
//        sortSeleccion(edad, 0);
//
//        for (int i : edad) {
//            System.out.println(" " + i + " ");
//        }
//    }
//
//    public static int[] sortSeleccion(int[] arreglo, int inicio) {
//        if (inicio >= arreglo.length) {
//            return arreglo;
//        }
//        int min = buscarIdxElementoMin(arreglo, inicio);
//        if (min != inicio) {
//            swap(arreglo, inicio, min);
//        }
//        return sortSeleccion(arreglo, inicio + 1);
//    }
//
////    public static void swap(int arreglo[], int i, int j) {
////        int aux = arreglo[i];
////        arreglo[i] = arreglo[j];
////        arreglo[j] = aux;
////    }
////
////    //Metodo Burbuja
////    public static void metodoBurbuja() {
////        //int[] edad = {3, 5, 8, 1, 5};
////        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Cantidad de Números"));
////        int aux;
////        int[] edad = new int[num];
////        for (int i = 0; i < edad.length; i++) {
////            edad[i] = (int) (Math.random() * 100) + 1;
////        }
////        System.out.println("Arreglo Creado De Burbuja");
////        for (int mostrar : edad) {
////            System.out.print(mostrar + "  ");
////        }
////        System.out.print("\nOrdenando Con Metodo Burbuja\n");
////        sortBubble(edad);
////        for (int i : edad) {
////            System.out.print(i + "  ");
////        }
////    }
////
////    public static int[] sortBubble(int[] arreglo) {
////        for (int i = 0; i < arreglo.length; i++) {
////            for (int j = 0; j < arreglo.length - 1; j++) {
////                if (arreglo[j] > arreglo[j + 1]) {
////                    swap(arreglo, j, j + 1);
////                }
////            }
////        }
////
////        return arreglo;
////    }
////
////    public static int[] sort(int[] arreglo) {
////        for (int i = 0; i < arreglo.length; i++) {
////            for (int j = 0; j < arreglo.length - 1; j++) {
////                if (arreglo[i] < arreglo[i + 1]) {
////                    swap(arreglo, j, j + 1);
////                }
////            }
////        }
////        return arreglo;
////
////    }
////
////    //3.-Metodo Inserccion 
////    public static void metodoInsercion() {
////        int[] edad = {3, 5, 8, 1, 4, 9, 7};
////
////        System.out.println("Arreglo Creado De Inserccion");
////        for (int mostrar : edad) {
////            System.out.println(mostrar + " ");
////        }
////        System.out.println("Ordenando con Insercion");
////        sortInsert(edad);
////
////        for (int i : edad) {
////            System.out.println(" " + i + " ");
////        }
////    }
////
////    public static int[] sortInsert(int[] arreglo) {
////        int i = 1;
////        while (i < arreglo.length) {
////            int j = i;
////            while (j > 0 && arreglo[j - 1] > arreglo[j]) {
////                swap(arreglo, j, j - 1);
////                j -= 1;
////            }
////            i += 1;
////        }
////        return arreglo;
////    }
//
//    
//    
//    public static void ordenar() {
//        String nombre1, nombre2;
//        nombre1 = "Juan";
//        nombre2 = "Rosa";
//        System.out.println(nombre1 + " " + nombre2);
//        String aux = nombre1;
//        nombre1 = nombre2;
//        System.out.println(aux);
//        nombre2 = aux;
//
//        System.out.println(nombre1 + " " + nombre2);
//
//    }
}
