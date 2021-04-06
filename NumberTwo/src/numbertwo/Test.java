package numbertwo;

/**
 *
 * @author Raven Torres
 */
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        System.out.println("Test 1");
        Customer customer1 = new Customer("Raven Torres");
        customer1.setMember(true);
        customer1.setMemberType("Gold");
        System.out.println(customer1.toString());

        System.out.println("");

        System.out.println("Test 2");
        System.out.println("New Visitor");
        System.out.println("");
        Visit visit = new Visit(new Customer("Japhilie Gwapa"), new Date());
        visit.setProductExpense(2000);
        visit.setServiceExpense(500);
        DiscountRate discount = new DiscountRate();
        System.out.println(visit.toString());

        System.out.println("");

        System.out.println("Test 3");
        Visit visit1 = new Visit(new Customer("Verah Cute"), new Date());
        visit1.setProductExpense(322);
        visit1.setServiceExpense(450);
        System.out.println("Customer: " + visit1.getCustomerName());
        System.out.println("Product Expense: " + visit1.getProductExpense());
        System.out.println("Service Expense: " + visit1.getServiceExpense());
        System.out.println("Total Expense: " + visit1.getTotalExpense());
        System.out.println(visit1.toString());
        System.out.println("");

        System.out.println("Test 4");
        Customer customer2 = new Customer("Loyla Dejito");
        customer2.setMemberType("Premium");
        System.out.println("Customer: " + customer2.getName());
        System.out.println("Member Type: " + customer2.getMemberType());
        System.out.println("Is Member: " + customer2.isMember());
        System.out.println(customer2.toString());
        System.out.println("");
    }
}
