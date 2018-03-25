String[] addBorder(String[] picture) {
    String [] myString = new String[(picture.length)+2];
    StringBuilder myString1 = new StringBuilder();
    int index=0;
    
    /*Forming the First line of '*'*/
    for(int i=0;i<(picture[0].length())+2;i++)
    {
        myString1.append('*');
    }
    myString[0]=myString1.toString();
    myString1.setLength(0);
   /************************************/
    
    for(int j=1;j<picture.length+1;j++)
    {
        myString1.append('*');
        myString1.append(picture[j-1]);
        myString1.append('*');
        myString[j]=myString1.toString();
        myString1.setLength(0);    
    }
    
    for(int i=0;i<(picture[0].length())+2;i++)
    {
        myString1.append('*');;
    }
    myString[picture.length+1]=myString1.toString();
    return myString;
    
}
