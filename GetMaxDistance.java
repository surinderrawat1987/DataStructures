/**
 * 
 * 
 * Given an array with repeated elements, the task is to find the maximum distance between two occurrences of an element.
 * Input:
 * The first line of input will contain no of test cases T . Then T test cases follow . Each test case contains 2 lines. The first line of each test case contains an integer N denoting the number of elements in the array, the next line contains N space separated integer's.

 * Output:
 * For each test case in new line print the Maximum distance between two occurrences of an element
 * Constraints:

1<=T<=100
1<=N<=1000

Example:
Input
2
6
1 1 2 2 2 1
12
3 2 1 2 1 4 5 8 6 7 4 2

Output
5
10
 * */

package learn;

import java.util.HashMap;
import java.util.Scanner;
import learn.GfG;



/**
 *
 * @author Surinder Rawat
 */
public class GetMaxDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            GfG g = new GfG();
            System.out.println(g.maxDistance(arr, n));

            t--;
        }
    }
}

class GfG {
    int maxDistance(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();        
        int maxDistance = 0;
    	for (int i=0; i<n; i++) 
        {            
            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            } else {                
                int distance = i-map.get(arr[i]);                
                if(maxDistance < distance){
                    maxDistance=distance;
                }
            }
        }
        return maxDistance;
    }
}
