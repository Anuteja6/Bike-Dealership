package bike_dealership;

public class Employee {
    public void handleCustomer(Customer cust,boolean finance,Vehicle vehicle){
        if(finance==true) {
            double loanAmount;
            loanAmount = vehicle.price = cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        }else if(vehicle.getPrice() <=  cust.getCashOnHand()){
            processTransaction(cust,vehicle);
        }else{
            System.out.println("Customer will need more monet to buy the vehicle"+vehicle);
        }
    }

    public void runCreditHistory(Customer cust,double loanAmount){
        System.out.println("Ran credit history for customer...");
        System.out.println("Customer has been approved to purchase the vehicle");
    }

    public void processTransaction(Customer cust,Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle"
                + vehicle +"for price"+vehicle.getPrice());
    }

}
