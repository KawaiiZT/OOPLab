/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KoonD
 */
public class Pigeous extends Bird   {
    public Pigeous(){
        super("", 150, 0);
    }
    public Pigeous(String name, int age){
        super(name , 150, age);
    }
    
    @Override
    public void eat(Food f){
        setPower(getPower() + (f.getPower() * 2));
    }
    @Override
    public void fly(){
        System.out.println(getName() + " fly fly ....");
    }
    @Override
    public void wingAttack(Animal a){
        a.setPower(a.getPower() - 5);
    }
    public void wingAttack(Animal a, int times){
        for( int i = 1 ; i <= times ; i++){
            a.setPower(a.getPower() - 5);
        }
        
    }
}
