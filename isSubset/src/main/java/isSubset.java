/*
 * Copyright (c) 2021. Surendra Shrestha
 * Linkedin: linkedin.com/in/shressur/
 */

import java.util.*;

class isSubset {

    public static void main(String[]args){
        int[] a = {1, 4, 4, 3, 0};
        int[] b =
        //        {};
        //        {1};
        //        {1, 0};
                {4, 4, 4};
        //        {4, 0, 4};
        //        {4, 4, 4, 4, 0, 0, 0};
        //        {9, 5, 4, 10};

        System.out.println("array 1: " + Arrays.toString(a));
        System.out.println("array 2: " + Arrays.toString(b));
        System.out.println("Q: Is second array subset of first array?");
        System.out.println("-".repeat(50));

        System.out.println("A: Flexible -> " + isSubsetFlexible(a,b) );
        System.out.println("A: Strict -> " + isSubsetStrict(a,b) );
    }
    //flexible function: allows duplicates (only cares about the presence or absense of the element in second array not the number of elements)
    public static boolean isSubsetFlexible(int[] arr1, int[] arr2){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Arrays.stream(arr1).forEach(list1::add);
        Arrays.stream(arr2).forEach(list2::add);

        return list1.containsAll(list2);
    }


    //strict function: no duplicates (must match each and every elements regardless of duplicate or not)
    public static boolean isSubsetStrict(int[] arr1, int[] arr2) {
        //THOUGHT PROCESS:
        //if arr2 is subset of arr1 then every element in arr2 must be present in arr1
        //so if matching element from arr2 is removed one by one then at the
        //end arr2 must be empty

//region "using List.remove()"
        /*
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        Arrays.stream(arr1).forEach(list1::add);
        Arrays.stream(arr2).forEach(list2::add);

        if(list2.size()>0){
            for(Integer i:list1){
                for(Integer j:list2){
                    if(Objects.equals(i, j)){
                        list2.remove(j);
                        //System.out.println(list2);
                        break;  //remove the first occurrence only (exit inner for loop)
                    }
                }
            }
            //System.out.println(list2);
            return list2.size() == 0;
        } else{
            return false;
        }
        */
//endregion

//region "using LinkedList.removeFirstOccurrence()"

        LinkedList<Integer> aList = new LinkedList<>();
        LinkedList<Integer> bList = new LinkedList<>();

        Arrays.stream(arr1).forEach(aList::add);
        Arrays.stream(arr2).forEach(bList::add);

        if (bList.size() > 0) {
            for (Integer e : aList) {
                bList.removeFirstOccurrence(e);     //if no match is found, list remains unchanged
            }
            //System.out.println(list2);
            return bList.size() == 0;
        } else {
            return false;
        }

//endregion
    }
}