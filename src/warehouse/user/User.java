package warehouse.user;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private String eMail;
    private int mobileNum;


    public User(String name, String surname,
                int dateOfBirth, int monthOfBirth, int yearOfBirth,
                String eMail, int mobileNum) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.eMail = eMail;
        this.mobileNum = mobileNum;
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
                ", mobileNum=" + mobileNum +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String next) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(int mobileNum) {
        this.mobileNum = mobileNum;
    }
}
