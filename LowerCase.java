/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String s = args[0];
        System.out.println(lowerCase(s));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String non = "";
		for (int i=0 ; i < s.length () ; i++) {
			if ((s.charAt(i) >= 65) && (s.charAt(i) <= 90)) {
				int new1 = s.charAt(i) + 32;
				non += (char) new1;
			} else non += s.charAt(i);
		}
		         return non;
				
			}
		}
		
		
		
		
		
