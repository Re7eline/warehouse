package warehouse.commands;
import warehouse.delivery.Delivery;
import warehouse.user.User;
import static warehouse.user.User.registeredUsers;

public interface Commands {
    static void commands(String command) {
        switch (command) {
            case "r":
                User.userRegister();
                Delivery.deliveryRegister();
                break;
            case "i": System.out.println(registeredUsers.toString());;
                break;
            case "e": System.out.println("Exiting"); System.exit(0);
        }
    }


}
