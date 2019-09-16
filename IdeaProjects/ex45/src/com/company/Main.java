package com.company;

class Bicycle {
    String defineMe() {
        return "a vehicle with pedals.";
    }
}

class Motorcycle extends Bicycle {
    String defineMe() {
        return "a cycle with an engine.";
    }
    Motorcycle() {
        System.out.println("Hello I am a motorcycle, I am " + defineMe());
        System.out.println("My ancestor is a cycle who is " + super.defineMe());
    }
}
public class Main {

    public static void main(String[] args) {
	Motorcycle M = new Motorcycle();
    }
}
