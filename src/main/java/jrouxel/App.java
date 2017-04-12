package jrouxel;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class App
{
    private static CSVReader reader;
	private static List<String> liste;

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
        //Vector<String> out = new Vector<String>(); Question 27 et plus, pas eu le temps de traiter
    	try 
    	{
			reader = new CSVReader(new FileReader("data.csv"),',');
			List<String[]>myEntries=reader.readAll();
			String[] test = null;
			for (int i =0; i<myEntries.size(); i++)
			{
	       		test=myEntries.get(i);
	       		//liste = Arrays.asList(test); Question 27 et plus, pas eu le temps de traiter
	       		//CollectionUtils.select(liste,new MonPredicat<String>(),out); Question 27 et plus, pas eu le temps de traiter
	       		//parcourt
	       		for (int j  = 0; j<test.length; j++)
	       		{
	       			nb=test[j];
	       			System.out.println("Nombre lu : " + nb);
	       			temp=Integer.parseInt(nb);
	       			if (max(monmax,temp)!=monmax)
	       			{
	       				monmax=temp;
	       			}
	       		}
	       	}
	       	System.out.println("Max :" + monmax);
    	} catch (FileNotFoundException e) 
    		{
				e.printStackTrace();
			}
    	
    }
}
