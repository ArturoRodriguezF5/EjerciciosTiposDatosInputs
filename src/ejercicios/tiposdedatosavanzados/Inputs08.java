package ejercicios.tiposdedatosavanzados;

import java.io.*;

public class Inputs08 {
    public static void main(String[] args) {

        //
        try {
            InputStream fileIn = new FileInputStream("nume.txt");
            OutputStream fileOut = new FileOutputStream("copia.txt");
            copiar(fileIn, fileOut);
        } catch (FileNotFoundException e) {
            System.out.println("Error, fichero no encontrado. " + e.getMessage());
        }
    }
    static void copiar(InputStream fileIn, OutputStream fileOut) {

        try {
            int s = fileIn.read();
            while (s != -1) {
                fileOut.write(s);
                s = fileIn.read();
            }
            System.out.println("Copia creada con exito.");
            fileIn.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
