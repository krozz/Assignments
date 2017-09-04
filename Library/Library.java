
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author krozz
 */
public class Library {

    private ArrayList<Book> catalog;

    public Library() {
        catalog = new ArrayList();

    }

    public void addBook(Book newBook) {
        catalog.add(newBook);

    }

    public void printBooks() {
        for (Book s : catalog) {
            System.out.println(s);
        }

    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : catalog) {
            if(StringUtils.included(book.title(), title)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book book : catalog) {
            if(StringUtils.included(book.publisher(), publisher)){
                found.add(book);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList();
        for (Book book : catalog) {
            if (book.year() == (year)) {
                found.add(book);
            }
        } return found;
    }
}
