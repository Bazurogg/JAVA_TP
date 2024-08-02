import java.util.*;
import java.util.Scanner;

public class Ex03 {

    public static void mainExo03() {

        // affectation de la taille de notre tableau à une variable pour ré-utilisation de cette valeurs pour le remplissage plus tard.
        int TailleTab = 10;

        // la variable "x" pour la recherche du "nombre" souhaiter parmis les valeurs contenus dans notre tableau d'entier.
        int x = 0;

        boolean confirmationX = false;

        // déclaration d'un tableau.
        //construct avec affectation des données du tableau.
        // "new int[]" attribution de la taille du tableau.
        Integer[] TabEntiers = new Integer[10];

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


        // Affichage du tableau dans la console :

        // avant rangement
        System.out.println("\nGénération d'un tableau aléatoire");

        System.out.print(Arrays.toString(TabEntiers));


        //aprés rangement => décroissant
        // grâce à la méthode "reverseOrder" de la classe "Collections"
        // qui renvoie un comparateur qui permets d'ordonner la collection dans l'ordre inverse.
        Arrays.sort(TabEntiers, Collections.reverseOrder());

        System.out.println("\n\nTrions le par ordre décroissant");

        System.out.print(Arrays.toString(TabEntiers));

        Scanner userInput = new Scanner(System.in);


        while (!confirmationX) {

            System.out.println("\n\nVeuillez saisir un nombre entier pour \"x\" :");

            x = userInput.nextInt();

            System.out.println("Vous avez saisi le nombre : " + x + ". Est-ce correct ? (oui/non)");

            String reponse = userInput.next();

            if (reponse.equalsIgnoreCase("oui")) {

                confirmationX = true;

                System.out.println("Merci pour votre confirmation. \"x\" = " + x);

            } else if (reponse.equalsIgnoreCase("non")) {

                confirmationX = false;

            } else {

                System.out.println("Réponse invalide. Veuillez répondre par 'oui' ou 'non'.");

            }

        }

        userInput.close();

    }


    /*
    public static int rechercheEntier (){


    };**/

    // execution
    public static void main(String[] args) {

        mainExo03();

    }

}
