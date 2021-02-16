    public static int countingValleys(int steps, String path) {
        int numberValley = 0;
        //level means sea level and equal 0
        int level = 0;
        for(int i=0;i<steps;i++){
            //one level below sea level and then up step is the valley.
            if(level ==-1 && path.charAt(i)=='U'){
                numberValley++;
            }     
            if(path.charAt(i)=='U'){
                level++;
            }else if(path.charAt(i)=='D'){
                level--;
            }
        }
        return numberValley;
    }
}


//hackerrank counting valleys