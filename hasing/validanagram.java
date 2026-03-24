//import java.util.HashMap;
import java.util.*;
 

class validAnagram{
    public static boolean ValidAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        if(ch1.length!=ch2.length){
            return false;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0; i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
            
        }
        // }
        // else{
        return true;
        // }
    }
    public static void main(String[] args) {
        String str1="face";
        String str2="acef";
        System.out.println(ValidAnagram(str1, str2));
    }
}   