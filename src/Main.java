import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_COLOUR;
import static model.constants.Colour.RED_COLOUR;


public class Main {
    public static void main(String args[]){

        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, RED_COLOUR);
        Apple greenApple = new Apple(10, 44, GREEN_COLOUR);



    }
}
