package ru.mirea.task4.lab4.task1;

enum Seasons {
    WINTER(-15),
    SPRING(10),
    SUMMER(25){
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(13);

    private final int temperature;
    Seasons(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
public class Main {
    public static void main(String[] args) {
        Seasons season = Seasons.AUTUMN;
        iLove(season);
        for (Seasons season1 : Seasons.values()) {
            getInfo(season1);
        }
    }
    public static void iLove(Seasons season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю " + season);
            case SPRING -> System.out.println("Я люблю " + season);
            case SUMMER -> System.out.println("Я люблю " + season);
            case AUTUMN -> System.out.println("Я люблю " + season);
            default -> System.out.println("Я не люблю ни одно из времён года =(");
        }
    }
    public static void getInfo(Seasons season) {
        String info = "Средняя температура равна: ";
        System.out.println(String.format(season + ". %s" + season.getTemperature() + ". " + season.getDescription(), info));
    }
}
