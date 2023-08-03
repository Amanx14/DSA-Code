import java.util.*;

public class LongestConsecutiveSubarr {
    public static int lcs(int arr[]) {
        Arrays.sort(arr);

        int maxLength = 1;
        int count = 1; 
        int prev = arr[0];
        
        for(int i=1; i<arr.length; i++) {
            if(prev + 1 == arr[i-1]) {
                count++;
            } 
            else if (prev != arr[i]){ // dublicates avoid karne ka
                count = 1;
            }
            prev = arr[i];
            maxLength = Math.max(maxLength, count);
        }
        return maxLength;
    }

    public static int lcsOptimized(int arr[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr) {
            set.add(i);
        }

        int longest = 1;
        for(Integer i : set) {
            if(!set.contains(i - 1)) {
                int count = 1;
                int currIdx = i;

                while(set.contains(currIdx + 1)) {
                    count++;
                    currIdx = currIdx+1;
                }
                longest = Math.max(count, longest);
            }

        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {3,8,5,7,6}; 
        // System.out.println(lcs(arr));
        System.out.println(lcsOptimized(arr));
    }
}