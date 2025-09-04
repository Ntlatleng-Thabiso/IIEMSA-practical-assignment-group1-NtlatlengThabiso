/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runlibrary;

/**
 *
 * @author lab_services_student
 */
import java.util.*;

public class RunLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        LibraryApp app = new LibraryApp();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) 
        {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Search Item");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) 
            {
                app.addBook();
            } else if (choice == 2) 
            {
                app.addMagazine();
            } else if (choice == 3) 
            {
                app.searchItem();
            } else if (choice == 4) 
            {
                app.report();
            } else if (choice == 5) 
            {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }
}

    

