
//import java.util.*;
//class validanagram{
    // public static boolean ValidAnagram(String str1,String str2){
//         char[] ch1=str1.toCharArray();
//         char[] ch2=str2.toCharArray();
//         if(ch1.length!=ch2.length){
//             return false;
//         }
//         Arrays.sort(ch1);
//         Arrays.sort(ch2);
//         for(int i=0; i<ch1.length;i++){
//             if(ch1[i]!=ch2[i]){
//                 return false;
//             }
//         }
//         return true;



//optimse
    // public static boolean ValidAnagram(String str1,String str2){ 
    //   HashMap<Character,Integer> mp=new HashMap<>();
    //   HashMap<Character,Integer> mp1=new HashMap<>();
    //   char[] ch1=str1.toCharArray();
    //   char[] ch2=str2.toCharArray();
    //   if(ch1.length!=ch2.length){
    //     return false;
    //   }
    //   for(int i=0; i<ch2.length;i++){
    //     if(mp.containsKey(ch1[i])){
    //         int frq=mp.get(ch1[i]);          //gey curr frq
    //         mp.put(ch1[i],frq +1);
    //     }else{
    //         mp.put(ch1[i],1);
    //     }
    //   }
    //   for(int i=0; i<ch1.length;i++){
    //     if(mp1.containsKey(ch2[i])){
    //         mp1.put(ch2[i],frq +1);
    //     }else{
    //         mp1.put(ch2[i],1);
    //     }
    //   }            int frq=mp1.get(ch2[i]);

    //   return mp.equals(mp1);
    //  // return true;

    // }




//optisemese

//   public static boolean ValidAnagram(String str1,String str2){
//       HashMap<Character,Integer> mp=new HashMap<>();
//       char[] ch1=str1.toCharArray();
//       if(ch1.length!=ch1.length){
//         return false;
//       }
//       for(int i=0; i<ch1.length;i++){
//         if(mp.containsKey(ch1[i])){
//           int frq=mp.get(ch1[i]);          //gey curr frq
//           mp.put(ch1[i],frq +1);
//         }else{
//           mp.put(ch1[i],1);
//         }
//       }
//       for (int i = 0; i < str22.length; i++) {
//         char[] ch2=str2.toCharArray();
//         int frq=ch2[i];
//         if(mp.get(value)-frq!=0){
//           System.out.println("ANAGRAM");
//         }
        
//       }
//       return true;
//   }
//   public static void main(String[] args) {
//     String str1="face";
//     String str2="acef";
//     System.out.println(ValidAnagram(str1, str2));
//     }
// }   




import java.util.*;

class ValidAnagram {
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();

        // Step 1: Count frequency of str1
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Reduce frequency using str2
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (!mp.containsKey(ch)) {
                return false;
            }

            mp.put(ch, mp.get(ch) - 1);

            if (mp.get(ch) < 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
    }
}