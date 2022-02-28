package HombreLobo;

public class Alfa extends HombreLobo {
    private String color;
    public Alfa (String nombre, int edad, double altura, String color) {
        super(nombre, edad, altura);
        this.color = color;
    }
    public void superFuerza() {
        System.out.println("Venga le conecto un carero...");
    }
}
