import java.util.Scanner;

public class Main{
//Instancia de la clase licuadora
    Licuadora licuadora = new Licuadora();

    
    public void mostrarMain() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nHola, soy una licuadora");
            System.out.println("1. Encender licuadora");
            System.out.println("2. Llenar licuadora con algo");
            System.out.println("3. Incrementar velocidad");
            System.out.println("4. Consultar velocidad");
            System.out.println("5. Consultar capacidad");
            System.out.println("6. Vaciar");
            System.out.println("7. Salir");
            System.out.print("Que queres hacer: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    licuadora.encender();
                    break;
                case 2:
                    licuadora.llenar();
                    break;
                case 3:
                    licuadora.aumentarVelocidad();
                    break;
                case 4:
                    licuadora.consultarVelocidad();
                    break;
                case 5:
                    licuadora.consultarLlenado();
                    break;
                case 6:
                    licuadora.vaciar();
                    break;
                case 7:
                    System.out.println("Never gonna give you up, never gonna let you down");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción vaaaaeaeaeaeae");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }

    public static void main(String[] args) {
        Main Main = new Main();
        Main.mostrarMain();
    }
}