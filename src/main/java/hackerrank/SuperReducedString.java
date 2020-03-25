package hackerrank;

/**
 * Steve has a string of lowercase characters in range ascii[‘a’..’z’]. He wants to reduce the string to its shortest length by doing a series of operations. In each operation he selects a pair of adjacent lowercase letters that match, and he deletes them. For instance, the string aab could be shortened to b in one operation.
 *
 * Steve’s task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print Empty String
 *
 * Sample Input 0
 *
 * aaabccddd
 * Sample Output 0
 *
 * abd
 * Explanation 0
 *
 * Steve performs the following sequence of operations to get the final string:
 *
 * aaabccddd → abccddd → abddd → abd
 */
public class SuperReducedString {


    public String reduce(String s){
        StringBuilder sb = new StringBuilder(s);
        char[] arr = s.toCharArray();
        int i=0;
        while(i<sb.length()-1){
            if(arr[i] == arr[i+1]){
                sb = sb.delete(i,i+2);
                i=0;
                arr = sb.toString().toCharArray();
                continue;
            }
            i++;
        }
        return (sb.toString().isEmpty()) ? "Empty String" : sb.toString();
    }

}
