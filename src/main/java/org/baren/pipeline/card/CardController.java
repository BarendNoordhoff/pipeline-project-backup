package org.baren.pipeline.card;

import lombok.extern.slf4j.Slf4j;
import org.baren.pipeline.api.CardApi;
import org.baren.pipeline.card.service.CardService;
import org.baren.pipeline.model.Card;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Validated
public class CardController implements CardApi {
    CardService cardService;

    public CardController() {
        cardService = new CardService();
    }

    @Override
    public ResponseEntity<Card> cardGet() {
        return ResponseEntity.ok(cardService.getCard());
    }
}
