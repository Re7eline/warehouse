package warehouse.commands;

import warehouse.arrays.Arrays;
import warehouse.delivery.Delivery;
import warehouse.enums.Colours;
import warehouse.user.User;

import java.util.stream.Stream;

import static warehouse.arrays.Arrays.getRegisteredUsers;


public interface Commands {
    static void check(String check) {
        if (check.equals("0") || check.equals("1") || check.equals("2")) {
            switch (check) {
                case "0":
                    Delivery.setI(0);
                    Arrays.getPackageTypes().get(Delivery.getI());
                    Arrays.getDestinations().get(Delivery.getI());
                    break;
                case "1":
                    Delivery.setI(1);
                    Arrays.getPackageTypes().get(Delivery.getI());
                    Arrays.getDestinations().get(Delivery.getI());
                    break;
                case "2":
                    Delivery.setI(2);
                    Arrays.getPackageTypes().get(Delivery.getI());
                    Arrays.getDestinations().get(Delivery.getI());
                    break;
            }
        } else {
            CommandMessage.error();

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
                    } else System.out.println("Registered Users: ");
                    Stream.of(getRegisteredUsers()).forEach(System.out::println);
                    break;
                case "e":
                    System.out.println(Colours.ANSI_RED +"Exiting...");
                    System.exit(0);
            }
        } else {
            CommandMessage.error2();
        }
    }
}
