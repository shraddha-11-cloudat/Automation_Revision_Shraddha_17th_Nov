package ConditionalStatements;

public class Ex4_iFElse {
    public static void main(String[] args) {

        int shoppingAmt = 300;

        if(shoppingAmt>= 500) // outer if
        {
            System.out.println("No Delivery Charges");
            if(shoppingAmt >= 2000) // nested if or inner if
            {
                System.out.println("Additional 10% Discount");
            }
            else
            {
                System.out.println("No Additional Discount");
            }
        }
        else  // outer if else
        {
            System.out.println("Rs. 50 Delivery Charges applied");
        }
    }
}
