int makeArrayConsecutive2(int[] statues) 
{
    int minIndex,temp;
    int count=0;
    //sort
    for(int i=0;i<statues.length;i++)
    {
        minIndex=i;
        for(int j=i+1;j<statues.length;j++)
        {
            if(statues[j]<statues[minIndex])
            {
                minIndex=j;
            }
        }
        temp=statues[minIndex];
        statues[minIndex]=statues[i];
        statues[i]=temp;
    }
    //calculate
    for(int k=0;k<(statues.length)-1;k++)
    {
        if(statues[k+1]>statues[k])
        {
            count+=(statues[k+1]-statues[k])-1;
        }
    }
    return count;

}
