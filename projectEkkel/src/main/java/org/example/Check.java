package org.example;

public class Check {
    int chekOne;
    char chekTwo;

    public Check(int chekOne, char chekTwo) {
        this.chekOne = chekOne;
        this.chekTwo = chekTwo;
    }

    @Override
    public String toString() {
        return "Check{" +
                "chekOne=" + chekOne +
                ", chekTwo=" + chekTwo +
                '}';
    }
}
