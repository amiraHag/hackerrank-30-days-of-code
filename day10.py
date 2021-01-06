#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(input())
    binaryN=[]
    while (n>0):
        binaryN.append(n%2)
        n= n//2
    count = 0
    maxCount =0
    for i in binaryN:
        if i == 1:
            count+=1
            if count> maxCount:
                maxCount = count
        else:
            count = 0
    print(maxCount)
