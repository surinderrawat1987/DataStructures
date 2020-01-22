/**
 *
 *
 * Given an array A[]  of n elements. Your task is to complete the Function num which returns an integer denoting the total number of times digit k appears in the whole array.
 *
 * For Example:
 *
 * A[]={11,12,13,14,15}, k=1
 *
 * Output=6 //Count of the digit 1 in the array
 *
 *
 * Input:
 * The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. The first line of each test case contain an integer n denoting the size of the array A[]. Then in the second line are n space separated values of the array A[] .In the third line of each test case contains an integer k, which is the digit to be counted.
 *
 *
 * Output:
 * For each test case in a new line print the number of elements counted.  *
 */
package learn;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Surinder Rawat
 */
public class GetDigitInArr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n = sc.nextInt();
            int arr[] = new int[n];            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int k = sc.nextInt();
            GfG1 g = new GfG1();
            System.out.println(GfG1.num(arr, n, k));
        }
    }
}

class GfG1 {

    public static int num(int a[], int n, int k) {
        int digits = 0;
        for (int i = 0; i < n; i++) {
            int num = a[i];
            while (num >= 10) {
                if ((num % 10) == k) {
                    digits++;
                }                
                num = num / 10;
            }
            if (num == k) {
                digits++;
            }
        }
        return digits;
    }
}