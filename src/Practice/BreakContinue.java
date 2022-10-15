package Practice;

public class BreakContinue {

    public static void main(String[] args) {

        //break--> the rest of the code will not be executed after the iteration
        //continue--> it will be impacted on the particular iteration and rest of the code will be executed

        for (int i = 1; i <= 10; i++) {
            System.out.println("iteration number " + i);

            System.out.println("Before break/continue");
            if (i == 7) {
                continue;

            }
            System.out.println("After break/continue");
        }
    }
}
