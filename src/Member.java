import java.util.ArrayList;
public class Member {
    private String memberId;
    private String contact;
    private String name;
    private ArrayList<Book> borrowedBooks;

    public Member(String memberId, String name, String contact){
        this.memberId=memberId;
        this.name=name;
        this.contact=contact;
        this.borrowedBooks=new ArrayList<>();
    }
    public String getMemberId(){
        return memberId;
    }
    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
    public ArrayList<Book> getBorrowedBooks(){
        return borrowedBooks;
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        borrowedBooks.remove(book);
    }

}
