package jrouxel;

import java.util.*;
import java.io.*;
import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App
{
    public static int max(int a, int b)
    {
    	return a > b ? a:b;
    	//return a;
    }
    
    public static void main( String[] args )
    {
    	//int result = max(4,5);
        //System.out.println( "Max :" + result );
    	int monmax=0;
    	String nb;
        int temp;
    	try 
    	{
			CSVReader reader = new CSVReader(new FileReader("data.csv"),',');
			List<String[]> myEntries = reader.readAll();
			String[] test;
	       	//parcourt
	       	for (int i  = 0; i<myEntries.size(); i++)
	       	{
	       		test=myEntries.get(i);
	       		nb=test[0];
	       		temp=Integer.parseInt(nb);
	       		if (max(monmax,temp)!=monmax)
	       		{
	       			monmax=temp;
	       		}
	       	}
	       	System.out.println("Max :" + monmax);
    	} catch (FileNotFoundException e) 
    		{
				e.printStackTrace();
			}
    	
    }
}
