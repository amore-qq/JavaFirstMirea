package ru.mirea.task3.lab3_2;

public class Main {
    public static void main(String[] args) {
        Double d = Double.valueOf(123132);
        System.out.println("1) " + d);
        String s = "2931931";
        double a = Double.parseDouble(s);
        System.out.println("2) " + a);
        System.out.println("3) ");
        Double num = 3.14;
        double doubleNum = num.doubleValue();
        byte byteNum = num.byteValue();
        short shortNum = num.shortValue();
        int intNum = num.intValue();
        long longNum = num.longValue();
        float floatNum = num.floatValue();

        System.out.println("Значение double: " + doubleNum);
        System.out.println("Значение byte: " + byteNum);
        System.out.println("Значение short: " + shortNum);
        System.out.println("Значение int: " + intNum);
        System.out.println("Значение long: " + longNum);
        System.out.println("Значение float: " + floatNum);

        System.out.println("4) Значение объекта Double: " + num);

        String strNum = Double.toString(num);
        System.out.println("5) Преобразование литерала типа double к строке: " + strNum);
    }
}
