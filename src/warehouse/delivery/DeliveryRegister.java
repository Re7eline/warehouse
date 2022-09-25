package warehouse.delivery;

import warehouse.commands.CommandMessage;
import warehouse.enums.Destination;
import warehouse.enums.PackageType;
import warehouse.user.UserRegister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DeliveryRegister {



    public static Delivery[] deliveryRegister() {
        Delivery[] delivery = {
                new Delivery(Destination.CITY, PackageType.PLASTICBOX),
                new Delivery(Destination.REGION, PackageType.PAPERBOX),
                new Delivery(Destination.COUNTRY, PackageType.WOODBOX)};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the type of delivery. Choose 1-3:");
        Arrays.stream(delivery).forEach(System.out::println);

        int check = scanner.nextInt();
        if (check<1||check>3){
            CommandMessage.error();
        }
        int typeOfDelivery = scanner.nextInt() - 1;
        Ordering order = new Ordering();

        return delivery;
//        CommandsMessages.showInfoMessage();
//        Commands.commands(scanner.next(), delivery[typeOfDelivery]);
//        Commands.commands(scanner.next(), delivery[typeOfDelivery]);



    }


}
