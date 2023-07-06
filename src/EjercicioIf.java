public class EjercicioIf {
    public static void main(String[] args) {
        double valorCompra = 299.99;

        if (valorCompra >= 100.0 && valorCompra < 200.0) {
            System.out.println("Su descuento es del 10%, el total a pagar es de: $ " + (valorCompra * 0.9));
        } else if (valorCompra >= 200.0 && valorCompra < 300.0) {
            System.out.println("Su descuento es del 15%, el total a pagar es de: $ " + (valorCompra * 0.85));
        } else if (valorCompra >= 300.0) {
            System.out.println("Su descuento es del 20%, el total a pagar es de: $ " + (valorCompra * 0.8));
        } else {
            System.out.println("No aplica descuento, el total a pagar es de: $ " + valorCompra);
        }
    }
}
