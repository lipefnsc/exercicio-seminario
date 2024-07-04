package academy.devdojo.java.domain;

public class Location {
    private String address;

    public Location(String address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Addres: " + this.address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
