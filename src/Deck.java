import java.util.ArrayList;

public class Deck {
    //declares and intializes variables
    private ArrayList<Card> cards;
    private int cardsLeft = 0;
    //constructor
    public Deck(String[] ranks, String[] suits, int[] values)
    {
        //creats an arraylist
        cards = new ArrayList<>();
        //goes through all the suits
        for (String suit: suits)
        {
            //goes through the ranks
            for (int i = 0; i < ranks.length; i++)
            {
                //creates a card for each one
                Card card = new Card(suit, ranks[i], values[i]);
                //adds the card to the arraylist
                cards.add(card);
                //52 cards
                cardsLeft++;
            }
        }
    }

    //checks if finished
    public boolean isEmpty()
    {
        return cardsLeft == 0;
    }

    //gets cardsleft
    public int getCardsLeft()
    {
        return cardsLeft;
    }
    //deals the cards
    public Card deal(int j)
    {
        if (cards.isEmpty())
        {
            return null;
        }
        cardsLeft--;

        return cards.get(cardsLeft + 1);


    }
    //shuffle the cards
    public void shuffle() {
        //creates a holder
        Card temp;
        //iterates through the cards
        for (int i = cards.size() - 1; i > 0; i--) {
            //random int between the cards
            int r = (int)(Math.random() * (i + 1));
            //swaps the 2 cards
            temp = cards.get(i);
            cards.set(i, cards.get(r));
            cards.set(r, temp);
        }
    }
    //gets a singular card
    public Card getCard()
    {
        cardsLeft--;
        return cards.get(cardsLeft);
    }
}
