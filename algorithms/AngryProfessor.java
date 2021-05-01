    static String angryProfessor(int k, int[] a) {
        //k=threshold
        int len = a.length;
        int late=0;
        for(int i=0;i<len;i++){
            if(a[i]<=0){
                late++;
            }
        }
        if(late>=k){
            return "NO";
        }
        else{
            return "YES";
        }
    }
