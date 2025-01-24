import java.util.Scanner;
/**
 * Clase principal que ejecuta el programa de la licuadora.
 * Proporciona un menú interactivo para realizar distintas operaciones
 * utilizando una implementación de la interfaz {@link Interfaz}.
 */
public class Main {

    /**
     * Método principal del programa.
     * Permite al usuario interactuar con la licuadora a través de un menú.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Instancia de la implementación de la licuadora

        //Interfaz licuadora = new LicuadoraNinja(); //grupo 4, fatima
       Interfaz licuadora = new Licuadora(); // Nuestro grupo 
        Scanner scanner = new Scanner(System.in);
        int opcion; // Almacena la opción seleccionada por el usuario

        do {
            // Mostrar el menú principal
            System.out.println("\nHola, hago brrr(soy licuadora)");
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
                // Ejecutar la opción seleccionada
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
                // Manejar errores específicos de la lógica de la licuadora
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 7); // Repetir el menú hasta que el usuario elija salir

        scanner.close(); // Cerrar el recurso del scanner
    }
}