/**
 * Clase que simula una licuadora con funcionalidades básicas.
 * Implementa la interfaz {@link Interfaz}.
 */
public class Licuadora implements Interfaz {

    // Atributos privados que representan el estado de la licuadora.
    private boolean encendida; // Indica si la licuadora está encendida.
    private boolean llena; // Indica si la licuadora tiene contenido.
    private int velocidad; // Velocidad actual de la licuadora (0-10).

    /**
     * Constructor de la clase Licuadora.
     * Inicializa la licuadora apagada, vacía y con velocidad 0.
     */
    public Licuadora() {
        this.encendida = false;
        this.llena = false;
        this.velocidad = 0;
    }

    /**
     * Enciende la licuadora. Si ya está encendida, muestra un mensaje.
     */
    @Override
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Licuadora encendida.");
        } else {
            System.out.println("La licuadora ya está encendida.");
        }
    }

    /**
     * Llena la licuadora. Si ya está llena, muestra un mensaje.
     */
    @Override
    public void llenar() {
        if (!llena) {
            llena = true;
            System.out.println("La licuadora se ha llenado.");
        } else {
            System.out.println("La licuadora ya está llena.");
        }
    }

    /**
     * Incrementa la velocidad de la licuadora en una unidad.
     * Valida que no se pueda aumentar la velocidad si está apagada, vacía,
     * o si ya está en la velocidad máxima.
     */
    @Override
    public void aumentarVelocidad() {
        if (!encendida) {
            System.out.println("La licuadora está apagada. No puedes aumentar la velocidad.");
        } else if (!llena) {
            System.out.println("La licuadora está vacía. No puedes aumentar la velocidad.");
        } else if (velocidad < 10) {
            velocidad++;
            System.out.println("Velocidad aumentada a: " + velocidad);
        } else {
            System.out.println("La velocidad ya está en su máximo nivel.");
        }
    }

    /**
     * Consulta la velocidad actual de la licuadora.
     *
     * @return La velocidad actual como un número entero.
     */
    @Override
    public int consultarVelocidad() {
        System.out.println("La velocidad actual es: " + velocidad);
        return velocidad;
    }

    /**
     * Consulta si la licuadora está llena.
     *
     * @return {@code true} si está llena, {@code false} si está vacía.
     */
    @Override
    public boolean consultarLlenado() {
        System.out.println("La licuadora está " + (llena ? "llena." : "vacía."));
        return llena;
    }

    /**
     * Vacía la licuadora. Reinicia la velocidad a 0.
     * Si ya está vacía, muestra un mensaje.
     */
    @Override
    public void vaciar() {
        if (llena) {
            llena = false;
            velocidad = 0;
            System.out.println("La licuadora se ha vaciado.");
        } else {
            System.out.println("La licuadora ya está vacía.");
        }
    }
}