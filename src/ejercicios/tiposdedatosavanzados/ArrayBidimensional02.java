package ejercicios.tiposdedatosavanzados;

public class ArrayBidimensional02 {
    public static void main(String[] args) {

        // Crear un Array bidimensional.
        Integer[][] array = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

        // Recorremos el Array con un ciclo for mostrando sus indices y sus valores.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Indice: " + i + j + " Valores: " + array[i][j]);
            }
        }
    }
}
