int matrixElementsSum(int[][] matrix) 
{
    //System.out.print(matrix[0][1]);
    int sum=0;
    for(int colomn=0;colomn<matrix[0].length;colomn++)
    {
        for(int row=0;row<matrix.length;row++)
        {
            if(matrix[row][colomn]!=0)
            {
                sum+=matrix[row][colomn];
            }
            else
            {
                break;
            }
          
        }
    }
    return sum;
    
}
