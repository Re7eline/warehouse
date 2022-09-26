package warehouse.commands;

import warehouse.enums.Colours;

public abstract class CommandMessage implements Commands {

    private static String info = "Type 'r' to register, 'i' to take info or 'e' to exit";
    private static String newUser = "Registering new user...";
    private static String newDelivery = "Registering new delivery...";
    private static String noData = "No registered users yet! You'll be first one :)";
    private static String error = "Error, Will be set the cheapest statement";
    private static String error2 = "Apparently you've crooked fingers? :) Aim CAREFULLY!";


    public static void info() {
        System.out.println(Colours.ANSI_GREEN + info + Colours.ANSI_RESET);
    }

    public static void newUser() {
        System.out.println(Colours.ANSI_YELLOW + newUser + Colours.ANSI_RESET);
    }

    public static void newDelivery() {
        System.out.println(Colours.ANSI_YELLOW + newDelivery + Colours.ANSI_RESET);
    }

    public static void noData() {
        System.out.println(Colours.ANSI_RED + noData + Colours.ANSI_RESET);
    }

    public static void error() {
        System.out.println(Colours.ANSI_RED + error + Colours.ANSI_RESET);
    }

    public static void error2() {
        System.out.println(Colours.ANSI_RED + error2 + Colours.ANSI_RESET);
    }


}
