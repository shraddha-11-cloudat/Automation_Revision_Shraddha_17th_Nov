package ConditionalStatements;

public class Nested_IfElse_EX2 {
    public static void main(String[] args) {
        int marks = 39;

        if(marks >= 65)
        {
            System.out.println("Distinction");
        }
        else if(marks >= 60 && marks < 65)
        {
            System.out.println("First Class");
        }
        else if (marks >= 55 && marks < 60)
        {
            System.out.println("Second Class");
        }
        else if (marks >= 45 && marks < 55)
        {
            System.out.println("Third Class");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
