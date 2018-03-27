int[] sortByHeight(int[] a) {
    int temp;
    int indexOfMin;
    for(int i=0; i<a.length;i++){
        if( a[i] == -1 ){
            continue;
        }
        indexOfMin = i;
        
        for(int j=i+1;j<a.length;j++){
            if(a[j]<a[indexOfMin]&&a[j]!=-1){
                indexOfMin=j;
            }
        }
        temp=a[i];
        a[i]=a[indexOfMin];
        a[indexOfMin]=temp;
    }
    return a;
}
