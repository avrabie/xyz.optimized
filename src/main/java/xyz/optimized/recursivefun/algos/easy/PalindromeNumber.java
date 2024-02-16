package xyz.optimized.recursivefun.algos.easy;

/**
 * Probem 9
 * The PalindromeNumber class checks whether a given number is a palindrome.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindrome = new PalindromeNumber();
        System.out.println(palindrome.isPalindrome(12321));
    }


    public boolean isPalindrome(int x) {
        if(x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;
        return x == reverseDigits(x);
    }

    public int reverseDigits(int r) {
        if (r == 0) return 0;
        return  (r % 10)* (int) Math.pow(10,getPower(r)) + reverseDigits(r/10) ;
    }

    public int getPower(int r) {
        if (r<0) return getPower(r*-1);
        if (r<10) return 0;
        return getPower(r/10)+1;
    }

    public int nonRecursiveReverse(int x) {
        int result = 0;
        while (x > 0) {
            result *= 10;
            result += x % 10;
            x = x / 10;
        }
        return result;
    }
}
