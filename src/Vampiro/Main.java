package Vampiro;

public class Main {
    public static void main(String[] args) {
        Drácula vladimir = new Drácula("Vladimir", 666, "Black");
            vladimir.morder();
            vladimir.chuparSangre();
            vladimir.hipnotizar();

        System.out.println("----------------------------------------");

            Vampiro eduard = new Vampiro("Eduardo", 75);
            eduard.morder();
            eduard.chuparSangre();
            eduard.aguantarSol();
        }
    }

