import java.util.*;

public class Leaders {
    public static void leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            int j=i+1;
            while(j < arr.length && arr[i] > arr[j]) {
                j++;
            }
            if(j == arr.length) {
                leaders.add(arr[i]);
            }
        } 
        
        System.out.println(leaders);
    }
    
    public static ArrayList<Integer> superiorElements(int []arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i=arr.length-1; i>=0; i--) {

            if(arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
        leaders(arr);
        // ArrayList<Integer> ans = superiorElements(arr);
        // System.out.println(ans);
    }
}