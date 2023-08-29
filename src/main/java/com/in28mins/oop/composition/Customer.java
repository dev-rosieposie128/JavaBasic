package com.in28mins.oop.composition;

public class Customer {


    //so when we design our classess, one of the important things that i would start with is the relatioship between the different objects that are involved
    // here, Customer contains an Address

    //state
    private String name;

    private Address homeAddress;
    private Address workAddress;

    //when we design our construction of the object, we need to start thinking about more detatils
    // when you create a Customer, is homeAddress mandatory? if it is, then I would include it in the constructor. If it's not, I would not

    //creating
    Customer(String name, Address homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //we would also think about what are the operations that we'd need to elaborate. so, for a customer, what are the operations that you would want to allow?

    //operations

    // so now, somebody who creates a Customer can create it with a name and a home address, and when the home address changes, they can do
    // setHomeAdress() and if they want to add in a work address, they can actually say setWorkAddress() as well.
    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    //print the state
    public String toString() {
        return String.format("name - %s, homeAddress - %s , workAddress - %s",
                name, homeAddress, workAddress);
    }

    //the imporatant thing about oop is the way we are approaching object oriented programming
    // so firsth thing is we would decide the classes, then we would decide the composition, how each class is composed
    // over here, we decided the customer would have two instances of the address class, that's called Composition
    // and then we would decide about how you'd want to allow creation of the objects
    // after that, you'd start thinking about the different operations that are involved
    // the focus behind these steps has been to get you initiated with oop thinking
}
