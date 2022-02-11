/*
Description:
Write simple .camelCase method (camel_case function in PHP, CamelCase in C# or camelCase in Java) for strings.
All words must have their first letter capitalized without spaces.

For instance:

camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"
*/

public class Solution {

    public static String camelCase(String str) {
        if (str==null) return null;
      
        String[] words = str.trim().replaceAll("( )+", " ").toLowerCase().split(" ");
        if (words.length==0) return "";
      
        StringBuilder finalString = new StringBuilder();
      
        for(String word : words)
        {
           finalString.append(word.substring(0,1).toUpperCase() + 
                              word.substring(1));
        }
      
        return finalString.toString();
    }

}
