package ejercicios.tiposdedatosavanzados;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLista05 {
    public static void main(String[] args) {

        // Creamos un ArrayList de tipo String
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        // Copiamos el ArrayList en una LinkedList
        LinkedList<String> lista = new LinkedList<>(list);
        System.out.println("Elementos del ArrayList: ");
        for (String elemento : list) {
            System.out.print(elemento);
        }
        System.out.println("\nElementos de la LinkedList: ");
        for (String ele : lista) {
            System.out.print(ele);
        }
    }
}
