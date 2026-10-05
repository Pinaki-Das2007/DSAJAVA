public class conditional {
    public static void main(String[] args){

        // IF ELSE  

        int age = 78;
        if(age > 18){
            System.err.println("You are eligible to vote");

        }

        else{
            System.out.println("You are not eligible to vote");
        }

        // IF -ELSE 

        int age2 = 22;

        if(age2 < 21){
            System.out.println("Not valid for liquor age");
        }

        else if(age2 >= 21){
            System.out.println("Valid ");
        }

        else{
            System.out.println("Enter a valid number");
        }

            //  IF ELSE IF LADDER

        int mark = 78;
        if(mark > 90){
            System.out.println("Grade A");

        }

        else if(mark > 80){
            System.out.println("Grade B");

        }

        else if(mark > 70){
            System.out.println("Grade C");
        }

        else if(mark > 60){
            System.out.println("Grade D");

        }

        else{
            System.out.println("Fail");
        }






    }
}
