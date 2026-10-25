package problem3;
import java.util.Scanner;

public class Test {

    private static final Scanner sc = new Scanner(System.in);
    private static Library library;

    public static void main(String[] args) {

        System.out.println("=========== LIBRARY MANAGEMENT ===========");
        int n = readInt("Enter the maximum number of documents (n): ");
        library = new Library(n);

        // --- initialise the library with two documents of our choice ---
        library.add(new Novel("The Hobbit", "J.R.R. Tolkien", 310, 15.50));
        library.add(new Magazine("Science & Life", "March", 2024));
        System.out.println("Library initialised with 2 documents (capacity = " + n + ").\n");

        int choice = -1;
        while (choice != 0) {
            displayMenu();
            choice = readInt("Your choice: ");

            switch (choice) {
                case 1: addDocument();          break;
                case 2: library.displayDocuments(); break;
                case 3: deleteDocument();       break;
                case 4: searchDocument();       break;
                case 5: library.displayAuthors(); break;
                case 0: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid choice, please try again.");
            }
            System.out.println();
        }
        sc.close();
    }

    // ------------------------------------------------------------- menu
    private static void displayMenu() {
        System.out.println("---------------- MENU ----------------");
        System.out.println("1. Add a document");
        System.out.println("2. Display all documents");
        System.out.println("3. Delete a document");
        System.out.println("4. Search a document by record number");
        System.out.println("5. Display all authors");
        System.out.println("0. Exit");
        System.out.println("--------------------------------------");
    }

    // ------------------------------------------------------- operations
    private static void addDocument() {

        System.out.println("Kind of document: 1-Novel  2-Textbook  3-Magazine  4-Dictionary");
        int type = readInt("Type: ");
        if (type < 1 || type > 4) {
            System.out.println("Unknown document type.");
            return;
        }

        String title = readString("Title: ");
        Document doc;

        switch (type) {
            case 1: {   // Novel
                String author = readString("Author: ");
                int pages     = readInt("Number of pages: ");
                double price  = readDouble("Price: ");
                doc = new Novel(title, author, pages, price);
                break;
            }
            case 2: {   // Textbook
                String author = readString("Author: ");
                int pages     = readInt("Number of pages: ");
                String level  = readString("Level: ");
                doc = new Textbook(title, author, pages, level);
                break;
            }
            case 3: {   // Magazine
                String month = readString("Month: ");
                int year     = readInt("Year: ");
                doc = new Magazine(title, month, year);
                break;
            }
            default: {  // Dictionary
                String language = readString("Language: ");
                doc = new Dictionary(title, language);
                break;
            }
        }

        if (library.add(doc))
            System.out.println("Added: " + doc);
        else
            System.out.println("Cannot add: library full (" + library.size()
                    + "/" + library.getCapacity() + ").");
    }

    private static void deleteDocument() {
        int num = readInt("Record number of the document to delete: ");
        Document doc = library.document(num);

        if (doc == null) {
            System.out.println("No document with record number " + num + ".");
            return;
        }
        System.out.println(library.delete(doc) ? "Deleted: " + doc : "Deletion failed.");
    }

    private static void searchDocument() {
        int num = readInt("Record number to search: ");
        Document doc = library.document(num);

        if (doc == null) System.out.println("No document with record number " + num + ".");
        else             System.out.println("Found: " + doc);
    }

    // --------------------------------------------------- input helpers
    // Always read a whole line -> avoids the classic nextInt()/nextLine() bug.
    private static String readString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println("  Please enter a valid integer.");
            }
        }
    }

    private static double readDouble(String prompt) {
        while (true) {
            try {
                return Double.parseDouble(readString(prompt));
            } catch (NumberFormatException e) {
                System.out.println("  Please enter a valid number.");
            }
        }
    }
}