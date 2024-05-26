package ru.gb.jcore.homework_4.online_shop;

import ru.gb.jcore.homework_4.online_shop.buyer.BuyerList;
import ru.gb.jcore.homework_4.online_shop.employee.EmployeeList;
import ru.gb.jcore.homework_4.online_shop.enums.Holiday;
import ru.gb.jcore.homework_4.online_shop.order.OrderList;
import ru.gb.jcore.homework_4.online_shop.product.ProductList;


public class Main {
    public static void main(String[] args) {
        // 1. Написать классы покупатель, товар и заказ
        BuyerList buyers = new BuyerList(); // Инициализация класса "Покупатель"
        ProductList products = new ProductList(); // Инициализация класса "Товар"
        OrderList orders = new OrderList(); // Инициализация класса "Заказ"

        EmployeeList staff = new EmployeeList(); // Инициализация класса "Сотрудник"

        buyers.getBuyersInfo();
        System.out.println("+++++++++++++++++++++++++++++++++");

        products.getProductsInfo();
        System.out.println("+++++++++++++++++++++++++++++++++");

        staff.getStaffInfo();
        System.out.println("+++++++++++++++++++++++++++++++++");

        System.out.println("Поздравления на сегодня: ");
        staff.congratulateStaff(Holiday.March_8); // Вызов метода поздравления с праздниками
        System.out.println("+++++++++++++++++++++++++++++++++");

        orders.getOrdersInfo();
        System.out.println("+++++++++++++++++++++++++++++++++");

        orders.buy(buyers.getBuyers(), products.getProducts());
    }
}