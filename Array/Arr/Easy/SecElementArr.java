public class SecElementArr {
    public static void getSecondOrderElements(int n, int []a) {

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }

            if(a[i] < min) {
                min = a[i];
            }
        }

        int secMin = Integer.MAX_VALUE; 
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++) {
            if(a[i] == min || a[i] == max) {
                continue;
            }

            if(a[i] > secMax) {
                secMax = a[i];
            }
            if(a[i] < secMin) {
                secMin = a[i];
            }
        }

        System.out.println(secMax);
        System.out.println(secMin);
    }

    public static void secElementsOptimized(int arr[]) {
        int small = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < small) {
                secSmall = small;
                small = arr[i];
            }
            else if(arr[i] < secSmall && arr[i] != small){
                secSmall =arr[i];
            }
        }
        System.out.println(secSmall);
    }
    public static void main(String args[]) {
        int arr[] = {1,1,2,6,6,4,5,5};

        getSecondOrderElements(arr.length, arr);
        // secElementsOptimized(arr);

        
      
    }
}