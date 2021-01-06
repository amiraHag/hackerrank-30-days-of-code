# Enter your code here. Read input from STDIN. Print output to STDOUT
n = int(input())

for i in range(n):
    inputWord = input()
    leftPart=""
    rightPart=""
    for j in range(len(inputWord)):
        if j%2 ==1:
            rightPart = rightPart + inputWord[j]
        else:
            leftPart = leftPart + inputWord[j]
    print(leftPart + " " + rightPart)
