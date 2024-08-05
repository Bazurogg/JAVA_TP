import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {

        // Création d'un objet Scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Permettre à l'utilisateur d'effectuer plusieurs calcul d'affilés
        while (true) {

            // Affichage du choix des différents opérateurs
            System.out.println("Choisissez une opération : +, -, *, /");

            // on interroge l'utilisateur sur l'opération qu'il souhaite effectuer
            System.out.println("Entrez le caractère de l'opération :");

            // stockage du caractère dans la variable "opérateur"
            char operateur = scanner.next().charAt(0);

            // Vérification de l'opérateur tant que le bon opérateur de calcul n'est pas entré par l'utilisateur on ne passe pas à la suite
            if (operateur != '+' && operateur != '-' && operateur != '*' && operateur != '/') {

                // affichage du message d'erreur
                System.out.println("Opérateur invalide. Veuillez réessayer.");

                continue;

            }

            // Demander à l'utilisateur de saisir les deux valeurs
            System.out.println("Entrez le premier opérande :");

            double operande1 = scanner.nextDouble();

            System.out.println("Entrez le second opérande :");

            double operande2 = scanner.nextDouble();

            // Appel de la procédure "calculer"
            double resultat = calculer(operateur, operande1, operande2);

            // Affichage du résultat
            System.out.println("Le résultat de " + operande1 + " " + operateur + " " + operande2 + " est : " + resultat);

            // Demander à l'utilisateur s'il souhaite effectuer un autre calcul
            System.out.println("Souhaitez-vous effectuer un autre calcul ? (oui/non)");

            String reponse = scanner.next();

            if (reponse.equalsIgnoreCase("non")) {

                break;

            }

        }

        scanner.close();

    }

    // Procédure pour effectuer le calcul grâce à un "switch case" qui permets en fonction de l'opérateur choisis par l'utilisateur d'effectuer l'opération qui correspond
    // on évite ainsi l'abus d'imbriquation abusive d'un "if-else" on a une gestion de cas multiples mieux approprié
    // le code est plus clair et plus efficace
    // facilité de maintenance
    public static double calculer(char operateur, double operande1, double operande2) {

        double resultat = 0;

        switch (operateur) {

            case '+':

                resultat = operande1 + operande2;

                break;

            case '-':

                resultat = operande1 - operande2;

                break;

            case '*':

                resultat = operande1 * operande2;

                break;

            case '/':

                // on vérifie que le second opérateur est différent de 0
                // on empêche le cas d'une division par 0
                if (operande2 != 0) {

                    resultat = operande1 / operande2;


                } else {

                    System.out.println("Erreur : Division par zéro.");

                }

                break;

            // le cas où un opérateur n'est pas valide
            default:

                System.out.println("Opérateur invalide.");

                break;

        }

        return resultat;

    }

}

