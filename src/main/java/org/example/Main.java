package org.example;

public class Main {
   public static void main(String[] args) {
      Integer res =Main.result(3,5);
      Integer res2 =Main.result2(10,2);
      Integer res3 =Main.result3(4,2);
      Integer res4 =Main.result4(16,2);
      System.out.println(res);
      System.out.println(res2);
      System.out.println(res3);
      System.out.println(res4);
    }

    private static Integer result(Integer a, Integer b) {
      return a+b;
    }

    private static Integer result2(Integer a, Integer b) {
       return a-b;
    }

    private static Integer result3(Integer a, Integer b){
       return a*b;
    }

    private static Integer result4(Integer a, Integer b){
        return a/b;
    }
}

