package onlineshopping;

class Electronics extends Product {

    private String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void displayElectronicsDetails() {
        System.out.println("Brand: " + brand);
    }
}
