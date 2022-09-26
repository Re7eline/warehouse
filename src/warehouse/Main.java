package warehouse;

import warehouse.arrays.Arrays;
import warehouse.commands.CommandMessage;
import warehouse.commands.Commands;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.arraysFilling();
        while (true) {
            CommandMessage.info();
            Commands.commands(scanner.next());
        }
    }
}