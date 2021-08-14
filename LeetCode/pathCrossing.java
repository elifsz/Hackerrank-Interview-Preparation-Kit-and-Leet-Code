public boolean isPathCrossing(String path) {
        Set<Pair<Integer,Integer>> places = new HashSet();
        places.add(new Pair(0,0));
        int x = 0;
        int y = 0;
        
        for(int i = 0;i<path.length();i++){    
            if(path.charAt(i)=='N')
                x++;
            else if(path.charAt(i)=='S')
                x--;
            else if(path.charAt(i)=='E')
                y--;
            else if(path.charAt(i)=='W')
                y++;
            
            if(places.contains(new Pair(x,y)))
                return true; 
            places.add(new Pair(x,y)); 
        }
        return false;
    }
