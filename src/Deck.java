public class Deck {
    private ArrayList<String> cards;
    private static int cardsLeft;

    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new Arraylist<>();
        for (String suit: suits)
        {
            for (int i = 0; i < ranks.length; i++)
            {
                Card card = new Card(suit, rank[i], value[i]);
                cards.add(card);
            }
        }
    }

    public boolean isEmpty()
    {
        return cardsLeft == 0;
    }

    public Card deal()
    {
        if (cards.isEmpty())
        {
            return null;
        }
        return cards.get(cardsLeft--);
    }
}
