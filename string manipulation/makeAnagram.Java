    static int makeAnagram(String a, String b) {
        int numberDelete = 0;
        int numberEqual = 0;
        char tempArray1[] = a.toCharArray(); 
        char tempArray2[] = b.toCharArray();
        for(int i=0;i<tempArray1.length;i++){
            for(int j=0;j<tempArray2.length;j++){
                if(tempArray1[i]==tempArray2[j]){
                    //Since the second loop starts at 0 for each i, the equal tempArray2 [j] should not be counted equal again for another letter.
                    tempArray2[j] = '0';
                    //Since it is equal for both arrays, the total is the number of letters that are equal.
                    numberEqual+=2;
                    break;
                }
            }
        }      
        numberDelete = tempArray2.length+tempArray1.length - numberEqual;
        return numberDelete;
    }

//strings: making anagram hackerrank