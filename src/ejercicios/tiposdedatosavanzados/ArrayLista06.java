package ejercicios.tiposdedatosavanzados;

import java.util.ArrayList;

public class ArrayLista06 {
    public static void main(String[] args) {

        // Crear un ArrayList de tipo int
        ArrayList<Integer> list = new ArrayList<>();
        // Rellenar con bucle for
        for (int i = 1; i < 11; i++) {
            if ( i % 2 != 0 ) {
                list.add(i);
            }
        }
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
