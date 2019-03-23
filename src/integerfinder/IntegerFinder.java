/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
* Write a function:
*
* class Solution { public int solution(int[] A); }
*
* that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
*
* For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
*
* Given A = [1, 2, 3], the function should return 4.
*
* Given A = [−1, −3], the function should return 1.
*
* Write an efficient algorithm for the following assumptions:
*
* N is an integer within the range [1..100,000]; each element of array A is an integer within the range [−1,000,000..1,000,000].
*/
package integerfinder;

/**
 *
 * @author linusbrannstrom
 */
public class IntegerFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize soulutions
		Solution1 sol1 = new Solution1();
		Solution2 sol2 = new SOlution2();
		Solution3 sol3 = new Solution3();

		// Test inputs
		int[] arr1 = {2, 3, 7, 6, 8, -1, -10, 15}; // Output 1
		int[] arr2 = { 2, 3, -7, 6, 8, 1, -10, 15 }; // Output 4
		int[] arr3 = {1, 1, 0, -1, -2}; //Output 2
		int[] arr4 = {5}; // Output 1
		int[] arr5 = {}; 

		// Integer to find
		int missing = 0;

		// Tests ----------------------------------------------
		missing = sol2.findMissing(arr1, arr1.length);
		System.out.println(missing);
    }
    
}
