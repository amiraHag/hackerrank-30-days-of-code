

class Student(Person):
    #   Class Constructor
    def __init__(self, firstName, lastName, idNumber, scores):
    #   Parameters:
    #   firstName - A string denoting the Person's first name.
    #   lastName - A string denoting the Person's last name.
    #   id - An integer denoting the Person's ID number.
    #   scores - An array of integers denoting the Person's test scores.
    #
    # Write your constructor here
        self.scores = scores
        return super(Student, self).__init__(firstName, lastName, idNumber)

    #   Function Name: calculate
    #   Return: A character denoting the grade.
    #
    # Write your function here
    def calculate(self):
        scoreAverage= sum(self.scores) / len(self.scores)
        if scoreAverage >= 90:
            return 'O'
        elif scoreAverage >= 80 and scoreAverage < 90:
            return 'E'
        elif scoreAverage >= 70 and scoreAverage < 80:
            return 'A'
        elif scoreAverage >= 55 and scoreAverage < 70:
            return 'P'
        elif scoreAverage >= 40 and scoreAverage < 55:
            return 'D'
        else:
            return 'T'
