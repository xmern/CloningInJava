package org.presley;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            // Creating an object with references to Address
            Address addr = new Address("New York");
            Person p1 = new Person("John", addr);

            // Cloning the person object
            Person p2 = (Person) p1.clone();

            // Modifying the address of p1
            p1.address.city = "Los Angeles";

            // Displaying info
            p1.displayInfo();  // Output: Name: John, City: Los Angeles
            p2.displayInfo();  // Output: Name: John, City: Los Angeles (unexpected change in p2)

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}