
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;

public class TimerGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userGuess = 0;

        int randomNumber = random.nextInt(10);

        System.out.println("Welcome to Number Guessing game, you have 10 seconds to guess the correct number");
        System.out.println("Start guesing....");

        LocalTime startTime = LocalTime.now();

        while (true) {

            System.out.print("Enter your guess : ");
            userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                LocalTime endTime = LocalTime.now();
                long timeTaken = ChronoUnit.SECONDS.between(startTime, endTime);
                System.out.println("Correct answer, you guessed in : " + timeTaken + "s");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Too high, Try again");
            }

            long totalTime = ChronoUnit.SECONDS.between(startTime, LocalTime.now());

            if (totalTime > 10) {

                System.out.println("Time over, The correct number was : " + randomNumber);
                break;
            }
        }

        System.out.println("Game over");
        scanner.close();

    }
}
