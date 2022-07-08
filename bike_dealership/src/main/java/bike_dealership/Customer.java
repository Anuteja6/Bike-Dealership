package bike_dealership;

public class Customer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(Integer cashOnHand) {
        this.cashOnHand = cashOnHand;
    }

    public String name;
    public String address;
    public double cashOnHand;
    public void purchaseBike(Vehicle vehicle,Employee employee,boolean finance){
       employee.handleCustomer(this,finance,vehicle);
    }
}
