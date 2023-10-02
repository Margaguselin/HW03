public class ThirdTask {
    public static int absoluteDifference(int a, int b) {
        return Math.abs(a - b);
    }

    public char getFirstChar(String str) {
        return str.charAt(0);
    }

    public char getLastChar(String str) {
        return str.charAt(str.length() - 1);
    }

    public String swapFirstAndLastCharacter(String string) {
        if (string == null || string.length() < 2) {
            // The string is either null or too short to perform the swap.
            return string;
        }

        char[] charArray = string.toCharArray();
        char firstChar = charArray[0];
        char lastChar = charArray[charArray.length - 1];

        // Swap the first and last characters
        charArray[0] = lastChar;
        charArray[charArray.length - 1] = firstChar;

        // Create a new string from the modified char array
        return new String(charArray);
    }

    public static void main(String[] args) {
        ThirdTask task = new ThirdTask();

        int a = 5;
        int b = 9;
        int result = absoluteDifference(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);

        String inputString = "Python";
        char firstChar = task.getFirstChar(inputString);
        System.out.println("string = " + inputString);
        System.out.println("result = " + firstChar);

        char lastChar = task.getLastChar(inputString);
        System.out.println("result = " + lastChar);

        String swappedString = task.swapFirstAndLastCharacter(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Swapped string: " + swappedString);
    }
}

