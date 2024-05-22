import java.util.*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputNum = scanner.nextLine();
        int N = inputNum.length();
        List<String> generatedId = new ArrayList<>();
        
        for (int i = 1; i < N; i++) {
            String rotatedStr = rotateArrayToString(inputNum, i, N);
            generatedId.add(removeLeadingZero(rotatedStr));
        }
        
        for (String id : generatedId) {
            System.out.print(id + " ");
        }
    }

    public static String rotateArrayToString(String arr, int k, int N) {
        StringBuilder rotatedStr = new StringBuilder();
        for (int i = 0; i < N; i++) {
            rotatedStr.append(arr.charAt((i + k) % N));
        }
        return rotatedStr.toString();
    }

    public static String removeLeadingZero(String num) {
        int i = 0;
        while (i < num.length() && num.charAt(i) == '0') {
            i++;
        }
        return num.substring(i);
    }
}
