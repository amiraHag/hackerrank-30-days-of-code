
class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        if(n< 1){
            return 0;
        }
        int sum=0;
        for(int i=n; i>0; i--){
            if(n % i == 0){
                sum+=i;
            }
        }
        return sum;
    }
}
