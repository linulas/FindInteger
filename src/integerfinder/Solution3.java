/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerfinder;

import java.util.Arrays;

/**
 *
 * @author 29AjayKumar
 */
public class Solution3 {

    // Java Program to find the smallest 
    // positive missing number 
    static int solution(int[] A) {

        int m = Arrays.stream(A).max().getAsInt(); //Storing maximum value 
        if (m < 1) // In case all values in our array are negative 
        {
            return 1;
        }
        if (A.length == 1) {

            //If it contains only one element 
            if (A[0] == 1) {
                return 2;
            } else {
                return 1;
            }
        }
        int i = 0;
        int[] l = new int[m];
        for (i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                if (l[A[i] - 1] != 1) //Changing the value status at the index of our list 
                {
                    l[A[i] - 1] = 1;
                }
            }
        }
        for (i = 0; i < l.length; i++) //Encountering first 0, i.e, the element with least value 
        {
            if (l[i] == 0) {
                return i + 1;
            }
        }
        //In case all values are filled between 1 and m 
        return i + 2;
    }
// This code is contributed by 29AjayKumar 

}
