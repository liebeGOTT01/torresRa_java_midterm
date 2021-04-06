
package three;

/**
 *
 * @author Raven Torres
 */

public class Test {
        public static void main(String[] args) {
        MyDate date = new MyDate(2021, 2, 28);
        System.out.println("Date: " + date);            
        System.out.println("Next Day: " + date.nextDay());  
        System.out.println("Next Day: " + date.nextDay());
        System.out.println("Next Month: " + date.nextMonth());
        System.out.println("Next Year: " + date.nextYear());
    }
}
