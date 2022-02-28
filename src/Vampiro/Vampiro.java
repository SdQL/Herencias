package Vampiro;

public class Vampiro {
    private String nombre;
    private int edad;

    public Vampiro(String name, int age) {
        this.nombre = name;
        this.edad = age;
    }

    public void morder() {
        System.out.println("Lo vi mal parqueado pa'");
    }

    void chuparSangre() {
        System.out.println("Sabrosa esa sangre mijo");
    }

    public void aguantarSol() {
        System.out.println("Que sol tan suave...");
    }
}
