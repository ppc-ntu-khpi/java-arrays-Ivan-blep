package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {

        int R=100000;// Кількість техніки
        System.out.println("The amount of seized military equipment: "+Exercise.Calculate(R));
    }
}

