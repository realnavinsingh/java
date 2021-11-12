<h3>Is subset</h3>
Return true if <strong>second</strong> array is subset of <strong>first</strong> array.<br>
An arrays is considered to be a subset of another array if each array element of previous array is in later array.
<h5>Example:</h5>
int [ ] a = {1, 4, 4, 3, 0};</tr>
<table>
    <tr>
        <td><strong>int[ ] b =</strong></td>
        <td>
            <strong>Output (flexible)</strong><br>
            <em>isSubsetFlexible()</em>
        </td>
        <td><strong>Output (strict)</strong><br>
            <em>isSubsetStrict()</em>
        </td>
    </tr>
    <tr>
        <td>{}</td>
        <td>true</td>
        <td>false</td>
    </tr>
    <tr>
        <td>{1}</td>
        <td>true</td>
        <td>true</td>
    </tr>
    <tr>
        <td>{1, 0}</td>
        <td>true</td>
        <td>true</td>
    </tr>
    <tr>
        <td>{4, 4, 4}</td>
        <td>true</td>
        <td>false</td>
    </tr>
    <tr>
        <td>{4, 0, 4}</td>
        <td>true</td>
        <td>true</td>
    </tr>
    <tr>
        <td>{4, 4, 4, 4, 0, 0, 0}</td>
        <td>true</td>
        <td>false</td>
    </tr>
    <tr>
        <td>{9, 5, 4, 10}</td>
        <td>false</td>
        <td>false</td>
    </tr>
    <tr>
        <td>a.length < b.length</td>
        <td>false</td>
        <td>false</td>
    </tr>
</table>
<p><strong>flexible</strong> method allows duplicate<br>
<strong>strict</strong> method does not allow duplicate<br>
<span style="padding-left: 12px;">* reference above table</span>
</p>