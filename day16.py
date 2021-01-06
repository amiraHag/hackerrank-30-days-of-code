#!/bin/python3

import sys


S = input().strip()
try:
    int_s = int(S)
    print(int_s)
except:
    print("Bad String")
