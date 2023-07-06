public class CadenasCaracteres {
    public static void main(String[] args) {

        char caracter = 'a'; // Usamos comillas simples para caracteres
        System.out.println(caracter);

        caracter = 97; // Podemos asignar un valor numérico de la tabla ASCII
        System.out.println(caracter);

        caracter = 65 + 1;
        char segundoCaracter = (char)(caracter + 1);
        System.out.println(segundoCaracter);

        String cadena = "Hola Mundo"; // Usamos comillas dobles para cadenas
        System.out.println(cadena);

        cadena = "Hola " + "Mundo"; // Podemos concatenar cadenas
        System.out.println(cadena);
    }
}
