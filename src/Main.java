import model.Apple;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.greenColour;
import static model.constants.Colour.redColour;

public class Main {
    public static void main(String args[]){

        Meat meat = new Meat(5, 100, false);
        Apple redApple = new Apple(10, 50, redColour, true);
        Apple greenApple = new Apple(8, 60, greenColour, true);
    }


}
