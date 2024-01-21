/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs06;

/**
 *
 * @author KoonD
 */
public class Seller extends Employee {
    public Food sell(Employee e){
        Food food = new Food();
        double price = Food.getPrice();
        if (e.getWallet().getBalance() >= Food.getPrice()){
            getWallet().setBalance(getWallet().getBalance() + price);
            e.getWallet().setBalance(e.getWallet().getBalance() - price);
            return food;
        }
        else{
            System.out.println("Your money is not enough");
            return null;
        }
    }
}
