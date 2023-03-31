package ejercicios.tiposdedatosavanzados;

public class DivideCero07 {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        // LLamamos a la funcion.
        try {
            System.out.println(dividePorCero(a, b));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Demo código.");
        }

        }
    static int dividePorCero(int a, int b) throws ArithmeticException {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e ) {
            throw  new ArithmeticException("Esto no puede hacerse." + e.getMessage());
        }
        return result;
        }

}
