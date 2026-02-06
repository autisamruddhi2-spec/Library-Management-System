// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class LibrarySystem {
   public LibrarySystem() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      Library var2 = new Library();
      var2.addBook(new Book("978-0-262-03384-8", "Introduction to Algorithms", "Thomas Cormen", "Computer Science"));
      var2.addBook(new Book("978-0-262-03399-1", "Effective Java", "Joshua Bloch", "Programming"));
      var2.addBook(new Book("978-0-56619-909-4", "Clean Code", "Robert Martin", "Programming"));
      var2.addMember(new Member("M001", "Alice Jhonson", "9876543210"));

      int var3;
      do {
         System.out.println("\n==== LIBRARY MANAGEMENT SYSTEM ====");
         System.out.println("1. Add new Book");
         System.out.println("2. Register New Member");
         System.out.println("3. Display All Books");
         System.out.println("4.Display Available Books");
         System.out.println("5. Search Book");
         System.out.println("6.Borrow Book");
         System.out.println("7. Return Book");
         System.out.println("8. Exit");
         System.out.println("\nEnter your Choice: ");
         var3 = var1.nextInt();
         var1.nextLine();
         switch (var3) {
            case 1:
               System.out.println("\n=== ADD NEW BOOK ===");
               System.out.println("Enter ISBN: ");
               String var4 = var1.nextLine();
               System.out.println("Enter Title: ");
               String var5 = var1.nextLine();
               System.out.println("Enter Author: ");
               String var6 = var1.nextLine();
               System.out.println("Enter Genre: ");
               String var7 = var1.nextLine();
               var2.addBook(new Book(var4, var5, var6, var7));
               break;
            case 2:
               System.out.println("\n=== REGISTER NEW MEMBER ===");
               System.out.println("Enter Member ID: ");
               String var8 = var1.nextLine();
               System.out.println("Enter Name: ");
               String var9 = var1.nextLine();
               System.out.println("Enter Contact: ");
               String var10 = var1.nextLine();
               var2.addMember(new Member(var8, var9, var10));
               break;
            case 3:
               var2.displayAllBooks();
               break;
            case 4:
               var2.displayAvailableBooks();
               break;
            case 5:
               System.out.println("\n===== SEARCH BOOKS ====");
               System.out.println("Enter Search keyword: ");
               String var11 = var1.nextLine();
               var2.searchBooks(var11);
               break;
            case 6:
               System.out.println("\n===== BORROW BOOK ====");
               System.out.println("Enter Member ID: ");
               String var12 = var1.nextLine();
               System.out.println("Enter Book ISBN: ");
               String var13 = var1.nextLine();
               var2.borrowBook(var12, var13);
               break;
            case 7:
               System.out.println("\n===== RETURN BOOK ====");
               System.out.println("Enter Member ID: ");
               String var14 = var1.nextLine();
               System.out.println("Enter Book ISBN: ");
               String var15 = var1.nextLine();
               var2.returnBook(var14, var15);
               break;
            case 8:
               System.out.println("Exiting system....");
               break;
            default:
               System.err.println("Invalid choice!");
         }
      } while(var3 != 8);

      var1.close();
   }
}
