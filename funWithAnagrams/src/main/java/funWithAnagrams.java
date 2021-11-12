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

//region "using Map.putIfAbsent()"
        /*
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
        */
//endregion

//region "using two for-loop"

    HashSet<String> setText = new HashSet<>(); //remove duplicate anagrams
    for (String t:text){
        char[] temp = t.toCharArray();
        Arrays.sort(temp);  //without sorting anagram cannot be determined i.e. without sorting "cat" and "cta" are different element
        setText.add(new String(temp)); //only adds unique elements
    }

    //map to original array element
    List<String> filteredList = new ArrayList<String>();
    for(String st:setText){ //sorted
        for(String t:text){ //original
            char[] temp = t.toCharArray();
            Arrays.sort(temp);
            if((new String(temp)).equals(st)){
                filteredList.add(t);
                break;  //find first match, leave other anagrams
            }
        }
    }
    Collections.sort(filteredList);
    return filteredList;

//endregion
    }
}
