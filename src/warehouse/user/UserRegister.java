package warehouse.user;

import warehouse.commands.CommandMessage;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegister {
    public static User userRegister(){
        CommandMessage.start();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your surname");
        String surname = scanner.next();
        System.out.println("Enter your day of birth");
        int dateOfBirth = scanner.nextInt();
        System.out.println("Enter your month of birth");
        int monthOfBirth = scanner.nextInt();
        System.out.println("Enter your year of birth");
        int yearOfBirth = scanner.nextInt();
        System.out.println("Enter your eMail");
        String eMail = scanner.next();
        System.out.println("Enter your mobile number");
        int mobileNum = scanner.nextInt();

        User user = new User(name,surname,dateOfBirth,monthOfBirth,yearOfBirth,eMail,mobileNum);

        ArrayList<User> registeredUsers = new ArrayList<>();
        registeredUsers.add(user);

        System.out.println(user);
        return user;
    }
}




