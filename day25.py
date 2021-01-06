# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
def is_prime(n):
    if n <= 3:
        return n > 1
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i ** 2 <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

T=int(input())
for i in range(T):
    number = int(input())
    if(is_prime(number)):
        print("Prime")
    else:
        print("Not prime")
