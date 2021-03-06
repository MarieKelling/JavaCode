public class MergeSort
{
		public static void main (String[] args)
		{  
		  //Delcare array
			int[] list = new int[100]; 
		  
		  //Populate array w random numbers
		  for (int i = 0; i < list.length; i++)
		  {
			 list[i] = (int) Math.floor(Math.random() * 101); 
		  }                      
			  
		  System.out.println("Unsorted List: ");
		  printList(list);
		  
		  list = merge_sort(list); 
		  
		  System.out.println("Sorted List: ");
		  printList(list); 
		}
	   
	   ///////////////////////////////////////////////////////////////////////////////////////////////

	   public static int[] merge_sort(int[] list)
  	   {
		  //Base case:
		  if(list.length <= 1)
		  {
			 return list; 
		  }
		  
			 //Recursive Case:
			 int mid = list.length/2;
			 int[] left = new int[mid];
			 int[] right = new int[list.length - mid];
			 int[] result = new int[list.length];   
					 
			 for(int i = 0; i < mid; i++)
			 {
				left[i] = list[i];
			 }
			 
			 int x = 0;
			 for(int j = mid; j < list.length; j++)
			 {
				right[x] = list[j];
				x++;  
			 }
			 
			 //Recursive Calls: 
			 left = merge_sort(left);
			 right = merge_sort(right);
			 
			 //Call Subroutine: 
			 result = merge(left, right); 
			 
			 return result;    
      }
		
		public static int[] merge(int[] left, int[] right)
		{
		  int resultLength = left.length + right.length; 
		  int[] result = new int[resultLength]; 
		  int leftIndex = 0;
		  int rightIndex = 0;
		  int resultIndex = 0; 
		  
		  while (leftIndex < left.length || rightIndex < right.length)
		  {
			 if (leftIndex < left.length && rightIndex < right.length)
			 {
				//left is smaller --> placed in the sorted list first
				if (left[leftIndex] <= right[rightIndex]) 
				{
				   result[resultIndex] = left[leftIndex];
				   leftIndex++;
				   resultIndex++; 
				}
				
				//right is smaller --> placed in the sorted list first
				else                            
				{
				   result[resultIndex] = right[rightIndex];
				   rightIndex++;
				   resultIndex++; 
				}

			 }
			 //Only left or only right has elements in the list
			 else if (leftIndex < left.length)
			 {
				result[resultIndex] = left[leftIndex];
				   leftIndex++;
				   resultIndex++;
			 }
			 else if (rightIndex < right.length)
			 {
				result[resultIndex] = right[rightIndex];
				   rightIndex++;
				   resultIndex++;
			 }
		  }
		  return result; 
		}
		
		
		public static void printList(int[] list)
		{
		  for(int i = 0; i < list.length; i++)
			{
				System.out.print(list[i] + " " );  
			}
		  System.out.println();
		  System.out.println();
		} 
 }