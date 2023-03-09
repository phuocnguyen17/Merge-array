import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int size1 = input.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Enter the size of the second array : ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Enter the element for the first array: ");
        for (int i = 0; i < size1; i++) {
            array1[i] = input.nextInt();
        }

        System.out.println("Enter the elements for the second array: ");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }
        int[] array3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        System.out.println("The merged array is:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");

        }
    }
}