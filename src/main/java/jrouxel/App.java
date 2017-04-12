package jrouxel;

import java.io.*;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App
{
    private static CSVReader reader;

	public static int max(int a, int b)
    {
    	return a > b ? a:b;
    	//return a;
    }
    
    public static void main( String[] args ) throws IOException
    {
    	//int result = max(4,5);
        //System.out.println( "Max :" + result );
    	int monmax=0;
    	String nb;
        int temp;
    	try 
    	{
			reader = new CSVReader(new FileReader("data.csv"),',');
			List<String[]>myEntries=reader.readAll();
			String[] test;
       		test=myEntries.get(0);
	       	//parcourt
	       	for (int i  = 0; i<test.length; i++)
	       	{
	       		nb=test[i];
	       		System.out.println("Nombre lu : " + nb);
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
