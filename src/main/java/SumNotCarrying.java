public class SumNotCarrying {

    public static int sumNotCarrying(int firstNumber, int secondNumber){
        String sum = "";

        if(firstNumber == 0 && secondNumber == 0) return 0;

        while(firstNumber > 0 || secondNumber > 0){
            int additionNumber = 0;
            int digitOfFirstNumber = firstNumber%10;
            int digitOfSecondNumber = secondNumber%10;
            additionNumber = digitOfFirstNumber+digitOfSecondNumber;
            sum = String.valueOf(additionNumber) + sum;
            firstNumber /=10;
            secondNumber /= 10;
        }
        return Integer.parseInt(sum);
    }
}
