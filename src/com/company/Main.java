package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setSpeed(Fan.FAST);
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        System.out.println(fan2.toString());
    }
}
