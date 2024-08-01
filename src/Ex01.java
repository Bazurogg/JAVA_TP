// Imports de librairies Java.
import java.util.Scanner;

// Déclaration de la classe principale
public class Ex01 {

    // Méthode qui va contenir le code.
    public static void mainExo01(){

        // Lire les inputs utilisateurs
        Scanner saisieUtilisateur = new Scanner(System.in);

        // création des variables de "confirmation" pour notre système de validation (while) de l'input utilisateur.
        boolean confirmationA = false;
        boolean confirmationB = false;
        boolean confirmationC = false;

        // Bien que la variable "nombre" aura une valeur ré-assignée on l'initialise ici malgré tout sinon erreur. En JAVA les variables locales doivent être initialisées avant d'être utilisées.
        int a = 0;
        int b = 0;
        int c = 0;

        // système de confirmation par l'utilisateur lors de la saisie du nombre. l'utilisateur est invité à validé son entrée par oui ou non.
        // si la saisie est erronée alors il est invité à la refaire.
        while (!confirmationA) {

            // Affichage message machine
            System.out.println("Veuillez saisir un nombre entier pour \"a\" :");

            // saisie du nombre par l'utilisateur.
            a = saisieUtilisateur.nextInt();

            // la machine informe l'utilisateur de sa saisie et l'interroge si celle-ci est correct ou non.
            System.out.println("Vous avez saisi le nombre : " + a + ". Est-ce correct ? (oui/non)");

            // Lecture de la réponse utilisateur.
            String reponse = saisieUtilisateur.next();

            // boucle de condition "if" si :
            //oui la valeur entrée est attibuée à la variable.
            //sinon l'utilisateur refais une saisi
            if (reponse.equalsIgnoreCase("oui")) {

                // condition validé
                confirmationA = true;

                System.out.println("Merci pour votre confirmation. \"a\" = " + a);

            } else if (reponse.equalsIgnoreCase("non")) {

                // la condition n'est pas validée
                confirmationA = false;

                // L'utilisateur fais une saisie qui n'est ni oui, ni non.
            } else {

                System.out.println("Réponse invalide. Veuillez répondre par 'oui' ou 'non'.");

            }

        }


        // Saisie et confirmation de 'b'
        while (!confirmationB) {

            System.out.println("Veuillez saisir un nombre entier pour \"b\" :");

            b = saisieUtilisateur.nextInt();

            System.out.println("Vous avez saisi le nombre : " + b + ". Est-ce correct ? (oui/non)");

            String reponse = saisieUtilisateur.next();

            if (reponse.equalsIgnoreCase("oui")) {

                confirmationB = true;

                System.out.println("Merci pour votre confirmation. \"b\" = " + b);

            } else if (reponse.equalsIgnoreCase("non")) {

                confirmationB = false;

            } else {

                System.out.println("Réponse invalide. Veuillez répondre par 'oui' ou 'non'.");

            }

        }

        // Saisie et confirmation de 'c'
        while (!confirmationC) {

            System.out.println("Veuillez saisir un nombre entier pour \"c\" :");

            c = saisieUtilisateur.nextInt();

            System.out.println("Vous avez saisi le nombre : " + c + ". Est-ce correct ? (oui/non)");

            String reponse = saisieUtilisateur.next();

            if (reponse.equalsIgnoreCase("oui")) {

                confirmationC = true;

                System.out.println("Merci pour votre confirmation. \"c\" = " + c);

            } else if (reponse.equalsIgnoreCase("non")) {

                confirmationC = false;

            } else {

                System.out.println("Réponse invalide. Veuillez répondre par 'oui' ou 'non'.");

            }

        }

        // Calcul du discriminant.
        // "double" : type de données en Java qui permets de stocker des valeurs à virgule flottante.
        double discriminant = b * b - 4 * a * c;

        // Affichage de l'équation et du discriminant.
        System.out.println("L'équation est: " + a + "x² + " + b + "x + " + c + " = 0." + "\nCalcul du discriminant: " + b + " * " + b + " - " + "4" + a + " * " + c + "\nSon discriminant est égale à : " + discriminant);

        // Résolution de l'équation
        // boucle "if" pour donner le résultat selon les cas différents cas possibles càd selon la valeur du "discriminant".
        if (discriminant > 0) {

            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);

            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Le discrimant est strictement positif." + "\nLes solutions sont: x1 = " + x1 + " et x2 = " + x2);

        } else if (discriminant == 0) {

            double x = -b / (2 * a);

            System.out.println("Le discrimant est nul." + "\nLa solution unique est: x = " + x);

        } else {

            System.out.println("Le discrimant est strictement négatif." + "Il n'y a pas de solution réelle.");

        }

        /* Fermeture du "scanner"
        _Libérer de la ressources : Le "scanner" utilise de la ressource système pour lire les entrées. Ne pas le fermer ces ressources restent alors allouées.(problèmes de performances).

        _Bonne pratique de programmation : Maintiens de la stabilité et de la performance de l'application.

        _Prévention des erreurs : Facilité du diagnostique des erreurs.
         */
        saisieUtilisateur.close();

    }

    // Méthode "main" point d'entrée du programme, qui appelle la méthode "executerExo01".
    public static void main(String[] args) {

        mainExo01();

    }

}