    static String isBalanced(String s) {
        Stack<Character> checkStack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                checkStack.push(')');
            }else if(s.charAt(i)=='{'){
                checkStack.push('}');
            }else if(s.charAt(i)=='['){
                checkStack.push(']');
            }
            else if(!checkStack.isEmpty()){
                char temp = checkStack.pop();
                if(s.charAt(i)!=temp){
                    return "NO";
                }
            //If the stack is empty, it means there are no elements to check.    
            }else{
                return "NO";
            }
            
        }
        //All elements have been checked and the stack is empty.
        if(checkStack.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }
    }
