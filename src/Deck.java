import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private int cardsLeft = 0;

    public Deck(String[] ranks, String[] suits, int[] values)
    {

        cards = new ArrayList<>();
        for (String suit: suits)
        {
            for (int i = 0; i < ranks.length; i++)
            {
                Card card = new Card(suit, ranks[i], values[i]);
                cards.add(card);
                cardsLeft++;
            }
        }
    }

    public boolean isEmpty()
    {
        return cardsLeft == 0;
    }


    public int getCardsLeft()
    {
        return cardsLeft;
    }
    public Card deal()
    {
        if (cards.isEmpty())
        {
            return null;
        }
        cardsLeft--;
        return cards.get(cardsLeft + 1);
    }

    public void shuffle() {
        Card temp;
        for (int i = cards.size() - 1; i > 0; i--) {
            int r = (int)(Math.random() * (i + 1));
            temp = cards.get(i);
            cards.set(i, cards.get(r));
            cards.set(r, temp);
        }
    }

}
