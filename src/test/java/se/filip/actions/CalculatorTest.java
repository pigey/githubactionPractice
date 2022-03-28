package se.filip.actions;
import org.junit.jupiter.api.*;


class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void addition() {
        double answer =calculator.addition(1,1);
        Assertions.assertEquals(2.0,answer);
    }

    @Test
    void subtraction() {
        double answer = calculator.subtraction(2,1);
        Assertions.assertEquals(1.0,answer);
    }

    @Test
    void multiplication(){
        double answer = calculator.multiplication(5,5);
        Assertions.assertEquals(25,answer,1);
    }
}