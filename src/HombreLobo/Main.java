package HombreLobo;


public class Main {
    public static void main(String[] args) {
        Alfa wolf = new Alfa( "Liam", 51, 2.20, "Negro");
        wolf.morder();
        wolf.superReistencia();
        wolf.velocidad();
        wolf.superFuerza();

        System.out.println("-------------------------------------");

        HombreLobo wolfi = new HombreLobo
                ( "Peter",
                        21,
                        1.90
                );
            wolfi.morder();
            wolfi.velocidad();
            wolfi.superReistencia();

    }



    }

