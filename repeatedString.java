    //letter a
    static long repeatedString(String s, long n) {
        long count = 0;
        int length = s.length();
        int numberA = 0;
        char letter = 'a';
        for(int i=0;i<length;i++){
            if(s.charAt(i)==letter){
                numberA++;
            }
        }
        
        if(n%length==0){
            count = n/length;
            count = count * numberA;
        }else{
            long temp = n%length;
            count = n/length;
            count = count * numberA;
            int tempNumber = 0;
            for(int i=0;i<temp;i++){
                if(s.charAt(i)==letter){
                tempNumber++;
                } 
            }
            count = count + tempNumber;
        }       
        return count;
    }

//hackerrank repeated string