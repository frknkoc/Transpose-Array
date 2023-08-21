import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1, number2;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen çok boyutlu dizinizin satır sayısını giriniz...");
        number1 = input.nextInt();
        System.out.println("lütfen kaç sayı girmek istediğinizi giriniz...");
        number2 = input.nextInt();
        int[][] arr = new int[number1][number2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println("lütfen girmek istediğiniz " + (i + 1) + ". satır " + (j + 1) + ". sütuna ait sayıyı giriniz...");
                arr[i][j] = input.nextInt();
            }
            System.out.print(Arrays.toString(arr[i]) + "\n");
        }


        int[][] tranposeArray = new int[number2][number1];
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                tranposeArray[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < tranposeArray.length; i++) {
            System.out.print(Arrays.toString(tranposeArray[i]) + "\n");
        }
    }
}