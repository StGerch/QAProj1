package com.company.Animals;

public class Koala extends Animal
{
    public Koala(String name, float weight){
        super(name,weight);
        System.out.println("Koala!");
    }

    @Override
    public void nameSound() {
        System.out.println("Koala noises");
    }

    @Override
    public void eat() {
        System.out.println("Koala eats");
    }
    @Override
    public  void sleep(){
        System.out.println("Koala sleeps");
        sleep=true;
    }

    public  void Show(){
        System.out.println("KoalaShow");
    }
}
