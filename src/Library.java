import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library(){
        books= new ArrayList<>();
        members= new ArrayList<>();
    }

        public void addBook(Book book){
            books.add(book);
            System.out.println("\nBook added successfully!");
        }
        public void addMember(Member member){
            members.add(member);
            System.out.println("\nMember registered successfully");
        }
        public void displayAllBooks(){
            System.out.println("\n=== ALL BOOKS ===");
            for(Book book : books){
                    book.displayBook();
        }
    }  
    public void displayAvailableBooks(){
        System.out.println("\n=== AVAILABLE BOOKS === ");
        for(Book book : books){
            if(book.isAvailable()){
                book.displayBook();
            }
        }
    } 
    public void searchBooks(String keyword){
        System.out.println("\nSearch Results: ");
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
            book.getAuthor().toLowerCase().contains(keyword.toLowerCase())){
                book.displayBook();
            }
        }
    } 

public void borrowBook(String memberId, String isbn){
    Member member = findMember(memberId);
    Book book = findBook(isbn);

    if(member==null || book==null){
        System.out.println("\nMember or Book not found!");
        return;
    }
    if(!book.isAvailable()){
        System.out.println("\nBook is already borrowed");
        return;
    }
    book.setAvailable(false);
    member.borrowBook(book);
    System.out.println("\nBook borrowed successfully!");
    System.out.println("Member: "+member.getName());
    System.out.println("Book: "+book.getTitle());
}
public void returnBook(String memberId, String isbn){
    Member member = findMember(memberId);
    Book book = findBook(isbn);

    if(member == null || book == null){
        System.out.println("Invalid details!");
        return;
    }
    book.setAvailable(true);
    member.returnBook(book);
    System.out.println("\nBook returned successfully!");
}
private Book findBook(String isbn){
    for(Book book : books){
        if(book.getIsbn().equals(isbn)){
            return book;
        }
    }
    return null;
}
private Member findMember(String memberId){
    for (Member member : members){
        if(member.getMemberId().equals(memberId)){
            return member;
        }
    }
    return null;
}
}
