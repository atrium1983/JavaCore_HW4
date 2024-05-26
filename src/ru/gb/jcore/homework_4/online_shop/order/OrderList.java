package ru.gb.jcore.homework_4.online_shop.order;

import ru.gb.jcore.homework_4.online_shop.product.Product;
import ru.gb.jcore.homework_4.online_shop.buyer.Buyer;
import ru.gb.jcore.homework_4.online_shop.exceptions.AmountException;
import ru.gb.jcore.homework_4.online_shop.exceptions.BuyerException;
import ru.gb.jcore.homework_4.online_shop.exceptions.ProductException;

public class OrderList {
    private final Order[] orders;
    private final Object[][] requests;

    //2. Создать массив покупателей, массив товаров и массив заказов;
    public OrderList() {
        orders = new Order[5];
        requests = createRequest();
    }

    private Object[][] createRequest(){
        return new Object[][]{
                {"Иванов Иван Иванович", "Xiaomi", "2"}, //всё верно +
                {"Иванов Иван Иванович", "Audi", "2"}, //нет такого товара -
                {"Иванов Иван Иванович", "Xiaomi", "200"}, //слишком много => 1 +
                {"Иванов Иван Иванович", "Xiaomi", "0"}, //слишком мало => 1 +
                {"Иванов Ольга Иванович", "Xiaomi", "2"} //нет такого покупателя -

        };
    }

    public void buy(Buyer[] buyers, Product[] products){
        int index = 0;
        int i = 0;

        while (index < orders.length || i < orders.length){
            try{
                orders[index] = makeOrder((String) requests[i][0], (String) requests[i][1], (String) requests[i][2], buyers, products, index+1);
                index++;
            } catch (AmountException e){
                orders[index] = makeOrder((String) requests[i][0], (String) requests[i][1], "1", buyers, products, index+1);
                index++;
            } catch (ProductException e){
                e.printStackTrace();
            } catch (BuyerException e){
                throw new RuntimeException(e);
            } finally {
                getOrdersInfo();
            }
            ++i;
        }
    }

    private static Order makeOrder(String customer, String ware, String number, Buyer[] buyers, Product[] products, int id) throws AmountException, BuyerException, ProductException {
        String[] fullName = customer.split(" ");
        int quantity = Integer.parseInt(number);
        checkQuantity(quantity);
        return new Order(id, getBuyer(buyers, fullName), getProduct(products, ware), quantity);
    }

    public static Buyer getBuyer(Buyer[] buyers, String[] fullName) throws BuyerException{
        for (Buyer buyer : buyers) {
            if (buyer.getLastName().equals(fullName[0]) && buyer.getFirstName().equals(fullName[1]) && buyer.getMiddleName().equals(fullName[2])) {
                return buyer;
            }
        }
        throw new BuyerException("Покупатель "+fullName[0]+" "+fullName[1]+" "+fullName[2]+" не найден");
    }

    public static Product getProduct(Product[] products, String name) throws ProductException{
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new ProductException("Товар "+name+" не найден");
    }

    public static void checkQuantity (int quantity) throws AmountException{
        if(quantity < 1){
            throw new AmountException("Вы заказали слишком малое количество товара");
        } else if (quantity > 100) {
            throw new AmountException("К сожалению товар в таком количестве отсутсвует");
        }
    }

    public void getOrdersInfo(){
        int quantity = 0;
        for (Order value : orders) {
            if (value != null) {
                quantity++;
            }
        }
        System.out.println("Заказы магазина. Всего => " + quantity);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
