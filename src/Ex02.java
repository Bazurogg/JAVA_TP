
// Imports de librairies Java.
import java.util.Scanner;


public class Ex02 {

    public static void mainExo02() {

        Scanner userInput = new Scanner(System.in);

        boolean confirmationX = false;
        boolean confirmationY = false;

        int X = 0;
        int Y = 0;

        while (!confirmationX) {

            System.out.println("Veuillez saisir un nombre entier positif pour \"X\" :");

            X = userInput.nextInt();

            System.out.println("Vous avez saisi le nombre : " + X + ". Est-ce correct ? (oui/non)");

            String reponse = userInput.next();

            if (reponse.equalsIgnoreCase("oui")) {

                confirmationX = true;

                System.out.println("Merci pour votre confirmation. \"X\" = " + X);

            } else if (reponse.equalsIgnoreCase("non")) {

                confirmationX = false;

            } else {

                System.out.println("Réponse invalide. Veuillez répondre par 'oui' ou 'non'.");

            }

        }

        while (!confirmationY) {

            System.out.println("Veuillez saisir un nombre entier positif pour \"Y\" :");

            Y = userInput.nextInt();

            System.out.println("Vous avez saisi le nombre : " + Y + ". Est-ce correct ? (oui/non)");

            String reponse = userInput.next();

            if (reponse.equalsIgnoreCase("oui")) {

                confirmationY = true;

                System.out.println("Merci pour votre confirmation. \"Y\" = " + Y);

            } else if (reponse.equalsIgnoreCase("non")) {

                confirmationY = false;

            } else {

                System.out.println("Réponse invalide. Veuillez répondre par 'oui' ou 'non'.");

            }

        }

        userInput.close();

    }

    public static void main(String[] args) {

        mainExo02();

    }
    

}
