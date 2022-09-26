package warehouse.user;
import warehouse.commands.CommandMessage;
import warehouse.delivery.Delivery;
import warehouse.enums.Destination;
import warehouse.enums.PackageType;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private static ArrayList<User> registeredUsers = new ArrayList<>();
    private final String name;
    private final String surname;
    private final String dateOfBirth;
    private final String monthOfBirth;
    private final String yearOfBirth;
    private String eMail;
    private PackageType packageTypes;
    private Destination destinations;


    public User(String name, String surname,
                String dateOfBirth, String monthOfBirth, String yearOfBirth,
                String eMail,
                PackageType packageTypes,
                Destination destinations) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
        this.packageTypes = packageTypes;
        this.destinations = destinations;
    }

    public static User userRegister() {
        CommandMessage.newUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your surname");
        String surname = scanner.next();
        System.out.println("Enter your day of birth");
        String dateOfBirth = scanner.next();
        System.out.println("Enter your month of birth");
        String monthOfBirth = scanner.next();
        System.out.println("Enter your year of birth");
        String yearOfBirth = scanner.next();
        System.out.println("Enter your eMail");
        String eMail = scanner.next();
        User user = new User(name, surname,
                dateOfBirth, monthOfBirth, yearOfBirth,
                eMail,
                Delivery.getPackageTypes().get(Delivery.getI()),
                Delivery.getDestinations().get(Delivery.getI()));

        registeredUsers.add(user);
        System.out.println("Your data: " + user.toString());
        return user;
    }

    public static ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }

    public static void setRegisteredUsers(ArrayList<User> registeredUsers) {
        User.registeredUsers = registeredUsers;
    }

    @Override
    public String toString() {
        return "\n" + "User{" +
                "Name= " + name +
                ", Surname= " + surname +
                ", Date of birth= " + dateOfBirth +
                "." + monthOfBirth +
                "." + yearOfBirth +
                ", Email= " + eMail +
                ", Ordered Package Type= " + packageTypes +
                ", Destination= " + destinations +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public PackageType getPackageTypes() {
        return packageTypes;
    }

    public void setPackageTypes(PackageType packageTypes) {
        this.packageTypes = packageTypes;
    }

}
