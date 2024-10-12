import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String playerAMove = "";
        String playerBMove = "";
        int playerAWins = 0;
        int playerBWins = 0;
        int ties = 0;
        int gameCounter = 0;
        String[] validInput = {"R", "P", "S"};
        boolean okInput = false;
        String continueYN = "";

        try (Scanner in = new Scanner(System.in)) { //close Scanner after program concludes to avoid memory leak
            System.out.println("Welcome to Rock, Paper, Scissors");
            System.out.println("R/r - Rock  P/p - Paper  S/s - Scissors");

            do { // game will do at least 1 interation, will continue as long as y or Y is entered at prompt

                okInput = false;
                gameCounter++;
                System.out.println("\nGame " + gameCounter);
                do { //input loop for player1
                    System.out.print("Player 1, enter your move. [RPS]: ");
                    playerAMove = in.nextLine();
                    for (String choice : validInput) {
                        if (playerAMove.equalsIgnoreCase(choice)) {
                            okInput = true;
                            break;
                        }
                    }
                    if (!okInput) {// no valid input entered
                        System.out.println("\nInvalid move. Please choose between [RPS]");
                    }


                } while(!okInput);

                System.out.print("\nContinue? [Y/N]: ");
                continueYN = in.nextLine();

            } while(continueYN.equalsIgnoreCase("Y"));

        }
    }
}