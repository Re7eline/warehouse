package warehouse.commands;
import warehouse.delivery.Delivery;
import warehouse.user.User;
import java.util.stream.Stream;
import static warehouse.user.User.getRegisteredUsers;
import static warehouse.user.User.userRegister;

public interface Commands {
    static void check(String check) {
        if (check.equals("0") || check.equals("1") || check.equals("2")) {
            switch (check) {
                case "0":
                    Delivery.setI(0);
                    Delivery.getPackageTypes().get(Delivery.getI());
                    Delivery.getDestinations().get(Delivery.getI());
                    break;
                case "1":
                    Delivery.setI(1);
                    Delivery.getPackageTypes().get(Delivery.getI());
                    Delivery.getDestinations().get(Delivery.getI());
                    break;
                case "2":
                    Delivery.setI(2);
                    Delivery.getPackageTypes().get(Delivery.getI());
                    Delivery.getDestinations().get(Delivery.getI());
                    break;
            }
        } else {
            CommandMessage.error();
            System.out.println("Will be a basic statement");
        }

    }

    static void commands(String command) {
        if (command.equals("r") || command.equals("i") || command.equals("e")) {
            switch (command) {
                case "r":
                    Delivery.deliveryRegister();
                    User.userRegister();
                    break;
                case "i":
                    if (getRegisteredUsers().isEmpty()) {
                        CommandMessage.noData();
                    } else  System.out.println("Registered Users: ");
                    Stream.of(getRegisteredUsers()).forEach(System.out::println);
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
