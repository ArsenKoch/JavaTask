package com.company.eblan;

public class OverriddenAnimal {
    protected String type;
    protected String name;
    private int age;
    private float weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    public OverriddenAnimal(String type, String name, int age, float weight, boolean isFly, boolean isWalk, boolean isSwim) {
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

class OverriddenBird extends OverriddenAnimal {

    private String area;
    private boolean winterFly;

    public OverriddenBird() {
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

    void chirickChirick() {
        System.out.println("Chirik-Chirik");
    }

    @Override
    void display() {
        System.out.print("I am " + type);
        super.display();
        System.out.println("Area : " + area + ", Winter Fly: " + winterFly);
    }
}

class OverriddenFish extends OverriddenAnimal {

    private String squama;
    private boolean upStreamSwim;

    public OverriddenFish() {
        super("Fish", null, 0, 0.0f, false, false, true);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public String getSquama() {
        return squama;
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
        System.out.println("Squama : " + squama + ", Up Stream Swim : " + upStreamSwim);
    }
}

class OverriddenInsect extends  OverriddenAnimal{

    private int wingCount;
    private boolean likeJesus;

    public OverriddenInsect() {
        super("Insect", null, 0, 0.0f, true, true, true);
    }

    void ggggg() {
        System.out.println("Ggggg");
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

class Main232 {
    public static void main(String[] args) {
        OverriddenAnimal duck = new OverriddenAnimal("Утка", "Утя", 3, 5.8f, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.setArea("На югах");
        b.setWinterFly(false);
        b.display();
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirickChirick();

        Fish f = new Fish();
        f.setName("Сельд");
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        f.display();
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bulBul();

        Insect i = new Insect();
        i.setName("Жук Жукыч");
        i.setWingCount(4);
        i.setLikeJesus(true);
        i.display();
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}

