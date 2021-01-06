#!/bin/python3

import math
import os
import random
import re
import sys

def printArray(array):
    for i in range (len(array)):
        print(array[len(array) - i -1], end =" ")

if __name__ == '__main__':
    n = int(input())

    arr = list(map(int, input().rstrip().split()))
    printArray(arr)
