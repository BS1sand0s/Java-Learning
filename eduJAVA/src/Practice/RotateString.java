package Practice;

public class RotateString {
    public boolean rotateString(String A, String B) {
        for(int i =0; i<= A.length();i++){
            A = shift(A);
            if (A.equals(B))
                return true;
        }
        return false;

    }
    static public String shift(String shiftString){
        int N = shiftString.length();
        char[] shiftChars = shiftString.toCharArray();
        char leftmost;
        if( N != 0) leftmost = shiftChars[0];
        else return "";
        StringBuilder shiftBuilder = new StringBuilder();
        for(char shiftChar:shiftChars){
            shiftBuilder.append(shiftChar);
        }
        shiftBuilder.deleteCharAt(0);
        shiftBuilder.append(leftmost);
        return shiftBuilder.toString();
    }
    public static void main(String[] agrs){
        RotateString test = new RotateString();
        System.out.println(test.rotateString("",""));
    }
}
