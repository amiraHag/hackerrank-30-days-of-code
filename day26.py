# Enter your code here. Read input from STDIN. Print output to STDOUT
d1, m1, y1 = map(int, input().strip().split())
d2, m2, y2 = map(int, input().strip().split())
sum=0
numberDays= (d1-d2) + (m1-m2)*30 + (y1 -y2) *365
if numberDays > 365 or y1 > y2:
    sum=10000
elif numberDays > 30:
     sum = (m1-m2) * 500
elif numberDays >=1:
     sum = (d1 - d2) * 15
else:
    sum=0

print(sum)
