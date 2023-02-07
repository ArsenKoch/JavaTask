package com.company.animal;

public class AnimalTask1 {
    String type;
    String name;
    int age;
    float weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;

    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }

    void rename() {
        name = "Утя-Утя";
    }

    void holiday(int i) {
        weight += i * 0.1F;
    }

    public AnimalTask1(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public AnimalTask1(String type, int age) {
        this.type = type;
        this.age = age;
        name = "No Name";
    }

    public AnimalTask1(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public static class MainTask1 {
        public static void main(String[] args) {
            AnimalTask1 tiger = new AnimalTask1("Tiger", "Violeta");
            tiger.age = 15;
            tiger.weight = (float) 300.6;
            tiger.isSwim = true;
            tiger.isWalk = true;
            tiger.isFly = false;
            tiger.display();

            AnimalTask1 sparrow = new AnimalTask1("Sparrow", 5);
            sparrow.weight = 2;
            sparrow.isSwim = false;
            sparrow.isWalk = true;
            sparrow.isFly = true;
            sparrow.display();

            AnimalTask1 duck = new AnimalTask1("Duck", "Donald", 3, 5.8f, true, true, true);
            duck.holiday(5);
            duck.rename();
            duck.display();
        }
    }
}