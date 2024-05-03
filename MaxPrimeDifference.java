public class MaxPrimeDifference {
    public static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int maximumPrimeDifference(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int out = 0;

        while(i<j && (!isPrime(nums[i]) || !isPrime(nums[j]))){
            if(!isPrime(nums[i])){
                i++;
            }
            if(!isPrime(nums[j])){
                j--;
            }
        }
        if(isPrime(nums[j]) && isPrime(nums[i])){
            return j-i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,9,5,3};
        System.out.println(maximumPrimeDifference(nums));
    }
}
