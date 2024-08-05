import java.util.Random;
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        // déclaration et initialisation du tableau d'entiers
        int[] tableau = new int[10];

        // remplissage du tableau avec des entiers aléatoires
        Random rand = new Random();

        // génération de nombres aléatoires entre -100 et 100
        for (int i = 0; i < tableau.length; i++) {

            tableau[i] = rand.nextInt(201) - 100;

        }

        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Affichage du tableau non trié
        System.out.println("Tableau non trié :");

        afficherTableau(tableau);

        // Boucle infinie pour permettre à l'utilisateur de faire plusieurs calculs jusqu'à condition de sortie.
        while (true) {

            // Demander à l'utilisateur de choisir l'ordre de tri
            System.out.println("Veuillez choisir l'ordre de tri (croissant \"c\" /décroissant \"d\") :");

            String ordre = scanner.next();

            // Trier le tableau en fonction du choix de l'utilisateur
            boolean croissant = ordre.equalsIgnoreCase("c");

            trierTableau(tableau, croissant);

            // Affichage du tableau trié
            if (croissant) {

                System.out.println("Tableau trié en ordre croissant :");

            } else {

                System.out.println("Tableau trié en ordre décroissant :");

            }

            afficherTableau(tableau);

            // Demander à l'utilisateur s'il souhaite effectuer un autre tri
            System.out.println("Souhaitez-vous encore un tri ? (oui/non)");

            String reponse = scanner.next();

            if (reponse.equalsIgnoreCase("non")) {

                // Sortir de la boucle si l'utilisateur ne souhaite plus faire de tri
                break;

            }

        }

        scanner.close();

    }

    // Méthode pour trier le tableau en utilisant le tri par insertion
    public static void trierTableau(int[] tableau, boolean croissant) {

        for (int i = 1; i < tableau.length; i++) {

            int key = tableau[i];

            int j = i - 1;

            if (croissant) {

                // Trier en ordre croissant
                while (j >= 0 && tableau[j] > key) {

                    tableau[j + 1] = tableau[j];

                    j = j - 1;

                }

            } else {

                // Trier en ordre décroissant
                while (j >= 0 && tableau[j] < key) {

                    tableau[j + 1] = tableau[j];

                    j = j - 1;

                }

            }

            tableau[j + 1] = key;

        }

    }

    // Procédure pour afficher le tableau dans la console
    public static void afficherTableau(int[] tableau) {

        for (int i = 0; i < tableau.length; i++) {

            System.out.print(tableau[i] + " ");

        }

        System.out.println();

    }

}

