public class IVA {

    public static void main(String[] args) {

        double monto = 12345.47;
        System.out.println("El monto es: " + monto);

        double montoIVA = precioIVA(monto);
        System.out.println("El monto de IVA: " + montoIVA);

        double montoTotal = precioTotal(monto, montoIVA);
        System.out.println("El precio total: " + montoTotal);

    }

    static double precioIVA(double precio) {
        return (precio * 16) / 100;
    }

    static double precioTotal(double precio, double impuesto) {
        return precio + impuesto;
    }

}
