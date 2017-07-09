package com.prework.ios;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usingh on 7/8/17.
 */
public class ConcentricRectangular {

    public static void main(String[] args) {

        List<ArrayList<Integer>> resultList = prettyPrint(3);

        for(ArrayList<Integer> innerList : resultList){
            for(Integer numbers : innerList){
                System.out.print("    " + numbers + "  ");
            }
            System.out.println();
        }
    }
    public static  List<ArrayList<Integer>> prettyPrint(int a) {
        a = a * 2 -1;
        List<ArrayList<Integer>> resultList = new ArrayList<>();
        for (int index=0; index< a; index++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int inner=0; inner< a; inner++) {
                row.add(Math.max(Math.abs(a/2 - index), Math.abs(a/2 - inner)) + 1);
            }
            resultList.add(row);
        }
        return resultList;
    }
}
