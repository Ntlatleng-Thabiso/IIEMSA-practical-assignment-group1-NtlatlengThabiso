/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runlibrary;

/**
 *
 * @author lab_services_student
 */
public class Book extends Item
{
    private String author;

    public Book(String id, String title, String author) 
    {
        super(id, title);
        this.author = author;
    }

    public String getAuthor() 
    {
        return author; 
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString() 
    {
        return "Book [ " + super.toString() + ", Author: " + author + "]";
    }
}
