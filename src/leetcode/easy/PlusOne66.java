package src.leetcode.easy;

import java.math.BigInteger;
import java.util.Arrays;

    public class PlusOne66 {
//        public int[] plusOne(int[] digits) {
////            int res = 0;
////            for(int i=0; i<digits.length; i++) {
////                res = res * 10 + digits[i];
////            }
////                    res = res+1;
//
//            // ---> for longer values where the number exceeds the int limit we have to use bigInt
//            BigInteger res = BigInteger.ZERO;
//            for (int i = 0; i < digits.length; i++) {
//                res = res.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
//            }
//
//            // Add 1 to the BigInteger
//            res = res.add(BigInteger.ONE);
//            String s = String.valueOf(res);
//            int[] arr = new int[s.length()];
//                    for (int j = 0; j < s.length(); j++) {
//                        arr[j] = Character.getNumericValue(s.charAt(j));
//                    }
//                    return arr;
//            }

        public int[] plusOne(int[] digits) {
            for(int i =digits.length-1; i>=0; i--){
                if(digits[i]!= 9){
                    digits[i]++;
                    return digits;
                }
                else{
                    digits[i] =0;
                }
            }

            int d[]= new int[digits.length+1];
            d[0]=1;
            return d;
        }

        public static void main(String[] args) {
            int[] digits = {9};
            PlusOne66 plus = new PlusOne66();
            int arr[] = plus.plusOne(digits);
            System.out.println(Arrays.toString(arr));
        }
    }
