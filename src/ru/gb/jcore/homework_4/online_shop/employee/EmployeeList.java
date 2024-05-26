package ru.gb.jcore.homework_4.online_shop.employee;

import ru.gb.jcore.homework_4.online_shop.enums.Gender;
import ru.gb.jcore.homework_4.online_shop.enums.Holiday;

import java.time.LocalDate;

public class EmployeeList {
    private final Employee [] staff;

    public EmployeeList(){
        staff = new Employee[]{new Employee(1, "Иванов", "Иван", "Иванович", Gender.Male, "бухгалтер", "79255813223", 120000, LocalDate.of(1973, 10, 2)),
                new Employee(2, "Петров", "Пётр", "Петрович", Gender.Male, "эксперт", "79051234567", 90000, LocalDate.of(2001, 6, 30)),
                new Employee(3, "Екатеринова", "Екатерина", "Екатериновна", Gender.Female, "дистрибьютор", "79255813223", 120000, LocalDate.of(1963, 5, 7)),
                new Employee(4, "Тарасов", "Тарас", "Тарасович", Gender.Male, "маркетолог", "79033244556", 100000, LocalDate.of(1999, 3, 21)),
                new Employee(5, "Ольгова", "Ольга", "Ольговна", Gender.Female, "курьер", "79012237879", 60000, LocalDate.of(2001, 6, 30)),
                new Employee(6, "Владимиров", "Владимир", "Владимирович", Gender.Male, "Начальник", "79150803023", 150000, LocalDate.of(1975, 9, 15))};
    }

    public void getStaffInfo(){
        System.out.println("Сотрудники магазина. Всего => " + staff.length);
        for (Employee employee : staff) {
            System.out.println(employee.getInfo());
        }
    }

    public void congratulateStaff(Holiday today){
        switch (today) {
            case New_Year:
                for (Employee employee : staff) {
                    System.out.println(employee.getFirstName() +" "+ employee.getMiddleName() + ", поздравляем Вас с Новым Годом!");
                }
                break;
            case March_8:
                for (Employee employee : staff) {
                    if (employee.getGender() == Gender.Female) {
                        System.out.println(employee.getFirstName() +" "+ employee.getMiddleName() + ", поздравляем Вас с 8 Марта!");
                    }
                }
                break;
            case February_23:
                for (Employee employee : staff) {
                    if (employee.getGender() == Gender.Male) {
                        System.out.println(employee.getFirstName() +" "+ employee.getMiddleName() + ", поздравляем Вас с 23 Февраля!");
                    }
                }
                break;
            case No_Holidays:
                System.out.println("Сегодня нет праздников");
                break;
        }
    }
}
