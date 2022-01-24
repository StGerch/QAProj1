package com.company.Animals;

public class Horse extends Animal{
    public Horse(String name,float weight){
        super(name,weight);
    }

    @Override
    public void nameSound() {
        System.out.println("Igogo");
    }

    @Override
    public void eat() {
        System.out.println("Horse eats");
    }

    @Override
    public void sleep() {
        System.out.println("Horse tired. Horse sleeps");
        sleep=true;
    }

}
