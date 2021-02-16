    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotateArray = new int[n];
        int rot;
        for(int i=0;i<n;i++){
            //for circular rotate
            if(i-d<0){
                rot=(i-d)+n;
                rotateArray[rot] = a[i];
            }else{
                rot = i-d;
                rotateArray[rot] = a[i];
            }
            
        }
        return rotateArray;
    }

//hackerrank arrays: left rotation