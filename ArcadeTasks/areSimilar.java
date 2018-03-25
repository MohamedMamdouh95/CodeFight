//MAMDOUH CODE not working 
/*
boolean areSimilar(int[] a, int[] b) {
    boolean flag= true;
    int temp;
    int i=0,count=0;
    int index=0;
    while(count<2&&index<a.length){
        /*if the two numbers are not equal search in second array for the needed number*//*
        if(a[i] != b[i]){
            for(int j=i+1 ;j<b.length ;j++){
                /*If the number is found swap it with the current one */
                /*if(a[i] == b[j]){ 
                    temp=b[j];
                    b[j]=b[i];
                    b[i]=temp;
                    count++;/*increase the swapping indicator by 1*//*
                    break;
                }
            }
            /*Loop again on array and check if they are identical or not*/
            /*for(int x=0;x<a.length;x++){
                /*if there are two numbers are not identical. break and return false*/
              /*if(a[x]!=b[x]){
                      count++;
                  flag = false;
                  break;
              }
            }
        }
        i++;
        index++;
    }
    return flag;
}
*/


//SABRA CODE 

boolean areSimilar(int[] A, int[] B) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
      if ( A[i] != B[i] ) {
        list.add(i);
      }
    }
    if (list.size() == 0) {
      return true;
    }
    if (list.size() != 2) {
      return false;
    }
    int index1 = list.get(0);
    int index2 = list.get(1);
    if (A[index1] == B[index2] && A[index2] == B[index1]) {
      return true;
    }
    return false;
}



