public class ForLoopInterest {

    public static void main(String[] args) {

        for(int i = 2; i < 9; i++){

            System.out.println("Interest for " + i + "% = " + String.format("%.2f", getInterest(10000, i)) );
        }
    }

    public  static double getInterest(double amount, double interestRate){

        double interest = amount * (interestRate / 100);
        return interest;
    }
}
