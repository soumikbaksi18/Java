public class Animal {
    String name;
    String color;
    int legs;
    double price;

    Animal(String name, String color, int legs, double price){
        this.name = name;
        this.color = color;
        this.legs = legs;
        this.price = price;

    }
     void displayIt() {
        System.out.println(name+" "+color+" Legs: "+legs+" Price: "+price);
    }
}