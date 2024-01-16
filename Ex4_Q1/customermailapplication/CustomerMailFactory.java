public class CustomerMailFactory {
    public static Customer createCustomer(String custype){
    Customer customer  = null;
    switch(custype) {
        case "Regular":
            customer = new RegularCustomer();
            break;
        case "Mountain":
            customer = new MountainCustomer();
            break;
        case "Delinquent":
            customer = new DelinquentCustomer();
            break; 
    }
    return customer;
}
}
