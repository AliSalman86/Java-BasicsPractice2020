public class LongestString{
     public static void main(String []args){
        String [] stringArr = {"12", "123", "123456", "1234567", "1", "13", "1234", "1111111111"};
        String longestString = findLongestString(stringArr);
        System.out.println(longestString);
     }
     /**
     * findLongestString is a function searches an array of strings
     * for the longest string.
     * @param strings is an array of strings
     * @return String: the longest string found.
     */
     public static String findLongestString(String [] strings) {
         String winnerString = strings[0];
         for(int i = 1; i < strings.length; i++) {
             if (strings[i].length() > winnerString.length()) {
                 winnerString = strings[i];
             }
        }
     return winnerString;
     }
}