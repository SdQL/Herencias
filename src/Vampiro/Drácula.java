package Vampiro;


public class Drácula extends Vampiro {
    private String apellido;
    public Drácula(String nombre, int edad, String apellido) {
        super(nombre, edad);
        this.apellido = apellido;
    }

    public void hipnotizar() {
        System.out.println("Venga que no es pa eso...");
    }
}
