package ru.gb.jcore.homework_4.online_shop.employee;

import ru.gb.jcore.homework_4.online_shop.enums.Gender;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Gender gender;
    private String position;
    private String phoneNumber;
    private int salary;
    private LocalDate dateOfBirth;

    public Employee(int id, String lastName, String firstName, String middleName, Gender gender, String position, String phoneNumber, int salary, LocalDate dateOfBirth) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = gender;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public String getInfo(){
        return "ID: " +
                getId() +
                "| Фамилия: " +
                getLastName() +
                ", имя: " +
                getFirstName() +
                ", отчество: " +
                getMiddleName() +
                "| Пол: " +
                getGender() +
                "| Должность: " +
                getPosition() +
                "| Телефон: " +
                getPhoneNumber() +
                "| Зарплата: " +
                getSalary() +
                "| Возраст: " +
                getAge();
    }
}
