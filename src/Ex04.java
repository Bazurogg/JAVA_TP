import java.util.Random;
import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {

        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir la taille du tableau
        System.out.println("Veuillez saisir la taille du tableau :");

        int TailleTab = scanner.nextInt();

        // Déclaration du tableau d'entiers
        int[] tableau = new int[TailleTab];

        // Classe publique qui permet la génération de nombres pseudo-aléatoires
        Random rand = new Random();

        // Remplissage du tableau avec des entiers aléatoires
        for (int i = 0; i < TailleTab; i++) {

            // Génère des nombres aléatoires entre 0 et 100
            tableau[i] = rand.nextInt(101);

        }

        // Affichage du tableau
        System.out.println("Tableau d'entiers aléatoires :");

        for (int i = 0; i < TailleTab; i++) {

            System.out.print(tableau[i] + " | ");

        }

        System.out.println();

        // Appel de la fonction pour trouver le maximum
        int maximum = lireMaxTabEntiers(tableau);

        // Affichage de l'élément maximum
        System.out.println("L'élément maximum est : " + maximum);

        // Fermeture du scanner
        scanner.close();
    }

    // Fonction pour trouver l'entier maximum dans le tableau
    public static int lireMaxTabEntiers(int[] tableau) {

        // initialisation de la valeur de départ de "maxi" qui va permettre la comparaison entre l'autre indice du tableau.
        int maxi = tableau[0];

        // on parcours le tableau
        for (int i = 1; i < tableau.length; i++) {

            // à chaque pas "i" on fais la comparaison de "maxi" est de l'indice du tableau à "i".
            if (tableau[i] > maxi) {

                maxi = tableau[i];

            }

        }

        return maxi;

    }

}
