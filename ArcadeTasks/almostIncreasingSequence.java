/* 
 * Description: this code is a solution for the almostIncreasingSequence problem in codefights          
 */
boolean almostIncreasingSequence(int[] sequence) 
{
      int i;                                                                                                
      boolean firstTry = false;                                  /* to indicate the first try */         
      boolean secondTry = false;                                 /* to indicate the second try */               
      int indexOfBreakingElement = 0;                    /* to indicate which index of the array is not following the almost increasing sequence */                           
      int sizeOfSequence = sequence.length;                                               
      int[] newFixedArray = new int[sizeOfSequence - 1]; /* an array used to store the edited or fixed array for further processing */                                             
      for(i = 0; i < sizeOfSequence-1; i++)
      {
            if(sequence[i] >= sequence[i+1])
            {
                  indexOfBreakingElement = i+1;
                  firstTry = true;
                  break;
            }
      }
      
      if(firstTry)
      {
            for(i = 0; i < indexOfBreakingElement; i++)
            {
                  newFixedArray[i] = sequence[i];  
            }
            for(i = indexOfBreakingElement+1; i < sizeOfSequence; i++)
            {
                  newFixedArray[i-1] = sequence[i]; 
            }
      }
      
      for(i = 0; i < sizeOfSequence-2; i++)
      {
            if(newFixedArray[i] >= newFixedArray[i+1])
            {
                  indexOfBreakingElement = i;
                  secondTry = true;
                  break;
            }
      }
      
      if(secondTry)
      {
            for(i = indexOfBreakingElement+1; i < sizeOfSequence; i++)
            {
                  newFixedArray[i-1] = sequence[i]; 
            }
      }
      
      for(i = 0; i < sizeOfSequence-2; i++)
      {
            if(newFixedArray[i] >= newFixedArray[i+1])
            {
                  return false;
            }
      }
      return true;
}

/*

boolean almostIncreasingSequence(int[] sequence)
{
    int count=0;
    int  i=0;
    List<Integer> myList = new ArrayList<Integer>();
//This part is used to check whether the array is increasing or not and indicating the number of sequence brokers by the flag count
    if(sequence[i]<sequence[i+1])
    {
         myList.add(sequence[i]);
    }
    else
    {
        ;
    }
   
    for(i=1;i<sequence.length-1;i++)
    {
        if(sequence[i+1]>sequence[i])
        {
            myList.add(sequence[i+1]);   
        }
        else if(sequence[i+1]<sequence[i+2]&&sequence[i+1]>sequence[i-1])
        {
            myList.add(i,sequence[i+1]);
        }
        else
        {
            count=count+1;
        }
        //System.out.print(myList.get(i));
    }
    //this part is used to handle the last number if it is greater than the second last number it will be appended to the list else it will be removed and count will be incremented 
    if(sequence[i]>sequence[i-1])
    {
        myList.add(sequence[i]);
    }
//--------------------------------------------------------------------------------- 
// This part is used to check the new list whether it is in increasing sequence or still not
    for(i=0;i<(myList.size())-1;i++)
    {
        if(myList.get(i+1)>myList.get(i))
        {
            ;   
        }
        else
        {
            count=count+1;
        }
        //System.out.print(myList.get(i));
    }
//if the count is more than 1 it means that we removed more than one variable so it will return false else it will return true
    if(count>1)
    {
        return false;
    }
    else
    {
        return true;
    }
}   





*/

/*
 * package com.ashok.collections.arraylist;
 
import java.util.ArrayList;
import java.util.List;
 
public class MyArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mariyala");
		list.add("Venkata");
		list.add("Ashok");
		list.add("Kumar");
 
		System.out.println("Using for loop");
		System.out.println("--------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Using Enhanced for loop");
		System.out.println("-----------------------");
		for (String str : list) {
			System.out.println(str);
		}
 
		System.out.println("Using Iterator class");
		System.out.println("-----------------------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
 
Output
Using for loop
--------------
Mariyala
Venkata
Ashok
Kumar
 
Using Enhanced for loop
-----------------------
Mariyala
Venkata
Ashok
Kumar
 
Using Iterator class
-----------------------
Mariyala
Venkata
Ashok
Kumar
*/