import java.util.ArrayList;

public class Customer {
    public int customerId;
    public String name;
    public String email;
    public String phoneNumber;
    public String address;
    public ArrayList<String> previousOrders;
    public int points;

    // Constructor
    public Customer(int id, String cName, String cEmail, String cNumber, String cAddress, ArrayList<String> pOrders, int p) {
        this.customerId = id;
        this.name = cName;
        this.email = cEmail;
        this.phoneNumber = cNumber;
        this.address = cAddress;
        this.previousOrders = pOrders;
        this.points = p;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<String> getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(ArrayList<String> previousOrders) {
        this.previousOrders = previousOrders;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
