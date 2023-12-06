import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Game {

    private Player p;
    private Deck deck;
    private List<Card> pile;
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public Game(Player player)
    {
        p = player;
        deck = new Deck(ranks, suits, values);
        pile = new ArrayList<>();
    }

        public void playGame()
        {
            //print instructi
            System.out.println(deck);
            Scanner scanner = new Scanner(System.in);
            while (!p.getHand().isEmpty()) {
                System.out.println("Your Hand: " + p.getHand());
                System.out.println("Press 'n' for a new card");

                char choice = scanner.next().charAt(0);

                if (choice == 'n') {
                    playTurn();
                }
                else {
                    System.out.println("Please press 'n' for a new card ");
                }
            }
        }

//        public boolean check()
//        {
//
//            return
//        }
        private void playTurn() {



        }
        public static void main(String[] args) {

            Player player = new Player("Kavan");
            Game game = new Game(player);
            game.playGame();

        }
    }