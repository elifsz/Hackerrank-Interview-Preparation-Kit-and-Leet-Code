class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int len = s.length();
        if(s.indexOf(" ") == -1) { //no space
            return len;
        }
        int i = len - 1;
        len = 0;
        while(true){
            if(s.charAt(i) == ' ' || i < 0){
                break;
            }
            i--;
            len++;
        }
        return len;
    }
}
