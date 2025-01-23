import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Interfaz licuadora = new LicuadoraNinja(); // Usa la implementación de LicuadoraNinja
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nHola, soy una licuadora Ninja");
            System.out.println("1. Encender licuadora");
            System.out.println("2. Llenar licuadora con algo");
            System.out.println("3. Incrementar velocidad");
            System.out.println("4. Consultar velocidad");
            System.out.println("5. Consultar si está llena");
            System.out.println("6. Vaciar");
            System.out.println("7. Salir");
            System.out.print("Qué quieres hacer: ");
            opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1 -> licuadora.encender();
                    case 2 -> licuadora.llenar();
                    case 3 -> licuadora.aumentarVelocidad();
                    case 4 -> System.out.println("Velocidad actual: " + licuadora.consultarVelocidad());
                    case 5 -> System.out.println("¿Está llena? " + (licuadora.consultarLlenado() ? "Sí" : "No"));
                    case 6 -> licuadora.vaciar();
                    case 7 -> System.out.println("Adiós.");
                    default -> System.out.println("Opción inválida. Intenta de nuevo.");
                }
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7);

        scanner.close();
    }
}
