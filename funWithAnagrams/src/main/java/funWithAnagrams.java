/*
 * Copyright (c) 2021. Surendra Shrestha
 * Linkedin: linkedin.com/in/shressur/
 */

import java.util.*;

public class funWithAnagrams {
    public static void main(String[] args) {

        List<String> test =
            new ArrayList<>(Arrays.asList("dam", "cat", "adm", "tca", "mad", "act", "catt"));
            //new ArrayList<>(Arrays.asList("poke", "pkoe", "okpe", "ekop"));

        System.out.println(funWithAnagramsCode(test));
    }

    //logic
    public static List<String> funWithAnagramsCode(List<String> text){
        //THOUGHT PROCESS:
        //Get list elements and sort the characters'. If two words are anagrams then they will result in the same characters sequence
        //Only keep the first occurrence of the anagram (original word) and reject the rest
        //Use the sorted character sequence to filter/find the anagram
        //--------------------------------------------------------
        //original sequence => sorted sequence      => action
        //--------------------------------------------------------
        //"poke"            => "ekop"               => keep
        //"pkoe"            => "ekop"               => reject
        //"okpe"            => "ekop"               => reject
        //"ekop"            => "ekop"               => reject

        Map<String, String> map = new HashMap<>();
        for(String s:text){
            char[] s_char = s.toCharArray();
            Arrays.sort(s_char);
            //prevent overwriting (.put() will overwrite the value)
            map.putIfAbsent(new String(s_char), s); //new String(sequence_of_characters) => String
        }
        //Map<K: sorted_seq, V: original_seq>
        //add all values from the map to a list
        List<String> finalList = new ArrayList<>(map.values());
        //sort the list
        Collections.sort(finalList);
        return finalList;
    }
}
