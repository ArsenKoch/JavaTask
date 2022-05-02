package com.company.eblan;

public class InheritanceAnimal {
    private String type;
    private String name;
    private int age;
    private float weight;
    boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    void display() {
        System.out.print(" Type: " + type + " , Name: " + name + " , Age: " + age + " , Weight: " + weight + " , IsFly: " + (isFly ? "yes" : "no"));
        System.out.println(" , isWalk : " + (isWalk ? "yes" : "no") + " , isSwim : " + (isSwim ? "yes" : "no"));
    }
}

    class Bird extends InheritanceAnimal {
        String name1;
        String area;
        boolean winterFly;

        public void setName(String name1) {
            this.name1 = name1;
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

        void chirick_chirick() {
            System.out.println("Chirik-Chirik");
        }
    }

     class Fish extends InheritanceAnimal {
        String name2;
        String squama;
        boolean upStreamSwim;

        public void setName2(String name2) {
            this.name2 = name2;
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

        void bul_bul() {
            System.out.println("Bul-bul");
        }

    }

     class Insect extends InheritanceAnimal {
        String name3;
        int wingCount;
        boolean likeJesus;

        void ggggg() {
            System.out.println("Ggggg");
        }

        public void setName3(String name3) {
            this.name3 = name3;
        }

        public void setWingCount(int wingCount) {
            this.wingCount = wingCount;
        }
        public void setLikeJesus(boolean likeJesus){
            this.likeJesus = likeJesus;
        }

        public int getWingCount() {
            return wingCount;
        }

        public boolean isLikeJesus() {
            return likeJesus;
        }
    }


class Main23{
    public static void main(String[] args) {
        Animal duck = new Animal("Утка", "Утя", 3, 5.8f, true, true, true);
        duck.display();

        Bird b = new Bird();
        b.setName("Bob");
        b.display();
        b.setArea("На югах");
        b.setWinterFly(false);
        System.out.println(b.getArea());
        System.out.println(b.isWinterFly());
        b.chirick_chirick();

        Fish f = new Fish();
        f.setName2("Сельд");
        f.display();
        f.setSquama("Крупная");
        f.setUpStreamSwim(true);
        System.out.println(f.getSquama());
        System.out.println(f.isUpStreamSwim());
        f.bul_bul();

        Insect i = new Insect();
        i.setName3("Жук Жукыч");
        i.display();
        i.setWingCount(4);
        i.setLikeJesus(true);
        System.out.println(i.getWingCount());
        System.out.println(i.isLikeJesus());
        i.ggggg();
    }
}

