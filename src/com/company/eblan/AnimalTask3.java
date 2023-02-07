package com.company.eblan;

public class AnimalTask3 {
    private final String type;
    private String name;
    private int age;
    private float weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;


    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }


    void rename() {
        name = "Donald Duck";
    }


    public AnimalTask3(String type, String name) {
        this.type = type;
        this.name = name;

    }

    public AnimalTask3(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSwim(boolean isSwim) {
        this.isSwim = isSwim;
    }

    public void setWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }

    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public boolean isFly() {
        return isFly;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public boolean isWalk() {
        return isWalk;
    }

}

class MainTask3 {
    public static void main(String[] args) {
        AnimalTask3 tiger = new AnimalTask3("Tiger", "Artem");
        tiger.setAge(15);
        tiger.setWeight(300.6f);
        tiger.setSwim(true);
        tiger.setWalk(true);
        tiger.setFly(false);
        tiger.display();

        AnimalTask3 duck = new AnimalTask3("Duck", "Donald", 3, 5.8f, true, true, true);

        duck.rename();
        duck.display();
        System.out.println(duck.getAge());
        System.out.println(duck.getName());
        System.out.println(duck.getWeight());
        System.out.println(duck.getType());
        System.out.println(duck.isSwim());
        System.out.println(duck.isWalk());
        System.out.println(duck.isFly());
    }
}