package bike_dealership;

public class Dealership {

    public static void  main(String[] args){
         Customer cust1 = new Customer();
         cust1.setName("tom");
         cust1.setAddress("hyd");
         cust1.setCashOnHand(5000);

         Vehicle vehicle = new Vehicle();
         vehicle.setMake("apache");
         vehicle.setModel("apache 2.0");
         vehicle.setPrice(10000);


         Employee employee = new Employee();
         cust1.purchaseBike(vehicle, employee,false);

    }
}
