package com.springlifecycle.demo;

public class Restaruant {
   IHotDrink hotDrink;
   //This is the Constructer method
   /*Restaruant(IHotDrink hotDrink){
       this.hotDrink = hotDrink;
   }*/

    //this is setter method
    public void setHotDrink(IHotDrink hotDrink){
        this.hotDrink = hotDrink;
    }
   public void prepareHotDrink(){
       hotDrink.preapareHotDrink();
   }

}
