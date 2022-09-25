package warehouse.commands;
import warehouse.delivery.Delivery;
import warehouse.delivery.DeliveryRegister;
import warehouse.user.UserRegister;

import java.util.ArrayList;

public interface Commands {
    static void commands(String command, Delivery[] deliveryRegister, UserRegister registeredUsers) {
        switch (command) {
            case "r":
                UserRegister.userRegister();
                DeliveryRegister.deliveryRegister();
                break;
            case "i": System.out.println("info"); CommandMessage.showInfoMessage();
                break;
            case "e": System.out.println("Exiting"); System.exit(0);
        }
    }


}
