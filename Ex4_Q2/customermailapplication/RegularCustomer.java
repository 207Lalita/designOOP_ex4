//make this class a subclass of customer
public class RegularCustomer implements ICustomer {
    @Override
    public String createMail() {
        return "Regular Customer Mail";
    }
    
    @Override
    public String createBrochure() {
        return "Regular Customer Brochure";
    } 
}
