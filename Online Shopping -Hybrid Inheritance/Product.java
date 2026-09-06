package onlineshopping;

class Product {

    private String productName;
    private double price;

    void setProductName(String productName) {
        this.productName = productName;
    }

    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs." + price);
    }
}
