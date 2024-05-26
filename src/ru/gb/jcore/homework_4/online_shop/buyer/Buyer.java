package ru.gb.jcore.homework_4.online_shop.buyer;

import ru.gb.jcore.homework_4.online_shop.enums.Gender;

import java.time.LocalDate;

import java.time.Period;

// 1. Написать классы покупатель, товар и заказ
public class Buyer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Gender gender;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    public Buyer(int id, String lastName, String firstName, String middleName, Gender gender, String phoneNumber, LocalDate dateOfBirth) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return getPeriod(getDateOfBirth(), LocalDate.now());
    }

    private int getPeriod(LocalDate start, LocalDate end){
        Period difference = Period.between(start, end);
        return difference.getYears();
    }

    @Override
    public String toString() {
        return  "ID: " +
                getId() +
                "| Фамилия: " +
                getLastName() +
                ", имя: " +
                getFirstName() +
                ", отчество: " +
                getMiddleName() +
                "| Пол: " +
                getGender() +
                "| Возраст: " +
                getAge() +
                "| Телефон: " +
                getPhoneNumber();
    }
}
