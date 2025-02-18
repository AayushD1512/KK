public class CountZeros {
    public static void main(String[] args) {
        System.out.print(fun());
    }
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);
    }
    static int fun(){
        return helper(13004220,0);


    }
}
