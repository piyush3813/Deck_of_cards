package com.bridgelabz;

import java.util.Random;

public class DeckOfCards {
    public DeckOfCards() {
    }

    public static String[] shuffleCardsDeck(String[] arr) {
        Random random = new Random();

        for(int i = 0; i < 52; ++i) {
            int f1 = random.nextInt(51);
            int f2 = random.nextInt(51);
            if (f1 != f2) {
                String temp = arr[f1];
                arr[f1] = arr[f2];
                arr[f2] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        String[] cardType = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] cardNumbers = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] cardsArray = new String[52];
        int start = 0;
        int end = 12;
        int j1 = 0;

        int j2;
        int i;
        for(j2 = 0; j2 < 4; ++j2) {
            for(i = start; i <= end; ++i) {
                cardsArray[i] = cardType[j2] + " " + cardNumbers[j1];
                ++j1;
            }

            j1 = 0;
            start = end + 1;
            end += 13;
        }

        shuffleCardsDeck(cardsArray);
        System.out.println("**************************************");
        j2 = 0;

        for(i = 0; i < 4; ++i) {
            System.out.print("For Player " + i + ": \n");

            for(int j = 0; j < 9; ++j) {
                System.out.print(cardsArray[j2] + "-->");
                ++j2;
            }

            System.out.println();
        }

    }
}

