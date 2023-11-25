package listtuple;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        //Creating list of Books
        List<Book> list=new ArrayList<Book>();

        //Creating Books
        Book b1=new Book(101,"Java Programming","Eric","Elexindo",10);
        Book b2=new Book(102,"Database Fundamental","John","Kompas",5);
        Book b3=new Book(103,"Linux","Calvin","Gramedia",6);

        //Adding Books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);

        //Traversing list
        for(Book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
