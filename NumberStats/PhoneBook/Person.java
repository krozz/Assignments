/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc user
 */
public class Person {

    private String name;
    private String phoneNumber;

   public Person(String Name, String number) {
        this.name = Name;
        this.phoneNumber = number;
    }

    public String getNumber() {
        return this.phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " " + "number " + this.phoneNumber;
    }

    public void changeNumber(String newNumber) {
        this.phoneNumber = newNumber;
    }
    


}
