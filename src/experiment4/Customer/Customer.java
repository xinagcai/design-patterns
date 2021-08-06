package experiment4.Customer;

import java.io.Serializable;

public class Customer implements Cloneable{
    private Address address = null;

    public Customer(){
        this.address = new Address();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone is failure");
        }
        return obj;
    }

}

class Address implements Serializable {
}
