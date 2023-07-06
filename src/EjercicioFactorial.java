public class EjercicioFactorial {
    public static void main(String[] args) {
        int factorial = 1;

        for(int contador = 1; contador <= 10; contador++) {
            factorial *= contador;
            System.out.println("El factorial de " + contador + " es: " + factorial);
        }
    }
}
