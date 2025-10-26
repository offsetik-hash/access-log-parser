
    import java.util.Scanner;

    public class GuessGame {
        public static void main(String[] args) {
            guessGame();
        }

        public static void guessGame() {
            int randomNum = 7;
            int attempts = 0;
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("What number am I thinking (0 to 9)? :");
                int x = sc.nextInt();
                attempts++;

                if (x != randomNum) {
                    System.out.println("No, try again");
                } else {
                    System.out.println("Yes, it's " + randomNum);
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                    break;
                }
            }

            sc.close();
        }
    }
