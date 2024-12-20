import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
        System.out.println("============== Menue ==============");
        System.out.println("1 add");
        System.out.println("2 display");
        System.out.println("3 rechercher");
        System.out.println("4 Update");


        System.out.println("0 exit");
        System.out.print("Choose an operation from menu : ");


        choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("enter Isbn");
                String isbn = sc.next();
                System.out.println("enter title :");
                String title = sc.next();
                System.out.println("enter author :");
                String author = sc.next();
                System.out.println("enter desponebility (true / false) :");

                boolean desponebility = sc.nextBoolean();

                 library.addBook(new Book(isbn, title, author, desponebility));


                 break;
           case 2:
                     library.affichage();
                     break;
           case 3:
               String searchValue;
               System.out.println("enter titre / outhor / isbn:");
               searchValue = sc.next();
               library.rechercher(searchValue);
               break;
            case 4:
                library.updateBook();
                break;



        }
        }while (choice!=0);

    }
}