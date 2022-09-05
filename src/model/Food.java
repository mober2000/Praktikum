package model;

import static model.constants.Colour.GREEN_COLOUR;
import static model.constants.Colour.RED_COLOUR;

public abstract class Food {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price) {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }


    public void setIsVegetarian(boolean isVegetarian){
       this.isVegetarian = isVegetarian;
    }





}
