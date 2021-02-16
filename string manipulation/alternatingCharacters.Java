    static int alternatingCharacters(String s) {
        int minNumberDelete = 0;
        char temp[] = s.toCharArray();
        for(int i=0;i<temp.length;i++){
            if(i+1<temp.length && temp[i]==temp[i+1]){
                minNumberDelete++;
            }
        }
        return minNumberDelete;
    }