/*
Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
 */
import java.util.Scanner;
public class Main {
    static int valueOnes(int[] array){
        for (int start = 0; start < array.length; start++){
            int index = start + 1;
            if (array[start] == index){
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int length = input.nextInt();
        System.out.println("Enter the element inside the array :");
        int[] array = new int[length];
        for (int start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        System.out.println(valueOnes(array));
    }
}