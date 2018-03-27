String[] allLongestStrings(String[] inputArray) 
{
    int maxSizeOfString = inputArray[0].length();
    int counter=0;
    /*Determine the length of the largest string in the array*/
    
    for(int i=0;i<inputArray.length;i++)
    {
        if(inputArray[i].length()>maxSizeOfString)
        {
            maxSizeOfString = inputArray[i].length();
        }
    }
    
    /*get the number of strings that have the maximum length*/
    for(int x=0;x<inputArray.length;x++)
    {
        if(maxSizeOfString == inputArray[x].length())
        {
            counter++;
        }
    }
    /*Append the strings that have the maximum length to the output array*/
    String[] outputString = new String[counter];
    int index=0;
    for(int j=0;j<inputArray.length;j++)
    {
        if(inputArray[j].length() == maxSizeOfString)
        {
            outputString[index] = inputArray[j];
            index++;
        }
    }
    return outputString;
}



  
    
    
    
    
    
    

/*String[] allLongestStrings(String[] inputArray) 
{
    int counter=0;
    List <Integer> indexOfMaximumNumber= new ArrayList <Integer>();
    int maximumSizeOfString;
    
    maximumSizeOfString = inputArray[0].length();
    indexOfMaximumNumber.add(0);
    //System.out.print(maximumSizeOfString);
    for(int i=1;i<inputArray.length;i++)
    {
        if(inputArray[i].length()>=maximumSizeOfString)
        {
            maximumSizeOfString = inputArray[i].length();
            indexOfMaximumNumber.add(i);
            counter++;
        }
    }
    
    int j=0;
    String [] outputString = new String[counter+1];
    
    for(int index : indexOfMaximumNumber)
    {
        outputString[j] = inputArray[index];
        j++;
    }
    return outputString;
}
*/