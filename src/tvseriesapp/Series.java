/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvseriesapp;

/**
 *
 * @author lab_services_student
 */
import java.util.*;
public class Series 
{
    ArrayList<SeriesModel> seriesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void CaptureSeries()
    {
        System.out.println(" Enter the series id: ");
        String id = scanner.nextLine();
        
        System.out.println(" Enter series name: ");
        String name = scanner.nextLine();
        
        int ageReg = validateAgeRestriction();
        
       System.out.println(" Enter number of episodes: ");
       int episodes = Integer.parseInt(scanner.nextLine());
       
       SeriesModel series = new SeriesModel(id, name, ageReg, episodes);
       seriesList.add(series);
       
       System.out.println(" Series successfully captured.");
    }
    
    public int validateAgeRestriction()
    {
        int age = -1;
        boolean validAge = false;
        
        while(!validAge)
        {
            System.out.println(" Enter the age restriction: ");
            if(scanner.hasNextInt())
            {
                age = scanner.nextInt();
                scanner.nextLine();
                
                if(age >= 2 && age <= 18)
                {
                    validAge = true;
                }else{
                    System.out.println(" You have entered the incorrect age restriction (ages between 2 - 18). ");
                }
            }else{
                System.out.println(" You have entered the incorrect age restriction (ages between 2 - 18). ");
                scanner.nextLine();
            }
        }
        return age;
    }
    
    public void SearchSeries()
    {
        System.out.println(" Enter the series id to search: ");
        String id = scanner.nextLine();
        
        for (SeriesModel s : seriesList)
        {
            if (s.getSeriesId().equalsIgnoreCase(id))
            {
            System.out.println(s);
            return;
            }
        }
        System.out.println(" Search with Series Id: " + id + " was not found. ");
    }
    
    public void UpdateSeries()
    {
        System.out.println(" Enter series id to update: ");
        String id = scanner.nextLine();
        
        for ( SeriesModel s : seriesList)
        {
            if (s.getSeriesId().equalsIgnoreCase(id))
            {
                System.out.println(" Enter new series name:");
                s.setSeriesName(scanner.nextLine());
                
                s.setSeriesAge(validateAgeRestriction());
                
                System.out.println(" Enter the number of episodes: ");
                s.setNumOfEpisodes(Integer.parseInt(scanner.nextLine()));
                
                System.out.println(" Series updated successfully.");
                return;
            }
        }
        
        System.out.println(" Search with Series Id: " + id + " was not found. ");
    }
    
    public void DeleteSeries()
    {
        System.out.println(" Enter the series id to delete: ");
        String id = scanner.nextLine();
        
        for (int i = 0; i < seriesList.size(); i++)
        {
            if(seriesList.get(i).getSeriesId().equalsIgnoreCase(id))
            {
                seriesList.remove(i);
                System.out.println(" Series deleted successfully. ");
                return;
            }
        }
        System.out.println(" Search with Series Id: " + id + " was not found. ");
    }
    
    public void SeriesReport()
    {
        if (seriesList.isEmpty())
        {
            System.out.println(" No series captured yet. ");
            return;
        }
        System.out.println(" -------SERIES REPORT-------- ");
        int count = 1;
        for (SeriesModel s : seriesList)
        {
            System.out.println(" Series " + count);
            System.out.println(s);
            System.out.println(" -----------------------");
        }
        System.out.println(" Total series captured: " + seriesList.size());
    }
    
    public void ExitSeriesApp()
    {
        System.out.println(" Exiting application...Goodbye ");
    }
}