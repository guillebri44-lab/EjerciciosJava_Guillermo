import java.util.Scanner;

class ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número entero no negativo: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            int contador = 1;
            long factorial = 1;

            while (contador <= numero) {
                factorial *= contador;
                contador++;
            }

            System.out.println("El factorial de " + numero + " es " + factorial);
        }

        entrada.close();
    }
}
