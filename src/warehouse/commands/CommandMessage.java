package warehouse.commands;

import java.time.Instant;
import java.time.LocalDate;

public abstract class CommandMessage implements Commands {

    private static String start = "You need to register first";
    private static String info = """
            Type 'i' to take info or 'e' to exit
            or type any to register more users""";
    private static String error = "Error, enter 1-3";
    private static String waitingTime = "Time for waiting is: ";

    public static void start() {
        System.out.println(start);
    }
    public static void showInfoMessage() {
        System.out.println(info);
    }
    public static void waiting(){

        System.out.println(waitingTime+(LocalDate.now())+14D);
    }
    public static void error(){
        System.err.printf(error);
    }
}
