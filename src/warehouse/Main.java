package warehouse;
import warehouse.commands.CommandMessage;
import warehouse.commands.Commands;
import warehouse.delivery.Delivery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Delivery.arraysFilling();
        while (true) {
            CommandMessage.info();
            Commands.commands(scanner.next());
        }
    }
}