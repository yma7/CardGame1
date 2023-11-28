public class Card {
    private String suit;
    private String rank;
    private int point;


    public Card(String s, String r, int p)
    {
        suit = s;
        rank = r;
        point = p;
    }
    public String getSuit()
    {
        return suit;
    }
    public void setSuit(String s)
    {
        suit = s;
    }
    public String getRank()
    {
        return rank;
    }
    public void setRank(String r)
    {
        rank = r;
    }
    public int getPoint()
    {
        return point;
    }
    public void setPoint(int p)
    {
        point = p;
    }
    public String toString() {
        return rank + " of " + suit;
    }
}
