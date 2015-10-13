
import java.util.Scanner;
public class Validator {
	public static String getName(Scanner sc, String prompt)
	{
	    System.out.print(prompt);
	    String name = sc.next();  // read user entry
	    sc.nextLine();  // discard any other data entered on the line
	    return name;
	}

	public static int getAge(Scanner sc, String prompt)
	{
	    int age = 0;
	    boolean isValid = true;
	    while (isValid == true)
	    {
	        System.out.println(prompt);
	        age= sc.nextInt(); 
	        if (age >1 && age<100)
	        {
	            
	            isValid = false;
	        }
	        else
	        {
	            System.out.println("Error! Try again.");
	        }
	        
	    }
	    return age;
	}

	public static double getHeight(Scanner sc, String prompt)
	{
	    double height  = 0;
	    boolean isValid = true;
	    while (isValid == true)
	    {
	    	System.out.print(prompt);
	    	height=sc.nextDouble();
	        if (height>36 && height<92)
	        { 
	            isValid = false;
	        }
	        else{
	            System.out.println( "Error! Try again.");
	        
	    }
	    }
	    return height ;
	}
	
	public static double getWeight(Scanner sc, String prompt)
	{
	    double weight  = 0;
	    boolean isValid = true;
	    while (isValid == true)
	    {
	    	System.out.print(prompt);
	    	weight=sc.nextDouble();
	        if (weight>80 && weight<400)
	        { 
	            isValid = false;
	        }
	        else{
	            System.out.println( "Error! Try again.");
	        
	    }
	    }
	    return weight ;
	}
	

	public static double getNumber(Scanner sc, String prompt)
	{
	    double num  = 0;
	    boolean isValid = true;
	    while (isValid == true)
	    {
	    	System.out.print(prompt);
	    	num=sc.nextDouble();
	        if (num>0 && num<1)
	        { 
	            isValid = false;
	        }
	        else{
	            System.out.println( "Error! Try again.");
	        
	    }
	    }
	    return num ;
	}
}

