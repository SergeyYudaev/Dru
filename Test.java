import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        charIncSplit();
//        charIncIter();
    }

    static void charIncSplit() {
        try (Scanner sc = new Scanner(System.in)) {
            char c = 0;
            String str = sc.nextLine();
            String[] token = str.split(" ");

            for (int i = 0; i < token.length; i++) {
                c = token[i].charAt(0);
                if (c >= 65 && c < 90) c += 1;
                else if (c == 90) c = 65;
                else if (c >= 97 && c < 122) c += 1;
                else if (c == 122) c = 97;

                System.out.print(c + " ");
            }
        }
    }

    static void charIncIter(){
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int length = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 32) length++;
            }

            char[] arr = new char[length];
            int counter = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != 32) {
                    arr[i - counter] = str.charAt(i);
                } else counter++;
            }

            char c = 0;

            for (int i = 0; i < arr.length; i++) {
                c = arr[i];
                if (c >= 65 && c < 90) c += 1;
                else if (c == 90) c = 65;
                else if (c >= 97 && c < 122) c += 1;
                else if (c == 122) c = 97;
                arr[i] = c;
            }

            System.out.println(Arrays.toString(arr));

        }
    }

}
