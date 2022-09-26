package warehouse.commands;

public abstract class CommandMessage implements Commands {

    private static String info = "Type 'r' to register, 'i' to take info or 'e' to exit";
    private static String newUser = "Registering new user";
    private static String newDelivery = "Registering new delivery";
    private static String noData = "No registered users yet! You'll be first one :)";
    private static String error = "Error, enter 0-2";
    private static String error2 = "Apparently you've crooked fingers? :) Aim CAREFULLY!";


    public static void info() {
        System.out.println(info);
    }

    public static void newUser() {
        System.out.println(newUser);
    }

    public static void newDelivery() {
        System.out.println(newDelivery);
    }

    public static void noData() {
        System.out.println(noData);
    }

    public static void error() {
        System.out.println(error);
    }

    public static void error2() {
        System.out.println(error2);
    }

    public static String getInfo() {
        return info;
    }

}
