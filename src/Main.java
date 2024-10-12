import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String playerAMove = "";
        String playerBMove = "";
        int playerAWins = 0;
        int playerBWins = 0;
        int ties = 0;
        boolean done = false;
        String continueYN = "";
        String trash = "";

        try (Scanner in = new Scanner(System.in)) { //close Scanner after program concludes to avoid memory leak
            System.out.println("Welcome to Rock, Paper, Scissors");
            System.out.println("R or r for Rock, P or p for Paper, S or s for Scissors");

            do { // game will do at least 1 interation, will continue as long as y or Y is entered at prompt

                done = false;
                do { //input loop for player1
                    System.out.print("\nPlayer 1, enter your move [RPS]: ");
                    done = true; //placeholder until rest of program is written


                } while(!done);

                System.out.print("\nContinue? Y/N: ");
                continueYN = in.nextLine();

            } while(continueYN.equalsIgnoreCase("Y"));

        }
    }
}