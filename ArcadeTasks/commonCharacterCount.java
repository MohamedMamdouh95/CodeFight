int commonCharacterCount(String s1, String s2) 
{
   int counter=0;
   char[] Array1 = s1.toCharArray();
   char[] Array2 = s2.toCharArray();
   for(int i=0;i<Array1.length;i++)
   {
     for(int j=0;j<Array2.length;j++)
     {
       if(Array1[i]-Array2[j]==0)
       {
         counter++;
         Array2[j]='\0'; /*Remove the matched character from the second array so it cannot be matched again*/
         break;
         
       }
     }
   }
   return counter;
}
