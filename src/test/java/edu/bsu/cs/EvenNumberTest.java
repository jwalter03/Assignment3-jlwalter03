package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenNumberTest {
    @Test
    public void testEvenNumber(){
        EvenNumber number = new EvenNumber();
        boolean result = number.EvenNumber(4);
        Assertions.assertTrue(result);
    }

    @Test
    public void testNotEvenNumber(){
        EvenNumber number = new EvenNumber();
        boolean result = number.EvenNumber(7);
        Assertions.assertFalse(result);


    }
}
