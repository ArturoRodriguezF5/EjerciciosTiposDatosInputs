package ejercicios.tiposdedatosavanzados;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Sorprender09 {
    public static void main(String[] args) {

        // Creamos un ArrayList de tipo Integer
        ArrayList<Integer> numes = new ArrayList<>();
        /*
         * 1. Cargamos el fichero nume.txt
         * 2. Pasamos lo que contiene el archivo al ArrayList
         * 3. Cerramos el archivo
         * 4. Si no encuentra el archivo manda la Exception
         */
        try {
            InputStream inputStream = new FileInputStream("nume.txt");
            System.out.println("Fichero encontrado.");
            try {
                int dato = inputStream.read();
                while (dato != -1) {
                    numes.add(dato);
                    dato = inputStream.read();
                }
                inputStream.close();
            } catch (IOException e ) {
                System.out.println("Error" + e.getMessage());
            }
            System.out.println(numes);
        } catch (FileNotFoundException e) {
            System.out.println("Error al cargar fichero." + e.getMessage());
        }
        // Creamos un HashMap y lo llenamos con los datos del ArrayList nume
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 1; i < numes.size() -1; i++) {
            map.put(i, numes.get(i).toString());
        }
        /*
         * 1. Creamos un fichero de salida
         * 2. Recorremos el mapa y al mismo tiempo escribimos los datos en el fichero
         * 3. Cerramos el archivo.
         */
        try {
            OutputStream outputStream = new FileOutputStream("salidaDelMapa.txt");
                try {
                    for (int i = 1; i < map.size() -1; i++) {
                    outputStream.write(map.get(i).getBytes());
                    }
                    outputStream.close();
                    System.out.println("Fichero salidaDelMap.txt, creado con éxito.");
                } catch (IOException e) {
                    System.out.println("Error." + e.getMessage());
                }

        } catch (FileNotFoundException e) {
            System.out.println("Error." + e.getMessage());
        }

    }
}
