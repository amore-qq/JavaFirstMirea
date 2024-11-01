package ru.mirea.task3.lab3_3;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        Converter obj = new Converter();
        double n = sc.nextDouble();
        System.out.println(obj.toDollars(n) + " " + obj.toEuros(n));
    }
}

class Converter {
    private double dollar = 92.71;
    private double euro = 103.47;
    private double res = 0;
    NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat numberFormat2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
    public String toDollars(double amount) {
        res = amount / dollar;
        return numberFormat1.format(res);
    }
    public String toEuros(double amount) {
        res = amount / euro;
        return numberFormat2.format(res);
    }
}
