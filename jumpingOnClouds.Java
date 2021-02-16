    static int jumpingOnClouds(int[] c) {
        int n = c.length;
        int jump = 0;
        for(int i=0;i<n;i++){
            //unsafe condition
            if(c[i]==1){
                //for minimum jump
                if(i<n-2 && c[i+2]==0){
                    jump++;
                    //i++ for 2 index
                    i++;
                }
                else if(i<n-1 && c[i+1]==0){
                    jump++;
                }
            }
            //safe condition
            else{
                if(i<n-2 && c[i+2]!=1){
                    jump++;
                    i++;
                }
                else if(i<n-1 && c[i+1]!=1){
                    jump++;
                }
            }
        }
        return jump;
    }


//hackerrank jumping on the clouds