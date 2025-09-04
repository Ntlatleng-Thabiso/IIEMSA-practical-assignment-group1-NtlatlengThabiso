/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runlibrary;

/**
 *
 * @author lab_services_student
 */
import java.util.*;
public class LibraryApp 
{
    private Item[] items = new Item[10];
    private int count = 0;
    Scanner scanner = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        items[count++] = new Book(id, title, author);
        System.out.println("Book added successfully!");
    }

    public void addMagazine() {
        System.out.print("Enter Magazine ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Issue Number: ");
        int issue = Integer.parseInt(scanner.nextLine());

        items[count++] = new Magzine(id, title, issue);
        System.out.println("Magazine added successfully!");
    }

    public void searchItem() {
        System.out.print("Enter ID to search: ");
        String id = scanner.nextLine();

        for (int i = 0; i < count; i++) {
            if (items[i].getId().equalsIgnoreCase(id)) {
                System.out.println("Found: " + items[i]);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void report() {
        System.out.println("----- Library Report -----");
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
