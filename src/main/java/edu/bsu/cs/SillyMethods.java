package edu.bsu.cs;

public class SillyMethods {
    public boolean didGuess42(int numberGuessed){
        return numberGuessed == 42;
    }


    public String countTo(int numberCountedTo) {
        StringBuilder result = new StringBuilder();
        iterateAndAppendCurrentNumbers(result, numberCountedTo);
        return result.toString().trim();
    }

    private void iterateAndAppendCurrentNumbers(StringBuilder result, int numberCountedTo) {
        for (int currentNumber = 0; currentNumber <= numberCountedTo; currentNumber++) {
            appendNumber(result, currentNumber);
        }
    }

    private void appendNumber(StringBuilder result, int number) {
        result.append(number).append(" ");
    }

}
