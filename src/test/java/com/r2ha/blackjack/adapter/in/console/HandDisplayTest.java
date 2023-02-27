package com.r2ha.blackjack.adapter.in.console;

import com.r2ha.blackjack.domain.Card;
import com.r2ha.blackjack.domain.Hand;
import com.r2ha.blackjack.domain.Rank;
import com.r2ha.blackjack.domain.Suit;
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

        Approvals.verify(ConsoleHand.displayFaceUpCard(hand));
    }

    @Test
    void displayAllCardsAsCorrectString() throws Exception {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, Rank.ACE),
                new Card(Suit.CLUBS, Rank.JACK));
        Hand hand = new Hand(cards);

        Approvals.verify(ConsoleHand.cardsAsString(hand));
    }

}
