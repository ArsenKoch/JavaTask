package com.company.eblan;

public class Animal {
    String type;
  private   String name;
    int age;
    float weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;


    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }


    void rename(String s) {
        name = s;
    }

    void holiday(int i) {
        weight += i * 0.1F;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;

    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        name = "No Name";
    }

    public Animal(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

}