package model;

import static model.constants.Colour.RED_COLOUR;
import static model.constants.Discount.discountGreenApple;
import static model.constants.Discount.discountRedApple;

public class Apple extends Food implements Discountable {
    String colour;

        public Apple(int amount, double price, String colour){
            super(amount, price);
            setIsVegetarian(true);
            this.colour = colour;
        }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_COLOUR)) {
            return discountRedApple;
        } else {
            return discountGreenApple;
        }
    }

}

