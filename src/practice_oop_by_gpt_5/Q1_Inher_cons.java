package practice_oop_by_gpt_5;
//🧩 1. Inheritance + Constructor
//Question:
//Ek class Vehicle banao jisme speed aur color ho.
//Car class banao jo Vehicle ko extend kare aur ek method display() likhe jo dono properties print kare.
//👉 Phir ek Car object banao aur values print karwao.

class Vehicle {
    int speed;
    String colour;
}
    class Car extends Vehicle {
        void display () {
            this.speed = 40;
            this.colour = "red";
            System.out.println("speed = " + speed);
            System.out.println("colour = " + colour);
        }
    }
public class Q1_Inher_cons {
    public static void main(String[] args) {
Car c1 = new Car();
c1.display();
    }
}
