import java.util.Scanner;   //Scanner class to take input from user
 
class BinarySearch   //main class to perform binary search in an array
{
  public static void main(String args[])   //public void class with main method
  {
    int c, firstNum, lastNum, middleNum, Limit, searchElement, MyArray[];  //declared int type variables to search in an array declared as array[]
 
    Scanner DefineArray = new Scanner(System.in);    //Created object of Scanner Class
    System.out.println("Enter number of elements");  //Taking the size of array from user
    Limit = DefineArray.nextInt();   //taking input 
    MyArray= new int[Limit];   //storing values in array 
 
    System.out.println("Enter " + Limit + " integers");    //Asking user to input all the elements of the array
 
 
    for (c = 0; c < Limit; c++)   //for loop till array has elements
    	MyArray[c] = DefineArray.nextInt();  //storing all the element in an array using for loop
 
    System.out.println("Enter value to find");   //enter value which need to be find
    searchElement = DefineArray.nextInt();
 
    firstNum  = 0;   //initialized 1st element of an array as 0
    lastNum   = Limit - 1;   //last element will be 1 less than the size of array
    middleNum = (firstNum + lastNum)/2;  //middle number will be divisible of two divided by 2
 
    while( firstNum <= lastNum )   //loop will continue from fist element till the last one
    {
    	
    	//Applying binary search algorithm which search in the element in either half first
      if ( MyArray[middleNum] < searchElement )   //if element to be search is less than mid of number than enter in this loop 
    	  firstNum = middleNum + 1;  //and increment first number value by 1 to mid value    
      else if ( MyArray[middleNum] == searchElement )   //else if it is in mid than element is at that place 
      {
        System.out.println(searchElement + " found at location " + (middleNum + 1) + ".");
        break;   //breaks the loop
      }
      else
         lastNum = middleNum - 1;   //else search in the backward direction 
 
      middleNum = (firstNum + lastNum)/2;   //find the mid element of the array
   }
   if ( firstNum > lastNum )   //if we reach to the end of the array and still element is not there than that element is not present in the array list
      System.out.println(searchElement + " is not present in the list.\n");
  }
}