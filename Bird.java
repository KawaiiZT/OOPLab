/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KoonD
 */
public abstract class Bird extends Animal implements Flyable{
    public Bird(String name, int power, int age) {
        super(name, 150, age);
    }
    @Override
    public abstract void fly();
    @Override
    public abstract void eat(Food f);
    public abstract void wingAttack(Animal a);
}
