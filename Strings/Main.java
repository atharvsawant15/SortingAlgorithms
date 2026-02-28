import java.util.HashMap;
import java.util.HashSet;

class Main{
    //----------Function for reverse a String------------
    public static String reverse_string(String str){
        char[] arr =  str.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    //----------Function to check Palindrome----------
    public static boolean check_palindrome(String str){
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
        String rev = reverse_string(cleaned);
        return cleaned.equals(rev);
    }

    //----------count vowels-----------
    public static int count_vowels(String str){
        String cleaned = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase().trim();
        int count = 0;
        for(char c : cleaned.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }

    //----------Anagram Checker------------
    public static boolean check_anagram(String str1, String str2){
        str1 = str1.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(str1.length() != str2.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : str2.toCharArray()){
            if(!map.containsKey(ch)) return false;
            map.put(ch,map.get(ch)-1);
        }
        for (Integer value : map.values()) {
            if(value != 0) return false;
        }
        return true;
    }

    //----------Remove Duplicates----------
    public static String remove_duplicates(String str){
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for(char ch : str.toCharArray()) {
            if(!set.contains(ch)) {  
                set.add(ch);
                result.append(ch);   
            }
        }
        return result.toString();
    }

    //---------String Compressor-----------
    public static String string_compressor(String str){
        if (str == null || str.length() == 0) return str;
        int i=0;
        int j=0;
        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        while(j < str.length()){
            if(arr[i] != arr[j]){
                int count = j-i;
                result.append(arr[i]);
                result.append(count);
                i = j;
            }
            j++;    
        }
        result.append(arr[i]);
        result.append(j - i);
        return result.toString();
    }
    
    public static void main(String args[]){
        String str = "Hello";
        String str1 = "listen";
        String str2 = "silent";
        String str3 = "aaaabbbbbbcccccccddeee";

        //-----All Functions Test ------
        String result_revStr = reverse_string(str);
        Boolean result_checkPal = check_palindrome(str);
        int result_cntVowels = count_vowels(str);
        Boolean result_anaCheck = check_anagram(str1,str2);
        String result_remDup = remove_duplicates(str);
        String result_strComp = string_compressor(str3);

        //---------Output-------------
        System.out.println(result_revStr);
        System.out.println(result_checkPal);
        System.out.println(result_cntVowels);
        System.out.println(result_anaCheck);
        System.out.println(result_remDup);
        System.out.println(result_strComp);
    }
}