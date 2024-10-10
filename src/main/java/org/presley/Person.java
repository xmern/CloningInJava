package org.presley;

public class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();  // Shallow copy
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", City: " + address.city);
    }
}
