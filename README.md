Topic 4 - Inheritance
1. Assess a poker hand
   Poker face
   Implement a class to represent a poker hand, and evaluate whether or not each is a straight, flush, or a straight flush.
   In this exercise, you are asked to write a class that can represent a poker hand, and evaluate whether or not each is a straight, flush, or a straight flush. Note that prior knowledge of poker is not necessary to complete this exercise.
   Definitions
   A hand here consists of 5 cards; each card is specified by a value (an int between 1 and 13, inclusive) and a suit (an int between 0 and 3, inclusive; 0 represents Clubs, 1 represents Diamonds, 2 represents Hearts, and 3 represents Spades).
   A hand is defined to be a straight if the values are—up to reordering—5 consecutive values. Precisely, it is meant that, a hand is a straight if the values can be ordered in a way such that:
   the values are equal to v, v+1, v+2, v+3, and v+4, where v is in the range 1 to 9 (inclusive)
   OR
   the values are equal to 10, 11, 12, 13, 1. That is, the ace value may be high or low.
   A hand is defined to be a flush if all of the suits are the same; and, it is defined to be a straight flush if it is both a straight and a flush. Observe that whether or not a hand is a straight, a flush, or a straight flush is not dependent on the order in which the cards of the hand are presented.
2. Challenge
   Implement the class Hand (whose skeleton is in the provided .java file) that has (at least) the following methods:
   A constructor which should receive a string containing 10 ints, which are assumed to consist of the value and the suit for 5 cards. Each card is presented one-by-one, so the first int is the value of the first card, the second int is the suit of the first card, the third int is the value of the second card, and so on, alternating between values and suits.
   A method String toString() which should print out the cards in a sequence, where two consecutive cards are separated by a comma and a space. Use the word Ace to represent the value 1, Jack to represent the value 11, Queen to represent the value 12, and King to represent the value 13. (See the example below.)
   A method String status() which should return “straight flush”, “straight”, “flush”, or “none” depending on the type of hand.