package HombreLobo;

public class HombreLobo {
    private String nombre;
    private int edad;
    private double altura;

    public HombreLobo(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public void morder() {
        System.out.println("Lleve su mordisco...");
    }

    public void superReistencia() {
        System.out.println("No siento tus puñitos pelao'...");
    }

    public void velocidad() {
        System.out.println("¡Atrápame si puedes!");
    }
}
