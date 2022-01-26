class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character,String> alphabetMap = new HashMap<>();
        ArrayList<String> transformations  = new ArrayList<>();
        
        char alphabet = 'a';
        for(int i=0;i<26;i++){
            alphabetMap.put(alphabet++,morse[i]);
        }
        
        for(String word: words){
            String transformation = "";
            for(char letter:word.toCharArray()){
                transformation += alphabetMap.get(letter);
            }
            if(!transformations.contains(transformation)){
                transformations.add(transformation);
            }
        }
        return transformations.size();
    }
}
