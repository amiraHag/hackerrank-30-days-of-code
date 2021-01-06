#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    arrListResults=[]

    for n in range(4):
        for m in range(4):
            arrListResultsTemp=[]
            arrListResultsTemp.append(arr[n][m])
            arrListResultsTemp.append(arr[n][m+1])
            arrListResultsTemp.append(arr[n][m+2])
            arrListResultsTemp.append(arr[n+1][m+1])
            arrListResultsTemp.append(arr[n+2][m])
            arrListResultsTemp.append(arr[n+2][m+1])
            arrListResultsTemp.append(arr[n+2][m+2])
            arrListResults.append(arrListResultsTemp)

    sumList=[]
    for p in range(len(arrListResults)):
        sumList.append(sum(arrListResults[p]))

    print(max(sumList))
