/*
Your task is to convert strings to how they would be written by Jaden Smith. 
The strings are actual quotes from Jaden Smith,
but they are not capitalized in the same way he originally typed them.

Example:

Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
*/

public class JadenCase {

	public String toJadenCase(String phrase) {
   if(phrase == null || phrase.equals("")) return null;
    
    char[] array = phrase.toCharArray();
    
    for(int i = 0; i < array.length; i++) 
    {
      if(i == 0 || array[i-1] == ' ')
      {
        array[i] = Character.toUpperCase(array[i]);
      }
    }
    
    return new String(array);
  }

}
