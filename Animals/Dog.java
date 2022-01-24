package com.company.Animals;

public class Dog extends Animal{

    public Dog(String name,float weight){
        super(name,weight);

    }
    @Override
    public void nameSound() {
        System.out.println("Dog sound");
    }

    @Override
    public void eat() {
        System.out.println("Hotdoggy time!");
    }

    @Override
    public void sleep() {
        System.out.println("Doggy goes to sleep");
        sleep=true;
    }
}
