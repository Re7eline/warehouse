package warehouse.delivery;

import warehouse.commands.CommandMessage;
import warehouse.enums.Destination;
import warehouse.enums.PackageType;

import java.util.ArrayList;
import java.util.Scanner;

import static warehouse.enums.Destination.*;
import static warehouse.enums.PackageType.*;

public class Delivery {
    private static int i;
    private static int check;
    private static ArrayList<PackageType> packageTypes = new ArrayList<>(3);
    private static ArrayList<Destination> destinations = new ArrayList<>(3);

    public static void deliveryRegister() {

        packageTypes.add(0, PLASTICBOX);
        packageTypes.add(1, PAPERBOX);
        packageTypes.add(2, WOODBOX);
        destinations.add(0, CITY);
        destinations.add(1, REGION);
        destinations.add(2, COUNTRY);

        Scanner scanner = new Scanner(System.in);
        CommandMessage.newDelivery();
        System.out.println("Select the type of delivery. Choose 0-2:");
        System.out.println(packageTypes);
        check = scanner.nextInt();
        System.out.println("Select Destination. Choose 0-2:");
        System.out.println(destinations);
        check = scanner.nextInt();

        if (check > 0 || check < 2) {
            if (check == 0) {
                setI(0);
                packageTypes.get(i);
                destinations.get(i);
            } else if (check == 1) {
                setI(1);
                packageTypes.get(i);
                destinations.get(i);
            } else if (check == 2) {
                setI(2);
                packageTypes.get(i);
                destinations.get(i);
            }
        } else {
            CommandMessage.error();
            return;
        }

        System.out.println("You've ordered: " + packageTypes.get(i) + " Delivery in the: " + destinations.get(i));
    }

    public static int getI() {
        return i;
    }

    public static void setI(int i) {
        Delivery.i = i;
    }

    public static int getCheck() {
        return check;
    }

    public static void setCheck(int check) {
        Delivery.check = check;
    }

    public static ArrayList<PackageType> getPackageTypes() {
        return packageTypes;
    }

    public static void setPackageTypes(ArrayList<PackageType> packageTypes) {
        Delivery.packageTypes = packageTypes;
    }

    public static ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public static void setDestinations(ArrayList<Destination> destinations) {
        Delivery.destinations = destinations;
    }
}