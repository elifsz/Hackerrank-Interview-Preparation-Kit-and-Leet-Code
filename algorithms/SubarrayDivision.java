    static int birthday(List<Integer> s, int d, int m) {
        int number = 0;
        int length = s.size();
        int sum=0;
        for(int i=0;i<length;i++){
            for(int j=0;j<m;j++){
                //check array size
                if(i+j<length){
                    sum+=s.get(i+j);
                }
            }
            //The sum of the integers on the squares is equal to his birth day
            if(sum==d){
                number++;
            }
            sum = 0;
        }     
        return number;
    }
