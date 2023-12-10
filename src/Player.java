import java.util.ArrayList;
public class Player
{
    //variable declaration
    private String name;
    private ArrayList<Card> hand;
    private int points;
    //constructor
    public Player(String n)
    {
        //sets up instance variables
        name = n;
        points = 0;
        hand = new ArrayList<>();
    }
    //overloading
    public Player(String n, ArrayList<Card> p)
    {
        //instance variables
        name = n;
        points = 0;
        hand = new ArrayList<>(p);
    }
    //gets the name
    public String getName()
    {
        return name;
    }
    //gets the points
    public int getPoints()
    {

        return points;
    }
    //add points to the user
    public void addPoint(int p)
    {
        points += p;
    }
    //adds a card
    public void addCard(Card card)
    {
        hand.add(card);
    }
    //gets the hand
    public ArrayList<Card> getHand()
    {
        return hand;
    }
    //prints out the user's points and hand
    public String toString()
    {
        return name + " has " + points + "\n" + name +"'s cards: " + hand;
    }
    //removes a card from hand
    public void remove(Card card)
    {
        hand.remove(card);
    }
}
