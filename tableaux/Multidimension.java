package tableaux;


public class Multidimension {
    public static void main(String[] args) { // Toujours String[] ici
        if (args.length < 6) {
            System.out.println("Oups, saisissez 3 notes suivies de 3 coefficients.");
            return;
        }
        // Création d'un tableau à 2 dimensions (3 lignes, 2 colonnes)
        // Ligne 0 : [note, coeff]
        // Ligne 1 : [note, coeff]
        // Ligne 2 : [note, coeff]
        double[][] tableauFinal = new double[3][2];

        for (int i = 0; i < 3; i++) {
            // On remplit le tableau à deux dimensions
            tableauFinal[i][0] = Double.parseDouble(args[i]);     // Colonne 0 : la note
            tableauFinal[i][1] = Double.parseDouble(args[i + 3]); // Colonne 1 : le coeff
        }

        // Affichage propre
        System.out.println("Tableau des résultats :");
        for (int i = 0; i < tableauFinal.length; i++) {
            System.out.println("Ligne " + i + " -> Note: " + tableauFinal[i][0] + " | Coeff: " + tableauFinal[i][1]);
        }
    }
}