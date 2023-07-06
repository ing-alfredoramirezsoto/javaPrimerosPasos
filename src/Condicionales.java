public class Condicionales {
    public static void main(String[] args) {

        int edad = 17;
        int cantidad = 2;

        if (edad >= 18) {
            System.out.println("Usted puede entrar");
        } else {
            if (cantidad >= 2) {
                System.out.println("Usted es menor de edad, pero puede entrar con su acompañante");
            } else {
                System.out.println("Usted no tiene permiso de entrar");
            }
        }
    }
}
