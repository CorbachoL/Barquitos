package es.lithium.barquitos.init;

import static org.junit.jupiter.api.Assertions.assertThrows;

class BarquitosTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    //@Test
    public void givenNullArguments_whenInit_thenKO() {

        // Given
        String[] args = null;

        // When
        assertThrows(
                NullPointerException.class,
                () -> BarquitosInitiator.main(args),
                "Se esperaba nullpointerException al llamar sin argumentos");

    }
}