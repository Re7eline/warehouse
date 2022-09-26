package warehouse.commands;

import warehouse.delivery.Delivery;
import warehouse.user.User;

import static warehouse.user.User.getRegisteredUsers;

public interface Commands {
    static void commands(String command) {
        if (command.equals("r") || command.equals("i") || command.equals("e")) {
            switch (command) {
                case "r":
                    Delivery.deliveryRegister();
                    User.userRegister();
                    break;
                case "i":
//                    if (getRegisteredUsers().toString().contains(null)){
//                        CommandMessage.noData();
//                    }else
                    System.out.println("Registered Users: " + getRegisteredUsers());
                    break;
                case "e":
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        } else {
            CommandMessage.error2();

        }

    }
}
