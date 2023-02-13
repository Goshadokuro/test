package org.example;

public class Main {
   public static void main(String[] args) {
      Integer addition =Main.addition(3,5);
      Integer subtraction =Main.subtraction(10,2);
      Integer multiply =Main.multiply(4,2);
      Integer division =Main.division(16,2);
      System.out.printf("Results: plus = %d, minus = %d, ymnojit = %d, razdelity = %d \n", addition,subtraction,multiply,division);
    }

    private static Integer addition(Integer a, Integer b) {
      return a+b;
    }

    private static Integer subtraction(Integer a, Integer b) {
       return a-b;
    }

    private static Integer multiply(Integer a, Integer b){
       return a*b;
    }

    private static Integer division(Integer a, Integer b){
        return a/b;
    }
}

