class Main{
    //---------Function for reverse a String------------
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
    public static void main(String args[]){
        String str = "Hello";

        //-----All Functions Test ------
        String result_revStr = reverse_string(str);
        Boolean result_checkPal = check_palindrome(str);
        int result_cntVowels = count_vowels(str);

        //---------Output-------------
        System.out.println(result_revStr);
        System.out.println(result_checkPal);
        System.out.println(result_cntVowels);
    }
}