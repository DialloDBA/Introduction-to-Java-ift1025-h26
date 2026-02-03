package tableaux;

import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void tab() {
        int[] montab = new int[1000];
        System.out.println("Saisir vos chiffres préférés (0 pour arrêter) :");
        Scanner sc = new Scanner(System.in);
        int i = 0;

        while (i < 1000) {
            int valeur = sc.nextInt();

            if (valeur <= 0) {
                break;
            }

            montab[i] = valeur;
            i++;
        }

        try {
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Code ANSI disponible sur google :
                // \033 : C'est le caractère "Échap" (Escape)
                // [H : C'est l'ordre de déplacer le curseur.
                // Par défaut, il renvoie le curseur tout en haut à gauche de l'écran.
                // \033 : C'est le caractère "Échap" (Escape)
                // [2J : C'est l'ordre d'effacer l'écran (J pour "Jump" ou "Junk").
                // Le chiffre 2 signifie qu'on efface tout, du haut jusqu'en bas.
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ex) {
            System.err.println("Impossible d'effacer la console");
        }

        // --- AFFICHAGE ---
        System.out.println("Liste des valeurs saisies :");
        for (int j = 0; j < i; j++) {
            if (j == 0) {
                System.out.print("{");
            }
            System.out.print(montab[j]);
            if (j == 0) {
                System.out.print("{");
            }
        }

        sc.close();
    }

    public static <T> Boolean compareTab(T[] tab1, T[] tab2) {
        return Arrays.equals(tab1, tab2);
    }

    public static void main(String[] args) {
        // tab();
        String currency = "CAD";
        String[] services = { "Dymmo", "fiios", "dymcors" };
        String[] methods = { "om", "momo", "others" };
        Double[] amounts = { 2000.0, 5000.0, 7000.0 };
        Double[] fees = { 1.0, 2.0, 3.0 };

        int i =0 ;
        int j  = 0;
        for (Double amount : amounts) {
            System.out.println(amount + " $" + currency);
            for (Double fee : fees) {
                if(i==j){
                    System.out.println("calculate amount = "+ fee * amount);
                    j++;
                }
                i++;
            }
        }

        System.err.println(compareTab(fees, fees));
        System.err.println(compareTab(services, methods));
        System.err.println(compareTab(services, methods));
        System.err.println(compareTab(services, methods));
        
        String [] fusions = new String[services.length + methods.length];

        System.arraycopy(services, 0, fusions, 0, services.length);
        System.arraycopy(methods, 0, fusions, services.length, methods.length);
        // System.arraycopy(fusions, 0, services, i, j);
      
        for (int k=0 ; k<fusions.length;k++){
            System.out.println(fusions[k]);
        }

    }

}