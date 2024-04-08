public class Card {
    int suit;
    int value;

    Card(int value, int suit){
        this.suit = suit;
        this.value = value;
    }
    String strSuit;
    public String getCardSuit() {
        switch(this.suit) {
            case 1:
                strSuit = "Diamonds";
                break;
            case 2:
                strSuit = "Hearts";
                break;
            case 3:
                strSuit = "Spades";
                break;
            case 0:
                strSuit = "Clubs";
                break;
        }
        return strSuit;
    }

    String strValue;
    public String getCardValue() {
        switch(this.value) {
            case 1:
                strValue = "Ace";
                break;
            case 2:
                strValue = "2";
                break;
            case 3:
                strValue = "3";
                break;
            case 4:
                strValue = "4";
                break;
            case 5:
                strValue = "5";
                break;
            case 6:
                strValue = "6";
                break;
            case 7:
                strValue = "7";
                break;
            case 8:
                strValue = "8";
                break;
            case 9:
                strValue = "9";
                break;
            case 10:
                strValue = "10";
                break;
            case 11:
                strValue = "Jack";
                break;
            case 12:
                strValue = "Queen";
                break;
            case 13:
                strValue = "King";
                break;
        }
        return strValue;
    }
}
