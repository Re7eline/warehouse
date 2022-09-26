package warehouse.delivery;

import warehouse.commands.CommandMessage;
import warehouse.enums.PackageType;

import java.util.Arrays;
import java.util.Scanner;

public class Delivery {
    private static String packageType;

    public Delivery(PackageType packageType) {
        this.packageType = packageType.toString();
    }

    public static void deliveryRegister() {
        Delivery[] delivery = {
                new Delivery(PackageType.PLASTICBOX),
                new Delivery(PackageType.PAPERBOX),
                new Delivery(PackageType.WOODBOX)};

        Scanner scanner = new Scanner(System.in);
        CommandMessage.newDelivery();
        System.out.println("Select the type of delivery. Choose 0-3:");
//        Arrays.stream(delivery).forEach(System.out::println);
        System.out.println(Arrays.toString(delivery));
        int check = scanner.nextInt();
        if (check < 1 || check > 3) {
            CommandMessage.error();
        }
        if (check == 0) {
            String packageType = PackageType.PLASTICBOX.toString();
            System.out.println(packageType);
        } else if (check == 1) {
            String packageType = PackageType.PAPERBOX.toString();
            System.out.println(packageType);
        } else if (check == 2) {
            String packageType = PackageType.WOODBOX.toString();
            System.out.println(packageType);
        }
        CommandMessage.info();
    }
}