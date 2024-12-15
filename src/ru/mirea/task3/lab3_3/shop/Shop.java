package ru.mirea.task3.lab3_3.shop;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

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

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        int notebook = 50000, pc = 159999, console = 63999, tv = 84000;
        System.out.println("Добро пожаловать в интернет-магазин!\nЖелаете что-нибудь приобрести?\n1) Да; 2) Нет");
        int ans = Integer.parseInt(sc.nextLine());
        if (ans == 2) {
            System.out.println("Жаль, всего доброго!\nБудем ждать Вас в следующий раз!");
        } else if (ans == 1) {
            boolean flag = true;
            while (flag) {
                System.out.println("Введите номер товара, который хотите приобрести:\n1) Ноутбук; 2) ПК; 3) Консоль; 4) Телевизор");
                num = Integer.parseInt(sc.nextLine()) - 1;
                if (num >= 0 && num <= 3) {
                    switch (num) {
                        case 0:
                            sum += notebook;
                            break;
                        case 1:
                            sum += pc;
                            break;
                        case 2:
                            sum += console;
                            break;
                        case 3:
                            sum += tv;
                            break;
                        default:
                            break;
                    }
                } else {
                    System.out.println("Товар не найден");
                }
                System.out.println("Желаете добавить что-то ещё в корзину?\n1) Да; 2) Нет");
                int something = Integer.parseInt(sc.nextLine());
                if (something == 2) {
                    System.out.println("Хорошо, перейдем к оплате.");
                    flag = false;
                }
            }
            System.out.println("Выберите одну из доступных валют для оплаты:\n1) Евро; 2) Доллары; 3) Рубли");
            int coin = Integer.parseInt(sc.nextLine());
            Converter converter = new Converter();
            if (coin == 1) {
                System.out.println(converter.toEuros(sum));
            } else if (coin == 2) {
                System.out.println(converter.toDollars(sum));
            } else if (coin == 3) {
                System.out.printf("\nК оплате: %.2f ₽\nСпасибо за покупку, будем ждать Вас снова!", (double) sum);
            }
        }
    }
}