boolean palindromeRearranging(String inputString)
{
    char[] inputStringCopy = inputString.toCharArray();
    int[] letterCount = {
                            0,0,0,0,0,0,0,0,0,0,0,0,0,
                            0,0,0,0,0,0,0,0,0,0,0,0,0
                        };
    boolean oddOccured = false;
    int sizeOfInputString = inputString.length();
    
    for(int i = 0; i < sizeOfInputString; i++)
        letterCount[inputStringCopy[i] - 'a']++;

    for(int i = 0; i < 26; i++)
        if( ((letterCount[i] % 2) != 0) && (!oddOccured) )
            oddOccured = true;
        else if( ((letterCount[i] % 2) != 0) && (oddOccured) )
            return false;
    return true;
}


/*boolean palindromeRearranging(String inputString) {
    inputString=selectionSort(inputString);
    char[] charArray = inputString.toCharArray();
    int counter=0;
    for(int i=0;i<(charArray.length)-1;i=i+2)
    {
        if(charArray[i] != charArray[i+1])
        {
            counter++;
        }
    }
    if(counter>1)
        return false;
    else
        return true;
    
}

 public static String selectionSort(String array){
        char[] myArray = array.toCharArray();
        int indexOfminimumNumber;
        char temp;
        for(int i=0; i<myArray.length;i++){
            indexOfminimumNumber=i;
            for(int j=i+1;j<myArray.length;j++)
            {
                if(myArray[j]<myArray[indexOfminimumNumber]) {
                    indexOfminimumNumber = j;
                }
            }
            temp=myArray[i];
            myArray[i]=myArray[indexOfminimumNumber];
            myArray[indexOfminimumNumber]=temp;

        }
        String outputString = new String(myArray);
        return outputString;
    }
    */