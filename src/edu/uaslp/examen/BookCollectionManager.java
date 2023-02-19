package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollectionManager {
    private List<BookCollection> collections = new ArrayList<BookCollection>();

    public BookCollection createCollection (String name){
        BookCollection newCollection = new BookCollection(name);
        collections.add(newCollection);
        return newCollection;
    }

    public BookCollection getCollectionByName (String name){
        Iterator<BookCollection> it = collections.iterator();

        while (it.hasNext()){
            BookCollection temp;
            temp = it.next();
            if (temp.getName() == name){
                return temp;
            }
        }
        return null;
    }

    public void deleteCollectionByName(String name){
        Iterator<BookCollection> it = collections.iterator();

        while (it.hasNext()){
            if (it.next().getName() == name){
                it.remove();
            }
        }
    }

    public void addBookToCollection(String collectionName, Book book){
        Iterator<BookCollection> it = collections.iterator();
        while (it.hasNext()) {
            if (it.next().getName() == collectionName) {
                it.next().addBook(book);
                return;
            }
        }
        BookCollection temp = createCollection(collectionName);
        temp.addBook(book);
    }

    public List<String> getCollectionNames(){
        List<String> nombres = new ArrayList<String>();
        Iterator<BookCollection> it = collections.iterator();

        while (it.hasNext()){
            nombres.add(it.next().getName());
        }
        return nombres;

    }


    public List<BookCollection> getCollections() {
        return collections;
    }
}
