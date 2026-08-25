/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.billsburgerchallenge;

/**
 *
 * @author ABYUU
 */
public class BillsBurgerChallenge {

    public static void main(String[] args) {
        
        //        Item coke = new Item("drink", "coke", 1.50);
//          coke.printItem();
//          coke.setSize("LARGE");
//          coke.printItem();
// 
//          Item avocado = new Item("Topping", "avocado", 1.50);
//          avocado.printItem();
//
//          Burger burger = new Burger("regular", 4.00);
//          burger.addToppings("BACON", "CHEESE", "MAYO");
//          burger.printItem();

//          MealOrder reularMeal = new MealOrder();
//          reularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//          reularMeal.setDrinkSize("LARGE");
//          reularMeal.printItemizedList();

//            MealOrder secondMeal = new MealOrder("turkey", "7-up" , "chili");
//            secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//            secondMeal.setDrinkSize("SMALL");
//            secondMeal.printItemizedList();

              MealOrder deluxeMeal =new MealOrder("deluxe","7 Up","chili");
              deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE","CHEESE","MAYO");
              deluxeMeal.setDrinkSize("SMALL");
              deluxeMeal.printItemizedList();








    }
}
