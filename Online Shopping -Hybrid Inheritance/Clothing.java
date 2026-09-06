package onlineshopping;

class Clothing extends Product {

    private String size;

    void setSize(String size) {
        this.size = size;
    }

    void displayClothingDetails() {
        System.out.println("Size: " + size);
    }
}
