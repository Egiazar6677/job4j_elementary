package ru.job4j.ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(183);
        double woman = Fit.womanWeight(160);
        System.out.println("Man 183 is " + man);
        System.out.println("Woman 160 is " + woman);
    }
}
