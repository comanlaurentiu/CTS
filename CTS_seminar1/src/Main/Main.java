package Main;

//find the occurrences of a minimum value in an array
//occurrences - how many times the minimum value appears in the array

public class Main {

	static int occurrences(int n, int array[])
	{
	    int min = array[0],
	    occ = 1; //occurrences
	 
	    for (int i = 1; i < n; i++)
	    {
	        if (array[i] < min)
	        {
	            min = array[i];
	            occ = 1;
	        }
	         
	        else if (array[i] == min)
	            occ++;
	    }
	    return occ;
	}
	 
	

	public static void main (String[] args)
	    {
	        int n = 5;
	        int array[] = {4, 2, 1, 1, 9}; // output = 2 (1 is the minimum value and it appears twice)
	        System.out.println(occurrences(n, array));
	        
	    }
}