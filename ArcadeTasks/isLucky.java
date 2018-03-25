boolean isLucky(int n) 
{
    int sum1=0 , sum2=0;
    List <Integer> numbers = new ArrayList<Integer>();
    /*Break down the whole number into single numbers*/
    while(n != 0)
    {
        numbers.add(n%10);
        n=n/10;
    }
    /*get the sum of the two halves*/
    for(int i=0;i<(numbers.size())/2;i++)
    {
        sum1+=numbers.get(i);
        sum2+=numbers.get(i+(numbers.size())/2);
    }
    
    if(sum1==sum2)
    {
        return true;
    }
    else
    {
        return false;
    }
    
}