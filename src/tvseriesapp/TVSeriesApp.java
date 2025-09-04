/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tvseriesapp;

/**
 *
 * @author lab_services_student
 */
import java.util.*;

public class TVSeriesApp {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Series seriesApp = new Series();
        
        System.out.println(" -----LATEST SERIES - 2025 -----");
        System.out.println(" ************************************** ");    
        
        while(true)
        {
            System.out.println(" \nPlease select one of the following menu items: ");
            System.out.println(" (1) Caputer a new series. ");
            System.out.println(" (2) Search for a series. ");
            System.out.println(" (3) Update a series. ");
            System.out.println(" (4) Delete a series. ");
            System.out.println(" (5) Print a series report. ");
            System.out.println(" (6) Exit Application. ");
            System.out.println(" Enter your choice: ");
            String choice = sc.nextLine();
            
            if (choice.equals("1")) 
            {
                seriesApp.CaptureSeries();
            } else if (choice.equals("2")) {
                seriesApp.SearchSeries();
            } else if (choice.equals("3")) {
                seriesApp.UpdateSeries();
            } else if (choice.equals("4")) {
                seriesApp.DeleteSeries();
            } else if (choice.equals("5")) {
                seriesApp.SeriesReport();
            } else if (choice.equals("6")) {
                seriesApp.ExitSeriesApp();
                break;
            } else {
                System.out.println("Invalid option. Please try again!");
            }

        }
    }
    
}
