package warehouse.delivery;

import warehouse.arrays.Arrays;
import warehouse.commands.CommandMessage;
import warehouse.commands.Commands;
import warehouse.enums.Colours;

import java.util.Scanner;

public class Delivery {
    private static int i;
    private static String check;

    public static void deliveryRegister() {
        Scanner scanner = new Scanner(System.in);
        CommandMessage.newDelivery();
        System.out.println(Colours.ANSI_YELLOW + "Select the type of delivery. Choose 0-2:" + Colours.ANSI_RESET);
        System.out.println(Arrays.getPackageTypes());
        check = scanner.next();
        Commands.check(check);
        System.out.println(Colours.ANSI_YELLOW + "Select Destination. Choose 0-2:" + Colours.ANSI_RESET);
        System.out.println(Arrays.getDestinations());
        check = scanner.next();
        Commands.check(check);

        System.out.println(Colours.ANSI_GREEN + "You've ordered: " + Arrays.getPackageTypes().get(i) +
                " Delivery in the " + Arrays.getDestinations().get(i) + Colours.ANSI_RESET);
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Delivery.i = i;
    }


}

