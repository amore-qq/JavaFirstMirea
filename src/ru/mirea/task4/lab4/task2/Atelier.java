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
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for (Clothes s : clothes) {
            if (s instanceof MenClothing) {
                ((MenClothing) s).dressMan();
            }
        }
    }

    public void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for (Clothes s : clothes) {
            if (s instanceof WomenClothing) {
                ((WomenClothing) s).dressWoman();
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {new Pants(Sizes.S, 1500, "black"),
                new TShirt(Sizes.XXS, 1000, "blue"),
                new Tie(Sizes.M, 1750, "purple"),
                new Skirt(Sizes.XS, 3350, "red")};
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        System.out.println();
        atelier.dressWoman(clothes);
    }
}


interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWoman();
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

    public void dressMan() {
        System.out.println("Мужская футболка: " + this);
    }

    public void dressWoman() {
        System.out.println("Женская футболка: " + this);
    }

    @Override
    public String toString() {
        return String.format("{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Мужские штаны: " + this);
    }

    public void dressWoman() {
        System.out.println("Женские штаны: " + this);
    }

    public String toString() {
        return String.format("{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}


class Skirt extends Clothes implements WomenClothing {
    public Skirt(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressWoman() {
        System.out.println("Юбка: " + this);
    }

    public String toString() {
        return String.format("{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Галстук: " + this);
    }

    public String toString() {
        return String.format("{Size = " + getSize() + ", cost = %.2f, color = %s}", getCost(), getColor());
    }
}