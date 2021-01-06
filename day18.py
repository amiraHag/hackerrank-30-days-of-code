

class Solution:
    # Write your code here
    def __init__(self):
        super().__init__()
        self.queuey=[]
        self.stacky=[]

    def pushCharacter(self, ch):
        self.stacky.append(ch)
    def enqueueCharacter(self, ch):
        self.queuey.append(ch)

    def popCharacter(self):
        return self.stacky.pop()


    def dequeueCharacter(self):
        return self.queuey.pop(0)
