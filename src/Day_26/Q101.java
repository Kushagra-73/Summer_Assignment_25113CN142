package Day_26;

import java.util.Random;
import java.util.Scanner;

public class Q101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Welcome the the number guessing game *****");
        System.out.println("Choose a level : " + "\n1. Hard Level - You have 5 lives to guess" + "\n2. Medium level - You have 7 lives to guess :" + "\n3. Easy level - You have 10 lives to guess");
        int level = sc.nextInt();

        int lives = 0;
        while (level < 1 || level > 3){
            System.out.println("Enter the right level");
            level = sc.nextInt();
        }
        int secretNumber = random();
        int attempts = 0;
        switch(level){
            case 1 -> lives = 5;
            case 2 -> lives = 7;
            case 3 -> lives = 10;
        }
        while (lives > 0){
            System.out.println("lives :" + lives);
            int userGuess = userInput(sc);
            if(userGuess < 1 || userGuess > 100){
                System.out.println("Enter number in range 1 to 100 ");
                continue;
            }
            attempts++;
            if(checkNum(userGuess, secretNumber)){
                System.out.println("Congratulations !" + "\nattempts : " + attempts);
                break;
            }

            lives--;

        }
        if(lives == 0){
            System.out.println("You lost");
            System.out.println("The correct number was :" + secretNumber);
        }

    }


    static int random(){
        Random randint = new Random();
        return randint.nextInt(100) + 1;
    }

    static int userInput(Scanner sc){
        System.out.println("Enter the number in range 1 to 100 :");
        return sc.nextInt();
    }

    static boolean checkNum(int guess, int secret){
        if(guess == secret){
            System.out.println("You guessed it right the number is :" );
            return true;

        }
        if (guess > secret) {
            System.out.println("Number is Lower than the guessed number");
        }
        else {
            System.out.println("Number is Greater than the guessed number");
        }
        return false;
    }


}
