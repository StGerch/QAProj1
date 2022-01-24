package com.company.Animals;

public abstract class Animal {
    String name;
    float weight;
    boolean sleep;
    public Animal(String name, float weigh){
        System.out.println("Animal created!");
        this.name=name;
        this.weight=weigh;
        sleep=false;
    }
    public abstract void nameSound();
    public abstract  void eat();
    public abstract  void sleep();
    public void show(){
        System.out.println("Name: "+name+"\nWeight: "+weight);
    }
}
