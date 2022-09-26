package warehouse.delivery;

import warehouse.commands.CommandMessage;
import warehouse.enums.PackageType;

import java.util.ArrayList;
import java.util.Scanner;

import static warehouse.enums.PackageType.*;

public class Delivery {
    private static int i;
    private static ArrayList<PackageType> packageTypes = new ArrayList<>(3);
    public static void deliveryRegister() {

        packageTypes.add(0, PLASTICBOX);
        packageTypes.add(1, PAPERBOX);
        packageTypes.add(2, WOODBOX);

        Scanner scanner = new Scanner(System.in);
        CommandMessage.newDelivery();
        System.out.println("Select the type of delivery. Choose 0-2:");
        System.out.println(packageTypes);

        int check = scanner.nextInt();
        if (check > 0 || check < 2) {

            if (check == 0) {
                i = 0;
                packageTypes.get(i);
            } else if (check == 1) {
                i=1;
                packageTypes.get(i);
            } else if (check == 2) {
                i=2;
                packageTypes.get(i);
            }
        } else {
            CommandMessage.error();
            return;
        }
        System.out.println("You've ordered: " + packageTypes.get(i));
        CommandMessage.info();
    }

    public static ArrayList<PackageType> getPackageTypes() {
        return packageTypes;
    }

    public static int getI() {
        return i;
    }
}