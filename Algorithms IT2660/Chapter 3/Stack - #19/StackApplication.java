public class StackApplication
{
	public static void main(String[] args)
	{
		Stack stack = new Stack(3);
		
			Listing list1 = new Listing("Peter", "1st Street", "330-123-4567");
			Listing list2 = new Listing("Paul", "2nd Street", "214-123-4567");
			Listing list3 = new Listing("Mary", "3rd Street", "440-123-4567"); 
			Listing temp; 

		System.out.println("Is the Stack Empty?"); 
		System.out.println(stack.emptyTest());
		System.out.println("Is the Stack Full?"); 
		System.out.println(stack.fullTest()); 
		System.out.println(); 
		
		System.out.println("Attempts to perform a push on a full stack - Underflow Error: ");
		System.out.println(stack.pop());	
		System.out.println(); 
		
		System.out.println("3 Push Operations - Peter, Paul, & Mary Listings: "); 
		System.out.println(stack.push(list1));
		System.out.println(stack.push(list2));
		System.out.println(stack.push(list3));
		System.out.println(); 
		
		System.out.println("showAll method invoked - Should Display Peter, Paul, & Mary Listings: "); 
		stack.showAll(); 
		System.out.println(); 
		
		System.out.println("**Re-initialize the stack**");  
		stack.reset(); 
		System.out.println(); 
		
		System.out.println("showAll method invoked - Should display nothing: "); 
		stack.showAll(); 
		System.out.println(); 
		
		System.out.println("3 Push Operations - Peter, Paul, & Mary Listings: ");
		System.out.println(stack.push(list1));
		System.out.println(stack.push(list2));
		System.out.println(stack.push(list3)); 
		System.out.println(); 
												
		System.out.println("Peak Operation - Should Display Mary's Listing: ");
		System.out.println(stack.peak());   
		System.out.println(); 
		
		System.out.println("3 Pop Operations - Displayed w/ toString Method: ");
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		temp = stack.pop();
		System.out.println(temp.toString());
		System.out.println(); 
		
		System.out.println("showAll Method - Should Display Nothing: "); 
		stack.showAll(); 
		System.out.println(); 
		
	}
}