package ru.gb.jcore.homework_4.online_shop.product;

public class ProductList {
    private final Product[] products;

    //2. Создать массив покупателей, массив товаров и массив заказов;
    public ProductList() {
        products = new Product[]{new Product(1, "Apple IPhone 15", 103000),
                new Product(2, "Xiaomi", 45000),
                new Product(3, "Samsung Galaxy A55", 35000),
                new Product(4, "Samsung Galaxy S24", 105000),
                new Product(5, "Tecno Camon 30", 19000)};
    }

    public void getProductsInfo(){
        System.out.println("Товары магазина. Всего наименований => " + products.length);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product[] getProducts() {
        return products;
    }
}
