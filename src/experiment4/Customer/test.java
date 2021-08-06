package experiment4.Customer;

import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Customer customer = new Customer();
        Customer1 customer1 = new Customer1();
        Customer obj = (Customer) customer.clone();
        Customer1 obj1 = (Customer1) customer1.deepClone();

        System.out.println(obj.getAddress().toString());
        System.out.println(customer.getAddress().toString());
        System.out.println(obj1.getAddress().toString());
        System.out.println(customer1.getAddress().toString());
    }
}
