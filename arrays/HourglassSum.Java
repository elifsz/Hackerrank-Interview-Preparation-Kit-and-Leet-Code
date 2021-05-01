    static int hourglassSum(int[][] arr) {
        int sum;
        //initial max value must be smaller for all test cases
        int maxHourglassSum=Integer.MIN_VALUE;
        for(int i=0;i<=3;i++){
            for(int j=0;j<=3;j++){
                //sum hourglass
                    sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                    //control max
                    if(sum>maxHourglassSum){
                        maxHourglassSum = sum;
                    }
          
            }
        }
        return maxHourglassSum;
    }

//hackerrank 2D array
