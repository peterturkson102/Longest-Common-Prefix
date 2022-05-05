class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String myString = "";
        int shorty = 0;
        int short0 = strs[0].length();
        int short1 = strs[1].length();
        int short2 = strs[2].length();

        if (short0 < short1 && short0 < short2) {
            shorty = short0;
        } else if (short1 < short0 && short1 < short2) {
            shorty = short1;
        } else if (short2 < short0 && short2 < short1) {
            shorty = short2;
        }else if (short0 == short1 && short0 < short2) {
            shorty = short0;
        } else if (short1 == short2 && short1 < short0) {
            shorty = short1;
        } else if (short0 == short2 && short2 < short1) {
            shorty = short2;
        }


        for (int x = 0; x < shorty; x++) {
            if (strs[0].charAt(x) == strs[1].charAt(x) &&strs[0].charAt(x) == strs[2].charAt(x))

            {
                myString =myString.concat(String.valueOf(strs[0].charAt(x)));
            } else {
                break;
            }

        }
     return myString;
    }
    public static void main(String[] args) {
        String[] words= {"flower","flow","flet"};
        System.out.println(longestCommonPrefix(words));
    }
}