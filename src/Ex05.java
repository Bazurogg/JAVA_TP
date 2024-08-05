import java.util.Scanner;

public class Ex05 {

    // déclarations de nos constantes qui vont définir la taille des colonnes et lignes de notre tableau
    public static final int Lignes = 10;
    public static final int Colonnes = 10;

    public static void main(String[] args) {

        // initialisation de notre tableau à 2 dimensions avec sa taille max en paramètre
        int[][] TabMultiplication = new int[Lignes][Colonnes];

        // remplissage manuel de la première ligne et de la première colonne
        for (int i = 0; i < Lignes; i++) {

            TabMultiplication[i][0] = i;
            TabMultiplication[0][i] = i;

        }

        // remplissage du reste du tableau de multiplication
        for (int i = 1; i < Lignes; i++) {

            for (int j = 1; j < Colonnes; j++) {

                TabMultiplication[i][j] = i * j;

            }

        }

        // affichage du tableau de multiplication
        System.out.println("Tableau de multiplication :");

        for (int i = 0; i < Lignes; i++) {

            for (int j = 0; j < Colonnes; j++) {

                System.out.print(TabMultiplication[i][j] + "\t");

            }

            System.out.println();

        }

        // création d'un nouvel objet "Scanner" pour lire l'input utilisateur
        Scanner scanner = new Scanner(System.in);

        // boucle "while" pour permettre à l'utilisateur de faire plusieurs calculs
        while (true) {

            // on demande à l'utilisateur de saisir les valeurs X et Y
            System.out.println("Veuillez saisir un entier pour X :");

            int X = scanner.nextInt();

            System.out.println("Veuillez saisir un entier pour Y :");

            int Y = scanner.nextInt();

            // on vérifie si les saisies sont correctes
            if (X < 0 || X >= Lignes || Y < 0 || Y >= Colonnes) {

                System.out.println("Veuillez entrer un entier valide !");

                // revenir au début de la boucle pour redemander les valeurs
                continue;

            }

            // extraction de la valeur située à l'intersection des lignes/colonnes correspondantes
            int produit = TabMultiplication[X][Y];

            // affichage du résultat
            System.out.println("Le résultat de " + X + " x " + Y + " est : " + produit);

            // demander à l'utilisateur s'il souhaite effectuer un autre calcul
            System.out.println("Souhaitez-vous encore un calcul ? (oui/non)");

            // lecture de la réponse utilisateur
            String reponse = scanner.next();

            // on sort de la boucle si l'utilisateur ne souhaite plus faire de calcul
            if (reponse.equalsIgnoreCase("non")) {

                break;

            }

        }

        // Fermeture du scanner
        scanner.close();

    }

}
