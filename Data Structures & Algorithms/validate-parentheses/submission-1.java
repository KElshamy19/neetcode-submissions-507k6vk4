class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList();
        for(int i=0;i<s.length();i++)
        {
            if(isOpening(s.charAt(i)))
                stack.addLast(s.charAt(i));
            else if(isClosing(s.charAt(i)))
                {
                    char c='\0';
                    if(!stack.isEmpty())
                        c = stack.removeLast();
                    if(!isMatching(c,s.charAt(i)))
                        return false;
                }
        }
        return stack.isEmpty();
    }
    public static boolean isOpening(char c){
        return c=='('||c=='{'||c=='[';
    }
    public static boolean isClosing(char c){
        return c==')'||c=='}'||c==']';
    }
    public static boolean isMatching(char opening, char closing){
        return switch(opening){
            case '(' -> closing ==')';
            case '[' -> closing ==']';
            case '{' -> closing =='}';
            default -> false;
        };
    }

}
