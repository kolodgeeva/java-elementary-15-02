package com.company.lesson3;

public class Bicycle {

    private int height;
    private String model;

    public Bicycle(int height, String model) {
        this.height = height;
        this.model = model;
    }

    public void ride() {
        System.out.println("ride");
    }

    class SteeringWheel {

        public void left() {
            System.out.println("left");
        }

        public void right() {
            System.out.println("right");
        }

    }

    class Seat {

        public void up() {
            height++;
            System.out.println("bicycle height: " + height);
            System.out.println("up");
        }

        public void down() {
            height--;
            System.out.println("bicycle height: " + height);
            System.out.println("down");
        }

    }
}
