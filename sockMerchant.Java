    static int sockMerchant(int n, int[] ar) {
        int pairNumber = 0;
        //array must be ordered to match pairs.
        Arrays.sort(ar);
        for(int i=0;i<n;i++){
            //i<n-1 for index out 
            if(i<n-1 && ar[i]==ar[i+1]){
                pairNumber++;
                //i+=1 because sock is pair the pair number increases in loop and here
                i+=1;
            }
        }
        return pairNumber;

    }


//Hackerrank sales by match