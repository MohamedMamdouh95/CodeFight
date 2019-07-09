int[][] boxBlur(int[][] image) {
    int outputMatrixNumberOfRows = image.length-2;
    int outputMatrixNumberOfColumns = image[0].length-2;
    List<List<Integer>> dynamic2D = new ArrayList<List<Integer>>();
    int [][] outputMatrix = new int[outputMatrixNumberOfRows][outputMatrixNumberOfColumns];
    for(int i=0;i<outputMatrixNumberOfRows;i++){
        dynamic2D.add(new ArrayList<Integer>());
        for(int j=0;j<outputMatrixNumberOfColumns;j++){
            int average = (image[i][j]+image[i][j+1]+image[i][j+2]+image[i+1][j]+image[i+1][j+1]+image[i+1][j+2]+image[i+2][j]+image[i+2][j+1]+image[i+2][j+2])/9;
         dynamic2D.get(i).add(average);   
        }
    }
    for(int i=0;i<outputMatrixNumberOfRows;i++){
        for(int j=0;j<outputMatrixNumberOfColumns;j++){
            outputMatrix[i][j] =dynamic2D.get(i).get(j); 
        }
    }
    return outputMatrix;
}
