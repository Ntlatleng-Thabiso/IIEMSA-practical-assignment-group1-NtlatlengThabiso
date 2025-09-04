/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runlibrary;

/**
 *
 * @author lab_services_student
 */
public class Magzine extends Item 
{
    private int issueNumber;

    public Magzine(String id, String title, int issueNumber) 
    {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber()
    {
        return issueNumber; 
    }
    
    public void setIssueNumber(int issueNumber) 
    {
        this.issueNumber = issueNumber; 
    }

    @Override
    public String toString() {
        return " Magzine [" + super.toString() + ", Issue No: " + issueNumber;
    }
}

