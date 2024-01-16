public class CustomerMailFactory {
    public static ICustomer createCustomer(String custype){
    ICustomer customer  = null;
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
