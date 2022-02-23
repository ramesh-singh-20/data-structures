import java.util.Stack;


public class App {
    public static void main(String[] args) {
        String s= "[(])";
        System.out.println(isValid(s));
        System.out.println(IsValidParenthesis(s));

    }

    public static boolean isValid(String s){
        Stack<Character> stack= new Stack<>();

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)== '{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                Character ch= stack.pop();

                if((ch=='[' && s.charAt(i)!=']') || (ch=='{' && s.charAt(i)!='}')
                || (ch=='(' && s.charAt(i)!=')')){
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }

    //This method will act only if brackets are of similar type.
    public static boolean IsValidParenthesis(String s){

        int curlyOpen=0;
        int roundOpen=0;
        int squareOpen= 0;
        for(int i=0; i< s.length(); i++){
            if(s.charAt(i)=='('){
                roundOpen++;
            }
            else if(s.charAt(i)== '{'){
                curlyOpen++;
            }
            else if(s.charAt(i)== '['){
                squareOpen++;
            }
            else if(s.charAt(i)== ')'){
                roundOpen--;
                if(roundOpen<0){
                    return false;
                }
            }
            else if(s.charAt(i)== '}'){
                curlyOpen--;
                if(curlyOpen<0){
                    return false;
                }
            }
            else if(s.charAt(i)== ']'){
                squareOpen--;
                if(squareOpen<0){
                    return false;
                }
            }
        }

        return (curlyOpen==0 && roundOpen==0 && squareOpen==0);

    }
}
