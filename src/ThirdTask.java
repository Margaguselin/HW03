public class ThirdTask {
    public static int absoluteDifference(int a, int b) {
        return Math.abs(a - b);
    }
    public static char getFirstChar(String str) {
        return str.charAt(0);
    }
public static char getLastChar(String str) {
    return str.charAt(str.length() - 1);

    public static char




}

    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int result = absoluteDifference(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);

        String inputString = "Python";
        char firstChar = getFirstChar(inputString);
        System.out.println("string = " + inputString );
        System.out.println("result = " + firstChar );


char lastChar = getLastChar(inputString);
System.out.println("result = " + lastChar);
    }
}

