package warehouse;

import warehouse.delivery.DeliveryRegister;
import warehouse.user.UserRegister;

public class Main {
    public static void main(String[] args) {
        UserRegister.userRegister();
        DeliveryRegister.deliveryRegister();


    }
}
