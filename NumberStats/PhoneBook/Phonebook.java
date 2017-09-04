
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pc user
 */
public class Phonebook {

    private ArrayList<Person> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        contacts.add(new Person(name, number));

    }

    public void printAll() {
        for (Person p : contacts) {
            System.out.println( p.toString());
        }
    }
    public String searchNumber(String name){
        String result = "number not known";
        for(Person s : contacts){
            if(s.getName().contains(name)){
                result = s.getNumber();
            }
        }return result;
    }
}
