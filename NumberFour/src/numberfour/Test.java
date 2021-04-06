
package numberfour;
/**
 *
 * @author Raven Torres
 */

public class Test {
    
    public static void main(String[] args) {
        Customer customer = new Customer(111, "Raven", 50);
        System.out.println(customer.toString());
        
        Invoice invoice = new Invoice(202, customer, 1000);
        System.out.println(invoice.toString());
    }
    
    
}
