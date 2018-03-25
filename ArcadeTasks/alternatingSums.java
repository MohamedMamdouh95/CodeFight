int[] alternatingSums(int[] a) {
    int sum1=0,sum2=0;
    for(int i=2;i<a.length+2;i++)
    {
        if(i%2==0)
        {
            sum1+=a[i-2];
        }
        else
        {
            sum2+=a[i-2];
        }
    }
    int [] sum = {sum1,sum2};
    return sum;
}
