package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = k + 1;
        h = 2 * h;
        h = p / h;
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

     public static void main(String[] args) {
         double result1 = SqArea.square(6, 2);
         System.out.println(" p = 6, k = 2, s = 2, real = " + result1);


     }

}
