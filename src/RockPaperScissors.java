import java.util.Scanner;

public class RockPaperScissors {
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
                System.out.println();
                do { // playerA input loop
                    System.out.print("Player A, enter your move. [RPS]: ");
                    playerAMove = in.nextLine();
                    for (String choice : validInput) {
                        if (playerAMove.equalsIgnoreCase(choice)) {
                            okInput = true;
                            break;
                        }
                    }
                    if (!okInput) { // no valid input entered
                        System.out.println("Invalid move. Please choose between R for Rock, P for Paper, or S for Scissors");
                    }
                } while(!okInput); //loop until valid choice entered
                okInput = false;
                do { // player2 input loop
                    System.out.print("Player B, enter your move. [RPS]: ");
                    playerBMove = in.nextLine();
                    for (String choice : validInput) {
                        if (playerBMove.equalsIgnoreCase(choice)) {
                            okInput = true;
                            break;
                        }
                    }
                    if (!okInput) { //no valid input entered
                        System.out.println("Invalid move. Please choose between R for Rock, P for Paper, or S for Scissors");
                    }
                } while(!okInput); //loop until valid choice entered

                if (playerAMove.equalsIgnoreCase("R")) { //Player A chose Rock
                    if (playerBMove.equalsIgnoreCase("R")) {
                        //Rock vs Rock
                        ties++;
                        System.out.println("Rock vs Rock, it's a Tie!");
                    }
                    else if (playerBMove.equalsIgnoreCase("P")) {
                        //Rock vs Paper
                        playerBWins++;
                        System.out.println("Paper covers Rock, Player B Wins!");
                    }
                    else if (playerBMove.equalsIgnoreCase("S")) {
                        //Rock vs Scissors
                        playerAWins++;
                        System.out.println("Rock breaks Scissors, Player A wins!");
                    }
                    else { //included for 'impossible' error catching
                        System.out.println("Unexpected result. Check program code line 71");
                    }
                }
                else if (playerAMove.equalsIgnoreCase("P")) { //Player A chose Paper
                    if (playerBMove.equalsIgnoreCase("R")) {
                        //Paper vs Rock
                        playerAWins++;
                        System.out.println("Paper covers Rock, Player A wins!");
                    }
                    else if (playerBMove.equalsIgnoreCase("P")) {
                        //Paper vs Paper
                        ties++;
                        System.out.println("Paper vs Paper, it's a tie!");
                    }
                    else if (playerBMove.equalsIgnoreCase("S")) {
                        //Paper vs Scissors
                        playerBWins++;
                        System.out.println("Paper vs Scissors, Player B wins!");
                    }
                    else { // included for 'impossible' error catching
                        System.out.println("Unexpected result, check program line 91");
                    }
                }
                else if (playerAMove.equalsIgnoreCase("S")) { //Player A chose Scissors
                    if (playerBMove.equalsIgnoreCase("R")) {
                        //Scissors vs Rock
                        playerBWins++;
                        System.out.println("Rock breaks Scissors, Player B wins!");
                    }
                    else if (playerBMove.equalsIgnoreCase("P")) {
                        //Scissors vs Paper
                        playerAWins++;
                        System.out.println("Scissors cuts Paper, Player A wins!");
                    }
                    else if (playerBMove.equalsIgnoreCase("S")) {
                        //Scissors vs Scissors
                        ties++;
                        System.out.println("Scissors vs Scissors, it's a tie!");
                    }
                    else { // included for 'impossible' error catching
                        System.out.println("Unexpected result. Check program code line 111");
                    }
                }
                else { //included for error catching
                    System.out.println("Unexpected Player A input. Check program code line 115");
                }

                System.out.println("\nScore   PlayerA: " + playerAWins + "   PlayerB: " + playerBWins + "   Ties: " + ties);

                System.out.print("\nContinue? [Y/N]: ");
                continueYN = in.nextLine();

            } while(continueYN.equalsIgnoreCase("Y"));

        }
    }
}