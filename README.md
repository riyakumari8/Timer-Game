A simple Java-based Number Guessing Game where the player has 10 seconds to guess the correct number.

🎮 How It Works
The game generates a random number between 0 and 9.
The player keeps guessing the number until they either:
Guess the correct number 🎯
Exceed the 10-second time limit ⏳
The game provides hints if the guess is too high or too low.
Once the game ends, it displays either the time taken to guess correctly or a time-out message.

📜 Code Overview :-
The key components of the code include:
Random Number Generation: random.nextInt(10)
Time Tracking: Using LocalTime.now() and ChronoUnit.SECONDS.between().
User Input Handling: Using Scanner.
Loop for Continuous Guessing: Until the user wins or time runs out.

🏆 Example Gameplay :-
Welcome to Number Guessing game, you have 10 seconds to guess the correct number
Start guessing....
Enter your guess: 6
Too low, try again
Enter your guess: 8
Correct answer, you guessed in: 5s
Game over
