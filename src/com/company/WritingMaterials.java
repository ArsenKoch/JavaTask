package com.company;

public class WritingMaterials {
    // TODO: 29.04.2022 Add private thing
    String name;
    String color;
    int price;
    double length;
    boolean canDraw;

    void display() {
        System.out.println("Название: " + name + ", Цвет: " + color + ", Длина: " + length + ", Цена: " + price + ", Умеет рисовать: " + (canDraw ? "Да" : "Нет"));
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
        if (canDraw) System.out.println(name + " провел линию. Ее цвет - " + color + ".");
        else System.out.println(name + " не может ничего нарисовать.");
    }
}

class Main4 {
    public static void main(String[] args) {
        WritingMaterials pen = new WritingMaterials();
        pen.name = "ручка";
        pen.color = "Красный";
        pen.length = 15.6;
        pen.price = 145;
        pen.canDraw = true;
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replaceRod("Синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.name = "линейка";
        ruler.length = 30.0;
        ruler.price = 25;
        ruler.canDraw = false;
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();
    }
}
