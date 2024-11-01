package ru.mirea.task4.lab4.task2;

enum Sizes {
    XXS(32) {
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {new Pants(Sizes.S, 1500, "black"),
                new TShirt(Sizes.XXS, 1000, "blue"),
                new Tie(Sizes.M, 1750, "purple"),
                new Skirt(Sizes.XS, 3350, "red")};
        dressMan(clothes);
        System.out.println();
        dressWoman(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes s : clothes) {
            if (s instanceof MenClothing) {
                System.out.println(s);
            }
        }
    }

    public static void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes s : clothes) {
            if (s instanceof WomenClothing) {
                System.out.println(s);
            }
        }
    }
}

interface MenClothing {
    static String dressMan() {
        return "Одеваем мужчину";
    }
}

interface WomenClothing {
    static String dressWoman() {
        return "Одеваем женщину";
    }
}

abstract class Clothes {
    private final Sizes size;
    private final double cost;
    private final String color;

    Clothes(Sizes size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Sizes getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public String toString() {
        return String.format("TShirt{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, double cost, String color) {
        super(size, cost, color);
    }
    public String toString() {
        return String.format("Pants{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}


class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }
    public String toString() {
        return String.format("Skirt{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, double cost, String color) {
        super(size, cost, color);
    }
    public String toString() {
        return String.format("Tie{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}