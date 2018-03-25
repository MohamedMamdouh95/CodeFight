boolean checkPalindrome(String inputString)
{
    int flag=1;

        for(int i=0;i<inputString.length()/2;i++)
        {
            if(inputString.charAt(i) != inputString.charAt(inputString.length()-1-i))
            {
                flag=0;
            }
        }
 if(flag==0)
 {
   return false;
 }  
 else
    {
        return true;
    }
    
}
