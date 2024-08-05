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

        // Recherche de l'élément "x" dans le tableau trié.
        int position = rechercheX(TabEntiers, x);

        if (position != -1) {

            System.out.println("L'élément " + x + " a été trouvé à la position " + position);

        } else {

            System.out.println("L'élément " + x + " n'a pas été trouvé dans le tableau.");

        }

        userInput.close();

    }

    // notre fonction de recherche de "X" dans la tableau trié via la recherche "dichotomique".
    public static int rechercheX(Integer[] tab, int x) {

        // initialisation des marqeurs de positions:
        // début du tableau
        int gauche = 0;

        // fin du tableau
        int droite = tab.length - 1;

        //"tant que" gauche est inférieur ou égal à droite
        while (gauche <= droite) {

            // calcul du milieu de la plage des valeurs sur laquelle on se trouve
            int milieu = gauche + (droite - gauche) / 2;

            // on vérifie si l'élément du milieu est égale à "x"
            if (tab[milieu] == x) {

                return milieu;

            }

            // si l'élément "tab[milieu]" situé à l'indice du tableau "milieu" et qu'il est plus grand que "x" alors "x" ce trouve dans la partie droite du tableau.
            if (tab[milieu] > x) {

                gauche = milieu + 1;

            // sinon il est plus petit alors il se trouve dans la partie gauche.
            } else {

                droite = milieu - 1;

            }

        }

        // si l'élément n'a pas été trouvé alors :
        return -1;

    }

    // Exécution
    public static void main(String[] args) {
        mainExo03();
    }

}
