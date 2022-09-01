package model.constants;

import model.Discountable;

public class Discount implements Discountable {

        @Override
        public double getDiscount () {
        return 60.0;
    }

}
