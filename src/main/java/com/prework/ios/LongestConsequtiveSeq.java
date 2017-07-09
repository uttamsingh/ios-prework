package com.prework.ios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by usingh on 7/9/17.
 */
public class LongestConsequtiveSeq {

    public static void main(String[] args) {
        Integer a[]={100, 4, 200, 1, 3, 2};
        System.out.println(new LongestConsequtiveSeq().longestConsecutive(Arrays.asList(a)));
    }

    public int longestConsecutive(final List<Integer> arr) {

        HashSet<Integer> tempSet = new HashSet<Integer>();
        int ans = 0;
        int n = arr.size();

        for (int i=0; i<n; ++i)
            tempSet.add(arr.get(i));

        for (int i=0; i<n; ++i)
        {
            if (!tempSet.contains(arr.get(i) - 1))
            {
                int j = arr.get(i);
                while (tempSet.contains(j))
                    j++;

                if (ans<j-arr.get(i))
                    ans = j-arr.get(i);
            }
        }
        return ans;
    }

}
