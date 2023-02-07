package com.company.animal;

public class HeirAnimal {
    protected String type;
    protected String name;
    private final int age;
    private final float weight;
    private final boolean isFly;
    private final boolean isWalk;
    private final boolean isSwim;

    public HeirAnimal(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
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

class HeirBird extends HeirAnimal {

    private String area;
    private boolean winterFly;

    public HeirBird() {
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
        System.out.println("Chirik-Chirik");
    }

    @Override
    void display() {
        System.out.print("I am " + type);
        super.display();
        System.out.println("Area : " + area + ", Winter Fly: " + winterFly);
    }
}

class HeirFish extends HeirAnimal {

    private String squamous;
    private boolean upStreamSwim;

    public HeirFish() {
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

    @Override
    void display() {
        System.out.print("I am " + type);
        super.display();
        System.out.println("Squamous : " + squamous + ", Up Stream Swim : " + upStreamSwim);
    }
}

class HeirInsect extends HeirAnimal {

    private int wingCount;
    private boolean likeJesus;

    public HeirInsect() {
        super("Insect", null, 0, 0.0f, true, true, true);
    }

    void ggggg() {
        System.out.println("G-g-g-g-g");
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

    @Override
    void display() {
        System.out.print("I am " + type);
        super.display();
        System.out.println("Wing Count : " + wingCount + ", Like Jesus: " + likeJesus);
    }
}

class MainHeirTask {
    public static void main(String[] args) {
        HeirAnimal duck = new HeirAnimal("Duck", "Donald", 3, 5.8f, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.setArea("On the sea");
        b.setWinterFly(false);
        b.display();
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.voiceBird();

        Fish f = new Fish();
        f.setName("Pile");
        f.setSquamous("Big");
        f.setUpStreamSwim(true);
        f.display();
        System.out.println(f.getSquamous());
        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.display();
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.voiceInsect();
    }
}