/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package tvseriesapp;

import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class SeriesTest 
{
    Series seriesApp = new Series();
        
    @Test
    public void TestSearchSeries() 
    {
        
        SeriesModel s1 = new SeriesModel("S1", "Breaking Bad", 18, 62);
        seriesApp.seriesList.add(s1);

        SeriesModel found = null;
        for (SeriesModel s : seriesApp.seriesList) 
        {
            if (s.getSeriesId().equals("S1")) 
            {
                found = s;
            }
        }

        assertNotNull(found);
        assertEquals("Breaking Bad", found.getSeriesName());
    }

    @Test
    public void TestSearchSeries_SeriesNotFound() 
    {
        SeriesModel s1 = new SeriesModel("S1", "Breaking Bad", 18, 62);
        seriesApp.seriesList.add(s1);

        SeriesModel found = null;
        for (SeriesModel s : seriesApp.seriesList) 
        {
            if (s.getSeriesId().equals("S2")) 
            {
                found = s;
            }
        }

        assertNull(found);
    }

    @Test
    public void TestUpdateSeries() 
    {
        SeriesModel s1 = new SeriesModel("S1", "Breaking Bad", 18, 62);
        s1.setSeriesName("Better Call Saul");
        s1.setSeriesAge(16);

        assertEquals("Better Call Saul", s1.getSeriesName());
        assertEquals(16, s1.getSeriesAge());
    }

    @Test
    public void TestDeleteSeries() 
    {
        ArrayList<SeriesModel> list = new ArrayList<>();
        SeriesModel s1 = new SeriesModel("S1", "Breaking Bad", 18, 62);
        list.add(s1);
        
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).getSeriesId().equals("S1"))
            {
                list.remove(i);
                break;
            }
        }
        assertTrue(list.isEmpty());
    }

    @Test
    public void TestDeleteSeries_SeriesNotFound() 
    {
        ArrayList<SeriesModel> list = new ArrayList<>();
        SeriesModel s1 = new SeriesModel("S1", "Breaking Bad", 18, 62);
        list.add(s1);
        
        for (int i = 0; i < list.size(); i++) 
        {
        if (list.get(i).getSeriesId().equals("S2")) 
        {
            list.remove(i);
            break;
        }
    }
        assertFalse(list.isEmpty());
    }

    @Test
    public void TestSeriesAgeRestriction_AgeValid() 
    {
        SeriesModel s1 = new SeriesModel("S1", "Breaking Bad", 16, 62);
        assertTrue(s1.getSeriesAge() >= 2 && s1.getSeriesAge() <= 18);
    }

    @Test
    public void TestSeriesAgeRestriction_SeriesAgeInValid() 
    {
        SeriesModel s1 = new SeriesModel("S1", "Breaking Bad", 21, 62);
        assertFalse(s1.getSeriesAge() >= 2 && s1.getSeriesAge() <= 18);
    }
    
}
