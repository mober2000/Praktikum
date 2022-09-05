package model;

import static model.constants.Discount.discountMeat;

public class Meat extends Food implements Discountable{

    public Meat(int amount, double price){
        super(amount, price);
        setIsVegetarian(false);
    }

    @Override
    public double getDiscount() {
        return discountMeat;
    }
}
