package ejercicios.tiposdedatosavanzados;

import java.util.Vector;

public class Vectorr03 {
    public static void main(String[] args) {

        // Creamos un Vector de tipo double.
        Vector<Double> vector = new Vector<>();

        // Añadimos los valores a la Vector.
        vector.add(21.5d);
        vector.add(22.5d);
        vector.add(23.5d);
        vector.add(24.5d);
        vector.add(25.5d);
        // Eliminamos los elementos 2 y 3.
        vector.remove(1);
        vector.remove(1);
        // Mostramos sus elementos.
        System.out.println(vector);
    }
}
