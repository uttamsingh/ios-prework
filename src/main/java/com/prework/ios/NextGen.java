package com.prework.ios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by usingh on 7/9/17.
 */
public class NextGen {

    public static void main(String[] args) {
        Integer a[]={4, 5, 2, 10};
        System.out.println(new NextGen().nextGreater(Arrays.asList(a)));

    }

    public ArrayList<Integer> nextGreater(List<Integer> arr) {

        ArrayList<Integer> result = new ArrayList<>();
        int next, i, j, n;
        n = arr.size();
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (arr.get(i) < arr.get(j))
                {
                    next = arr.get(j);
                    break;
                }
            }
            result.add(next);
        }
        return result;
    }
}
