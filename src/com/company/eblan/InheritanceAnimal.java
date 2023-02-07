package com.company.eblan;

public class InheritanceAnimal {
    private final String type;
    protected String name;
    private final int age;
    private final float weight;
    private final boolean isFly;
    private final boolean isWalk;
    private final boolean isSwim;

    public InheritanceAnimal(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }
}

class Bird extends InheritanceAnimal {

    private String area;
    private boolean winterFly;

    public Bird() {
        super("Bird", null, 0, 0.0f, true, true, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }

    public String getArea() {
        return area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    void voiceBird() {
        System.out.println("Chiril-Chiril");
    }
}

class Fish extends InheritanceAnimal {
    private String squamous;
    private boolean upStreamSwim;

    public Fish() {
        super("Fish", null, 0, 0.0f, false, false, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquamous(String squamous) {
        this.squamous = squamous;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public String getSquamous() {
        return squamous;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    void bulBul() {
        System.out.println("Bul-bul");
    }
}

class Insect extends InheritanceAnimal {

    private int wingCount;
    private boolean likeJesus;

    public Insect() {
        super("Insect", null, 0, 0.0f, true, true, true);
    }

    void voiceInsect() {
        System.out.println("G-g-g-g");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public int getWingCount() {
        return wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }
}

class MainInheritanceTask {
    public static void main(String[] args) {
        InheritanceAnimal duck = new InheritanceAnimal("Duck", "Donald", 3, 5.8f, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("On the sea");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.voiceBird();

        Fish f = new Fish();
        f.setName("Pike");
        f.display();
        f.setSquamous("Big");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquamous());
        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        Insect i = new Insect();
        i.setName("Beetle Zhukovsky");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.voiceInsect();
    }
}