package com.prework.ios;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by usingh on 7/9/17.
 */
public class KthElement {

    public static void main(String[] args) {
        int a[]={2,1,4,3,2};
        System.out.println(new KthElement().kthsmallest(IntStream.of(a).boxed().collect(Collectors.toList()), 2));
    }

    public Integer kthsmallest(final List<Integer> a, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: a){
            q.offer(i);
        }

        int n = -1;
        while(k>0){
            n = q.poll();
            k--;
        }
        return n;
    }
}
