import java.util.Scanner;


	public class TestApp {
		  public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        
		            // get the input from the user
		            String name = Validator.getName(sc, "Give your name: ");
		            int age = Validator.getAge(sc, "You age?");
		            double height= Validator.getHeight(sc, "Your height?");
		            double weight= Validator.getWeight(sc, "Your weight?");
		            double num = Validator.getHeight(sc, "Your favorite number between 0 and 1?");
		            		
		            System.out.println("Your name is" + name);
		            System.out.println("Your age is" + age);
		            System.out.println("Your height is" + height);
		            System.out.println("Your weight is"+ weight);
		            System.out.println("Your favorite number is" +num);
		            
		        }
		  }
		
	


