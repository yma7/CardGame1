import java.util.ArrayList;
public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int points;

    public Player(String n)
    {
        name = n;
        points = 0;
        hand = new ArrayList<>();
    }
    public Player(String n, ArrayList<Card> p)
    {
        name = n;
        points = 0;
        hand = new ArrayList<>(p);
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
    }
    public void addPoint(int p)
    {
        points += p;
    }
    public void addCard(Card card)
    {
        hand.add(card);
    }

    public ArrayList<Card> getHand()
    {
        return hand;
    }

    public String toString()
    {
        return name + " has " + points + "\n" + name +"'s cards: " + hand;
    }

}
