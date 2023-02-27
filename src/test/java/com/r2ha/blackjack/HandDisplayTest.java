package com.r2ha.blackjack;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HandDisplayTest {

    @Test
    void displayFaceUpCardReturnsAsCorrectString() throws Exception {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, Rank.ACE),
                new Card(Suit.CLUBS, Rank.JACK));
        Hand hand = new Hand(cards);

        Approvals.verify(ConsoleCard.displayFaceUpCard(hand));
    }

    @Test
    void displayAllCardsAsCorrectString() throws Exception {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, Rank.ACE),
                new Card(Suit.CLUBS, Rank.JACK));
        Hand hand = new Hand(cards);

        Approvals.verify(hand.cardsAsString());
    }

}
