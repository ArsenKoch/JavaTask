package com.company.eblan;

public class AnimalTask2 {
    private final String type;
    private final String name;
    private final int age;
    private float weight;
    private final boolean isFly;
    private final boolean isWalk;
    private final boolean isSwim;

    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }

    void holiday() {
        weight += 0.1F;
    }

    void holiday(float m) {
        weight += m;
    }

    void holiday(double m, int n) {
        weight += (n * m);
    }

    public AnimalTask2(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }
}

class MainTask2 {
    public static void main(String[] args) {
        AnimalTask2 duck = new AnimalTask2("Duck", "Donald", 3, 5.8f, true, true, true);
        duck.display();

        duck.holiday();
        duck.display();

        duck.holiday(5);
        duck.display();

        duck.holiday(0.4f);
        duck.display();

        duck.holiday(0.3, 2);
        duck.display();
    }
}