package ru.gb.jcore.homework_4.online_shop.order;

import ru.gb.jcore.homework_4.online_shop.product.Product;
import ru.gb.jcore.homework_4.online_shop.buyer.Buyer;
// 1. Написать классы покупатель, товар и заказ
public class Order {
    private int id;
    private Buyer buyer;
    private Product product;
    private int quantity;

    public Order(int id, Buyer buyer, Product product, int quantity) {
        this.id = id;
        this.buyer = buyer;
        this.product = product;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " +
                getId() +
                "| Покупатель: " +
                getBuyer() +
                "| Товар: " +
                getProduct() +
                "| Количество: " +
                getQuantity();
    }
}
