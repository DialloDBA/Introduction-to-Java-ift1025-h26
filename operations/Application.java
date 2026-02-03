package operations;

public class Application {
    public static void main(String[] args) {
        int result = 0;
        int number = 4;
        String name = "DIALLO";
        float longitude = 12345678910L;
        float nombreFlottant32bits = 15.3f;
        System.out.println(longitude);
        System.out.println((double) result);
        System.out.println((double) number);
        System.out.println(Math.round(nombreFlottant32bits));
        System.out.println(name.toUpperCase());
    }

    public static double nombreHarminique(int nombre) {

        double somme = 0;
        for (int i = 0; i >= 0; i++) {
            double terme = 1 / i;
            somme += terme;
        }
        System.out.println(somme);
        return somme;
    }
}
