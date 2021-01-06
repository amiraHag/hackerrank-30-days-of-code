

//Write your code here

class Calculator{

    public int power(int number, int powerNumber) throws Exception{

        if (number < 0 || powerNumber < 0){
            throw new Exception("n and p should be non-negative");

        }else{
            return (int) Math.pow(number,powerNumber);
        }
    }
}
