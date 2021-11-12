<h3> Fun with anagrams </h3>

<p>
    Two strings are anagrams if they are permutations of each other. In other words, both strings have the same size and the same characters. For example, "aaagmnrs" is an anagram of "anagrams". Given an array of strings, remove each string that is an anagram of an earlier string, then return the remaining array in sorted order.
</p>
<h5>Example</h5>
<ul>
    <li>["dam", "cat", "adm", "tca", "mad", "act", "catt"] 
        <br>=> ["cat", "catt", "dam"]
    </li>
    <li>["poke", "pkoe", "okpe", "ekop"] 
        <br>=> ["poke"]
    </li>
</ul>
<h5>Key points</h5>
<ul>
    <li>no duplicates</li>
    <li>sorted order</li>
    <li>program only returns the first occurrence of the anagram, meaning from the list of "poke", "pkoe", "okpe", and "ekop" it returns "poke"</li>
</ul>
<h5>Tips</h5>
1. List.of("s1", "s2", "s3") : <strong>immutable list</strong> <br>
2. Arrays.asList("s1", "s2", "s3") : <strong>fixed length list</strong> <br>
<br>
3. new ArrayList < > (Arrays.asList("s1", "s2", "s3")) : <strong>can grow and shrink</strong> <br>
4. new ArrayList < > {{add("s1"); add("s2"); add("s3")) : <strong>can grow and shrink</strong> <br>
5. Stream.of("val1", "val2").collect(Collectors.toList()) : <strong>can grow and shrink</strong> <br><br>
6. Set<String> setTextList = new HashSet < > (textList):    <strong>converting list to set</strong>

<table>
    <tr>
        <td><strong>Property</strong></td>
        <td><strong>HashMap</strong></td>
        <td><strong>TreeMap</strong></td>
        <td><strong>LinkedHashMap</strong></td>
    </tr>
    <tr>
        <td>Iteration Order	</td>
        <td>no guaranteed order, will remain constant over time	</td>
        <td>sorted according to the natural ordering	</td>
        <td>insertion-order</td>
    </tr>
    <tr>
        <td>Get / put / remove / containsKey</td>
        <td>O(1)</td>
        <td>O(log(n))</td>
        <td>O(1)</td>
    </tr>
    <tr>
        <td>Interfaces</td>
        <td>Map</td>
        <td>NavigableMap, Map, SortedMap	</td>
        <td>Map</td>
    </tr>
    <tr>
        <td>Null values/keys</td>
        <td>allowed</td>
        <td>Only values</td>
        <td>allowed</td>
    </tr>
</table>
<br> source: https://stackoverflow.com/questions/2889777/difference-between-hashmap-linkedhashmap-and-treemap
<img src="https://i.stack.imgur.com/MtCX2.png" />