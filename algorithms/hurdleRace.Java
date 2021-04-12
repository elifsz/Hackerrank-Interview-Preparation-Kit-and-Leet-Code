    static int hurdleRace(int k, int[] height) {
    int max =Arrays.stream(height).max().getAsInt();

    if(k>=max){
        return 0;
    }
    else{
         int dose = max-k;
         return dose;
    }   
    }
