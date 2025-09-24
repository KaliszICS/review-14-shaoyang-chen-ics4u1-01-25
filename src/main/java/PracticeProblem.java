public class PracticeProblem {
	public static void main(String args[]) {

	}
	public static int calculate(int a, int b, char c){
        return switch (c) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> (int)Math.pow(a, b);
            default -> -1;
        };
    }
    final static int MAXIMUM = 10;
    public static boolean totalWordsChecker(String words){
        String[] wordsArray = words.split(" ");
        return wordsArray.length <= MAXIMUM;
    }
    public static String minStrings(String str1, String str2, String str3){
        String temp1 = str1.toLowerCase();
        String temp2 = str2.toLowerCase();
        String temp3 = str3.toLowerCase();
        if (temp1.compareTo(temp2) <= 0 && temp1.compareTo(temp3) <= 0) {
            return str1;
        } else if (temp2.compareTo(temp3) <= 0) {
            return str2;
        } else {
            return str3;
        }
    }

}
