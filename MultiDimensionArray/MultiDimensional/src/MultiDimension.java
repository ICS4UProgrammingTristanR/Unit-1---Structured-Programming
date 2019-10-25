import java.util.Random;

public class MultiDimension {
	  public static int theClassAverage; 
	  public static int[][] allStudentsAndMarks = new int [4][6];
	  public static int counter1 ;
	  public static int counter2 ;
	 
	  private static int FindAverage (int [][] studentAndMarks)
	  {
	   int [] averages = new int [4];
	   int classAverage = 0;
	   int counterA = 0;
	   int counterB = 0;
	   int counterC = 0;
	
	   int marks = 0;
	   
	   for ( counterA = 0;counterA < studentAndMarks.length;counterA++)
	    {
		   marks = 0;
	    
	     for (counterB = 0;counterB < studentAndMarks[counterA].length;counterB++ )
	     {
	      marks += studentAndMarks[counterA][counterB];
	      
	      
	     }
	     averages[counterA] = marks / counterB;
	     System.out.println("" + averages[counterA]);
	    }
	     for (counterC = 0;counterC < averages.length ;counterC ++)
	     {
	      classAverage += averages[counterC];
	     }
	     classAverage = classAverage / averages.length;
	   
	   return classAverage;
	  }
	  
	  public static void main(String args[]) 
	  {
		
	   
	   // create instance of Random class 
	      Random rand = new Random();
	   for ( counter1 = 0;counter1 < allStudentsAndMarks.length;counter1 ++)
	   {
		   for ( counter2 = 0; counter2 < allStudentsAndMarks[counter1].length; counter2++)
		   {
			  
			   	allStudentsAndMarks[counter1][counter2] = rand.nextInt(100);
		   }
	   }
	   
	   theClassAverage = FindAverage (allStudentsAndMarks);
	   System.out.println("The class average is:" + theClassAverage);
	   
	  }
	  
	 }

