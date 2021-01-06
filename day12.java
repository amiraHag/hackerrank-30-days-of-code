

class Student extends Person{
	private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores){
        super(firstName, lastName,identification );
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
        this.testScores= scores;
    }
    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here

    public char calculate(){
        int sum=0;
        for (int i : testScores){
            sum += i;
        }
        //System.out.println(sum);

        int averageScore = sum/testScores.length;
        //System.out.println(averageScore);
        if (averageScore >=90){
            return 'O';
        }
        else if(averageScore >=80 && averageScore < 90){
            return 'E';
        }
        else if(averageScore >=70 && averageScore < 80){
            return 'A';
        }
        else if(averageScore >=55 && averageScore < 70){
            return 'P';
        }
        else if(averageScore >=40 && averageScore < 55){
            return 'D';
        }
        else{
            return 'T';
        }
    }
}
