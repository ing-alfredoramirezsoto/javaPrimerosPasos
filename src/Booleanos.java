public class Booleanos {
    public static void main(String[] args) {

        int edad = 21;
        int cantidadPersonas = 2;

        boolean esPareja = cantidadPersonas > 1;

        if (edad >= 18 && esPareja) {
            System.out.println("Usted puede entrar");
        } else {
            System.out.println("Usted no tiene permiso de entrar");
        }
    }
}
