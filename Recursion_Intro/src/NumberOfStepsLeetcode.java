public class NumberOfStepsLeetcode {
    public static void main(String[] args) {
        int ans = numberOfSteps(102003);
        System.out.println(ans);
    }
    static int numberOfSteps(int n){
        return helper(n,0);
    }
    static int helper(int n, int steps){
        if(n==0) return steps;
        int rem = n%10;
        if(rem == 0){
            return helper(n/10,steps+1);

        }
        return helper(n/10,steps);
    }
}
