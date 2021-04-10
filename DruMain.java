import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DruMain {
    public static void main(String[] args) {
        Filter<String> stringFilter = new StringFilter<>();
        Filter<Integer> integerFilter = new IntegerFilter<>();
        String str;

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                Object[] result;
                str = sc.nextLine();
                if (str.equals("/end")) break;
                String[] token = str.split(" ");

                if (token[0].equals("S")) {
                    String[] arr = new String[token.length - 1];
                    for (int i = 1; i < token.length; i++) {
                        arr[i - 1] = token[i];
                    }
                    result = filter(arr, stringFilter);
                    System.out.println(Arrays.toString(result));

                } else if (token[0].equals("L")) {
                    Integer[] arr = new Integer[token.length - 1];
                    for (int i = 1; i < token.length; i++) {
                        arr[i - 1] = Integer.valueOf(token[i]);
                    }
                    result = filter(arr, integerFilter);
                    System.out.println(Arrays.toString(result));
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] array, Filter filter) {
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (filter.apply(array[i])) result.add(array[i]);
        }
        return (T[]) result.toArray();
    }

}
//    S Hi, my name isn`t Petr!
//    L 100 5 231 151 123 10 2
