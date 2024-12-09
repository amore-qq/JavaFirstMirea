package ru.mirea.task4.lab4.task4;

enum Brand {
    GIGABYTE,
    ASUS,
    DELL,
    SAMSUNG,
    DEXP, // XDD
    APPLE
}

class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    @Override
    public String toString() {
        return "Процессор: " + model + ", Базовая частота:  " + clockSpeed + " GHz";
    }
}

class Memory {
    private String type;
    private int size;

    public Memory(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Тип памяти: " + type + ", Размер памяти: " + size + " GB";
    }
}

class Monitor {
    private String model;
    private double size;

    public Monitor(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Модель монитора: " + model + ", Размер: " + size + "\"";
    }
}

class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Компьютер: " + brand + "\n" +
                processor + "\n" +
                memory + "\n" +
                monitor;
    }
}

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel Core i7", 3.5);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("Dell UltraSharp", 27.0);

        Computer computer = new Computer(Brand.DELL, processor, memory, monitor);

        System.out.println(computer);
    }
}
