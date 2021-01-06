#Write your code here
class Calculator:
    @staticmethod
    def power(number,numberPower):
        if number < 0 or numberPower < 0:
            raise Exception("n and p should be non-negative")
        else:
            return number ** numberPower
