
        self.maximumDifference=0
        self.diffList =[]
    # Add your code here

    def computeDifference(self):
        for i in range(len(self.__elements)-1):
            for j in range(i+1,len(self.__elements)):
                self.diffList.append(abs(self.__elements[i]-self.__elements[j]))
        self.maximumDifference = max(self.diffList)
