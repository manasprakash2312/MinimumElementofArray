import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testArr[] = getNumbers(5);
        minimumElement(testArr);
    }

    public static int[] getNumbers(int number) {
        int arr[] = new int[number];
        for (int i = 0; i < arr.length; i++) {
            int count = i + 1;
            System.out.println("Enter " + count +  " number");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void minimumElement(int arr[]) {
        int minimumElement = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimumElement) {
                minimumElement = arr[i];
            }
        }
        System.out.println("Minimum element of the array is " + minimumElement);


    }
}
