package org.example;

import java.sql.SQLOutput;
import java.text.Format;

public class Cards {

    public String suit;
    public String colour;

    public Cards(String suit, String colour) {
        this.suit = suit;
        this.colour = colour;
    }

    public static void main(String[] args) {
        Cards firstcard = new Cards("spades", "black");
        Cards secondcard = new Cards("clubs", "black");
        Cards thirdcard = new Cards("diamonds", "red");
        Cards fourthcard = new Cards("hearts", "red");
        Cards[] array = new Cards[4];
        for (int index = 0; index < array.length; index++) {
            switch (index) {
                case 0:
                    array[0] = firstcard;
                    break;
                case 1:
                    array[1] = secondcard;
                    break;
                case 2:
                    array[2] = thirdcard;
                    break;
                case 3:
                    array[3] = thirdcard;
                    break;
            }
        }
        for (Cards lod : array) {
            System.out.println(lod.suit);
        }
//        for (int index = 0; index < array.length; index++) {
//            Cards got = array[index];
//            System.out.println(got.suit);
//        }
    }

}
