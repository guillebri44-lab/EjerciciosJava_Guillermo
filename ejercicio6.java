import java.util.Scanner;

class ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double primero = entrada.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double segundo = entrada.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double tercero = entrada.nextDouble();

        double mayor;
        if (primero >= segundo && primero >= tercero) {
            mayor = primero;
        } else if (segundo >= tercero) {
            mayor = segundo;
        } else {
            mayor = tercero;
        }

        System.out.println("El número mayor es: " + mayor);
        entrada.close();
    }
}
