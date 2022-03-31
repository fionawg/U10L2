import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        int[] array = {1, 33, 3, 4, 4};
        System.out.println(findMaximum(array, 0));
    }
    /*public static boolean isPalindrome(String check) {
        if (check.length() == 1) {
            return true;
        } else {
            if (check.substring(0, 1).equals(check.substring(check.length() - 1))){
                check = check.substring(1, check.length() - 1);
                return true;
            } else {
                return false;
            }
        }
    }
    public static int countEvens(int[] array, int i) {
        if (i == array.length){
            return 0;
        }
        if (array[i] % 2 == 0){
            return 1 + countEvens(array, i + 1);
        }
        return countEvens(array, i + 1);
    }*/
    public static int findMaximum(int[] array, int i){
        if (i == array.length - 1){
            return array[i];
        }
        if (findMaximum(array, i + 1) > array[i]){
            return findMaximum(array, i + 1);
        } else {
            return array[i];
        }
    }
}
