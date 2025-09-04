/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package runlibrary;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class ItemTest 
{
    @Test
    public void testBookConstructorAndGetters() {
        Book book = new Book("B001", "Java Basics", "John Smith");

        assertEquals("B001", book.getId());
        assertEquals("Java Basics", book.getTitle());
        assertEquals("John Smith", book.getAuthor());
    }

    @Test
    public void testMagazineConstructorAndGetters() {
        Magzine mag = new Magzine("M101", "Tech Monthly", 42);

        assertEquals("M101", mag.getId());
        assertEquals("Tech Monthly", mag.getTitle());
        assertEquals(42, mag.getIssueNumber());
    }

    @Test
    public void testBookToString() {
        Book book = new Book("B002", "OOP Concepts", "Alice");
        String output = book.toString();

        assertTrue(output.contains("Book"));
        assertTrue(output.contains("B002"));
        assertTrue(output.contains("OOP Concepts"));
        assertTrue(output.contains("Alice"));
    }

    @Test
    public void testMagazineToString() {
        Magzine mag = new Magzine("M202", "Science Weekly", 88);
        String output = mag.toString();

        assertTrue(output.contains("Magazine"));
        assertTrue(output.contains("M202"));
        assertTrue(output.contains("Science Weekly"));
        assertTrue(output.contains("88"));
    }
}
