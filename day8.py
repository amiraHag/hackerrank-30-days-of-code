# Enter your code here. Read input from STDIN. Print output to STDOUT

n = int(input())
dictItem={}
for i in range(n):
    k , v = input().rstrip().split()
    v = int(v)
    dictItem[k] = v

while True:
    try:
        check = input()
        if check in dictItem:
            print(check + "=" + str(dictItem[check]))
        else:
            print("Not found")
    except:
        break
