package ru.gb.jcore.homework_4.online_shop.buyer;

import ru.gb.jcore.homework_4.online_shop.enums.Gender;

import java.time.LocalDate;

public class BuyerList {
    private final Buyer[] buyers;

    //2. Создать массив покупателей, массив товаров и массив заказов;
    public BuyerList() {
        buyers = new Buyer[] {new Buyer(1,"Иванов", "Иван", "Иванович",  Gender.Male,"79255813223", LocalDate.of(1973,10,2)),
                new Buyer(2,"Петров", "Пётр", "Петрович",  Gender.Male,"79051234567", LocalDate.of(2001,6,30)),
                new Buyer(3,"Екатеринова", "Екатерина", "Екатериновна",  Gender.Female,"79255813223", LocalDate.of(1963,5,7)),
                new Buyer(4,"Тарасов", "Тарас", "Тарасович",  Gender.Male,"79033244556", LocalDate.of(1999,3,21)),
                new Buyer(5,"Ольгова", "Ольга", "Ольговна",  Gender.Female,"79012237879", LocalDate.of(2001,6,30)),
                new Buyer(6,"Владимиров", "Владимир", "Владимирович",  Gender.Male,"79150803023", LocalDate.of(1975,9,15))};
    }

    public void getBuyersInfo(){
        System.out.println("Покупатели магазина. Всего => " + buyers.length);
        for (Buyer buyer : buyers) {
            System.out.println(buyer);
        }
    }

    public Buyer[] getBuyers() {
        return buyers;
    }
}
