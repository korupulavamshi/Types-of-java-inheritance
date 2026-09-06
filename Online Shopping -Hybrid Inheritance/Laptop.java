package onlineshopping;

class Laptop extends Electronics {

    private int ram;

    void setRam(int ram) {
        this.ram = ram;
    }

    void displayLaptopDetails() {
        System.out.println("RAM: " + ram + " GB");
    }
}
