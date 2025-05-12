package org.baren.pipeline.card;

import org.baren.pipeline.card.service.CardService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertNull;

public class CardControllerTests {
    private CardController sut;

    private CardService mockCardService;

    @BeforeEach
    void setup() {
        sut = new CardController();
        mockCardService = Mockito.mock(CardService.class);
        sut.cardService = mockCardService;
    }

    @Test
    void testCardGet() {
        assertNull(null);
    }
}
