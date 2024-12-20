import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book>books=new ArrayList<>();
    void addBook(Book livre)
    {
        books.add(livre);
    }
    void affichage () {
        for (Book livre : books)

        {
            System.out.println(livre);

        }
    }
    void rechercher(String searchValue)
    {
        for (Book livre : books)
        {
            if (livre.getISBN().equals(searchValue)||livre.getAuthor().equals(searchValue)||livre.getTitre().equals(searchValue))
            {

                System.out.println(livre);
            }

        }
    }
    public void updateBook() {
        Scanner sc = new Scanner(System.in);
        String isbn;
        boolean found = false;

        System.out.print("Enter ISBN of book to update: ");
        isbn = sc.nextLine();

        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                found = true;

                System.out.println("1: Update Title\n2: Update Author\n3: Update Disponibilite");
                System.out.print("Enter your choice: ");
                 int find=sc.nextInt();
                 sc.nextLine();

                switch (find) {
                    case 1:
                        System.out.print("Enter new title: ");
                        book.setTitre(sc.nextLine());
                        break;
                    case 2:
                        System.out.print("Enter new author: ");
                        book.setAuthor(sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Is the book Disponibilite? (true/false): ");
                        book.setDesponible(sc.nextBoolean());
                        sc.nextLine();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        return;
                }
                System.out.println("Book updated successfully.");
                break;
            }
        }

        if (!found) {
            System.out.println("the isbn is not found.");
        }
    }



}
