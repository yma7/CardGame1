import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    //variable declaration + initialization
    public static int tries = 0;
    private Player p;
    private Deck deck;
    private ArrayList<Card> pile;
    private String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    //constructor
    public Game(Player player)
    {
        //creates a player
        p = player;
        //creates a new deck with all 52 cards
        deck = new Deck(ranks, suits, values);
        //declares the pile
        pile = new ArrayList<>();
        //calls the initialization of the game
        initializeGame();
    }
    //initializes the game
    public void initializeGame() {
        // deals 3 cards
        for (int i = 0; i < 3; i++) {
            //shuffles the deck first
            deck.shuffle();
            //deals cards
            p.addCard(deck.getCard());
        }

        //gives 1 card to start the pile
        pile.add(deck.getCard());
    }
    //game logic
    public void playGame()
    {
        //prints instructions
        printInstructions();
        //repeats until player finishes
        while (isGameOver() == false) {
            //initializes the scanner
            Scanner scanner = new Scanner(System.in);
            //prints out general info
            System.out.println("The top card is " + pile.get(pile.size() - 1));
            System.out.println("Your Hand: " + p.getHand());
            //asks user if they want a new card
            System.out.println("Press 'n' for a new card or anything else to continue");
            //gets the character
            char choice = scanner.next().charAt(0);
            //checks to see if they are asking for new card
            if (choice == 'n')
            {
                //gets a new card
                p.addCard(deck.getCard());
                //prints out the new hand
                System.out.println("Your new hand is: " + p.getHand());
            }
            //plays a turn
            playTurn();
            //adds a try to calculate final scores
            tries++;
            }
        //prints out how many moves it took
        score();
    }
    //checks to see if game is over
    public boolean isGameOver()
    {
        //game is over when the players hand is empty or when the pile is greater than the size of a deck of cards
        return p.getHand().isEmpty() || pile.size() > 52;
    }

    //prints instructions
    public static void printInstructions()
    {
        //prints rules and game basics
        System.out.println("Welcome to Speed. In this game try to use all of your cards in the lowest moves");
        System.out.print("You can only place a card that's value is either 1+ or 1- the pile card\n");
        System.out.print("For example if the pile card is 9, you can place either a 8 or 10, but not a 11");
        System.out.print("Your final score will be based off how many moves you use.\n");
        System.out.print("Enjoy!");
    }
    //plays a turn
    private void playTurn()
    {
        //prompts user to enter a index of their hand
        System.out.println("Enter the index of the card you want to play:");
        System.out.println("Enter a letter if you don't have any cards that work");
        //scanner
        Scanner scanner = new Scanner(System.in);
        //gets the number
        int cardIndex = scanner.nextInt();
        //checks to see if the index is not out of bounds
        if (cardIndex >= 0 && cardIndex < p.getHand().size())
        {
            //gets the card from that index
            Card s = p.getHand().get(cardIndex);
            //checks if it is +1` or 1- the top of pile
            if (check(s)) {
                //adds the new number to pile
                pile.add(s);
                //removes it from the players hand
                p.remove(s);
            }
            //else if it doesnt work
            else if (!check(s))
            {
                //print error message
                System.out.println("The card must be +1 or 1- from the pile");
            }
            else
            {
                System.out.println("Index out of bounds. Please choose a index from your hand.");
            }
        }
    }

    //checks to see if card works
    public boolean check(Card card)
    {
        //gets the card from the top of the pile
        Card pileCard = pile.get(pile.size() - 1);
        //calculates the difference between the pile and the card
        int diff = Math.abs(card.getPoint() - pileCard.getPoint());
        //returns true if it is 1
        return diff == 1;
    }

    //prints out the score and total moves it took to finish
    public void score()
    {
        System.out.println("It took you a total of " + tries + " tries to finish! Play again to beat that!");
    }


    //starts game
    public static void main(String[] args) {

        Player player = new Player("Kavan");
        Game game = new Game(player);
        game.playGame();

    }
}