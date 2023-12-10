public class Card
{
    //variable declaration
    private String suit;
    private String rank;
    private int point;

    //constructor
    public Card(String s, String r, int p)
    {
        //sets up instance variables
        suit = s;
        rank = r;
        point = p;
    }
    //gets the suit
    public String getSuit()
    {
        //returns the suit
        return suit;
    }

    public void setSuit(String s)
    {
        //sets the suit based off user input
        suit = s;
    }
    public String getRank()
    {
        //gets the rank
        return rank;
    }
    public void setRank(String r)
    {
        //sets the ramk
        rank = r;
    }
    public int getPoint()
    {
        //returns the point
        return point;
    }
    public void setPoint(int p)
    {
        //sets the point
        point = p;
    }
    public String toString()
    {
        //prints the card
        return rank + " of " + suit;
    }
}
