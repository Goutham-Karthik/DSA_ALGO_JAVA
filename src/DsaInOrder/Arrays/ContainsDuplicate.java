package src.DsaInOrder.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        boolean found = false;
       // Map<Integer, String> map = new HashMap<>();
        // better to use set instaed of MAP as we can just check if we are able to add it .. as set doesn allow duplicates
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if(!set.add(x)){
                found = true;
            }
        }
        System.out.println(found);
    }
}
