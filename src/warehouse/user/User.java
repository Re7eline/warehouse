package warehouse.user;

import warehouse.commands.CommandMessage;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private static ArrayList<User> registeredUsers = new ArrayList<>();
    private final String name;
    private final String surname;
    private final int dateOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    private String eMail;

    public User(String name, String surname, int dateOfBirth, int monthOfBirth, int yearOfBirth, String eMail) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
    }

    public static User userRegister() {
        CommandMessage.newUser();
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

        User user = new User(name, surname,
                dateOfBirth, monthOfBirth, yearOfBirth,
                eMail);

        registeredUsers.add(user);
        System.out.println("Your data: "+user);


        return user;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", monthOfBirth=" + monthOfBirth +
                ", yearOfBirth=" + yearOfBirth +
                ", eMail='" + eMail + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public static ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }
}
