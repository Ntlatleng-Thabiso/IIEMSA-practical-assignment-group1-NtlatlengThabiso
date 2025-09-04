/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tvseriesapp;

/**
 *
 * @author lab_services_student
 */
public class SeriesModel 
{
    
    public String SeriesId;
    public String SeriesName;
    public int SeriesAge;
    public int NumOfEpisodes;
    
    public SeriesModel(String SeriesId, String SeriesName, int SeriesAge, int NumOfEpisodes)
    {
        this.SeriesId = SeriesId;
        this.SeriesName = SeriesName;
        this.SeriesAge = SeriesAge;
        this.NumOfEpisodes = NumOfEpisodes;
    }
    
    public void setSeriesId(String SeriesId)
    {
        this.SeriesId = SeriesId;
    }
    
    public String getSeriesId()
    {
        return SeriesId;
    }
    
    public void setSeriesName(String SeriesName)
    {
        this.SeriesName = SeriesName;
    }
    
    public String getSeriesName()
    {
        return SeriesName;
    }
    
    public void setSeriesAge(int SeriesAge)
    {
        this.SeriesAge = SeriesAge;
    }
    
    public int getSeriesAge()
    {
        return SeriesAge;
    }
    
    public void setNumOfEpisodes(int NumOfEpisodes)
    {
        this.NumOfEpisodes = NumOfEpisodes;
    }
    
    public int getNumOfEpisodes()
    {
        return NumOfEpisodes;
    }
    
    @Override
    public String toString()
    {
        return " Series ID: " + SeriesId +
               "\nSeries name: " + SeriesName + 
               "\nSeries age: " + SeriesAge + 
               "\nNumber of episodes: " + NumOfEpisodes;
        
    }
}
