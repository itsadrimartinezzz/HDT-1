public class Licuadora implements Interfaz {

    private boolean encendida;
    private boolean llena;
    private int velocidad;

    public Licuadora() {
        this.encendida = false;
        this.llena = false;
        this.velocidad = 0;
    }

    @Override
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Licuadora encendida.");
        } else {
            System.out.println("La licuadora ya está encendida.");
        }
    }

    @Override
    public void llenar() {
        if (!llena) {
            llena = true;
            System.out.println("La licuadora se ha llenado.");
        } else {
            System.out.println("La licuadora ya está llena.");
        }
    }

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

    @Override
    public int consultarVelocidad() {
        System.out.println("La velocidad actual es: " + velocidad);
        return velocidad;
    }

    @Override
    public boolean consultarLlenado() {
        System.out.println("La licuadora está " + (llena ? "llena." : "vacía."));
        return llena;
    }

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
