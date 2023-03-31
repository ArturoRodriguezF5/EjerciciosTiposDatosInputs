package ejercicios.tiposdedatosavanzados;

import java.util.Vector;

public class VectorrProblema04 {
    public static void main(String[] args) {

        // Creamos un Vector de capacidad default
        Vector<Integer> v = new Vector<>();
        // Imprimimos la capacidad del vector que en este caso es 10.
        System.out.println(v.capacity());
        for (int i = 1; i <= 1000; i++) {
            v.add(i);
        }
        /*
         * El problema es que cuando se crea un vector con capacidad default aparta memeoria, y cada que se rebasa
         * el límite se aparta nueva memoria y se hace copia de los elementos.
         * */
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
