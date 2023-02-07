package com.company.writingmaterials;

public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean canDraw;

    void display() {
        System.out.println("Name: " + name + ", Color: " + color + ", Length: " + length + ", Price: " + price + ", Can draw: " + (canDraw ? "Yes" : "No"));
    }

    void replaceRod(String newColor) {
        color = newColor;
    }

    void priceUp(int up) {
        price += up;
    }

    void priceDown(int down) {
        price -= down;
    }

    void draw() {
        if (canDraw) System.out.println(name + " drew a line. Her color - " + color + ".");
        else System.out.println(name + " can't draw anything.");
    }
}

class MainWritingMaterials {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.name = "Pen";
        pen.color = "Red";
        pen.length = 15.6;
        pen.price = 145;
        pen.canDraw = true;
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replaceRod("Blue");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.name = "Ruler";
        ruler.length = 30.0;
        ruler.price = 25;
        ruler.canDraw = false;
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();
    }
}