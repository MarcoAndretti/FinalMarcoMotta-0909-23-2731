import java.util.Scanner;

public class Main {
    private Scanner scanner;

    public Main() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMayorDeTres() {
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        System.out.println("El número mayor es: " + mayor);
    }

    public void mostrarTablaMultiplicar() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public void sumarParesHasta() {
        System.out.print("Ingrese un número: ");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los números pares es: " + suma);
    }


    public static void main(String[] args) {
        Main ejercicios = new Main();

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Mayor de 3");
            System.out.println("2. tabla de multiplicar");
            System.out.println("3. Mostrar tabla de multplicar");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    ejercicios.mostrarMayorDeTres();
                    break;
                case 2:
                    ejercicios.mostrarTablaMultiplicar();
                    break;
                case 3:
                    ejercicios.sumarParesHasta();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }
}
