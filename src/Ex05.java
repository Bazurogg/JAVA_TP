public class Ex05 {

    // Déclarations de nos constantes qui vont définir la structure de notre tableau :
    public static final int Lignes = 10;
    public static final int Colonnes = 10;

    public static void main(String[] args) {

        // Initialisation de notre tableau à 2 dimensions et on lui donne en paramètres sa taille max.
        int[][] TabMultiplication = new int[Lignes][Colonnes];

        // Remplissage manuel de la première ligne et de la première colonne
        for (int i = 0; i < Lignes; i++) {

            TabMultiplication[i][0] = i;

            TabMultiplication[0][i] = i;

        }

        // Remplissage du reste du tableau de multiplication
        for (int i = 1; i < Lignes; i++) {

            for (int j = 1; j < Colonnes; j++) {

                TabMultiplication[i][j] = i * j;

            }
        }

        // Affichage du tableau de multiplication
        System.out.println("Tableau de multiplication :");

        for (int i = 0; i < Lignes; i++) {

            for (int j = 0; j < Colonnes; j++) {

                System.out.print(TabMultiplication[i][j] + "\t");

            }

            System.out.println();

        }

    }

}
