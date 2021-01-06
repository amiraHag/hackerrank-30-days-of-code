#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    N = int(input())
    names= list()

    for N_itr in range(N):
        firstNameEmailID = input().split()

        firstName = firstNameEmailID[0]

        emailID = firstNameEmailID[1]
        if re.match("\w+\.*\w+@gmail.com", emailID):
            names.append(firstName)
    for elt in sorted(names):
        print(elt)
