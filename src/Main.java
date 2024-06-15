import java.util.Scanner;

public class Main {
    private Scanner scanner;

    public Main() {
        this.scanner = new Scanner(System.in);
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
