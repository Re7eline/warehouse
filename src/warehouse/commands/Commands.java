package warehouse.commands;

import warehouse.delivery.Delivery;
import warehouse.user.User;

import static warehouse.user.User.getRegisteredUsers;

public interface Commands {
    static void commands(String command) {
        if (command.equals("r") || command.equals("i") || command.equals("e")) {
            switch (command) {
                case "r":
                    User.userRegister();
                    Delivery.deliveryRegister();
                    break;
                case "i":
                    System.out.println(getRegisteredUsers()+" Your type of delivery: "+Delivery.getPackageTypes());
                    CommandMessage.info();
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
