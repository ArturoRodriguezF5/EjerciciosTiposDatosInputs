package ejercicios.tiposdedatosavanzados;

public class EjercicioReverse {
    public static void main(String[] args) {

        String texto = "hola mundo";
        // Imprimimos y la cadena que retorna la función Reverse
        System.out.println("Palabra en reversa: " + reverse(texto));
    }

    /**
     * Reverse funtion is used to reverse the text
     * @param texto
     * @return
     */
    static String reverse(String texto) {
        StringBuilder pal = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            pal.append(texto.charAt(i));
        }
        return pal.toString();
    }
}
