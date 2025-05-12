package org.baren.pipeline.card.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.baren.pipeline.model.Card;
import org.baren.pipeline.model.CardType;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CardService {
    public Card getCard() {
        Card teval = new Card();
        teval.setCardName("Teval, the balanced scale");
        teval.setId(1);
        teval.setCardType(CardType.CREATURE);
        teval.setManaValue(4);
        return teval;
    }

    public int isOneTwo() {
        return  1 % 2 + 3 * 4 / 23 - 2 * (2+3 / 5);
    }
}
