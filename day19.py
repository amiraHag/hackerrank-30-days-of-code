

class Calculator(AdvancedArithmetic):
    def divisorSum(self, n):
        if n < 1:
            return 0
        sum=0
        for i in range(1,n+1):
            if(n % i ==0):
                sum+=i;
        return sum
