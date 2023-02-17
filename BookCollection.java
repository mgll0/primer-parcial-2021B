import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    private String name;
    private List<Book> books = new ArrayList<Book>();


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addBook(Book newBook){
        books.add(newBook);
    }
    public List<Book> getBooks() {
        return books;
    }
    public int getStars(){
        int contStars = 0, contBooks = 0;
        Iterator<Book> it = books.iterator();
        while (it != null){
            Book temp;
            temp = it.next();
            contStars += temp.getStars();
            contBooks++;
        }
        contStars /= contBooks;
        return contStars;
    }
}
