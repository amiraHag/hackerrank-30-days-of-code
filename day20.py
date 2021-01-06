#!/bin/python3

import sys

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))
# Write Your Code Here
num_swap=0
for i in range(n):
    for j in range(i+1,n):
        if a[i] > a[j]:
            temp=a[j]
            a[j]=a[i]
            a[i]=temp
            num_swap+=1

result1= "Array is sorted in " + str(num_swap) +" swaps."
result2 = "First Element: "+str(a[0])
result3 = "Last Element: " +str(a[n-1])
print(result1)
print(result2)
print(result3)
