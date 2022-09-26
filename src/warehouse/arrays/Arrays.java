package warehouse.arrays;

import warehouse.enums.Destination;
import warehouse.enums.PackageType;
import warehouse.user.User;

import java.util.ArrayList;

import static warehouse.enums.Destination.*;
import static warehouse.enums.PackageType.*;

public class Arrays {
    private static ArrayList<PackageType> packageTypes = new ArrayList<>(3);
    private static ArrayList<Destination> destinations = new ArrayList<>(3);
    private static ArrayList<User> registeredUsers = new ArrayList<>();

    public static void arraysFilling() {
        packageTypes.add(0, PLASTICBOX);
        packageTypes.add(1, PAPERBOX);
        packageTypes.add(2, WOODBOX);
        destinations.add(0, CITY);
        destinations.add(1, REGION);
        destinations.add(2, COUNTRY);
    }

    public static ArrayList<PackageType> getPackageTypes() {
        return packageTypes;
    }

    public static ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public static ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }

}
