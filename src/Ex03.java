import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {


    public static void mainExo03() {

        // affectation de la taille de notre tableau à une variable pour ré-utilisation de cette valeurs pour le remplissage plus tard.
        int TailleTab = 10;

        // déclaration d'un tableau.
        //construct avec affectation des données du tableau.
        // "new int[]" attribution de la taille du tableau.
        int[] TabEntiers = new int[10];

        // class publique qui permet la génération de nombres pseudo-aléatoire.
        // elle donne accés à différentes méthodes pour pouvoir générer des nombres aléatoires.
        Random rand = new Random();

        // remplissage du tableau avec des entiers aléatoires.
        for (int i = 0; i < TailleTab; i++) {

            // génération de nombres entiers aléatoire entre 0 (inclus) et "bound" => rand.nextInt("bound"100)->(exclu)
            // càd pour "rand.nextInt(101)" on génére un nombre aléatoire entre 0 et 100(inclus)
            // ensuite ce nombre généré est soustrait de "50"
            // ainsi notre plage de nombre générés va de -50 à 50.
            // on aura bien ici des nombres positifs, négatifs et nuls.
            TabEntiers[i] = rand.nextInt(101) - 50; // Génère des nombres aléatoires entre -50 et 50

        }

        // display du tableau
        System.out.print(Arrays.toString(TabEntiers));

    }

    // execution
    public static void main(String[] args) {

        mainExo03();

    }

}
