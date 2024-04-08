import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Hand
{
    String str;
    Card card1;
    Card card2;
    Card card3;
    Card card4;
    Card card5;


    Hand( String str ) {
        String[] cards = str.split(" ");
        this.card1 = new Card(Integer.parseInt(cards[0]), Integer.parseInt(cards[1]));
        this.card2 = new Card(Integer.parseInt(cards[2]), Integer.parseInt(cards[3]));
        this.card3 = new Card(Integer.parseInt(cards[4]), Integer.parseInt(cards[5]));
        this.card4 = new Card(Integer.parseInt(cards[6]), Integer.parseInt(cards[7]));
        this.card5 = new Card(Integer.parseInt(cards[8]), Integer.parseInt(cards[9]));
    }

    public String toString()
    {
        String ans1 = card1.getCardValue() + " of " + card1.getCardSuit();
        String ans2 = card2.getCardValue() + " of " + card2.getCardSuit();
        String ans3 = card3.getCardValue() + " of " + card3.getCardSuit();
        String ans4 = card4.getCardValue() + " of " + card4.getCardSuit();
        String ans5 = card5.getCardValue() + " of " + card5.getCardSuit();
        return ans1 + ", " + ans2 + ", " + ans3 + ", " + ans4 + ", " + ans5;
    }

    public boolean getStraight() {
        int[] values = new int[5];
        values[0] = card1.value;
        values[1] = card2.value;
        values[2] = card3.value;
        values[3] = card4.value;
        values[4] = card5.value;
        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            if (values[0] + 1 == values[1] &&
                    values[0] + 2 == values[2] &&
                    values[0] + 3 == values[3] &&
                    values[0] + 4 == values[4]) {
                return true;
            } else if (values[0] + 9 == values[1] &&
                    values[0] + 10 == values[2] &&
                    values[0] + 11 == values[3] &&
                    values[0] + 12 == values[4]) {
                return true;
            }
        }
        return false;
    }

    public boolean getFlush() {
        if (card1.getCardSuit() == card2.getCardSuit()
                && card1.getCardSuit() == card3.getCardSuit()
                && card1.getCardSuit() == card4.getCardSuit()
                && card1.getCardSuit() == card5.getCardSuit()) {
            return true;
        }
        return false;
    }


    public String status() // return "straight flush", "straight", "flush", or "none"
    {
        String result;
        if (getStraight() && getFlush()) {
            result = "straight flush";
        } else if(getStraight()) {
            result = "straight";
        } else if(getFlush()) {
            result = "flush";
        } else {
            result = "none";
        }
        return result;
    }


    public static void main(String[] args) {
        // sample testing code
        Hand h = new Hand( "1 1 2 1 3 1 4 1 5 1" );
        System.out.println( h.toString() );
        System.out.println( h.status() );
    }

}

